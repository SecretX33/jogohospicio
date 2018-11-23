/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.CardLayout;
import java.awt.Container;

/**
 *
 * @author User
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form QuadroTemporario
     */
    public TelaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(Menu.EXIT_ON_CLOSE);
        atualizarStatus();
        nomeJogador.setText(Menu.jogador.getNome());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Stats = new javax.swing.JPanel();
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
        Decisao = new javax.swing.JPanel();
        botaoOpcao1 = new javax.swing.JButton();
        botaoOpcao2 = new javax.swing.JButton();
        areaTexto = new javax.swing.JFormattedTextField();
        Avancar = new javax.swing.JPanel();
        botaoAvancar = new javax.swing.JButton();
        areaTexto1 = new javax.swing.JFormattedTextField();

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

        javax.swing.GroupLayout StatsLayout = new javax.swing.GroupLayout(Stats);
        Stats.setLayout(StatsLayout);
        StatsLayout.setHorizontalGroup(
            StatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StatsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(StatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barraSanidade, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(nomeJogador, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addComponent(barraEmocional, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(barraCarisma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(barraCoragem, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(StatsLayout.createSequentialGroup()
                        .addComponent(labelCoragem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(percCoragem))
                    .addGroup(StatsLayout.createSequentialGroup()
                        .addComponent(labelSanidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(percSanidade))
                    .addGroup(StatsLayout.createSequentialGroup()
                        .addComponent(labelEmocional)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(percEmocional))
                    .addGroup(StatsLayout.createSequentialGroup()
                        .addComponent(labelCarisma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(percCarisma)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(473, 473, 473))
        );
        StatsLayout.setVerticalGroup(
            StatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StatsLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jSeparator3))
            .addGroup(StatsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomeJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(StatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSanidade)
                    .addComponent(percSanidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barraSanidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(StatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmocional)
                    .addComponent(percEmocional))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barraEmocional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(StatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCarisma)
                    .addComponent(percCarisma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barraCarisma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(StatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCoragem)
                    .addComponent(percCoragem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barraCoragem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 97, Short.MAX_VALUE))
        );

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

        areaTexto.setEditable(false);
        areaTexto.setText("areaTexto");
        areaTexto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        areaTexto.setRequestFocusEnabled(false);

        javax.swing.GroupLayout DecisaoLayout = new javax.swing.GroupLayout(Decisao);
        Decisao.setLayout(DecisaoLayout);
        DecisaoLayout.setHorizontalGroup(
            DecisaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DecisaoLayout.createSequentialGroup()
                .addContainerGap(173, Short.MAX_VALUE)
                .addGroup(DecisaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DecisaoLayout.createSequentialGroup()
                        .addComponent(botaoOpcao1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoOpcao2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(areaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        DecisaoLayout.setVerticalGroup(
            DecisaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DecisaoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(areaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(DecisaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoOpcao1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoOpcao2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        botaoAvancar.setText("Avançar");
        botaoAvancar.setMaximumSize(new java.awt.Dimension(75, 25));
        botaoAvancar.setMinimumSize(new java.awt.Dimension(75, 25));
        botaoAvancar.setPreferredSize(new java.awt.Dimension(75, 25));
        botaoAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAvancarActionPerformed(evt);
            }
        });

        areaTexto1.setEditable(false);
        areaTexto1.setText("areaTexto");
        areaTexto1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        areaTexto1.setRequestFocusEnabled(false);

        javax.swing.GroupLayout AvancarLayout = new javax.swing.GroupLayout(Avancar);
        Avancar.setLayout(AvancarLayout);
        AvancarLayout.setHorizontalGroup(
            AvancarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AvancarLayout.createSequentialGroup()
                .addContainerGap(173, Short.MAX_VALUE)
                .addGroup(AvancarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AvancarLayout.createSequentialGroup()
                        .addComponent(areaTexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AvancarLayout.createSequentialGroup()
                        .addComponent(botaoAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))))
        );
        AvancarLayout.setVerticalGroup(
            AvancarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AvancarLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(areaTexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Avancar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Decisao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Stats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Avancar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Decisao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Stats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoOpcao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOpcao2ActionPerformed
       
    }//GEN-LAST:event_botaoOpcao2ActionPerformed

    private void botaoOpcao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOpcao1ActionPerformed

     
    }//GEN-LAST:event_botaoOpcao1ActionPerformed

    private void botaoAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAvancarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoAvancarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Avancar;
    private javax.swing.JPanel Decisao;
    private javax.swing.JPanel Stats;
    private javax.swing.JFormattedTextField areaTexto;
    private javax.swing.JFormattedTextField areaTexto1;
    private javax.swing.JProgressBar barraCarisma;
    private javax.swing.JProgressBar barraCoragem;
    private javax.swing.JProgressBar barraEmocional;
    private javax.swing.JProgressBar barraSanidade;
    private javax.swing.JButton botaoAvancar;
    private javax.swing.JButton botaoOpcao1;
    private javax.swing.JButton botaoOpcao2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel labelCarisma;
    private javax.swing.JLabel labelCoragem;
    private javax.swing.JLabel labelEmocional;
    private javax.swing.JLabel labelSanidade;
    private javax.swing.JLabel nomeJogador;
    private javax.swing.JLabel percCarisma;
    private javax.swing.JLabel percCoragem;
    private javax.swing.JLabel percEmocional;
    private javax.swing.JLabel percSanidade;
    // End of variables declaration//GEN-END:variables

    private void atualizarStatus(){
        barraSanidade.setValue(Menu.jogador.getSanidade());
        percSanidade.setText(String.format("%d%%",(barraSanidade.getValue()*5)));
        barraEmocional.setValue(Menu.jogador.getEmocional());
        percEmocional.setText(String.format("%d%%",(barraEmocional.getValue()*5)));
        barraCarisma.setValue(Menu.jogador.getCarisma());
        percCarisma.setText(String.format("%d%%",(barraCarisma.getValue()*5)));
        barraCoragem.setValue(Menu.jogador.getCoragem());
        percCoragem.setText(String.format("%d%%",(barraCoragem.getValue()*5)));
    }
}