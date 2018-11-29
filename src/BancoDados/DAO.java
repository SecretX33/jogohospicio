/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDados;

import Elementos.Save;
import Elementos.Etapa;
import Elementos.Jogador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class DAO {  
    private static Connection connection = null;
    private static Statement statement = null;
    private static PreparedStatement prepstate = null;
    private static ResultSet resultado = null;
    
    /*public static boolean Inserir(Object objetoGenerico) throws SQLIntegrityConstraintViolationException{
        if(connection == null) connection = ConexaoMySQL.getConexaoMySQL();
        String tipo_dado;
        Etapa etapa = null;
        Save save = null;
        Jogador jogador = null;
        
        if(objetoGenerico instanceof Etapa){
            etapa = (Etapa)objetoGenerico;
            tipo_dado = "etapa";
        }
        else if(objetoGenerico instanceof Save){
            save = (Save)objetoGenerico;
            tipo_dado = "save";
        }
        else if(objetoGenerico instanceof Jogador){
            jogador = (Jogador)objetoGenerico;
            tipo_dado = "jogador";
        }
        else{
            throw new IllegalArgumentException("Os parâmetros fornecidos na função Inserir não correspondem a nenhum dos tipos suportados.");
        }

        try
        {
            connection = ConexaoMySQL.getConexaoMySQL();
            statement = (Statement) connection.createStatement();
            
            if(tipo_dado=="jogador"){           
                statement.execute(String.format("INSERT INTO jogador(usuario,senha,apelido) VALUES(\"%s\",\"%s\",\"%s\")",jogador.getUsuario(),jogador.getSenha(),jogador.getApelido()));
                System.out.println("Jogador inserido com sucesso.");
            }
        }
        catch (SQLException e)
        {
            System.out.println("Erro na operacão do Banco de Dados\nErro: " + e);
            return false;
        }
        return true;
    }*/
    
    public static boolean InserirJogador(String usuario, String senha, String apelido) throws SQLIntegrityConstraintViolationException{
        if(usuario == null || senha == null || apelido == null) throw new IllegalArgumentException("Não é possível inserir nulo na tabela jogador");
        else{
            try
            {
                resultado=null;
                if(connection == null) connection = ConexaoMySQL.getConexaoMySQL();
                statement = (Statement) connection.createStatement();

                statement.execute(String.format("INSERT INTO jogador(usuario,senha,apelido) VALUES(\"%s\",\"%s\",\"%s\")",usuario,senha,apelido));
            }  
            catch(SQLIntegrityConstraintViolationException e){
                throw e;
            }
            catch (SQLException e)
            {
                System.out.println("Erro na operacão do Banco de Dados\nErro: " + e);
                return false;
            }     

            System.out.println("Jogador inserido com sucesso.");
            return true;
        }
    }
    
    public static boolean AtualizarSave(Save save) throws SQLIntegrityConstraintViolationException{
        if(save == null) throw new IllegalArgumentException("Não é possível inserir um Save nulo na tabela save.");
        else{
            try
            {
                resultado = null;
                String query = "UPDATE save SET etapa_atual = ?, tempo_jogo = ?, sanidade = ?, emocional = ?, carisma = ?, coragem = ? WHERE slot_save = ? AND cod_usuario = ?";
                if(connection == null) connection = ConexaoMySQL.getConexaoMySQL();
                prepstate = connection.prepareStatement(query);
                
                prepstate.setInt(1,save.getEtapa_atual());
                prepstate.setLong(2,save.getTempo_jogo());
                prepstate.setInt(3,save.getSanidade());
                prepstate.setInt(4,save.getEmocional());
                prepstate.setInt(5,save.getCarisma());
                prepstate.setInt(6,save.getCoragem());
                prepstate.setInt(7,save.getSlot_save());
                prepstate.setInt(8,save.getCod_usuario());
                
                prepstate.executeUpdate();
                System.out.println("Save atualizado com sucesso.");
                return true;
                
            }  
            catch(SQLIntegrityConstraintViolationException e){
                throw e;
            }
            catch (SQLException e)
            {  
                System.out.println("Erro na operacão do Banco de Dados\nErro: " + e);
            }
            System.out.println("Erro ao tentar atualizar o save.");
            return false;
        }
    }
    
    public static boolean AtualizarJogador(Jogador jogador) throws SQLIntegrityConstraintViolationException{
        if(jogador == null) throw new IllegalArgumentException("[BD] Não é possível atualizar um jogador nulo.");
        else{
            try
            {
                resultado = null;
                String query = "UPDATE jogador SET usuario = ?, senha = ?, apelido = ?, tempo_jogo = ? WHERE cod_usuario = ?";
                if(connection == null) connection = ConexaoMySQL.getConexaoMySQL();
                prepstate = connection.prepareStatement(query);
                
                prepstate.setString(1,jogador.getUsuario());
                prepstate.setString(2,jogador.getSenha());
                prepstate.setString(3,jogador.getApelido());
                prepstate.setLong(4,jogador.getTempo_jogo());
                prepstate.setInt(5,jogador.getCod_usuario());
                
                prepstate.executeUpdate();
                System.out.println("[BD] Jogador atualizado com sucesso.");
                return true;
                
            }  
            catch(SQLIntegrityConstraintViolationException e){
                throw e;
            }
            catch (SQLException e)
            {  
                System.out.println("[BD] Erro na operacão do Banco de Dados\nErro: " + e);
            }
            System.out.println("[BD] Erro ao tentar atualizar o save.");
            return false;
        }
    }
    
    public static int getIdJogador(String nome){
       if(nome == null) throw new IllegalArgumentException("[BD] Não é possível pegar o ID de um jogador nulo.");
        else{
            try
            {
                resultado = null;
                if(connection == null) connection = ConexaoMySQL.getConexaoMySQL();
                statement = (Statement) connection.createStatement();

                statement.executeQuery(String.format("SELECT cod_usuario FROM jogador WHERE jogador.usuario = \"%s\"",nome));
                resultado = statement.getResultSet();
                if(resultado.next()){
                    System.out.println(String.format("O ID do usuario \'%s\' é %d",nome, (int)resultado.getInt(1)));
                    return (int)resultado.getInt(1);
                }
            }
            catch (SQLException e)
            {
                System.out.println("[BD] Erro na operacão do Banco de Dados\nErro: " + e);
            }
            throw new NullPointerException("[BD] O banco de dados retornou um resultado nulo para o jogador.");
        }
    }
    
    public static int getIdJogador(Jogador jogador){
       if(jogador == null) throw new IllegalArgumentException("[BD] Não é possível pegar o ID de um jogador nulo.");
        else{
            try
            {
                resultado = null;
                if(connection == null) connection = ConexaoMySQL.getConexaoMySQL();
                statement = (Statement) connection.createStatement();

                statement.executeQuery(String.format("SELECT cod_usuario FROM jogador WHERE jogador.usuario = \"%s\"",jogador.getUsuario()));
                resultado = statement.getResultSet();
                if(resultado.next()){
                    System.out.println(String.format("O ID do usuario \'%s\' é %d",jogador.getUsuario(), (int)resultado.getInt(1)));
                    return (int)resultado.getInt(1);
                }
            }
            catch (SQLException e)
            {
                System.out.println("[BD] Erro na operacão do Banco de Dados\nErro: " + e);
            }
            throw new NullPointerException("[BD] O banco de dados retornou um resultado nulo para o jogador.");
        }
    }
    
    public static Jogador getJogador(String usuario){
        if(usuario == null) throw new IllegalArgumentException("[BD] Não é possível pesquisar jogadores com login nulo.");
        else{
            try{
                resultado = null;
                Save s[] = new Save[4];
                int id=-1;
                String u=null;
                String se=null;
                String a=null;
                long tj=0;
                
                String query = "SELECT * FROM jogador WHERE jogador.usuario = ?";
                if(connection == null) connection = ConexaoMySQL.getConexaoMySQL();
                prepstate = connection.prepareStatement(query);
                prepstate.setString(1,usuario);
                resultado = prepstate.executeQuery();
  
                if(resultado.next()){
                    id = resultado.getInt("cod_usuario");
                    u = resultado.getString("usuario");
                    se = resultado.getString("senha");
                    a = resultado.getString("apelido");
                    tj = resultado.getLong("tempo_jogo");
                    //System.out.println(String.format("[BD] Dados do jogador solicitado: %d,%s,%s,%s,%s",id,u,se,a,convertLongToString(tj)));
                    resultado=null;
                    query="SELECT * FROM save WHERE save.cod_usuario = ? ORDER BY slot_save, cod_usuario";
                    if(connection == null) connection = ConexaoMySQL.getConexaoMySQL();
                    prepstate = connection.prepareStatement(query);
                    prepstate.setInt(1,id);
                    resultado = prepstate.executeQuery();
                    
                    for(int i=0; resultado.next() && i<4; i++){
                        Save gaveta = new Save(i);
                        gaveta.setSlot_save(resultado.getInt("slot_save"));
                        gaveta.setCod_usuario(resultado.getInt("cod_usuario"));
                        gaveta.setEtapa_atual(resultado.getInt("etapa_atual"));
                        gaveta.setTempo_jogo(resultado.getLong("tempo_jogo"));
                        gaveta.setSanidade(resultado.getInt("sanidade"));
                        gaveta.setEmocional(resultado.getInt("emocional"));
                        gaveta.setCarisma(resultado.getInt("carisma"));
                        gaveta.setCoragem(resultado.getInt("coragem"));
                        s[i]=gaveta;
                    }
                    return new Jogador(id,u,se,a,tj,s[0],s[1],s[2],s[3]);     
                }
                else throw new NullPointerException("[BD] Não foi possível criar o jogador por falta de dados.");
            }
            catch (SQLException e)
            {
                System.out.println("[BD] Erro na operacão do Banco de Dados\nErro: " + e);
            }
            throw new NullPointerException("[BD] O banco de dados retornou um resultado nulo para o jogador.");
        }
    }
    
    public static Etapa getEtapa(int codProxEtapa){
        if(codProxEtapa<1) throw new IllegalArgumentException(String.format("[BD] Erro, não é possível obter uma etapa de valor negativo (valor solicitado: %d).",codProxEtapa));
        else{
            try
            {    
                resultado = null;
                String query = "SELECT * FROM etapa WHERE etapa.cod = ?";
                if(connection == null) connection = ConexaoMySQL.getConexaoMySQL();
                prepstate = connection.prepareStatement(query);

                prepstate.setInt(1,codProxEtapa);
                resultado = prepstate.executeQuery();
                if(resultado.next()){
                    Etapa proxEtapa = new Etapa();

                    proxEtapa.setCod(resultado.getInt("cod"));
                    System.out.println("Etapa solicitada: " + proxEtapa.getCod());
                    proxEtapa.setDescricao(resultado.getString("descricao"));
                    proxEtapa.setTextobt1(resultado.getString("textobt1"));
                    proxEtapa.setTextobt2(resultado.getString("textobt2"));
                    proxEtapa.setTipo_quadro(resultado.getInt("tipo_quadro"));
                    proxEtapa.setRef_op1(resultado.getInt("ref_op1"));
                    proxEtapa.setRef_op2(resultado.getInt("ref_op2"));
                    proxEtapa.setImp_sanidade1(resultado.getInt("imp_sanidade1"));
                    proxEtapa.setImp_emocional1(resultado.getInt("imp_emocional1"));
                    proxEtapa.setImp_carisma1(resultado.getInt("imp_carisma1"));
                    proxEtapa.setImp_coragem1(resultado.getInt("imp_coragem1"));
                    proxEtapa.setImp_sanidade2(resultado.getInt("imp_sanidade2"));
                    proxEtapa.setImp_emocional2(resultado.getInt("imp_emocional2"));
                    proxEtapa.setImp_carisma2(resultado.getInt("imp_carisma2"));
                    proxEtapa.setImp_coragem2(resultado.getInt("imp_coragem2"));
                    proxEtapa.setTimer(resultado.getInt("timer"));
                    proxEtapa.setRef_optimer(resultado.getInt("ref_optimer"));
                    
                    return proxEtapa;
                }
                throw new NullPointerException(String.format("[BD] O banco de dados retornou um resultado nulo para a etapa %d.",codProxEtapa));
            }
            catch (SQLException e)
            {
                System.out.println("[BD] Erro na operacão do Banco de Dados\nErro: " + e);
            }
            return null;
        }
    }
    
    public static boolean checkIfUserExists(String nomeUsuario){
        if(nomeUsuario.isEmpty()) throw new IllegalArgumentException("[BD] Não é possível verificar um nome nulo na tabela jogador");
        else{
            try
            {
                resultado = null;
                if(connection == null) connection = ConexaoMySQL.getConexaoMySQL();
                statement = (Statement) connection.createStatement();

                statement.execute(String.format("SELECT usuario FROM jogador WHERE jogador.usuario = \"%s\"",nomeUsuario));
                resultado = statement.getResultSet();
                if(resultado.next()){
                    System.out.println(String.format("Usuário \'%s\' já existe!",nomeUsuario));
                    return true;
                }
                else{
                    System.out.println(String.format("Usuário \'%s\' não existe!",nomeUsuario));
                    return false;
                }     
            }
            catch (SQLException e)
            {
                System.out.println("[BD] Erro na operacão do Banco de Dados\nErro: " + e);
            }

            return true;
        }
    }
    
    public static boolean verifyLogin(String nomeUsuario, String senha){
        if(nomeUsuario.isEmpty() || senha.isEmpty()) throw new IllegalArgumentException("[BD] Não é possível verificar um logim com valores nulos na tabela jogador");
        else{
            try
            {
                resultado = null;
                if(connection == null) connection = ConexaoMySQL.getConexaoMySQL();
                statement = (Statement) connection.createStatement();

                statement.execute(String.format("SELECT usuario FROM jogador WHERE jogador.usuario = \"%s\" AND jogador.senha = \"%s\"",nomeUsuario,senha));
                resultado = statement.getResultSet();
                if(resultado.next()){
                    System.out.println("Usuário e senha conferem.");
                    return true;
                }
                else{
                    System.out.println("Usuário ou senha incorretos.");
                    return false;
                }     
            }
            catch (SQLException e)
            {
                System.out.println("[BD] Erro na operacão do Banco de Dados\nErro: " + e);
            }

            return true;
        }
    }
    
    private static String convertLongToString(long l){
        String hms = String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(l),
        TimeUnit.MILLISECONDS.toMinutes(l) % TimeUnit.HOURS.toMinutes(1),
        TimeUnit.MILLISECONDS.toSeconds(l) % TimeUnit.MINUTES.toSeconds(1));
        return hms;
    }
}
