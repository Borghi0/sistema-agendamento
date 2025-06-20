// src/main/java/visao/JListaPalestrantes.java
package main.java.visao;

import java.awt.Font;
import javax.swing.JOptionPane;
import main.java.objetos.Palestra;
import main.java.objetos.Palestrante;

import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class JListaPalestrantes extends javax.swing.JFrame {
    private static JListaPalestrantes jPalestrantesUnic = null;
    private Palestra palestraSelec;
    private boolean palestra;
    
    public JListaPalestrantes() {
        initComponents();
        
        setLocationRelativeTo(null); // Inicia a janela centralizada
    }

    public static JListaPalestrantes getJListaPalestrantes(){
        if (jPalestrantesUnic == null) {
            jPalestrantesUnic = new JListaPalestrantes();
        }
        return jPalestrantesUnic;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbPalestrantes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        tbPalestrantes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tbPalestrantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Palestrante", "Formação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPalestrantes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbPalestrantes.setRowHeight(30);
        tbPalestrantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPalestrantesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPalestrantes);
        //minhas configs
        tbPalestrantes.getColumnModel().getColumn(1).setCellRenderer(
            new DefaultTableCellRenderer(){{setHorizontalAlignment(SwingConstants.CENTER);}}
        );
        tbPalestrantes.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 18));
        //fim

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                .addContainerGap(147, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbPalestrantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPalestrantesMouseClicked
        // arthur, se usar, cria flag
    }//GEN-LAST:event_tbPalestrantesMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if(palestra) listarTabPalestrantesP();
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        fechar();
    }//GEN-LAST:event_formWindowClosed

    public void listarTabPalestrantesP(){
        DefaultTableModel modelo = (DefaultTableModel) tbPalestrantes.getModel();       

        int lin = 0;
        modelo.setRowCount(lin);
        if(palestraSelec!=null){
            for(Palestrante p : palestraSelec.getPalestrantes()){
                modelo.insertRow(lin, new Object[]{p.getNome(), p.getFormacao()});
                lin++;
            }
            if(lin==0){
                JOptionPane.showMessageDialog(
                        null, "Não há palestrantes nessa palestra", "Atenção!", JOptionPane.WARNING_MESSAGE
                );
                fechar();
            }
        }
    }
    
    public void fechar(){
        setFlags(false);
        palestraSelec = null;
        DefaultTableModel modelo = (DefaultTableModel) tbPalestrantes.getModel();
        modelo.setRowCount(0);
        dispose();
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
            java.util.logging.Logger.getLogger(JListaPalestrantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JListaPalestrantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JListaPalestrantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JListaPalestrantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JListaPalestrantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbPalestrantes;
    // End of variables declaration//GEN-END:variables

    public void setPalestraSelec(Palestra palestraSelec){
        this.palestraSelec = palestraSelec;
    }
    
    public void setPalestra(boolean b) {
        this.palestra = b;
    }
    
    
    // coloque as flags novas aqui
    public void setFlags(boolean b){
        this.palestra = b;
    }

}
