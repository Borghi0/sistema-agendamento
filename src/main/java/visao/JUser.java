// src/main/java/visao/JUser.java
package main.java.visao;

import main.java.controle.*;

import javax.swing.JOptionPane;


public class JUser extends javax.swing.JFrame {
    
    public JUser() {
        initComponents();
        setLocationRelativeTo(null); // Inicia a janela centralizada
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        rtBemVindoMSG = new javax.swing.JLabel();
        mbBarra = new javax.swing.JMenuBar();
        mOpcoes = new javax.swing.JMenu();
        miPalestras = new javax.swing.JMenuItem();
        miInscricoes = new javax.swing.JMenuItem();
        miSair = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        rtBemVindoMSG.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rtBemVindoMSG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        mOpcoes.setText("Opções");
        mOpcoes.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N

        miPalestras.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        miPalestras.setText("Palestras...");
        miPalestras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPalestrasActionPerformed(evt);
            }
        });
        mOpcoes.add(miPalestras);

        miInscricoes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        miInscricoes.setText("Inscrições...");
        miInscricoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miInscricoesActionPerformed(evt);
            }
        });
        mOpcoes.add(miInscricoes);

        miSair.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        miSair.setText("Sair...");
        miSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSairActionPerformed(evt);
            }
        });
        mOpcoes.add(miSair);

        mbBarra.add(mOpcoes);

        setJMenuBar(mbBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(306, Short.MAX_VALUE)
                .addComponent(rtBemVindoMSG, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addContainerGap(306, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addComponent(rtBemVindoMSG, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSairActionPerformed
        sair();
    }//GEN-LAST:event_miSairActionPerformed

    private void miPalestrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPalestrasActionPerformed
        JListaPalestras.getJListaPalestras().setCompleto(true);
        JListaPalestras.getJListaPalestras().setVisible(true);
        dispose();
    }//GEN-LAST:event_miPalestrasActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        rtBemVindoMSG.setText("Bem Vindo(a) "+MenuControle.getUsuarioAtual().getNome()+"!");
    }//GEN-LAST:event_formWindowActivated

    private void miInscricoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miInscricoesActionPerformed
        JListaPalestras.getJListaPalestras().setInscritas(true);
        JListaPalestras.getJListaPalestras().setVisible(true);
        dispose();
    }//GEN-LAST:event_miInscricoesActionPerformed

    public void sair(){
            
        int o = JOptionPane.showOptionDialog(
                null, "Deseja realmente sair?", "Sair",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, 
                null, new String[]{"Não", "Sim"}, ""
        );
        if(o == 1){
            MenuControle.setUsuarioAtual(null);
            dispose();
            MenuControle.menuInicial.setVisible(true);
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
            java.util.logging.Logger.getLogger(JUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu mOpcoes;
    private javax.swing.JMenuBar mbBarra;
    private javax.swing.JMenuItem miInscricoes;
    private javax.swing.JMenuItem miPalestras;
    private javax.swing.JMenuItem miSair;
    private javax.swing.JLabel rtBemVindoMSG;
    // End of variables declaration//GEN-END:variables
}
