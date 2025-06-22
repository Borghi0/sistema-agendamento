// src/main/java/visao/JListaPalestras.java
package main.java.visao;

import main.java.objetos.Palestra;
import main.java.controle.PalestraControle;
import main.java.controle.MenuControle;

import java.awt.Font;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import main.java.controle.UsuarioControle;


public class JListaPalestras extends javax.swing.JFrame {
    private static JListaPalestras jPalestrasUnic = null;    
    private List<Integer> palestraCod = new LinkedList<>();
    private boolean completo;
    private boolean inscritas;
        
    public JListaPalestras() {
        initComponents();
        
        setLocationRelativeTo(null); // Inicia a janela centralizada
        setExtendedState(MAXIMIZED_BOTH);
    }

    public static JListaPalestras getJListaPalestras(){
        if (jPalestrasUnic == null) {
            jPalestrasUnic = new JListaPalestras();
        }
        return jPalestrasUnic;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbPalestras = new javax.swing.JTable();
        rtInfo = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        mbOpcoes = new javax.swing.JMenu();
        miVoltar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tbPalestras.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tbPalestras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título", "Local", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPalestras.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbPalestras.setRowHeight(30);
        tbPalestras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPalestrasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPalestras);
        if (tbPalestras.getColumnModel().getColumnCount() > 0) {
            tbPalestras.getColumnModel().getColumn(0).setPreferredWidth(350);
            tbPalestras.getColumnModel().getColumn(1).setPreferredWidth(300);
            tbPalestras.getColumnModel().getColumn(2).setPreferredWidth(100);
        }
        //minhas configs
        tbPalestras.getColumnModel().getColumn(2).setCellRenderer(
            new DefaultTableCellRenderer(){{setHorizontalAlignment(SwingConstants.CENTER);}}
        );
        tbPalestras.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 18));
        //fim

        rtInfo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        rtInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rtInfo.setText("Clique em uma palestra para mais opções");

        mbOpcoes.setText("Opções");
        mbOpcoes.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N

        miVoltar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        miVoltar.setText("Voltar...");
        miVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVoltarActionPerformed(evt);
            }
        });
        mbOpcoes.add(miVoltar);

        barraMenu.add(mbOpcoes);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
                    .addComponent(rtInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(rtInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if(inscritas) listarTabPalestrasI();
        else if(completo) listarTabPalestrasC();
    }//GEN-LAST:event_formWindowActivated

    private void miVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVoltarActionPerformed
        voltar();
    }//GEN-LAST:event_miVoltarActionPerformed

    private void tbPalestrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPalestrasMouseClicked
        if(inscritas) selecTabI();
        else if(completo) selecTabC();
    }//GEN-LAST:event_tbPalestrasMouseClicked

    public void listarTabPalestrasC(){
        DefaultTableModel modelo = (DefaultTableModel) tbPalestras.getModel();       

        int lin = 0;
        modelo.setRowCount(lin);
        
        palestraCod.clear();
        
        for(Palestra p : PalestraControle.getPalestras()){
            modelo.insertRow(lin, new Object[]{p.getTitulo(), p.getLocal(), p.getData()});
            palestraCod.add(p.getCodigo());
            lin++;
        }
    }
    public void listarTabPalestrasI(){
        DefaultTableModel modelo = (DefaultTableModel) tbPalestras.getModel();       

        int lin = 0;
        modelo.setRowCount(lin);
        
        palestraCod.clear();
        
        for(Palestra p : MenuControle.getUsuarioAtual().getPalestras()){
            modelo.insertRow(lin, new Object[]{p.getTitulo(), p.getLocal(), p.getData()});
            palestraCod.add(p.getCodigo());
            lin++;
        }
        if(lin==0){
            JOptionPane.showMessageDialog(
                null, "Você não está inscrito em nenhuma palestra", "Mensagem", JOptionPane.INFORMATION_MESSAGE
            );
            voltar();
        }
    }
    
    public void selecTabC(){
        int linSelec = tbPalestras.getSelectedRow();

        if(linSelec == -1) return;
        
        int palestraSelecCod = palestraCod.get(linSelec);
        
        Palestra palestraSelec = null;

        for(Palestra p : PalestraControle.getPalestras()){
            if (p.getCodigo() == palestraSelecCod) {
                palestraSelec = p;
                break;
            }
        }

        if(palestraSelec != null){
            boolean flag = true;
            while(flag){
                flag = false;
                String mensagem = "Título: " + palestraSelec.getTitulo() +
                                  "\nLocal: " + palestraSelec.getLocal() +
                                  "\nData: " + palestraSelec.getData() +
                                  "\nHora: " + palestraSelec.getHora() +
                                  "\nVagas: " + palestraSelec.getVagas();

                int o = JOptionPane.showOptionDialog(
                        null, mensagem, "Detalhes da Palestra",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, 
                        null, new String[]{"Voltar", "Palestrantes", "Se Inscrever"}, "Voltar"
                );
                if(o == 1){
                    if(palestraSelec.getPalestrantes()!=null && !palestraSelec.getPalestrantes().getCpf().isBlank()){
                        JOptionPane.showMessageDialog(
                                null, 
                                "Palestrante: "+palestraSelec.getPalestrantes().getNome()+"\nFormação: "+palestraSelec.getPalestrantes().getFormacao()
                                        , palestraSelec.getTitulo(), JOptionPane.INFORMATION_MESSAGE
                        );
                    }
                    else JOptionPane.showMessageDialog(
                            null, "Não há palestrantes nessa palestra", "Atenção!", JOptionPane.WARNING_MESSAGE
                    );
                    flag = true;
                }
                else if(o == 2){
                    try {
                        UsuarioControle.autoInscricao(palestraSelec);
                    } catch(IllegalArgumentException iae){
                        JOptionPane.showMessageDialog(
                            null, iae.getMessage(), "Falha na inscrição", JOptionPane.INFORMATION_MESSAGE
                        );
                    }
                }
            }
        }
    }
    public void selecTabI(){
        int linSelec = tbPalestras.getSelectedRow();

        if(linSelec == -1) return;
        
        int palestraSelecCod = palestraCod.get(linSelec);
        
        Palestra palestraSelec = null;

        for(Palestra p : MenuControle.getUsuarioAtual().getPalestras()){
            if (p.getCodigo() == palestraSelecCod) {
                palestraSelec = p;
                break;
            }
        }

        if(palestraSelec != null){
            boolean flag = true;
            while(flag){
                flag = false;
                String mensagem = "Título: " + palestraSelec.getTitulo() +
                                  "\nLocal: " + palestraSelec.getLocal() +
                                  "\nData: " + palestraSelec.getData() +
                                  "\nHora: " + palestraSelec.getHora() +
                                  "\nVagas: " + palestraSelec.getVagas();

                int o = JOptionPane.showOptionDialog(
                        null, mensagem, "Detalhes da Palestra",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, 
                        null, new String[]{"Palestrantes", "Ok"}, "Ok"
                );
                if(o == 0){
                    if(palestraSelec.getPalestrantes()!=null && !palestraSelec.getPalestrantes().getCpf().isBlank()){
                        JOptionPane.showMessageDialog(
                                null, 
                                "Palestrante: "+palestraSelec.getPalestrantes().getNome()+"\nFormação: "+palestraSelec.getPalestrantes().getFormacao()
                                        , palestraSelec.getTitulo(), JOptionPane.INFORMATION_MESSAGE
                        );
                    }
                    else JOptionPane.showMessageDialog(
                            null, "Não há palestrantes nessa palestra", "Atenção!", JOptionPane.WARNING_MESSAGE
                    );        
                    flag = true;
                }
            }
        }
    }
    
    
    public void voltar(){
        MenuControle.getMenuUser().setVisible(true);
        dispose();
        setFlags(false);
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
            java.util.logging.Logger.getLogger(JListaPalestras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JListaPalestras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JListaPalestras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JListaPalestras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JListaPalestras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu mbOpcoes;
    private javax.swing.JMenuItem miVoltar;
    private javax.swing.JLabel rtInfo;
    private javax.swing.JTable tbPalestras;
    // End of variables declaration//GEN-END:variables

    public void setCompleto(boolean b) {
        this.completo = b;
    }

    public void setInscritas(boolean b) {
        this.inscritas = b;
    }
    
    
    // coloque as flags novas aqui
    public void setFlags(boolean b){
        this.completo = b;
        this.inscritas = b;
    }
}
