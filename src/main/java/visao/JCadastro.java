// src/main/java/visao/JCadastro.java
package main.java.visao;

import main.java.controle.*;

import java.awt.Color;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class JCadastro extends javax.swing.JFrame {
    static JCadastro cadUnic;
    
    public JCadastro() {
        initComponents();
        rtCadInfo.setVisible(false);
        setLocationRelativeTo(null); // Inicia a janela centralizada
        
        cxEmail.getDocument().addDocumentListener(new DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent e) {
                rtErroEmail.setText("");
                cxEmail.setForeground(Color.black);
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                rtErroEmail.setText("");
                cxEmail.setForeground(Color.black);
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        cxUser.getDocument().addDocumentListener(new DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent e) {
                rtErroUser.setText("");
                cxUser.setForeground(Color.black);
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                rtErroUser.setText("");
                cxUser.setForeground(Color.black);
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }

    public static JCadastro getMenuCadastro(){
        if(cadUnic == null) cadUnic = new JCadastro();
        return cadUnic;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cxNome = new javax.swing.JTextField();
        rtCPF = new javax.swing.JLabel();
        cxCPF = new javax.swing.JTextField();
        rtCSenha = new javax.swing.JLabel();
        rtSenha = new javax.swing.JLabel();
        csSenha = new javax.swing.JPasswordField();
        csCSenha = new javax.swing.JPasswordField();
        rtEmail = new javax.swing.JLabel();
        cxEmail = new javax.swing.JTextField();
        rtUser = new javax.swing.JLabel();
        cxUser = new javax.swing.JTextField();
        rtNome = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();
        btComf = new javax.swing.JButton();
        rtErroUser = new javax.swing.JLabel();
        rtErroEmail = new javax.swing.JLabel();
        rtCadInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro");

        cxNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cxNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cxNomeFocusLost(evt);
            }
        });
        cxNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cxNomeKeyPressed(evt);
            }
        });

        rtCPF.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rtCPF.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rtCPF.setText("CPF:");

        cxCPF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cxCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cxCPFFocusLost(evt);
            }
        });
        cxCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cxCPFKeyPressed(evt);
            }
        });

        rtCSenha.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rtCSenha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rtCSenha.setText("Comfirmar senha:");

        rtSenha.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rtSenha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rtSenha.setText("Senha:");

        csSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        csSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                csSenhaKeyPressed(evt);
            }
        });

        csCSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        csCSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                csCSenhaKeyPressed(evt);
            }
        });

        rtEmail.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rtEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rtEmail.setText("Email:");

        cxEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cxEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cxEmailFocusLost(evt);
            }
        });
        cxEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cxEmailKeyPressed(evt);
            }
        });

        rtUser.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rtUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rtUser.setText("Nome de Usuario:");

        cxUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cxUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cxUserFocusLost(evt);
            }
        });
        cxUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cxUserKeyPressed(evt);
            }
        });

        rtNome.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rtNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rtNome.setText("Nome:");

        btVoltar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });
        btVoltar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btVoltarKeyPressed(evt);
            }
        });

        btComf.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btComf.setText("Comfirmar");
        btComf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btComfActionPerformed(evt);
            }
        });
        btComf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btComfKeyPressed(evt);
            }
        });

        rtErroUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rtErroUser.setForeground(new java.awt.Color(255, 0, 0));
        rtErroUser.setMinimumSize(new java.awt.Dimension(120, 0));

        rtErroEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rtErroEmail.setForeground(new java.awt.Color(255, 0, 0));
        rtErroEmail.setMinimumSize(new java.awt.Dimension(120, 0));

        rtCadInfo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rtCadInfo.setForeground(new java.awt.Color(255, 0, 0));
        rtCadInfo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rtCadInfo.setText("Preencha todos os campos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btVoltar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(163, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(rtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rtNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rtCPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cxEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cxNome, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cxUser)
                                    .addComponent(cxCPF)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rtCSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                    .addComponent(rtSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 146, Short.MAX_VALUE)
                                        .addComponent(btComf))
                                    .addComponent(csSenha)
                                    .addComponent(csCSenha)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rtCadInfo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rtErroEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(rtErroUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtErroUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtErroEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(csSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtCSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(csCSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rtCadInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btComf, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        voltar();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btComfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btComfActionPerformed
        cadTenta();        
    }//GEN-LAST:event_btComfActionPerformed

    private void btComfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btComfKeyPressed
        cadTenta(evt);
    }//GEN-LAST:event_btComfKeyPressed

    private void cxUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cxUserKeyPressed
        cadTenta(evt);
    }//GEN-LAST:event_cxUserKeyPressed

    private void cxEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cxEmailKeyPressed
        cadTenta(evt);
    }//GEN-LAST:event_cxEmailKeyPressed

    private void cxNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cxNomeKeyPressed
        cadTenta(evt);
    }//GEN-LAST:event_cxNomeKeyPressed

    private void cxCPFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cxCPFKeyPressed
        cadTenta(evt);
    }//GEN-LAST:event_cxCPFKeyPressed

    private void csSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_csSenhaKeyPressed
        cadTenta(evt);
    }//GEN-LAST:event_csSenhaKeyPressed

    private void csCSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_csCSenhaKeyPressed
        cadTenta(evt);
    }//GEN-LAST:event_csCSenhaKeyPressed

    private void btVoltarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btVoltarKeyPressed
        voltar(evt);
    }//GEN-LAST:event_btVoltarKeyPressed

    private void cxCPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cxCPFFocusLost
        cxCPF.setText(cxCPF.getText().replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_cxCPFFocusLost

    private void cxUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cxUserFocusLost
        cxUser.setText(cxUser.getText().replaceAll("\\s+", ""));
    }//GEN-LAST:event_cxUserFocusLost

    private void cxEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cxEmailFocusLost
        cxEmail.setText(cxEmail.getText().replaceAll("\\s+", ""));
    }//GEN-LAST:event_cxEmailFocusLost

    private void cxNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cxNomeFocusLost
        cxNome.setText(cxNome.getText().trim());
    }//GEN-LAST:event_cxNomeFocusLost

    public void voltar(){
        dispose();
        MenuControle.menuInicial.setVisible(true);
    }
    public void voltar(java.awt.event.KeyEvent evt){
        if(evt.getKeyCode()==java.awt.event.KeyEvent.VK_ENTER){
            dispose();
            MenuControle.menuInicial.setVisible(true);   
        }
    }
    
    public void cadTenta(){
        cxUser.setText(cxUser.getText().replaceAll("\\s+", ""));
        cxEmail.setText(cxEmail.getText().replaceAll("\\s+", ""));
        cxNome.setText(cxNome.getText().trim());
        cxCPF.setText(cxCPF.getText().replaceAll("[^0-9]", ""));
        
        boolean c = false;
        try{
            UsuarioControle.cadastrar(cxNome.getText(), cxCPF.getText(), cxEmail.getText(),
                    String.valueOf(csSenha.getPassword()), String.valueOf(csCSenha.getPassword()), 
                    cxUser.getText(), false, false);
        }
        catch(IllegalArgumentException iae){
            c = true;
            rtCadInfo.setForeground(Color.red);
            rtCadInfo.setVisible(true);
            rtCadInfo.setText(iae.getMessage());
            if(iae.getMessage().equals("Email")) rtErro(1);
            else if(iae.getMessage().equals("User")) rtErro(2);
            else if(iae.getMessage().equals("UserEmail")) rtErro(3);
        }
        if(!c){
            limpa();
            rtCadInfo.setForeground(Color.black);
            rtCadInfo.setText("Cadastrado com sucesso!");
            rtCadInfo.setVisible(true);
        }
    }
    public void cadTenta(java.awt.event.KeyEvent evt){
        if(evt.getKeyCode()==java.awt.event.KeyEvent.VK_ENTER) cadTenta();
    }
    public void limpa(){
        cxUser.setText("");
        cxEmail.setText("");
        cxNome.setText("");
        cxCPF.setText("");
        csSenha.setText("");
        csCSenha.setText("");
        cxUser.requestFocus();
    }
    
    public void rtErro(int erro){
        switch (erro) {
            case 1 -> {
                rtCadInfo.setVisible(false);
                rtErroEmail.setText("Email já cadastrado");
                cxEmail.setForeground(Color.red);
            }
            case 2 -> {
                rtCadInfo.setVisible(false);
                rtErroUser.setText("Nome em uso");
                cxUser.setForeground(Color.red);
            }
            case 3 -> {
                rtErro(1);
                rtErro(2);
            }
        }
    }
    
    public void msgErro(String msg){
        rtCadInfo.setForeground(Color.red);
        rtCadInfo.setText(msg);
        rtCadInfo.setVisible(true);
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
            java.util.logging.Logger.getLogger(JCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btComf;
    private javax.swing.JButton btVoltar;
    private javax.swing.JPasswordField csCSenha;
    private javax.swing.JPasswordField csSenha;
    private javax.swing.JTextField cxCPF;
    private javax.swing.JTextField cxEmail;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxUser;
    private javax.swing.JLabel rtCPF;
    private javax.swing.JLabel rtCSenha;
    private javax.swing.JLabel rtCadInfo;
    private javax.swing.JLabel rtEmail;
    private javax.swing.JLabel rtErroEmail;
    private javax.swing.JLabel rtErroUser;
    private javax.swing.JLabel rtNome;
    private javax.swing.JLabel rtSenha;
    private javax.swing.JLabel rtUser;
    // End of variables declaration//GEN-END:variables
}
