package main.java.visao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import main.java.controle.MenuControle;
import main.java.controle.PalestraControle;
import main.java.exceptions.PalestraConcomitanteException;
import main.java.objetos.Palestra;
import main.java.objetos.Palestrante;

public final class JAdminPalestra extends javax.swing.JFrame implements JAdminInterface {
    private static JAdminPalestra insJAdminPalestra;
    private PalestraControle pc = PalestraControle.getPalestraControle();
    
    ActionListener apagaAviso = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent evt){
            rtAviso.setVisible(false);
            tempo.stop();
        }
    };
            
    Timer tempo = new Timer(1500, apagaAviso);
    private JAdminPalestra() {
        initComponents();
        setLocationRelativeTo(null); // Inicia a janela centralizada
        rtAviso.setVisible(false);

        try{
            PalestraControle.cadastrar(
                "Título", 
                "Local", 
                LocalDate.now(), 
                LocalTime.now(), 
                100, 
                null
            );

            PalestraControle.cadastrar(
                "Título 2", 
                "Auditório B", 
                LocalDate.of(2025, 7, 15), 
                LocalTime.of(14, 30), 
                80, 
                null
            );
        } catch(PalestraConcomitanteException pce){
            
        }
        compTabela();
    }
    
    public static JAdminPalestra getJAdminPalestra(){
        if(insJAdminPalestra == null) insJAdminPalestra = new JAdminPalestra();
        
        return insJAdminPalestra;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
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
        btIns = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

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
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Titulo", "Local", "Data", "Hora"
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
        rtTitulo.setText("Codigo:");

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

        btIns.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btIns.setText("INSCREVER");
        btIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(cxPalestra, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(rtAviso)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btPalestraC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btPalestraR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btPalestraU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btPalestraD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btIns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btPalestraC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btPalestraR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btPalestraU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btPalestraD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btIns)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(btVoltar)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPalestraCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPalestraCActionPerformed
        inserir();
        compTabela();
    }//GEN-LAST:event_btPalestraCActionPerformed

    private void btPalestraRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPalestraRActionPerformed
        ler();
    }//GEN-LAST:event_btPalestraRActionPerformed

    private void btPalestraUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPalestraUActionPerformed
        atualizar();
        compTabela();
    }//GEN-LAST:event_btPalestraUActionPerformed

    private void btPalestraDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPalestraDActionPerformed
        deletar();
    }//GEN-LAST:event_btPalestraDActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        voltar();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void cxPalestraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPalestraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxPalestraActionPerformed

    private void cxPalestraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cxPalestraKeyPressed
        ler(evt);
    }//GEN-LAST:event_cxPalestraKeyPressed

    private void btInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInsActionPerformed
        inscrever();
    }//GEN-LAST:event_btInsActionPerformed

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
        DefaultTableModel modelo = (DefaultTableModel) tbPalestras.getModel();
        int linha = 0,
            codigo = 0;
        boolean existe = false;
        
        try{
            codigo = Integer.parseInt(cxPalestra.getText());
            
            modelo.setRowCount(linha);

            for(Palestra p : PalestraControle.getPalestras()){
                if(p.getCodigo() == codigo){
                    modelo.insertRow(linha, new Object[]{
                                            p.getCodigo(),
                                            p.getTitulo(),
                                            p.getLocal(),
                                            p.getData(),
                                            p.getHora()});
                    existe = true;
                    linha++;
                }
            }
            
            if(!existe){
                rtAviso.setVisible(true);
                tempo.start();
            }
        } catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Parametro invalido", 
                    "Erro", JOptionPane.ERROR_MESSAGE);
        } finally{
            if("".equals(cxPalestra.getText())) compTabela();
                    
            cxPalestra.requestFocus();
        }
    }

    @Override
    public void ler(KeyEvent evt) {
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) ler();
    }

    @Override
    public void atualizar() {
        PalestraUC palestraU = null;
        int codigo = 0;
        Palestra p = null;
        
        try{
            codigo = Integer.parseInt(cxPalestra.getText());
            p = PalestraControle.buscaCodigo(codigo);
            
            if(p == null){
                rtAviso.setVisible(true);
                tempo.start();
            } else{
                palestraU = new PalestraUC(p, 0);
                palestraU.setVisible(true);
            }
        } catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Parametro invalido", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        } 
    }

    @Override
    public void deletar() {
        int codigo = 0;
        boolean check = false;
        
        try{
            codigo = Integer.parseInt(cxPalestra.getText());
            check = PalestraControle.deletar(codigo);
            
            if(check)
                JOptionPane.showMessageDialog(null, "Deletado com sucesso",
                        "Delecao", JOptionPane.INFORMATION_MESSAGE);
            else{
                rtAviso.setVisible(true);
                tempo.start();
            }
        } catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Parametro invalido", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        } finally{
            compTabela();
        }
    }
    
    private void inserir(){
        PalestraUC palestraU = null;
        Palestra p = null;
        
        palestraU = new PalestraUC(1);
        palestraU.setVisible(true);
    }
    
    private void inscrever(){
        int codigo = 0;
        Palestra p = null;
        boolean check = false;
        
        try{
            codigo = Integer.parseInt(cxPalestra.getText());
            p = PalestraControle.buscaCodigo(codigo);
            
            if(p == null){
                rtAviso.setVisible(true);
                tempo.start();
            } else{
                if(p.getVagas() == 0)
                    JOptionPane.showMessageDialog(null, 
                            "Vagas totalmente preenchidas!", "Palestra cheia",
                            JOptionPane.WARNING_MESSAGE);
                else{
                    check = p.novoInscrito(MenuControle.getUsuarioAtual());
                    
                    if(check) p.setVagas(p.getVagas() - 1);
                    JOptionPane.showMessageDialog(null, "Inscrito com sucesso",
                            "Inscricao", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Parametro invalido", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @Override
    public void compTabela() {
        DefaultTableModel modelo = (DefaultTableModel) tbPalestras.getModel();
        int linha = 0;
        
        modelo.setRowCount(0);
        
        for(Palestra p : PalestraControle.getPalestras()){
            modelo.insertRow(linha, new Object[]{
                                        p.getCodigo(),
                                        p.getTitulo(),
                                        p.getLocal(),
                                        p.getData(),
                                        p.getHora()});
            
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
    private javax.swing.JButton btIns;
    private javax.swing.JButton btPalestraC;
    private javax.swing.JButton btPalestraD;
    private javax.swing.JButton btPalestraR;
    private javax.swing.JButton btPalestraU;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField cxPalestra;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel rtAviso;
    private javax.swing.JLabel rtTitulo;
    private javax.swing.JTable tbPalestras;
    // End of variables declaration//GEN-END:variables
}
