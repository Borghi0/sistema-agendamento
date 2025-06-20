package main.java.visao;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.java.controle.PalestraControle;
import main.java.objetos.Palestra;

public class JAdminPalestra extends javax.swing.JFrame implements JAdminInterface {
    private static JAdminPalestra insJAdminPalestra;
    private PalestraControle pc = PalestraControle.getPalestraControle();
    
    private JAdminPalestra() {
        initComponents();
    }
    
    public static JAdminPalestra getJAdminPalestra(){
        if(insJAdminPalestra == null) insJAdminPalestra = new JAdminPalestra();
        
        return insJAdminPalestra;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btPalestraC = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPalestras = new javax.swing.JTable();
        btPalestraR = new javax.swing.JButton();
        btPalestraU = new javax.swing.JButton();
        btPalestraD = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        rtTitulo = new javax.swing.JLabel();
        cxPalestra = new javax.swing.JTextField();
        rtAviso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btPalestraC.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btPalestraC.setText("CADASTRAR");
        btPalestraC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPalestraCActionPerformed(evt);
            }
        });

        tbPalestras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Titulo", "Local", "Data"
            }
        ));
        jScrollPane1.setViewportView(tbPalestras);

        btPalestraR.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btPalestraR.setText("CONSULTAR");
        btPalestraR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPalestraRActionPerformed(evt);
            }
        });

        btPalestraU.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btPalestraU.setText("ATUALIZAR");
        btPalestraU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPalestraUActionPerformed(evt);
            }
        });

        btPalestraD.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btPalestraD.setText("DELETAR");
        btPalestraD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPalestraDActionPerformed(evt);
            }
        });

        btVoltar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        rtTitulo.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        rtTitulo.setText("Titulo:");

        cxPalestra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxPalestraActionPerformed(evt);
            }
        });
        cxPalestra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cxPalestraKeyPressed(evt);
            }
        });

        rtAviso.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        rtAviso.setForeground(new java.awt.Color(255, 51, 51));
        rtAviso.setText("Não encontrado.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btPalestraC)
                .addGap(18, 18, 18)
                .addComponent(btPalestraR)
                .addGap(18, 18, 18)
                .addComponent(btPalestraU)
                .addGap(18, 18, 18)
                .addComponent(btPalestraD, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cxPalestra, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rtAviso)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtTitulo)
                    .addComponent(cxPalestra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtAviso))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btPalestraR)
                        .addComponent(btPalestraU)
                        .addComponent(btPalestraD)
                        .addComponent(btPalestraC))
                    .addComponent(btVoltar))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPalestraCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPalestraCActionPerformed
        
    }//GEN-LAST:event_btPalestraCActionPerformed

    private void btPalestraRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPalestraRActionPerformed
        ler();
    }//GEN-LAST:event_btPalestraRActionPerformed

    private void btPalestraUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPalestraUActionPerformed
        
    }//GEN-LAST:event_btPalestraUActionPerformed

    private void btPalestraDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPalestraDActionPerformed
        
    }//GEN-LAST:event_btPalestraDActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        
    }//GEN-LAST:event_btVoltarActionPerformed

    private void cxPalestraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPalestraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxPalestraActionPerformed

    private void cxPalestraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cxPalestraKeyPressed
        ler(evt);
    }//GEN-LAST:event_cxPalestraKeyPressed

    @Override
    public void voltar() {
        JAdmin ja = new JAdmin();
        int opt = JOptionPane.showConfirmDialog(
                                                null,
                                                "Deseja voltar?",
                                                "Retorno",
                                                JOptionPane.YES_NO_OPTION);
        
        if(opt == 0){
            this.dispose();
            ja.setVisible(true);
        }
    }

    @Override
    public void ler() {
        String titulo = cxPalestra.getText();
        DefaultTableModel modelo = (DefaultTableModel) tbPalestras.getModel();
        int linha = 0;
        
        if("".equals(titulo)) compTabela();
        else{
            modelo.setRowCount(linha);

            for(Palestra p : PalestraControle.getPalestras()){
                if(p.getTitulo().equals(titulo)){
                    modelo.insertRow(linha, new Object[]{
                                            p.getTitulo(),
                                            p.getLocal(),
                                            p.getData() });

                    linha++;
                }
            }
        }
        
        cxPalestra.requestFocus();
    }

    @Override
    public void ler(KeyEvent evt) {
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) ler();
    }

    @Override
    public void atualizar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deletar() {
        
    }

    @Override
    public void compTabela() {
        DefaultTableModel modelo = (DefaultTableModel) tbPalestras.getModel();
        int linha = 0;
        
        modelo.setRowCount(0);
        
        for(Palestra p : PalestraControle.getPalestras()){
            modelo.insertRow(linha, new Object[]{
                                        p.getTitulo(),
                                        p.getLocal(),
                                        p.getData() });
            
            linha++;
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
            java.util.logging.Logger.getLogger(JAdminPalestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JAdminPalestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JAdminPalestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JAdminPalestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JAdminPalestra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPalestraC;
    private javax.swing.JButton btPalestraD;
    private javax.swing.JButton btPalestraR;
    private javax.swing.JButton btPalestraU;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField cxPalestra;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rtAviso;
    private javax.swing.JLabel rtTitulo;
    private javax.swing.JTable tbPalestras;
    // End of variables declaration//GEN-END:variables
}
