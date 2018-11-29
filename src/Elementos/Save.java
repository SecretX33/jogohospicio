package Elementos;

import java.sql.Time;

public class Save {
    private int slot_save;
    private int cod_usuario;
    private int etapa_atual;
    private Time tempo_jogo;  
    private int sanidade;
    private int emocional;
    private int carisma;
    private int coragem;
    
    // Inicializando um save novo
    public Save(int cod_usuario){
        this.slot_save = 0;
        this.cod_usuario = cod_usuario;
        this.etapa_atual = 0;   // 0 sinaliza que o save nunca foi usado
        this.tempo_jogo = null;
        this.sanidade = 0;
        this.emocional = 0;
        this.carisma = 0;
        this.coragem = 0;
    }
    
    // Criando um save já com informações do jogo atual
    public Save(int slot_save, int cod_usuario, int etapa_atual, Time tempo_jogo, int sanidade, int emocional, int carisma, int coragem) {
        this.slot_save = slot_save;
        this.cod_usuario = cod_usuario;
        this.etapa_atual = etapa_atual;
        this.tempo_jogo = tempo_jogo;
        this.sanidade = sanidade;
        this.emocional = emocional;
        this.carisma = carisma;
        this.coragem = coragem;
    }

    public int getSlot_save() {
        return slot_save;
    }

    public void setSlot_save(int slot_save) {
        this.slot_save = slot_save;
    }

    public int getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(int cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public int getEtapa_atual() {
        return etapa_atual;
    }

    public void setEtapa_atual(int etapa_atual) {
        this.etapa_atual = etapa_atual;
    }

    public Time getTempo_jogo() {
        return tempo_jogo;
    }

    public void setTempo_jogo(Time tempo_jogo) {
        this.tempo_jogo = tempo_jogo;
    }

    public int getSanidade() {
        return sanidade;
    }

    public void setSanidade(int sanidade) {
        this.sanidade = sanidade;
    }

    public int getEmocional() {
        return emocional;
    }

    public void setEmocional(int emocional) {
        this.emocional = emocional;
    }

    public int getCarisma() {
        return carisma;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    public int getCoragem() {
        return coragem;
    }

    public void setCoragem(int coragem) {
        this.coragem = coragem;
    }
    
    public void printDetails(){
        System.out.println("#######\nSave: " + slot_save);
        System.out.println("Cod_usuario: " + cod_usuario);
        System.out.println("Etapa_atual: " + etapa_atual);
        System.out.println("Tempo de jogo: " + tempo_jogo);
        System.out.println("Sanidade: " + sanidade);
        System.out.println("Emocional: " + emocional);
        System.out.println("Carisma: " + carisma);
        System.out.println("Coragem: " + coragem);
    }
}
