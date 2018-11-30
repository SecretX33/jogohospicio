package Elementos;

import java.sql.Time;

public class Save {
    private int slot_save;
    private int cod_usuario;
    private int etapa_atual;
    private long tempo_jogo;  
    private int sanidade;
    private int emocional;
    private int carisma;
    private int coragem;
    private String escolhas;
    private final int maxStatusValue = 20;
    
    // Inicializando um save novo
    public Save(int cod_usuario){
        this.slot_save = -1;
        this.cod_usuario = cod_usuario;
        this.etapa_atual = 0;   // 0 sinaliza que o save nunca foi usado
        this.tempo_jogo = 0;
        this.sanidade = 10;
        this.emocional = 10;
        this.carisma = 10;
        this.coragem = 10;
    }
    
    // Criando um save já com informações do jogo atual
    public Save(int slot_save, int cod_usuario, int etapa_atual, long tempo_jogo, int sanidade, int emocional, int carisma, int coragem, String escolhas) {
        this.slot_save = slot_save;
        this.cod_usuario = cod_usuario;
        this.etapa_atual = etapa_atual;
        this.tempo_jogo = tempo_jogo;
        this.sanidade = sanidade;
        this.emocional = emocional;
        this.carisma = carisma;
        this.coragem = coragem;
        this.escolhas = escolhas;
    }

    public String getEscolhas() {
        if(escolhas==null) return "";
        else return escolhas;
    }

    public void setEscolhas(String escolhas) {
        this.escolhas = escolhas;
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

    public long getTempo_jogo() {
        return tempo_jogo;
    }

    public void setTempo_jogo(long tempo_jogo) {
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
    
    public void alterarSanidade(int i){
        if(sanidade+i>0 && sanidade+i<maxStatusValue){
            sanidade+=i;
        }
        else if(sanidade+i<=0){
            sanidade=0;
        }
    }
    
    public void alterarEmocional(int i){
        if(emocional+i>0 && emocional+i<maxStatusValue){
            emocional+=i;
        }
        else if(emocional+i<=0){
            emocional=0;
        }
    }
    
    public void alterarCarisma(int i){
        if(carisma+i>0 && carisma+i<maxStatusValue){
            carisma+=i;
        }
        else if(carisma+i<=0){
            carisma=0;
        }
    }
    
    public void alterarCoragem(int i){
        if(coragem+i>0 && coragem+i<maxStatusValue){
            coragem+=i;
        }
        else if(coragem+i<=0){
            coragem=0;
        }
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
