/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import BancoDados.ConexaoMySQL;
import BancoDados.OperacoesBD;
import Elementos.Jogador;
import Interface.*;
import Interface.Menu.*;
import java.sql.Connection;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class JogoHospicio {
    
    public static void main(String[] args){        
        ConexaoMySQL.getConexaoMySQL();
        System.out.println(ConexaoMySQL.statusConnection());

        
        
        /*try {
            OperacoesBD.InserirJogador(jogador);
            
        } catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "Usuário já existe.\n\n" + e, "ERRO", JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog()
        }*/
        
        //Menu menu = new Menu();
        //menu.setVisible(true);
            
            
            /*if(OperacoesBD.checkIfUserExists("a")) System.out.println(String.format("Usuário \'%s\' existe!","a"));
            else System.out.println(String.format("Usuário \'%s\' não existe!","a"));
            if(OperacoesBD.checkIfUserExists("aa")) System.out.println(String.format("Usuário \'%s\' existe!","aa"));
            else System.out.println(String.format("Usuário \'%s\' não existe!","aa"));*/
            
        TelaLogin tl = new TelaLogin();
        //tl.setVisible(true);
        
        
    } 
}