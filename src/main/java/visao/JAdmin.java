// src/main/java/visao/JAdmin.java
package main.java.visao;


import java.awt.Dimension;// ADICIONEI ESTE IMPORT PARA RESOLVER O ERRO DO Dimension
import javax.swing.JOptionPane;

/**
 *
 * @author joaop
 */
public class JAdmin extends javax.swing.JFrame {

    /**
     * Creates new form JAdmin
     */
    public JAdmin() {
        initComponents();
        setLocationRelativeTo(null); // Inicia a janela centralizada
        
        // ADICIONEI ESTAS LINHAS PARA O REDIMENSIONAMENTO 
        setResizable(true);
        setMinimumSize(new Dimension(600, 500));
        setPreferredSize(new Dimension(800, 600));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rtGen = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rtGen.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        rtGen.setText("GERENCIAR");

        jButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton1.setText("USUARIOS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton2.setText("PALESTRAS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton3.setText("PALESTRANTES");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rtGen)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(113, 113, 113))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(rtGen)
                .addGap(35, 35, 35)
                .addComponent(jButton1)
                .addGap(31, 31, 31)
                .addComponent(jButton2)
                .addGap(35, 35, 35)
                .addComponent(jButton3)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // MANTIVE OS MÉTODOS ORIGINAIS E APENAS ADICIONEI VALIDAÇÕES
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        if (validarAcessoAdmin()) {
            JOptionPane.showMessageDialog(this, "Abrindo gerenciamento de usuários...");
        }
    }                                       

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        if (validarAcessoAdmin()) {
            JOptionPane.showMessageDialog(this, "Abrindo gerenciamento de palestras...");
        }
    }                                       

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        if (validarAcessoAdmin()) {
            JOptionPane.showMessageDialog(this, "Abrindo gerenciamento de palestrantes...");
        }
    }                                       

    // ADICIONEI ESTE MÉTODO PARA VALIDAÇÃO 
    private boolean validarAcessoAdmin() {
        if (this.user == null || !this.user.equals("admin")) {
            JOptionPane.showMessageDialog(this, 
                "Acesso permitido apenas para administradores", 
                "Erro de Autorização", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
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
            java.util.logging.Logger.getLogger(JAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JAdmin().setVisible(true);
            }
        });
    }
    
    private String user;
    public void setUser(String user){
        this.user = user;
    }
    public String getUser(){
        return user;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel rtGen;
    // End of variables declaration//GEN-END:variables
} 