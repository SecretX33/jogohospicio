package Elementos;


public class Jogador {
    private int cod_usuario;
    private String usuario;
    private String senha;
    private String apelido;
    private long tempo_jogo;
    private Save[] slot;
    
    public Jogador(String usuario, String senha, String apelido){
        this.cod_usuario = 0;
        this.usuario = usuario;
        this.senha = senha;
        this.apelido = apelido;
        this.tempo_jogo = 0;
        this.slot = new Save[4];      
        for(int i=0; i<4; i++) this.slot = null;        
    }
    
    public Jogador(int cod_usuario, String usuario, String senha, String apelido, long tempo_jogo, Save slot0, Save slot1, Save slot2, Save slot3) {
        this.cod_usuario = cod_usuario;
        this.usuario = usuario;
        this.senha = senha;
        this.apelido = apelido;
        this.tempo_jogo = tempo_jogo;
        this.slot = new Save[4]; 
       
        for(int i=0; i<4; i++){
            switch(i){
                case 0:
                    this.slot[i] = slot0;
                    break;
                case 1:
                    this.slot[i] = slot1;
                    break;
                case 2:
                    this.slot[i] = slot2;
                    break;
                case 3:
                    this.slot[i] = slot3;
                    break;
                    
            }
        }
    }

     public int getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(int cod_usuario) {
        this.cod_usuario = cod_usuario;
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

    public long getTempo_jogo() {
        return tempo_jogo;
    }

    public void setTempo_jogo(long tempo_jogo) {
        this.tempo_jogo = tempo_jogo;
    }
    
    public Save getSave(int numSlot){
        if(numSlot<0 || numSlot>3) throw new IllegalArgumentException(String.format("O número do slot de save solicitado (%d) não existe.",numSlot));
        else return slot[numSlot];
    }
    
    public void setSave(Save s, int numSlot){
        if(numSlot<0 || numSlot>3) throw new IllegalArgumentException(String.format("O número do slot de save solicitado (%d) não existe.",numSlot));
        else slot[numSlot] = s;
    }
}