/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.java.visao;

import main.java.objetos.*;
import main.java.controle.*;

import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

import main.java.controle.MenuControle;
/**
 *
 * @author gp51f
 */
public class JColabCriarPalestra extends javax.swing.JFrame {

    private final PalestraControle bdPalestra = new PalestraControle();
    DateTimeFormatter formataTime = DateTimeFormatter.ofPattern("HH:mm");
    DateTimeFormatter formataData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    public JColabCriarPalestra() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rtCriarPalColab = new javax.swing.JLabel();
        rtTitulo = new javax.swing.JLabel();
        rtLocal = new javax.swing.JLabel();
        rtData = new javax.swing.JLabel();
        rtHora = new javax.swing.JLabel();
        rtPalestrante = new javax.swing.JLabel();
        rtPalTitulo = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();
        btCriar = new javax.swing.JButton();
        cxTitulo = new javax.swing.JTextField();
        cxLocal = new javax.swing.JTextField();
        cxData = new javax.swing.JTextField();
        cxHora = new javax.swing.JTextField();
        cxPalestrante = new javax.swing.JTextField();
        cxPalTitulo = new javax.swing.JTextField();
        rtCpfPalestrante = new javax.swing.JLabel();
        cxPalCpf = new javax.swing.JTextField();
        rtVagas = new javax.swing.JLabel();
        cxVagas = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rtCriarPalColab.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        rtCriarPalColab.setText("Criar Palestra - Colaborador");

        rtTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rtTitulo.setText("Titulo:");

        rtLocal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rtLocal.setText("Local:");

        rtData.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rtData.setText("Data:");

        rtHora.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rtHora.setText("Horário:");

        rtPalestrante.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rtPalestrante.setText("Palestrante:");

        rtPalTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rtPalTitulo.setText("Titulo Palestrante:");

        btVoltar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btCriar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btCriar.setText("Criar");
        btCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCriarActionPerformed(evt);
            }
        });

        rtCpfPalestrante.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rtCpfPalestrante.setText("CPF Palestrante:");

        rtVagas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rtVagas.setText("Vagas:");

        cxVagas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxVagasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 255, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(rtCriarPalColab, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btCriar)
                                .addGap(18, 18, 18)
                                .addComponent(btVoltar)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rtTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rtLocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rtData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cxTitulo)
                                    .addComponent(cxLocal)
                                    .addComponent(cxData)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtHora)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cxHora))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtPalTitulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cxPalTitulo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtPalestrante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cxPalestrante))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtCpfPalestrante, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxPalCpf))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtVagas)
                                .addGap(18, 18, 18)
                                .addComponent(cxVagas)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rtCriarPalColab)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtTitulo)
                    .addComponent(cxTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtLocal)
                    .addComponent(cxLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtData)
                    .addComponent(cxData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtHora)
                    .addComponent(cxHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtPalestrante)
                    .addComponent(cxPalestrante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtPalTitulo)
                    .addComponent(cxPalTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtCpfPalestrante)
                    .addComponent(cxPalCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtVagas)
                    .addComponent(cxVagas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltar)
                    .addComponent(btCriar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        int resp = JOptionPane.showConfirmDialog(
                null,
                "Deseja realmente voltar?",
                "VOLTAR",
                JOptionPane.YES_NO_OPTION);
        
        if(resp == 0){
            dispose();
            MenuControle.menuColab.setVisible(true);
        }
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCriarActionPerformed
        criarPalestra();
    }//GEN-LAST:event_btCriarActionPerformed

    private void cxVagasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxVagasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxVagasActionPerformed

    public void criarPalestra(){
        int option = JOptionPane.showConfirmDialog(
                null,
                "Confirma o cadastro da palestra?",
                "CRIAR PALESTRA",
                JOptionPane.YES_NO_OPTION);
        
        if(option == 0){
            LinkedList<Palestrante> palestrantes = new LinkedList<>();
            palestrantes.add(0, new Palestrante(cxPalestrante.getText(),cxPalCpf.getText(),cxPalTitulo.getText()));
            int vagas = Integer.parseInt(cxVagas.getText());
            //falta colocar catch PalestraComitanteException
            try{
                bdPalestra.cadastrar(
                        cxTitulo.getText(),
                        cxLocal.getText(),
                        LocalDate.parse(cxData.getText(),formataData),
                        LocalTime.parse(cxHora.getText(),formataTime),
                        vagas,
                        palestrantes);
            }
            catch(DateTimeParseException dtpe){
                JOptionPane.showMessageDialog(
                        null, 
                        "Data ou Horario apresentam erro", 
                        "ERRO DE CADASTRO", 
                        JOptionPane.ERROR_MESSAGE);
            }
            
        }
        limpar();
    }
    
    public void limpar(){
        cxTitulo.setText("");
        cxLocal.setText("");
        cxData.setText("");
        cxHora.setText("");
        cxPalestrante.setText("");
        cxPalTitulo.setText("");
        cxPalCpf.setText("");
        cxVagas.setText("");
        
        cxTitulo.requestFocus();
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
            java.util.logging.Logger.getLogger(JColabCriarPalestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JColabCriarPalestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JColabCriarPalestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JColabCriarPalestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JColabCriarPalestra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCriar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField cxData;
    private javax.swing.JTextField cxHora;
    private javax.swing.JTextField cxLocal;
    private javax.swing.JTextField cxPalCpf;
    private javax.swing.JTextField cxPalTitulo;
    private javax.swing.JTextField cxPalestrante;
    private javax.swing.JTextField cxTitulo;
    private javax.swing.JTextField cxVagas;
    private javax.swing.JLabel rtCpfPalestrante;
    private javax.swing.JLabel rtCriarPalColab;
    private javax.swing.JLabel rtData;
    private javax.swing.JLabel rtHora;
    private javax.swing.JLabel rtLocal;
    private javax.swing.JLabel rtPalTitulo;
    private javax.swing.JLabel rtPalestrante;
    private javax.swing.JLabel rtTitulo;
    private javax.swing.JLabel rtVagas;
    // End of variables declaration//GEN-END:variables
}
