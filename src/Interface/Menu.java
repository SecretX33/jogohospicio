/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import BancoDados.DAO;
import Elementos.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Time;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.util.Duration.millis;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Menu extends javax.swing.JFrame {
    private Jogador jogador;  
    private Save saveAtual;
    
    private int tipoTela;
    private int numSaveAtual;
    private int numEtapaAtual;
    private long loginHorarioInicial;
    private long loginHorarioFinal;
    private long saveHorarioInicial;
    private long saveHorarioFinal;
    private boolean saved;
    private String escolhas;

    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(Menu.EXIT_ON_CLOSE);
        checkSelected();
        saved=false;
        escolhas="";
    }

    public Menu(Jogador j, int i) {
        this();
        this.jogador = j;
        this.tipoTela = i;
        this.saveAtual = new Save(jogador.getCod_usuario());
        this.numSaveAtual = 0;
        this.loginHorarioInicial=System.currentTimeMillis();
        this.loginHorarioFinal=0;
        this.saveHorarioInicial=0;
        this.saveHorarioFinal=0;
        labelNomeJogador.setText(jogador.getApelido());
        labelNomeJogador1.setText(jogador.getApelido());
        labelTempoJogo.setText(convertLongToString(jogador.getTempo_jogo()));
        labelTempoJogo1.setText(convertLongToString(jogador.getTempo_jogo()));
        setTela(i);
        
        setVisible(true);
    }
    
    public Menu(Jogador j, int i, long lHI){
        this();
        this.jogador = j;
        this.tipoTela = i;
        this.saveAtual = new Save(jogador.getCod_usuario());
        this.numSaveAtual = 0;
        this.loginHorarioInicial=System.currentTimeMillis();
        this.loginHorarioFinal=0;
        this.saveHorarioInicial=0;
        this.saveHorarioFinal=0;
        this.loginHorarioInicial=lHI;
        atualizarHorasJogador();   
        labelNomeJogador.setText(jogador.getApelido());
        labelNomeJogador1.setText(jogador.getApelido());
        labelTempoJogo.setText(convertLongToString(jogador.getTempo_jogo()));
        labelTempoJogo1.setText(convertLongToString(jogador.getTempo_jogo()));
        setTela(i);
        
        setVisible(true);
    }

    public Menu(Jogador j, int i, Save s, int ea, long lHI, long lHF, long sHI, long sHF, String escolhas) {
        this();
        this.jogador = j;
        this.tipoTela = i;
        this.saveAtual = s;
        this.numSaveAtual = s.getSlot_save()-1;
        this.numEtapaAtual = ea;
        this.loginHorarioInicial=(sHI!=0)?lHI:System.currentTimeMillis();
        this.loginHorarioFinal=lHF;
        this.saveHorarioInicial=sHI;
        this.saveHorarioFinal=sHF;
        this.escolhas = escolhas;     
        labelNomeJogador.setText(jogador.getApelido());
        labelNomeJogador1.setText(jogador.getApelido());
        labelTempoJogo.setText(convertLongToString(jogador.getTempo_jogo()));
        labelTempoJogo1.setText(convertLongToString(jogador.getTempo_jogo()));
        setTela(i);
        
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tela = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botaoLogout = new javax.swing.JButton();
        labelNomeJogador = new javax.swing.JLabel();
        botaoNovoJogo = new javax.swing.JButton();
        labelLogadoComo = new javax.swing.JLabel();
        botaoContinuar = new javax.swing.JButton();
        labelTempoJogo = new javax.swing.JLabel();
        save = new javax.swing.JPanel();
        rbS2 = new javax.swing.JRadioButton();
        rbS1 = new javax.swing.JRadioButton();
        rbS4 = new javax.swing.JRadioButton();
        rbS3 = new javax.swing.JRadioButton();
        labelSave = new javax.swing.JLabel();
        labelLogadoComo1 = new javax.swing.JLabel();
        labelNomeJogador1 = new javax.swing.JLabel();
        labelEtapaS1 = new javax.swing.JLabel();
        labelHorasS1 = new javax.swing.JLabel();
        labelHorasS2 = new javax.swing.JLabel();
        labelEtapaS2 = new javax.swing.JLabel();
        labelHorasS3 = new javax.swing.JLabel();
        labelEtapaS3 = new javax.swing.JLabel();
        labelHorasS4 = new javax.swing.JLabel();
        labelEtapaS4 = new javax.swing.JLabel();
        botaoVoltar = new javax.swing.JButton();
        botaoSalvarOuCarregar = new javax.swing.JButton();
        labelTempoJogo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tela.setPreferredSize(new java.awt.Dimension(399, 277));
        tela.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("O HOSPÍCIO");

        botaoLogout.setText("Logout");
        botaoLogout.setMaximumSize(new java.awt.Dimension(65, 20));
        botaoLogout.setMinimumSize(new java.awt.Dimension(65, 20));
        botaoLogout.setPreferredSize(new java.awt.Dimension(65, 20));
        botaoLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLogoutActionPerformed(evt);
            }
        });

        labelNomeJogador.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelNomeJogador.setForeground(new java.awt.Color(200, 20, 20));
        labelNomeJogador.setText("nomeJogador");

        botaoNovoJogo.setText("Novo jogo");
        botaoNovoJogo.setMaximumSize(new java.awt.Dimension(79, 32));
        botaoNovoJogo.setMinimumSize(new java.awt.Dimension(79, 32));
        botaoNovoJogo.setPreferredSize(new java.awt.Dimension(79, 32));
        botaoNovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoJogoActionPerformed(evt);
            }
        });
        botaoNovoJogo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoNovoJogoKeyPressed(evt);
            }
        });

        labelLogadoComo.setText("Logado como:");

        botaoContinuar.setText("Continuar");
        botaoContinuar.setMaximumSize(new java.awt.Dimension(79, 32));
        botaoContinuar.setMinimumSize(new java.awt.Dimension(79, 32));
        botaoContinuar.setPreferredSize(new java.awt.Dimension(79, 32));
        botaoContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoContinuarActionPerformed(evt);
            }
        });
        botaoContinuar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoContinuarKeyPressed(evt);
            }
        });

        labelTempoJogo.setText("tempoJogo");

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(botaoContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelLogadoComo)
                            .addComponent(labelNomeJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(menuLayout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(botaoNovoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelTempoJogo))
                        .addGap(54, 54, 54)
                        .addComponent(botaoLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(botaoNovoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(botaoContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(botaoLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelLogadoComo)
                        .addGap(6, 6, 6)
                        .addComponent(labelNomeJogador)
                        .addGap(8, 8, 8)
                        .addComponent(labelTempoJogo))))
        );

        tela.add(menu, "card2");

        save.setPreferredSize(new java.awt.Dimension(399, 260));

        rbS2.setText("Save 2");
        rbS2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbS2ActionPerformed(evt);
            }
        });

        rbS1.setText("Save 1");
        rbS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbS1ActionPerformed(evt);
            }
        });

        rbS4.setText("Save 4");
        rbS4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbS4ActionPerformed(evt);
            }
        });

        rbS3.setText("Save 3");
        rbS3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbS3ActionPerformed(evt);
            }
        });

        labelSave.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        labelSave.setForeground(new java.awt.Color(20, 20, 255));
        labelSave.setText("Saves");

        labelLogadoComo1.setText("Logado como:");

        labelNomeJogador1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelNomeJogador1.setForeground(new java.awt.Color(200, 20, 20));
        labelNomeJogador1.setText("nomeJogador");

        labelEtapaS1.setText("S1_Etapa");

        labelHorasS1.setText("S1_Horas");

        labelHorasS2.setText("S2_Horas");

        labelEtapaS2.setText("S2_Etapa");

        labelHorasS3.setText("S3_Horas");

        labelEtapaS3.setText("S3_Etapa");

        labelHorasS4.setText("S4_Horas");

        labelEtapaS4.setText("S4_Etapa");

        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        botaoSalvarOuCarregar.setText("Salvar");
        botaoSalvarOuCarregar.setEnabled(false);
        botaoSalvarOuCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarOuCarregarActionPerformed(evt);
            }
        });

        labelTempoJogo1.setText("tempoJogo");

        javax.swing.GroupLayout saveLayout = new javax.swing.GroupLayout(save);
        save.setLayout(saveLayout);
        saveLayout.setHorizontalGroup(
            saveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saveLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(saveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelLogadoComo1)
                    .addComponent(labelNomeJogador1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTempoJogo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(botaoSalvarOuCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(saveLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(labelSave)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(saveLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(saveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rbS1)
                    .addGroup(saveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelHorasS1)
                        .addComponent(labelEtapaS1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(saveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rbS2)
                    .addGroup(saveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelHorasS2)
                        .addComponent(labelEtapaS2)))
                .addGap(18, 18, 18)
                .addGroup(saveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rbS3)
                    .addGroup(saveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelHorasS3)
                        .addComponent(labelEtapaS3)))
                .addGap(18, 18, 18)
                .addGroup(saveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbS4)
                    .addComponent(labelEtapaS4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelHorasS4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(53, 53, 53))
        );
        saveLayout.setVerticalGroup(
            saveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saveLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(saveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbS1)
                    .addComponent(rbS2)
                    .addComponent(rbS3)
                    .addComponent(rbS4))
                .addGap(7, 7, 7)
                .addGroup(saveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(saveLayout.createSequentialGroup()
                        .addComponent(labelEtapaS1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelHorasS1))
                    .addGroup(saveLayout.createSequentialGroup()
                        .addComponent(labelEtapaS2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelHorasS2))
                    .addGroup(saveLayout.createSequentialGroup()
                        .addComponent(labelEtapaS4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelHorasS4))
                    .addGroup(saveLayout.createSequentialGroup()
                        .addComponent(labelEtapaS3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelHorasS3)))
                .addGroup(saveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(saveLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(saveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoVoltar)
                            .addComponent(botaoSalvarOuCarregar))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, saveLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelLogadoComo1)
                        .addGap(6, 6, 6)
                        .addComponent(labelNomeJogador1)
                        .addGap(7, 7, 7)
                        .addComponent(labelTempoJogo1))))
        );

        tela.add(save, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(tela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(tela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoContinuarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoContinuarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoContinuarKeyPressed

    private void botaoContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoContinuarActionPerformed
        setTela(1);
    }//GEN-LAST:event_botaoContinuarActionPerformed

    private void botaoNovoJogoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoNovoJogoKeyPressed

    }//GEN-LAST:event_botaoNovoJogoKeyPressed

    private void botaoNovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoJogoActionPerformed
        super.dispose();
        this.setVisible(false);
        System.out.println(String.format("[Menu] NOVO JOGO » Etapa atual: %d, Coragem: %d.", saveAtual.getEtapa_atual(), saveAtual.getCoragem()));
        createNewGame();
    }//GEN-LAST:event_botaoNovoJogoActionPerformed

    private void botaoLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLogoutActionPerformed
        jogador = null;
        saveAtual = null;
        this.dispose();
        TelaLogin tl = new TelaLogin();
    }//GEN-LAST:event_botaoLogoutActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        if(tipoTela == 1)
            setTela(0);
        else if(tipoTela == 2) {
            createNewGame();
        }
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void rbS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbS1ActionPerformed
        rbS2.setSelected(false);
        rbS3.setSelected(false);
        rbS4.setSelected(false);
        checkSelected();
    }//GEN-LAST:event_rbS1ActionPerformed

    private void rbS2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbS2ActionPerformed
        rbS1.setSelected(false);
        rbS3.setSelected(false);
        rbS4.setSelected(false);
        checkSelected();
    }//GEN-LAST:event_rbS2ActionPerformed

    private void rbS3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbS3ActionPerformed
        rbS1.setSelected(false);
        rbS2.setSelected(false);
        rbS4.setSelected(false);
        checkSelected();
    }//GEN-LAST:event_rbS3ActionPerformed

    private void rbS4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbS4ActionPerformed
        rbS1.setSelected(false);
        rbS2.setSelected(false);
        rbS3.setSelected(false);
        checkSelected();
    }//GEN-LAST:event_rbS4ActionPerformed

    private void botaoSalvarOuCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarOuCarregarActionPerformed
        if(checkSelected()){
            if(tipoTela == 1){
                if(rbS1.isSelected())
                    numSaveAtual = 0;
                else if (rbS2.isSelected())
                    numSaveAtual = 1;
                else if (rbS3.isSelected())
                    numSaveAtual = 2;
                else if (rbS4.isSelected())
                    numSaveAtual = 3;
                //saveAtual.setSlot_save(numSaveAtual);
                //copyStatus(jogador.getSave(numSaveAtual),saveAtual);
                saveAtual = jogador.getSave(numSaveAtual);
                createNewGame();
            }
            else if(tipoTela == 2) {
                if(rbS1.isSelected())
                    numSaveAtual = 0;
                else if (rbS2.isSelected())
                    numSaveAtual = 1;
                else if (rbS3.isSelected())
                    numSaveAtual = 2;
                else if (rbS4.isSelected())
                    numSaveAtual = 3;
                
                // Atualizando as informações do saveAtual com as obtidas da TelaPrincipal
                saveAtual.setSlot_save(numSaveAtual);
                saveAtual.setEtapa_atual(numEtapaAtual);
                saveAtual.setTempo_jogo(saveAtual.getTempo_jogo() + (saveHorarioFinal - saveHorarioInicial));
                saveAtual.setEscolhas(saveAtual.getEscolhas() + escolhas);
                // Atualizando o save no jogador com o saveAtual, no slot escolhido pelo usuário
                jogador.setSave(saveAtual, numSaveAtual);
                // Atualizando o save no banco com o saveAtual
                try {
                    DAO.AtualizarSave(saveAtual);
                } catch (SQLIntegrityConstraintViolationException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
                atualizarHorasJogador();
                updateTelaSave();
                saved=true;
                createNewGame();
            }
        }
        else System.out.println("Não há botões selecionados.");
    }//GEN-LAST:event_botaoSalvarOuCarregarActionPerformed

    private void atualizarHorasJogador(){
        loginHorarioFinal = System.currentTimeMillis();
        // Calculando o novo tempo jogado pelo jogador
        jogador.setTempo_jogo(jogador.getTempo_jogo() + (loginHorarioFinal - loginHorarioInicial));
        loginHorarioInicial = loginHorarioFinal;
        loginHorarioFinal = 0;
        // Atualizando no banco o tempo de jogo do jogador
        try {
            DAO.AtualizarJogador(jogador);
        } catch (SQLIntegrityConstraintViolationException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }         
    }
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    private void createNewGame() {
        this.dispose();
        TelaPrincipal tp = new TelaPrincipal(jogador, saveAtual, numSaveAtual, loginHorarioInicial, loginHorarioFinal, saveHorarioInicial, saveHorarioFinal, saved, escolhas);
    }

    private boolean checkSelected() {
        if (rbS1.isSelected() || rbS2.isSelected() || rbS3.isSelected() || rbS4.isSelected()) {
            botaoSalvarOuCarregar.setEnabled(true);
            return true;
        } else {
            botaoSalvarOuCarregar.setEnabled(false);
            return false;
        }
    }

    private void setTela(int i) {
        tela.removeAll();
        tipoTela = i;

        if(tipoTela == 0)
            tela.add(menu);
        else{
            updateTelaSave();
            tela.add(save);
        }

        tela.repaint();
        tela.revalidate();
    }

    private void updateTelaSave() {
        if (tipoTela == 1) {
            botaoSalvarOuCarregar.setText("Carregar");
        } else if (tipoTela == 2) {
            botaoSalvarOuCarregar.setText("Salvar");
        }
        
        rbS1.setSelected(false);
        rbS2.setSelected(false);
        rbS3.setSelected(false);
        rbS4.setSelected(false);
        
        for (int i=0; i<4; i++) {
            int etapa_atual = jogador.getSave(i).getEtapa_atual();
            long horas = jogador.getSave(i).getTempo_jogo();
            if(tipoTela == 1 && etapa_atual==0) {
                switch (i) {
                    case 0:
                        rbS1.setEnabled(false);
                        break;
                    case 1:
                        rbS2.setEnabled(false);
                        break;
                    case 2:
                        rbS3.setEnabled(false);
                        break;
                    case 3:
                        rbS4.setEnabled(false);
                        break;
                }
            }
            else if(tipoTela==2){
                switch(numSaveAtual){
                     case 0:
                        rbS1.setSelected(true);
                        break;
                    case 1:
                        rbS2.setSelected(true);
                        break;
                    case 2:
                        rbS3.setSelected(true);
                        break;
                    case 3:
                        rbS4.setSelected(true);
                        break;
                }
                checkSelected();
            }
            switch (i) {
                case 0:
                    labelEtapaS1.setText((etapa_atual == 0) ? "Vazio" : "Etapa: " + Integer.toString(etapa_atual));
                    labelHorasS1.setText((horas == 0) ? "" : convertLongToString(horas));
                    break;
                case 1:
                    labelEtapaS2.setText((etapa_atual == 0) ? "Vazio" : "Etapa: " + Integer.toString(etapa_atual));
                    labelHorasS2.setText((horas == 0) ? "" : convertLongToString(horas));
                    break;
                case 2:
                    labelEtapaS3.setText((etapa_atual == 0) ? "Vazio" : "Etapa: " + Integer.toString(etapa_atual));
                    labelHorasS3.setText((horas == 0) ? "" : convertLongToString(horas));
                    break;
                case 3:
                    labelEtapaS4.setText((etapa_atual == 0) ? "Vazio" : "Etapa: " + Integer.toString(etapa_atual));
                    labelHorasS4.setText((horas == 0) ? "" : convertLongToString(horas));
                    break;
                default:
                    break;
            }
        }
    }
    
    private String convertLongToString(long l){
        String hms = String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(l),
        TimeUnit.MILLISECONDS.toMinutes(l) % TimeUnit.HOURS.toMinutes(1),
        TimeUnit.MILLISECONDS.toSeconds(l) % TimeUnit.MINUTES.toSeconds(1));
        return hms;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoContinuar;
    private javax.swing.JButton botaoLogout;
    private javax.swing.JButton botaoNovoJogo;
    private javax.swing.JButton botaoSalvarOuCarregar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelEtapaS1;
    private javax.swing.JLabel labelEtapaS2;
    private javax.swing.JLabel labelEtapaS3;
    private javax.swing.JLabel labelEtapaS4;
    private javax.swing.JLabel labelHorasS1;
    private javax.swing.JLabel labelHorasS2;
    private javax.swing.JLabel labelHorasS3;
    private javax.swing.JLabel labelHorasS4;
    private javax.swing.JLabel labelLogadoComo;
    private javax.swing.JLabel labelLogadoComo1;
    private javax.swing.JLabel labelNomeJogador;
    private javax.swing.JLabel labelNomeJogador1;
    private javax.swing.JLabel labelSave;
    private javax.swing.JLabel labelTempoJogo;
    private javax.swing.JLabel labelTempoJogo1;
    private javax.swing.JPanel menu;
    private javax.swing.JRadioButton rbS1;
    private javax.swing.JRadioButton rbS2;
    private javax.swing.JRadioButton rbS3;
    private javax.swing.JRadioButton rbS4;
    private javax.swing.JPanel save;
    private javax.swing.JPanel tela;
    // End of variables declaration//GEN-END:variables
}
