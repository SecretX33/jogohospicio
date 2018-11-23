/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDados;

import Elementos.Save;
import Elementos.Etapas;
import Elementos.Jogador;
import Principal.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OperacoesBD {  
    private static Connection connection = null;
    private static Statement statement = null;
    private static ResultSet resultado = null;
    
    public static boolean Inserir(Object objetoGenerico){
        connection = ConexaoMySQL.getConexaoMySQL();
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
                //statement.execute(String.format("INSERT INTO jogador(usuario,senha,apelido,tempo_jogo) VALUES(\"%s\",\"%s\",\"%s\",'%d')",jogador.getUsuario(),jogador.getSenha(),jogador.getApelido(),jogador.getTempo_jogo()));
                statement.execute(String.format("INSERT INTO jogador(usuario,senha,apelido) VALUES(\"%s\",\"%s\",\"%s\")",jogador.getUsuario(),jogador.getSenha(),jogador.getApelido()));
                System.out.println("Jogador inserido com sucesso.");
            }
        }
        catch (SQLException e)
        {
            System.out.println("Falha ao acessar Banco de Dados\nErro: " + e);
            return false;
        }
        return true;
    }
    
    /*public static boolean checkIfUserExist(Jogador jogador){
        connection = ConexaoMySQL.getConexaoMySQL();
        String tipo_dado;
 
        try
        {
            connection = ConexaoMySQL.getConexaoMySQL();
            statement = (Statement) connection.createStatement();
            
            if(tipo_dado=="jogador"){
                //statement.execute(String.format("INSERT INTO jogador(usuario,senha,apelido,tempo_jogo) VALUES(\"%s\",\"%s\",\"%s\",'%d')",jogador.getUsuario(),jogador.getSenha(),jogador.getApelido(),jogador.getTempo_jogo()));
                statement.execute(String.format("INSERT INTO jogador(usuario,senha,apelido) VALUES(\"%s\",\"%s\",\"%s\")",jogador.getUsuario(),jogador.getSenha(),jogador.getApelido()));
                resultado = statement.getResultSet();
            }
            
        }
        catch (SQLException e)
        {
            System.out.println("Falha ao acessar Banco de Dados\nErro: " + e);
        }
        
        return true;
    }*/
    
    public static ResultSet getResultado(){
        return resultado;
    }
}
