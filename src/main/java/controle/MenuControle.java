// src/main/java/controle/MenuControle.java
package main.java.controle;

import main.java.visao.*;
import main.java.objetos.*;


public class MenuControle {
    private static Usuario usuarioAtual = new Usuario();
    public static JInicial menuInicial = new JInicial();
    public static JCadastro menuCadastro = new JCadastro();
    private static JAdmin menuAdmin = new JAdmin();
    //private static JColab menuColab = new JColab();
    private static JUser menuUser = new JUser();
    
    
    
    public static boolean entrar(String userEmail, char[] senha){
        try{
            usuarioAtual = UsuarioControle.entrar(userEmail, String.valueOf(senha));
        }
        catch(IllegalArgumentException iae){
            return false;
        }
        
        if(usuarioAtual.getAdm_flag()){
            menuAdmin.setVisible(true);
            return true;
        }
        else if(usuarioAtual.getColab_flag()){
            //menuColab.setVisible(true);
            return true;
        }
        else{
            menuUser = new JUser();
            System.gc();
            menuUser.setVisible(true);
            return true;
        }
    }
    
    public static Usuario getUsuarioAtual(){
        return usuarioAtual;
    }
    public static JUser getMenuUser(){
        return menuUser;
    }
    public static void setUsuarioAtual(Usuario usuarioAtual){
        MenuControle.usuarioAtual = usuarioAtual;
    }
}
