package main.java.visao;

import javax.swing.JOptionPane;
import main.java.controle.MenuControle;

public class JColaborador extends javax.swing.JFrame{

	private String user;

	public JColaborador(){
		initComponents();
		setLocationRelativeTo(null);
	}

	private void btSairActionPerformed(java.awt.event.ActionEvent evt){
		sair();
	}

	private void btCriarPalestraActionPerformed(java.awt.event.ActionEvent evt){
		if(validarColab()) criarPalestra();
	}

	public void setUser(String user){
        	this.user = user;
    	}

	public String getUser(){
        	return user;
    	}

	public void criarPalestra(){
		MenuControle.menuColabCriarPalestra.setVisible(true);
	}

	public boolean validarColab(){
		if(this.user -- null || !(this.user.equals("colab"))){
			JOptionPane.showMessageDialog(this, "Permitido apenas para colaboradores", "ACESSO NEGADO!", JOptionPane.ERROR_MESSAGE);
			return false;
		}else{
			return true;
		}
	}

	public void sair(){
        	int resp = JOptionPane.showConfirmDialog(
                	null,
                	"Deseja realmente sair?",
                	"SAIR",
                	JOptionPane.YES_NO_OPTION);
        
        	if(resp == 0){
            	dispose();
        	}
    	}

	public static void main(String arg[]){
		java.awt.EventQueue.invokeLater(new Runnable(){
			public void run(){
				new JColaborador().setVisible(true);
			}
		});
	}

	private javax.swing.JButton btConsultarPalestra;
	private javax.swing.JButton btCriarPalestra;
	private javax.swing.JButton btInscrever;
	private javax.swing.JButton btSair;
	private javax.swing.JLabel rtColab;
}