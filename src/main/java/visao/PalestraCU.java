package main.java.visao;

//CU: Create e Update

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import main.java.controle.PalestranteControle;
import main.java.objetos.Palestra;
import main.java.objetos.Palestrante;


public class PalestraCU extends javax.swing.JInternalFrame {
    PalestranteControle pc = PalestranteControle.getPalestranteControle();
    
    public PalestraCU() {
        DefaultComboBoxModel modelo = null;
        
        initComponents();
        
        modelo = (DefaultComboBoxModel) cmbPalestrante.getModel();
        
        modelo.removeAllElements();
        modelo.addElement(null);
        
        for(Palestrante p : pc.getPalestrantes())
            modelo.addElement(p.getNome());
    }
    
    public PalestraCU(Palestra p){
        DefaultComboBoxModel modelo = null;
        
        initComponents();
        
        modelo = (DefaultComboBoxModel) cmbPalestrante.getModel();
        
        modelo.removeAllElements();
        modelo.addElement(null);
        
        for(Palestrante p1 : pc.getPalestrantes())
            modelo.addElement(p1.getNome());
        
        this.cxTitulo.setText(p.getTitulo());
        this.cxDia.setText(Integer.toString(p.getData().getDayOfMonth()));
        this.cxMes.setText(Integer.toString(p.getData().getMonthValue()));
        this.cxAno.setText(Integer.toString(p.getData().getYear()));
        this.cxHora.setText(Integer.toString(p.getHora().getHour()));
        this.cxMin.setText(Integer.toString(p.getHora().getMinute()));
        this.cxVaga.setText(Integer.toString(p.getVagas()));
        this.cxLocal.setText(p.getLocal());
        this.cmbPalestrante.setSelectedItem(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rtTitulo = new javax.swing.JLabel();
        cxTitulo = new javax.swing.JTextField();
        rtData = new javax.swing.JLabel();
        cxDia = new javax.swing.JTextField();
        rtSep1 = new javax.swing.JLabel();
        cxMes = new javax.swing.JTextField();
        rtSep2 = new javax.swing.JLabel();
        cxAno = new javax.swing.JTextField();
        rtHora = new javax.swing.JLabel();
        rtVaga = new javax.swing.JLabel();
        rtPalestrante = new javax.swing.JLabel();
        cmbPalestrante = new javax.swing.JComboBox<>();
        cxVaga = new javax.swing.JTextField();
        cxHora = new javax.swing.JTextField();
        rtSepHora = new javax.swing.JLabel();
        cxMin = new javax.swing.JTextField();
        rtLocal = new javax.swing.JLabel();
        cxLocal = new javax.swing.JTextField();

        rtTitulo.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        rtTitulo.setText("Titulo: ");

        rtData.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        rtData.setText("Data (dd/mm/aaaa): ");

        rtSep1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        rtSep1.setText("/");

        rtSep2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        rtSep2.setText("/");

        rtHora.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        rtHora.setText("Hora: ");

        rtVaga.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        rtVaga.setText("Vagas: ");

        rtPalestrante.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        rtPalestrante.setText("Palestrante: ");

        cmbPalestrante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        rtSepHora.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        rtSepHora.setText("h");

        rtLocal.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        rtLocal.setText("Local: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rtData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxDia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rtSep1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxMes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rtSep2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cxAno, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rtPalestrante, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbPalestrante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(rtLocal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rtVaga, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rtHora, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cxHora, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                                    .addComponent(cxVaga))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rtSepHora)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxMin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cxLocal))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtTitulo)
                    .addComponent(cxTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtData)
                    .addComponent(cxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtSep1)
                    .addComponent(cxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtSep2)
                    .addComponent(cxAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rtHora)
                        .addComponent(cxHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rtSepHora)
                        .addComponent(cxMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtVaga)
                    .addComponent(cxVaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtLocal)
                    .addComponent(cxLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtPalestrante)
                    .addComponent(cmbPalestrante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbPalestrante;
    private javax.swing.JTextField cxAno;
    private javax.swing.JTextField cxDia;
    private javax.swing.JTextField cxHora;
    private javax.swing.JTextField cxLocal;
    private javax.swing.JTextField cxMes;
    private javax.swing.JTextField cxMin;
    private javax.swing.JTextField cxTitulo;
    private javax.swing.JTextField cxVaga;
    private javax.swing.JLabel rtData;
    private javax.swing.JLabel rtHora;
    private javax.swing.JLabel rtLocal;
    private javax.swing.JLabel rtPalestrante;
    private javax.swing.JLabel rtSep1;
    private javax.swing.JLabel rtSep2;
    private javax.swing.JLabel rtSepHora;
    private javax.swing.JLabel rtTitulo;
    private javax.swing.JLabel rtVaga;
    // End of variables declaration//GEN-END:variables

    
    public JComboBox<String> getCmbPalestrante() {
        return cmbPalestrante;
    }

    public JTextField getCxAno() {
        return cxAno;
    }

    public JTextField getCxDia() {
        return cxDia;
    }

    public JTextField getCxHora() {
        return cxHora;
    }

    public JTextField getCxMes() {
        return cxMes;
    }

    public JTextField getCxMin() {
        return cxMin;
    }

    public JTextField getCxTitulo() {
        return cxTitulo;
    }

    public JTextField getCxVaga() {
        return cxVaga;
    }
    
    public JTextField getCxLocal(){
        return cxLocal;
    }

    public void setCmbPalestrante(JComboBox<String> cmbPalestrante) {
        this.cmbPalestrante = cmbPalestrante;
    }

    public void setCxAno(JTextField cxAno) {
        this.cxAno = cxAno;
    }

    public void setCxDia(JTextField cxDia) {
        this.cxDia = cxDia;
    }

    public void setCxHora(JTextField cxHora) {
        this.cxHora = cxHora;
    }

    public void setCxMes(JTextField cxMes) {
        this.cxMes = cxMes;
    }

    public void setCxMin(JTextField cxMin) {
        this.cxMin = cxMin;
    }

    public void setCxTitulo(JTextField cxTitulo) {
        this.cxTitulo = cxTitulo;
    }

    public void setCxVaga(JTextField cxVaga) {
        this.cxVaga = cxVaga;
    }
    
    public void setCxLocal(JTextField cxLocal){
        this.cxLocal = cxLocal;
    }
}
