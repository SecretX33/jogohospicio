package _Old;

import java.util.concurrent.TimeUnit;

public class Fase1 {
    private QuadroGenerico tela = new QuadroGenerico();
    public static boolean clear;

    public Fase1() {
        tela.setDefaultCloseOperation(tela.EXIT_ON_CLOSE);
        clear = false;
    }

    public void start() {
        QuadroDecisao q1 = new QuadroDecisao(1, "Você ouviu um barulho, o que deseja fazer?", "Correr!", "Se esconder!");
        QuadroDecisao q2 = new QuadroDecisao(2, "Você é muito ruim, tente novamente.", "Ok...", "Não desisto nunca!");
        
        tela.mostraTela(q1);
        tela.setVisible(true);
        //while(!clear);
        tela.mostraTela(q2);
        
    }
    public static void levelClear(){
        clear = true;
    }
}