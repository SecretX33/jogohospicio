/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import BancoDados.DAO;
import Elementos.*;
import Principal.JogoHospicio;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Point;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;

/**
 *
 * @author User
 */
public class TelaPrincipal extends javax.swing.JFrame {
    private Jogador jogador;
    private Etapa etapaAtual;
    private Save saveAtual;
    
    private int tipoQuadroAtual;
    private boolean saved;
    private long loginHorarioInicial;
    private long loginHorarioFinal;
    private long saveHorarioInicial;
    private long saveHorarioFinal;
    private String escolhas;
    
    public TelaPrincipal(){
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(Menu.EXIT_ON_CLOSE);
        saved = true;
    }
    
    public TelaPrincipal(Jogador j, Save sA, int nSSA, long lHI, long lHF, long sHI, long sHF, boolean saved) {
        this();
        this.jogador = j;
        this.saveAtual = sA;
        this.etapaAtual = DAO.getEtapa((saveAtual.getEtapa_atual() == 0)? 1 : saveAtual.getEtapa_atual());
        this.nomeJogador.setText(jogador.getApelido());
        this.tipoQuadroAtual = etapaAtual.getTipo_quadro();      
        this.loginHorarioInicial=lHI;
        this.loginHorarioFinal=lHF;
        this.saveHorarioInicial=(sHI!=0)?sHI:System.currentTimeMillis();
        this.saveHorarioFinal=sHF;
        this.saved=saved;
        atualizarInterface();
        setVisible(true);
    }

    private void sairParaMenu(){
        this.dispose();
        Menu m = new Menu(jogador,0,loginHorarioInicial);
    }
    private void sairParaSave(){
        this.dispose();
        saveHorarioFinal=System.currentTimeMillis();
        Menu m = new Menu(jogador, 2, saveAtual, etapaAtual.getCod(), loginHorarioInicial, loginHorarioFinal, saveHorarioInicial, saveHorarioFinal);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tela = new javax.swing.JPanel();
        status = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        barraEmocional = new javax.swing.JProgressBar();
        barraSanidade = new javax.swing.JProgressBar();
        barraCarisma = new javax.swing.JProgressBar();
        barraCoragem = new javax.swing.JProgressBar();
        nomeJogador = new javax.swing.JLabel();
        labelSanidade = new javax.swing.JLabel();
        labelEmocional = new javax.swing.JLabel();
        labelCarisma = new javax.swing.JLabel();
        labelCoragem = new javax.swing.JLabel();
        percSanidade = new javax.swing.JLabel();
        percEmocional = new javax.swing.JLabel();
        percCarisma = new javax.swing.JLabel();
        percCoragem = new javax.swing.JLabel();
        botaoSair = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        labelEtapaAtual = new javax.swing.JLabel();
        alternar = new javax.swing.JPanel();
        decisao = new javax.swing.JPanel();
        botaoOpcao1 = new javax.swing.JButton();
        botaoOpcao2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTextoDecisao = new javax.swing.JTextArea();
        avancar = new javax.swing.JPanel();
        botaoAvancar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaTextoAvancar = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        barraEmocional.setForeground(new java.awt.Color(153, 255, 204));
        barraEmocional.setMaximum(20);

        barraSanidade.setForeground(new java.awt.Color(255, 51, 51));
        barraSanidade.setMaximum(20);

        barraCarisma.setForeground(new java.awt.Color(102, 255, 102));
        barraCarisma.setMaximum(20);

        barraCoragem.setForeground(new java.awt.Color(51, 102, 255));
        barraCoragem.setMaximum(20);

        nomeJogador.setText("nomeJogador");

        labelSanidade.setText("Sanidade");

        labelEmocional.setText("Emocional");

        labelCarisma.setText("Carisma");

        labelCoragem.setText("Coragem");

        percSanidade.setText("%");

        percEmocional.setText("%");

        percCarisma.setText("%");

        percCoragem.setText("%");

        botaoSair.setText("Sair");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        labelEtapaAtual.setText("etapaAtual");

        javax.swing.GroupLayout statusLayout = new javax.swing.GroupLayout(status);
        status.setLayout(statusLayout);
        statusLayout.setHorizontalGroup(
            statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(statusLayout.createSequentialGroup()
                        .addGroup(statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(barraSanidade, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(nomeJogador, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(barraEmocional, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(barraCarisma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(barraCoragem, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(statusLayout.createSequentialGroup()
                                .addComponent(labelCoragem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(percCoragem))
                            .addGroup(statusLayout.createSequentialGroup()
                                .addComponent(labelSanidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(percSanidade))
                            .addGroup(statusLayout.createSequentialGroup()
                                .addComponent(labelEmocional)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(percEmocional))
                            .addGroup(statusLayout.createSequentialGroup()
                                .addComponent(labelCarisma)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(percCarisma))
                            .addComponent(botaoSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10))
                    .addGroup(statusLayout.createSequentialGroup()
                        .addComponent(labelEtapaAtual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        statusLayout.setVerticalGroup(
            statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jSeparator3))
            .addGroup(statusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomeJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelEtapaAtual)
                .addGap(23, 23, 23)
                .addGroup(statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSanidade)
                    .addComponent(percSanidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barraSanidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmocional)
                    .addComponent(percEmocional))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barraEmocional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCarisma)
                    .addComponent(percCarisma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barraCarisma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCoragem)
                    .addComponent(percCoragem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barraCoragem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoSair)
                .addContainerGap())
        );

        alternar.setLayout(new java.awt.CardLayout());

        botaoOpcao1.setText("Opcao1");
        botaoOpcao1.setMaximumSize(new java.awt.Dimension(75, 25));
        botaoOpcao1.setMinimumSize(new java.awt.Dimension(75, 25));
        botaoOpcao1.setPreferredSize(new java.awt.Dimension(75, 25));
        botaoOpcao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOpcao1ActionPerformed(evt);
            }
        });

        botaoOpcao2.setText("Opcao2");
        botaoOpcao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOpcao2ActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        areaTextoDecisao.setColumns(20);
        areaTextoDecisao.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        areaTextoDecisao.setLineWrap(true);
        areaTextoDecisao.setRows(5);
        areaTextoDecisao.setText("areaTextoDecisao\n");
        areaTextoDecisao.setWrapStyleWord(true);
        areaTextoDecisao.setCaretPosition(0);
        jScrollPane1.setViewportView(areaTextoDecisao);

        javax.swing.GroupLayout decisaoLayout = new javax.swing.GroupLayout(decisao);
        decisao.setLayout(decisaoLayout);
        decisaoLayout.setHorizontalGroup(
            decisaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(decisaoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(decisaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(decisaoLayout.createSequentialGroup()
                        .addComponent(botaoOpcao1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoOpcao2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        decisaoLayout.setVerticalGroup(
            decisaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, decisaoLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addGroup(decisaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoOpcao1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoOpcao2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        alternar.add(decisao, "card2");

        botaoAvancar.setText("Avançar");
        botaoAvancar.setMaximumSize(new java.awt.Dimension(75, 25));
        botaoAvancar.setMinimumSize(new java.awt.Dimension(75, 25));
        botaoAvancar.setPreferredSize(new java.awt.Dimension(75, 25));
        botaoAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAvancarActionPerformed(evt);
            }
        });

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setAutoscrolls(true);

        areaTextoAvancar.setColumns(20);
        areaTextoAvancar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        areaTextoAvancar.setLineWrap(true);
        areaTextoAvancar.setRows(5);
        areaTextoAvancar.setText("areaTextoDecisao\n");
        areaTextoAvancar.setWrapStyleWord(true);
        areaTextoAvancar.setCaretPosition(0);
        jScrollPane2.setViewportView(areaTextoAvancar);

        javax.swing.GroupLayout avancarLayout = new javax.swing.GroupLayout(avancar);
        avancar.setLayout(avancarLayout);
        avancarLayout.setHorizontalGroup(
            avancarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(avancarLayout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addComponent(botaoAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
            .addGroup(avancarLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane2)
                .addGap(17, 17, 17))
        );
        avancarLayout.setVerticalGroup(
            avancarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, avancarLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addGap(9, 9, 9)
                .addComponent(botaoAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        alternar.add(avancar, "card3");

        javax.swing.GroupLayout telaLayout = new javax.swing.GroupLayout(tela);
        tela.setLayout(telaLayout);
        telaLayout.setHorizontalGroup(
            telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(alternar, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        telaLayout.setVerticalGroup(
            telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(alternar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoOpcao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOpcao2ActionPerformed
        avancarEtapa(2);
    }//GEN-LAST:event_botaoOpcao2ActionPerformed

    private void botaoOpcao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOpcao1ActionPerformed
        avancarEtapa(1);
    }//GEN-LAST:event_botaoOpcao1ActionPerformed

    private void botaoAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAvancarActionPerformed
        avancarEtapa(0);
    }//GEN-LAST:event_botaoAvancarActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        sairParaSave();
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        if(!saved){
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this,"Você deseja salvar antes de sair?","Aviso",dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION){
                sairParaSave();
            }
            else if(dialogResult == JOptionPane.NO_OPTION){
                sairParaMenu();
            }
        }
        else sairParaMenu();
    }//GEN-LAST:event_botaoSairActionPerformed

  
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel alternar;
    private javax.swing.JTextArea areaTextoAvancar;
    private javax.swing.JTextArea areaTextoDecisao;
    private javax.swing.JPanel avancar;
    private javax.swing.JProgressBar barraCarisma;
    private javax.swing.JProgressBar barraCoragem;
    private javax.swing.JProgressBar barraEmocional;
    private javax.swing.JProgressBar barraSanidade;
    private javax.swing.JButton botaoAvancar;
    private javax.swing.JButton botaoOpcao1;
    private javax.swing.JButton botaoOpcao2;
    private javax.swing.JButton botaoSair;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JPanel decisao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel labelCarisma;
    private javax.swing.JLabel labelCoragem;
    private javax.swing.JLabel labelEmocional;
    private javax.swing.JLabel labelEtapaAtual;
    private javax.swing.JLabel labelSanidade;
    private javax.swing.JLabel nomeJogador;
    private javax.swing.JLabel percCarisma;
    private javax.swing.JLabel percCoragem;
    private javax.swing.JLabel percEmocional;
    private javax.swing.JLabel percSanidade;
    private javax.swing.JPanel status;
    private javax.swing.JPanel tela;
    // End of variables declaration//GEN-END:variables

    private void avancarEtapa(int botao){
        saved = false;
        if(botao==0){
            escolhas+="0";
        }
        else if(botao==1){
            escolhas+="1";
        }
        else{
            escolhas+="2";
        }
        if(etapaAtual.getRef_op1() > 0){
            Etapa proxEtapa;
            
            atualizarStatus(botao);
            if(botao < 2) proxEtapa = DAO.getEtapa(etapaAtual.getRef_op1());
            else proxEtapa = DAO.getEtapa(etapaAtual.getRef_op2());

            if(tipoQuadroAtual != proxEtapa.getTipo_quadro()){
                tipoQuadroAtual = proxEtapa.getTipo_quadro();
            }
            etapaAtual = proxEtapa;
            atualizarInterface();       
        }
        else{
            saveHorarioFinal=System.currentTimeMillis();
            JOptionPane.showMessageDialog(this, String.format("Parabéns, você terminou o jogo!\n\nTempo jogado: %s",convertLongToString(saveAtual.getTempo_jogo() + (saveHorarioFinal - saveHorarioInicial))), "WOW", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void atualizarInterface(){
        alternar.removeAll();
        
        if(etapaAtual.getTipo_quadro() == 0){
            alternar.add(decisao);
            botaoOpcao1.setText(etapaAtual.getTextobt1());
            botaoOpcao2.setText(etapaAtual.getTextobt2());
            areaTextoDecisao.setText(String.format(etapaAtual.getDescricao()));
            areaTextoDecisao.setCaretPosition(0);
        }
        else{
            alternar.add(avancar);
            botaoOpcao1.setText("");
            botaoOpcao2.setText("");
            areaTextoAvancar.setText(String.format(etapaAtual.getDescricao()));
            areaTextoAvancar.setCaretPosition(0);
        }
        
        labelEtapaAtual.setText(String.format("Etapa: %d",etapaAtual.getCod()));
        barraSanidade.setValue(saveAtual.getSanidade());
        percSanidade.setText(String.format("%d%%",(barraSanidade.getValue()*5)));
        barraEmocional.setValue(saveAtual.getEmocional());
        percEmocional.setText(String.format("%d%%",(barraEmocional.getValue()*5)));
        barraCarisma.setValue(saveAtual.getCarisma());
        percCarisma.setText(String.format("%d%%",(barraCarisma.getValue()*5)));
        barraCoragem.setValue(saveAtual.getCoragem());
        percCoragem.setText(String.format("%d%%",(barraCoragem.getValue()*5)));

        tela.repaint();
        tela.revalidate(); 
    }
    
    private void atualizarStatus(int botao){
        if(botao == 1){
            saveAtual.alterarSanidade(etapaAtual.getImp_sanidade1());
            saveAtual.alterarEmocional(etapaAtual.getImp_emocional1());
            saveAtual.alterarCarisma(etapaAtual.getImp_carisma1());
            saveAtual.alterarCoragem(etapaAtual.getImp_coragem1());
        }
        else if(botao == 2){
            saveAtual.alterarSanidade(etapaAtual.getImp_sanidade2());
            saveAtual.alterarEmocional(etapaAtual.getImp_emocional2());
            saveAtual.alterarCarisma(etapaAtual.getImp_carisma2());
            saveAtual.alterarCoragem(etapaAtual.getImp_coragem2());
        }
    }
    private String convertLongToString(long l){
        String hms = String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(l),
        TimeUnit.MILLISECONDS.toMinutes(l) % TimeUnit.HOURS.toMinutes(1),
        TimeUnit.MILLISECONDS.toSeconds(l) % TimeUnit.MINUTES.toSeconds(1));
        return hms;
    }
}
