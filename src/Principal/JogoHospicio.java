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

public class JogoHospicio {
    
    public static void main(String[] args) {        
        ConexaoMySQL.getConexaoMySQL();
        System.out.println(ConexaoMySQL.statusConnection());
        
        //Jogador jogador = new Jogador("abinhogameplay","amigodamariana","Abinho Gameplay");
        //if(OperacoesBD.Inserir(jogador) == true) System.out.println("Inserção realizada com sucesso.");
        
        //Menu menu = new Menu();
        //menu.setVisible(true);
        
        TelaLogin tl = new TelaLogin();
        tl.setVisible(true);
    } 
}