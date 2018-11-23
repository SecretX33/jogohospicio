package Elementos;

import java.sql.Time;
import javafx.scene.input.DataFormat;


public class Jogador {
    private String usuario;
    private String senha;
    private String apelido;
    private Time tempo_jogo;
    private Save slot1;
    private Save slot2;
    private Save slot3;
    private Save slot4;
    
    public Jogador(String usuario, String senha, String apelido){
        this.usuario = usuario;
        this.senha = senha;
        this.apelido = apelido;
        //DataFormat formatter = new SimpleDataFormat("HH:mm:ss");
        //this.tempo_jogo = new Time(formatter.parse("00:00:00").getTime());
        this.tempo_jogo = null;
        this.slot1 = null;
        this.slot2 = null;
        this.slot3 = null;
        this.slot4 = null;
    }
    
    public Jogador(String usuario, String senha, String apelido, Time tempo_jogo, Save slot1, Save slot2, Save slot3, Save slot4) {
        this.usuario = usuario;
        this.senha = senha;
        this.apelido = apelido;
        this.tempo_jogo = tempo_jogo;
        this.slot1 = slot1;
        this.slot2 = slot2;
        this.slot3 = slot3;
        this.slot4 = slot4;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public Time getTempo_jogo() {
        return tempo_jogo;
    }

    public void setTempo_jogo(Time tempo_jogo) {
        this.tempo_jogo = tempo_jogo;
    }

    public Save getSlot1() {
        return slot1;
    }

    public void setSlot1(Save slot1) {
        this.slot1 = slot1;
    }

    public Save getSlot2() {
        return slot2;
    }

    public void setSlot2(Save slot2) {
        this.slot2 = slot2;
    }

    public Save getSlot3() {
        return slot3;
    }

    public void setSlot3(Save slot3) {
        this.slot3 = slot3;
    }

    public Save getSlot4() {
        return slot4;
    }

    public void setSlot4(Save slot4) {
        this.slot4 = slot4;
    }
}