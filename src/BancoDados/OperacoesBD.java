/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDados;

import Elementos.Save;
import Elementos.Etapas;
import Elementos.Jogador;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

public class OperacoesBD {  
    private static Connection connection = null;
    private static Statement statement = null;
    private static ResultSet resultado = null;
    
    public static boolean Inserir(Object objetoGenerico) throws SQLIntegrityConstraintViolationException{
        if(connection == null) connection = ConexaoMySQL.getConexaoMySQL();
        String tipo_dado;
        Etapas etapa = null;
        Save save = null;
        Jogador jogador = null;
        
        if(objetoGenerico instanceof Etapas){
            etapa = (Etapas)objetoGenerico;
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
    }
    
    public static boolean InserirJogador(Jogador jogador) throws SQLIntegrityConstraintViolationException{
        if(jogador == null) throw new IllegalArgumentException("Não é possível inserir nulo na tabela jogador");
        else{
            try
            {
                if(connection == null) connection = ConexaoMySQL.getConexaoMySQL();
                statement = (Statement) connection.createStatement();

                statement.execute(String.format("INSERT INTO jogador(usuario,senha,apelido) VALUES(\"%s\",\"%s\",\"%s\")",jogador.getUsuario(),jogador.getSenha(),jogador.getApelido()));
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
    
    
    
    public static boolean checkIfUserExists(String nomeUsuario){
        if(nomeUsuario.isEmpty()) throw new IllegalArgumentException("Não é possível verificar um nome nulo na tabela jogador");
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
                System.out.println("Erro na operacão do Banco de Dados\nErro: " + e);
            }

            return true;
        }
    }
    
    public static boolean verifyLogin(String nomeUsuario, String senha){
        if(nomeUsuario.isEmpty() || senha.isEmpty()) throw new IllegalArgumentException("Não é possível verificar um logim com valores nulos na tabela jogador");
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
                System.out.println("Erro na operacão do Banco de Dados\nErro: " + e);
            }

            return true;
        }
    }
    
    public static ResultSet getResultado(){
        return resultado;
    }
}
