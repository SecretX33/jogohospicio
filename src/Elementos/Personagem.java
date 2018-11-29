package Elementos;

public class Personagem {
    private String nome;
    // Status do personagem, varia de 0 a 20.
    private int sanidade;
    private int emocional;
    private int carisma;
    private int coragem;
    private boolean vivo;
    private String motivoMorte;
    private final int maxStatusValue = 20;
    
    public Personagem(String nome){
        this.nome = nome;
        sanidade = 10;
        emocional = 10;
        carisma = 10;
        coragem = 10;
        vivo = true;
    }

    public String getNome() {
        return nome;
    }

    public int getSanidade() {
        return sanidade;
    }

    public int getEmocional() {
        return emocional;
    }

    public int getCarisma() {
        return carisma;
    }

    public int getCoragem() {
        return coragem;
    }

    public void setSanidade(int sanidade) {
        this.sanidade = sanidade;
    }

    public void setEmocional(int emocional) {
        this.emocional = emocional;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    public void setCoragem(int coragem) {
        this.coragem = coragem;
    }

    
    
    public boolean isVivo() {
        return vivo;
    }
    
    public void alterarSanidade(int i){
        if(sanidade+i>0 && sanidade+i<maxStatusValue){
            sanidade+=i;
        }
        else if(sanidade+i<=0){
            sanidade=0;
            death("sanidade");
        }
    }
    
    public void alterarEmocional(int i){
        if(emocional+i>0 && emocional+i<maxStatusValue){
            emocional+=i;
        }
        else if(emocional+i<=0){
            emocional=0;
            death("emocional");
        }
    }
    
    public void alterarCarisma(int i){
        if(carisma+i>0 && carisma+i<maxStatusValue){
            carisma+=i;
        }
        else if(carisma+i<=0){
            carisma=0;
            death("carisma");
        }
    }
    
    public void alterarCoragem(int i){
        if(coragem+i>0 && coragem+i<maxStatusValue){
            coragem+=i;
        }
        else if(coragem+i<=0){
            coragem=0;
            death("coragem");
        }
    }
    
    private void death(String motivoMorte){   
        vivo = false;
        this.motivoMorte = motivoMorte;
    }
}
