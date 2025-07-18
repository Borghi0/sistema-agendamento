// src/main/java/visao/JInicial.java
package main.java.visao;

import main.java.controle.*;


public final class JInicial extends javax.swing.JFrame {

    public JInicial() {
        initComponents();
        rtErro.setVisible(false);
        mnOpcoes.requestFocus();
        placeholder(true);
        setLocationRelativeTo(null); // Inicia a janela centralizada
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rtUser = new javax.swing.JLabel();
        cxUser = new javax.swing.JTextField();
        rtSenha = new javax.swing.JLabel();
        csSenha = new javax.swing.JPasswordField();
        btCad = new javax.swing.JButton();
        btEnt = new javax.swing.JButton();
        rtErro = new javax.swing.JLabel();
        mnBar = new javax.swing.JMenuBar();
        mnOpcoes = new javax.swing.JMenu();
        mniCad = new javax.swing.JMenuItem();
        mniSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Inicial");

        rtUser.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rtUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rtUser.setText("Usuário:");

        cxUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cxUser.setToolTipText("");
        cxUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cxUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cxUserFocusLost(evt);
            }
        });
        cxUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cxUserKeyPressed(evt);
            }
        });

        rtSenha.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rtSenha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rtSenha.setText("Senha:");

        csSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        csSenha.setToolTipText("");
        csSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                csSenhaKeyPressed(evt);
            }
        });

        btCad.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btCad.setText("Cadastrar-se");
        btCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadActionPerformed(evt);
            }
        });
        btCad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btCadKeyPressed(evt);
            }
        });

        btEnt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btEnt.setText("Entrar");
        btEnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntActionPerformed(evt);
            }
        });
        btEnt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btEntKeyPressed(evt);
            }
        });

        rtErro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rtErro.setForeground(new java.awt.Color(255, 0, 0));
        rtErro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rtErro.setText("usuário ou senha incorretos");

        mnOpcoes.setText("Opções");
        mnOpcoes.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N

        mniCad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mniCad.setText("Cadastrar-se...");
        mniCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCadActionPerformed(evt);
            }
        });
        mnOpcoes.add(mniCad);

        mniSair.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mniSair.setText("Fechar aplicação");
        mniSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSairActionPerformed(evt);
            }
        });
        mnOpcoes.add(mniSair);

        mnBar.add(mnOpcoes);

        setJMenuBar(mnBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(290, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rtUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(csSenha)
                            .addComponent(cxUser)
                            .addComponent(rtErro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(316, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(csSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rtErro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(211, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadActionPerformed
        jCad();
    }//GEN-LAST:event_btCadActionPerformed

    private void btEntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntActionPerformed
        entrar();
    }//GEN-LAST:event_btEntActionPerformed

    private void mniCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCadActionPerformed
        jCad();
    }//GEN-LAST:event_mniCadActionPerformed

    private void cxUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cxUserFocusGained
        placeholder(false);
    }//GEN-LAST:event_cxUserFocusGained

    private void cxUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cxUserFocusLost
        placeholder(true);
    }//GEN-LAST:event_cxUserFocusLost

    private void mniSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mniSairActionPerformed

    private void cxUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cxUserKeyPressed
        entrar(evt);
    }//GEN-LAST:event_cxUserKeyPressed

    private void csSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_csSenhaKeyPressed
        entrar(evt);
    }//GEN-LAST:event_csSenhaKeyPressed

    private void btEntKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btEntKeyPressed
        entrar(evt);
    }//GEN-LAST:event_btEntKeyPressed

    private void btCadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btCadKeyPressed
        jCad();
    }//GEN-LAST:event_btCadKeyPressed

    public void entrar(){
        if(MenuControle.entrar(cxUser.getText(), csSenha.getPassword())){
            dispose();
            csSenha.setText("");
            rtErro.setVisible(false);
        }
        else{
            rtErro.setVisible(true);
        }
    }
    public void entrar(java.awt.event.KeyEvent evt){
        if(evt.getKeyCode()==java.awt.event.KeyEvent.VK_ENTER) entrar();
    }
    
    public void jCad(){
        MenuControle.menuCadastro.setVisible(true);
        setVisible(false);
        rtErro.setVisible(false);
    }
    public void jCad(java.awt.event.KeyEvent evt){
        if(evt.getKeyCode()==java.awt.event.KeyEvent.VK_ENTER) jCad();
    }
    
    public void placeholder(boolean add){
        if(cxUser.getText().isBlank() && add){
            cxUser.setText("user/email");
            cxUser.setForeground(java.awt.Color.gray);
        }
        else if(cxUser.getForeground().equals(java.awt.Color.gray) && !add){
            cxUser.setText("");
            cxUser.setForeground(java.awt.Color.black);
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(JInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCad;
    private javax.swing.JButton btEnt;
    private javax.swing.JPasswordField csSenha;
    private javax.swing.JTextField cxUser;
    private javax.swing.JMenuBar mnBar;
    private javax.swing.JMenu mnOpcoes;
    private javax.swing.JMenuItem mniCad;
    private javax.swing.JMenuItem mniSair;
    private javax.swing.JLabel rtErro;
    private javax.swing.JLabel rtSenha;
    private javax.swing.JLabel rtUser;
    // End of variables declaration//GEN-END:variables

    
}
