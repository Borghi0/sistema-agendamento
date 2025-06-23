/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.java.visao;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.java.controle.MenuControle;
import main.java.objetos.Palestra;
import main.java.controle.PalestraControle;
import java.util.LinkedList;
import java.util.List;
import main.java.controle.UsuarioControle;


public class JColabPalestra extends javax.swing.JFrame {
    private static JColabPalestra ColabPalestraUnic;
    private static final List<Integer> pltCodigo = new LinkedList<>();
    
    private JColabPalestra() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public static JColabPalestra geraColabPalestra(){
        if(ColabPalestraUnic == null){
            ColabPalestraUnic = new JColabPalestra();
        }
        ColabPalestraUnic.popularTabela();
        return ColabPalestraUnic;       
    }
    
    public void popularTabela(){
        DefaultTableModel tabmodelo = (DefaultTableModel) tabPalestras.getModel();
        
        int linha = 0;
        
        tabmodelo.setRowCount(linha);
        
        pltCodigo.clear();
        
        for(Palestra plt : PalestraControle.getPalestras()){
            tabmodelo.insertRow(linha, new Object []{plt.getTitulo(), plt.getLocal(), plt.getData(), plt.getHora(), plt.getCodigo()});
            pltCodigo.add(plt.getCodigo());
            linha++;
        }
    } 

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rtColabPalestra = new javax.swing.JLabel();
        painel = new javax.swing.JScrollPane();
        tabPalestras = new javax.swing.JTable();
        cxTitulo = new javax.swing.JTextField();
        rtTitulo = new javax.swing.JLabel();
        btBuscar = new javax.swing.JButton();
        btInscrever = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        btVerPalestrantes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rtColabPalestra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        rtColabPalestra.setText("Colaborador - Palestras");

        tabPalestras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Titulo", "Local", "Data", "Horário", "Codigo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        painel.setViewportView(tabPalestras);

        rtTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rtTitulo.setText("Titulo:");

        btBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        btInscrever.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btInscrever.setText("Inscrever-se");
        btInscrever.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInscreverActionPerformed(evt);
            }
        });

        btVoltar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btVerPalestrantes.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btVerPalestrantes.setText("Ver Palestrantes");
        btVerPalestrantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVerPalestrantesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btInscrever)
                .addGap(18, 18, 18)
                .addComponent(btVerPalestrantes)
                .addGap(18, 18, 18)
                .addComponent(btVoltar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(rtTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cxTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(rtColabPalestra, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rtColabPalestra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtTitulo)
                    .addComponent(btBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInscrever)
                    .addComponent(btVoltar)
                    .addComponent(btVerPalestrantes))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        voltar();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btInscreverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInscreverActionPerformed
        inscrever();
    }//GEN-LAST:event_btInscreverActionPerformed

    private void btVerPalestrantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVerPalestrantesActionPerformed
        verPalestrante();
    }//GEN-LAST:event_btVerPalestrantesActionPerformed

    public void buscar(){
        DefaultTableModel tabmodelo = (DefaultTableModel) tabPalestras.getModel();
        Palestra procuraplt = null;
        int linha = 0;
        
        if("".equals(cxTitulo.getText())){
            popularTabela();
        }else{
            tabmodelo.setRowCount(linha);
        
            for(Palestra plt : PalestraControle.getPalestras()){
                if(plt.getTitulo().equals(cxTitulo.getText())){
                    procuraplt = plt;
                    break;
                }
            }
            
            if(procuraplt != null){
                tabmodelo.insertRow(linha, new Object []{procuraplt.getTitulo(), procuraplt.getLocal(), procuraplt.getData(), procuraplt.getHora(), procuraplt.getCodigo()});
            }
        }
    }
    public void voltar(){
        int resp = JOptionPane.showConfirmDialog(
                null,
                "Deseja realmente voltar?",
                "VOLTAR",
                JOptionPane.YES_NO_OPTION);
        
        if(resp == 0){
            dispose();
            MenuControle.menuColab.setVisible(true);
        }
    }
    public void verPalestrante(){
        
            Palestra pltSelecionada = null;
            DefaultTableModel tabModelo = (DefaultTableModel) tabPalestras.getModel();
            
        try{
            int linhaEscolhida = tabPalestras.getSelectedRow();

           Object pegaCodigo = tabModelo.getValueAt(linhaEscolhida,4);
           int codEscolhido = (int) pegaCodigo;


            for(Palestra plt : PalestraControle.getPalestras()){
                if (plt.getCodigo() == codEscolhido) {
                    pltSelecionada = plt;
                    break;
                }
            }

            if(pltSelecionada != null){
                int resp = JOptionPane.showConfirmDialog(
                        null, 
                        "Quer ver os palestrantes dessa palestra?",
                        "VER PALESTRANTES",
                        JOptionPane.YES_NO_OPTION);


                if(resp == 0){
                        JColabVerPalestrante verPalestrante = JColabVerPalestrante.geraColabVerPalestrante();
                        verPalestrante.passarPalestra(pltSelecionada);
                        verPalestrante.setVisible(true);
                        dispose();
                }
            }
        } catch(NullPointerException npe){
            JOptionPane.showMessageDialog(null, "Sem palestrantes", 
                    "Palestrantes", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public void inscrever(){
        Palestra pltInscrita = null;
        DefaultTableModel tabModelo = (DefaultTableModel) tabPalestras.getModel();
        
       try{
           int linhaEscolhida = tabPalestras.getSelectedRow();
       
        
       Object pegaCodigo = tabModelo.getValueAt(linhaEscolhida,4);
       int codEscolhido = (int) pegaCodigo;
        
                
            for(Palestra plt : PalestraControle.getPalestras()){
                if (plt.getCodigo() == codEscolhido) {
                    pltInscrita = plt;
                    break;
                }
            }
        }
        
        if(pltInscrita != null){
            int resp = JOptionPane.showConfirmDialog(
                    null, 
                    "Quer se inscrever na palestra selecionada?",
                    "INSCRIÇÃO",
                    JOptionPane.YES_NO_OPTION);
            
            
            if(resp == 0){
                try{
                    UsuarioControle.autoInscricao(pltInscrita);
                }
                catch(IllegalArgumentException iae){
                    JOptionPane.showMessageDialog(
                        null, iae.getMessage(), "Erro ao se inscrever", JOptionPane.INFORMATION_MESSAGE
                    );
                }
            }
        }
       } catch(NullPointerException npe){
           JOptionPane.showMessageDialog(null, "Invalido", 
                   "Erro", JOptionPane.ERROR_MESSAGE);
       }
    }
    
    public void mostraErro(String msg){
        JOptionPane.showMessageDialog(
                        null, 
                        msg, 
                        "ERRO", 
                        JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(JColabPalestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JColabPalestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JColabPalestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JColabPalestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JColabPalestra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btInscrever;
    private javax.swing.JButton btVerPalestrantes;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField cxTitulo;
    private javax.swing.JScrollPane painel;
    private javax.swing.JLabel rtColabPalestra;
    private javax.swing.JLabel rtTitulo;
    private javax.swing.JTable tabPalestras;
    // End of variables declaration//GEN-END:variables
}
