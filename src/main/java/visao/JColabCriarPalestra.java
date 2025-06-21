package main.java.visao;

import main.java.objetos.*;
import main.java.controle.*;

import javax.swing.JOptionPane;

import main.java.controle.MenuControle;

public class JColabCriarPalestra extends javax.swing.JFrame{

	private PalestraControle bdPalestra = new PalestraControle();
    
	public JColabCriarPalestra() {
        	initComponents();
        	setLocationRelativeTo(null);
    	}

	
	private void btVoltarActionPerformed(java.awt.event.ActionEvent evt){
		
		int resp = JOptionPane.showConfirmDialog(null,"Deseja realmente sair?","VOLTAR",JOptionPane.YES_NO_OPTION);
		
		if(resp == 0){
			dispose();
			MenuControle.menuColab.setVisible(true);
		}
	}


	private void btCriarActionPerformed(java.awtevent.ActionEvent evt){
		criarPalestra();
	}

	public void criarPalestra(){
        	int option = JOptionPane.showConfirmDialog(
                	null,
                	"Confirma o cadastro da palestra?",
                	"CRIAR PALESTRA",
                	JOptionPane.YES_NO_OPTION);
        
        	if(option == 0){
           		Palestrante palestrante = new Palestrante();
            		palestrante.setNome(cxPalestrante.getText());
            		palestrante.setFormacao(cxPalTitulo.getText());
            		//desfazer comentario para atualizar metodo
           		//comentado para retirar erro de conversÃ£o de tipos
            		/*
            		bdPalestra.cadastrar(
                    		cxTitulo.getText(),
                    		cxLocal.getText(),
                    		cxData.getText(),
                    		cxHora.getText(),
                    		palestrante
                    		);*/
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

		cxTitulo.requestFocus("");
	}

	public static void main(String arg[]){
		java.awt.EventQueue.invokeLater(new Runnable() {
				public void run() {
					new JColabCriarPalestra().setVisible(true);	
				}
			});
	}

	private javax.swing.JButton btCriar;
	private javax.swing.JButton btVoltar;
	private javax.swing.JTextField cxData;
	private javax.swing.JTextField cxHora;
	private javax.swing.JTextField cxLocal;
	private javax.swing.JTextField cxPalTitulo;
	private javax.swing.JTextField cxPalestrante;
	private javax.swing.JTextField cxTitulo;
	private javax.swing.JLabel rtCriarPalColab;
	private javax.swing.JLabel rtData;
	private javax.swing.JLabel rtHora;
	private javax.swing.JLabel rtLocal;
	private javax.swing.JLabel rtPalTitulo;
	private javax.swing.JLabel rtPalestrante;
	private javax.swing.JLabel rtTitulo;

}