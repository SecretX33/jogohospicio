/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import java.util.Set;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class TelaLogin extends javax.swing.JFrame {
    JPanel j1;
    int tipoTela;
    
    public TelaLogin() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(Menu.EXIT_ON_CLOSE);
        tipoTela=0; // 0 = login, 1 = registro
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
        login = new javax.swing.JPanel();
        labelUsuarioLogin = new javax.swing.JLabel();
        labelSenhaLogin = new javax.swing.JLabel();
        tbUsuarioLogin = new javax.swing.JTextField();
        botaoLogar = new javax.swing.JButton();
        botaoRegistrarLogin = new javax.swing.JButton();
        labelLogin = new javax.swing.JLabel();
        tbSenhaLogin = new javax.swing.JPasswordField();
        registro = new javax.swing.JPanel();
        labelUsuarioRegistro = new javax.swing.JLabel();
        labelSenhaRegistro = new javax.swing.JLabel();
        tbUsuarioRegistro = new javax.swing.JTextField();
        botaoRegistrar = new javax.swing.JButton();
        labelApelidoRegistro = new javax.swing.JLabel();
        tbApelidoRegistro = new javax.swing.JTextField();
        labelRegistro = new javax.swing.JLabel();
        tbSenhaRegistro = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(400, 300));

        tela.setLayout(new java.awt.CardLayout());

        labelUsuarioLogin.setText("Usuário");

        labelSenhaLogin.setText("Senha");

        botaoLogar.setText("Login");
        botaoLogar.setEnabled(false);
        botaoLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLogarActionPerformed(evt);
            }
        });

        botaoRegistrarLogin.setText("Registrar");
        botaoRegistrarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRegistrarLoginActionPerformed(evt);
            }
        });

        labelLogin.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        labelLogin.setForeground(new java.awt.Color(80, 200, 40));
        labelLogin.setText("Login");

        tbSenhaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbSenhaLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(labelLogin))
                    .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(loginLayout.createSequentialGroup()
                            .addComponent(botaoRegistrarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(botaoLogar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(loginLayout.createSequentialGroup()
                            .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                                    .addComponent(labelUsuarioLogin)
                                    .addGap(10, 10, 10))
                                .addGroup(loginLayout.createSequentialGroup()
                                    .addComponent(labelSenhaLogin)
                                    .addGap(16, 16, 16)))
                            .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tbSenhaLogin)
                                .addComponent(tbUsuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelLogin)
                .addGap(29, 29, 29)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(labelUsuarioLogin))
                    .addComponent(tbUsuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSenhaLogin)
                    .addComponent(tbSenhaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoRegistrarLogin)
                    .addComponent(botaoLogar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        tela.add(login, "card2");

        registro.setPreferredSize(new java.awt.Dimension(286, 202));

        labelUsuarioRegistro.setText("Usuário");

        labelSenhaRegistro.setText("Senha");

        botaoRegistrar.setText("Registrar");
        botaoRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRegistrarActionPerformed(evt);
            }
        });

        labelApelidoRegistro.setText("Apelido");

        labelRegistro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelRegistro.setForeground(new java.awt.Color(20, 20, 240));
        labelRegistro.setText("Registro");
        labelRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout registroLayout = new javax.swing.GroupLayout(registro);
        registro.setLayout(registroLayout);
        registroLayout.setHorizontalGroup(
            registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registroLayout.createSequentialGroup()
                .addGroup(registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registroLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(registroLayout.createSequentialGroup()
                                .addComponent(labelApelidoRegistro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tbApelidoRegistro))
                            .addGroup(registroLayout.createSequentialGroup()
                                .addGroup(registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelUsuarioRegistro)
                                    .addComponent(labelSenhaRegistro))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tbUsuarioRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                    .addComponent(tbSenhaRegistro)))))
                    .addGroup(registroLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(botaoRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(registroLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(labelRegistro)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        registroLayout.setVerticalGroup(
            registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registroLayout.createSequentialGroup()
                .addComponent(labelRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUsuarioRegistro)
                    .addComponent(tbUsuarioRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSenhaRegistro)
                    .addComponent(tbSenhaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbApelidoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelApelidoRegistro))
                .addGap(18, 18, 18)
                .addComponent(botaoRegistrar)
                .addContainerGap())
        );

        tela.add(registro, "telaRegistro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tela, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tela, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRegistrarActionPerformed
        trocarTela();
    }//GEN-LAST:event_botaoRegistrarActionPerformed

    private void botaoRegistrarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRegistrarLoginActionPerformed
        trocarTela();        
    }//GEN-LAST:event_botaoRegistrarLoginActionPerformed

    private void botaoLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLogarActionPerformed
        
    }//GEN-LAST:event_botaoLogarActionPerformed

    private void tbSenhaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbSenhaLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbSenhaLoginActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }
    
    private void trocarTela(){
        tela.removeAll(); // Famoso cascade
        if(tipoTela==0){
            tbUsuarioRegistro.setText(tbUsuarioLogin.getText());
            tbUsuarioLogin.setText("");
            tbSenhaRegistro.setText(String.valueOf(tbSenhaLogin.getPassword()));
            tbSenhaLogin.setText("");
            tela.add(registro);
        }
        else{
            tbUsuarioLogin.setText(tbUsuarioRegistro.getText());
            tbUsuarioRegistro.setText("");
            tbSenhaRegistro.setText("");
            tbApelidoRegistro.setText("");
            tela.add(login);
        }
        tipoTela=1-tipoTela;

        tela.repaint();
        tela.revalidate();   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoLogar;
    private javax.swing.JButton botaoRegistrar;
    private javax.swing.JButton botaoRegistrarLogin;
    private javax.swing.JLabel labelApelidoRegistro;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelRegistro;
    private javax.swing.JLabel labelSenhaLogin;
    private javax.swing.JLabel labelSenhaRegistro;
    private javax.swing.JLabel labelUsuarioLogin;
    private javax.swing.JLabel labelUsuarioRegistro;
    private javax.swing.JPanel login;
    private javax.swing.JPanel registro;
    private javax.swing.JTextField tbApelidoRegistro;
    private javax.swing.JPasswordField tbSenhaLogin;
    private javax.swing.JPasswordField tbSenhaRegistro;
    private javax.swing.JTextField tbUsuarioLogin;
    private javax.swing.JTextField tbUsuarioRegistro;
    private javax.swing.JPanel tela;
    // End of variables declaration//GEN-END:variables
}
