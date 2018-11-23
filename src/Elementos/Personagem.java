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

    public boolean isVivo() {
        return vivo;
    }
    
    public void aumentarSanidade(){
        if(sanidade<maxStatusValue) sanidade++;
    }
    
    public void reduzirSanidade(){
        if(sanidade>1) sanidade--;
        else{
            sanidade=0;
            death("sanidade");
        }
    }
    
    public void aumentarEmocional(){
        if(emocional<maxStatusValue) emocional++;
    }
    
    public void reduzirEmocional(){
        if(emocional>1) emocional--;
        else{
            emocional = 0;
            death("emocional");
        }
    }
    
    public void aumentarCarisma(){
        if(carisma<maxStatusValue) carisma++;
    }
    
    public void reduzirCarisma(){
        if(carisma>1) carisma--;
        else{
            carisma = 0;
            death("carisma");
        }
    }
    
    public void aumentarCoragem(){
        if(coragem<maxStatusValue) coragem++;
    }
     
    public void reduzirCoragem(){
        if(coragem>1) coragem--;
        else{
            coragem = 0;
            death("coragem");
        }
    }
    
    private void death(String motivoMorte){   
        vivo = false;
        this.motivoMorte = motivoMorte;
    }
}
