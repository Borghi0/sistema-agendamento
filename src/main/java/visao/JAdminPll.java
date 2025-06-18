/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.java.visao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import main.java.controle.PalestranteControle;
import main.java.objetos.Palestrante;

public class JAdminPll extends javax.swing.JFrame {
    private static JAdminPll insJAdminPll;
    private PalestranteControle plc;
    private Palestrante pll;
    
    ActionListener apagaAviso = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent evt){
            rtAviso.setVisible(false);
            tempo.stop();
        }
    };
            
    Timer tempo = new Timer(1500, apagaAviso);
    
    private JAdminPll() {
        plc = PalestranteControle.getPalestranteControle();
        pll = null;
        
        initComponents();
        compTabela();
        rtAviso.setVisible(false);
    }
    
    public static JAdminPll getJAdminPll(){
        if(insJAdminPll == null) insJAdminPll = new JAdminPll();
        
        return insJAdminPll;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbPll = new javax.swing.JTable();
        btPllR = new javax.swing.JButton();
        btPllU = new javax.swing.JButton();
        btPllD = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        rtCpf = new javax.swing.JLabel();
        cxPll = new javax.swing.JTextField();
        rtAviso = new javax.swing.JLabel();
        btPllC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tbPll.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Formacao"
            }
        ));
        jScrollPane1.setViewportView(tbPll);

        btPllR.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btPllR.setText("CONSULTAR");
        btPllR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPllRActionPerformed(evt);
            }
        });

        btPllU.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btPllU.setText("ATUALIZAR");
        btPllU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPllUActionPerformed(evt);
            }
        });

        btPllD.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btPllD.setText("DELETAR");
        btPllD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPllDActionPerformed(evt);
            }
        });

        btVoltar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        rtCpf.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        rtCpf.setText("CPF:");

        cxPll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxPllActionPerformed(evt);
            }
        });
        cxPll.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cxPllKeyPressed(evt);
            }
        });

        rtAviso.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        rtAviso.setForeground(new java.awt.Color(255, 51, 51));
        rtAviso.setText("Não encontrado.");

        btPllC.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btPllC.setText("CADASTRAR");
        btPllC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPllCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btPllC)
                .addGap(18, 18, 18)
                .addComponent(btPllR)
                .addGap(18, 18, 18)
                .addComponent(btPllU)
                .addGap(18, 18, 18)
                .addComponent(btPllD, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cxPll, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rtAviso)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtCpf)
                    .addComponent(cxPll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtAviso))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btPllR)
                        .addComponent(btPllU)
                        .addComponent(btPllD)
                        .addComponent(btPllC)))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPllRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPllRActionPerformed
        ler();
    }//GEN-LAST:event_btPllRActionPerformed

    private void btPllUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPllUActionPerformed
        
    }//GEN-LAST:event_btPllUActionPerformed

    private void btPllDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPllDActionPerformed
        deletar();
    }//GEN-LAST:event_btPllDActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        
    }//GEN-LAST:event_btVoltarActionPerformed

    private void cxPllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPllActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxPllActionPerformed

    private void cxPllKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cxPllKeyPressed
       
    }//GEN-LAST:event_cxPllKeyPressed

    private void btPllCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPllCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btPllCActionPerformed
    
    private void compTabela(){
        DefaultTableModel modelo = (DefaultTableModel) tbPll.getModel();
        int linha = 0;
        
        modelo.setRowCount(0);
        
        for(Palestrante p1 : plc.getPalestrantes()){
            modelo.insertRow(linha, new Object[]{p1.getNome(), p1.getCpf(),
                                                 p1.getFormacao()
                                                 });
            linha++;
        }
    }
    
    private void ler(){
        DefaultTableModel modelo = (DefaultTableModel) tbPll.getModel();
        pll = null;
        
        if("".equals(cxPll.getText())) compTabela();
        else{
            modelo.setRowCount(0);
            
            for(Palestrante pl2 : plc.getPalestrantes()){
                if(pl2.getCpf().equals(cxPll.getText())) pll = pl2;
            }
            
            if(pll == null){ rtAviso.setVisible(true); tempo.start();}
            else{
                modelo.insertRow(0, new Object[]{pll.getNome(), pll.getCpf(),
                                                 pll.getFormacao()
                                                });
            }
        }
    }
    
    private void deletar(){
        boolean check = false;
        pll = plc.buscarCpf(cxPll.getText());
        
        if(pll == null){
            rtAviso.setVisible(true);
            tempo.start();
        } else{
            check = plc.deletar(pll);
            
            if(check)
                JOptionPane.showMessageDialog(null, "Deletado com sucesso");
            
            compTabela();
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
            java.util.logging.Logger.getLogger(JAdminPll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JAdminPll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JAdminPll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JAdminPll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JAdminPll().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPllC;
    private javax.swing.JButton btPllD;
    private javax.swing.JButton btPllR;
    private javax.swing.JButton btPllU;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField cxPll;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rtAviso;
    private javax.swing.JLabel rtCpf;
    private javax.swing.JTable tbPll;
    // End of variables declaration//GEN-END:variables
}
