// src/main/java/controle/MenuControle.java
package main.java.controle;

import main.java.visao.*;
import main.java.objetos.*;

public class MenuControle {
    public static JInicial menuInicial = new JInicial();
    public static JCadastro menuCadastro = new JCadastro();
    private static JAdmin menuAdmin = new JAdmin();
    //private static JColab menuColab = new JColab();
    //private static JUser menuUser = new JUser();
    
    public static boolean entrar(String userEmail, char[] senha){
        Usuario usuario = UsuarioControle.entrar(userEmail, String.valueOf(senha));
        
        if(usuario == null) return false;
        else if(usuario.getAdm_flag()){
            menuAdmin.setVisible(true);
            return true;
        }
        else if(usuario.getColab_flag()){
            //menuColab.setVisible(true);
            return true;
        }
        else{
            //menuUser.setVisible(true);
            return true;
        }
    }
    
    public static int cad(String nome, String cpf, String email, char[] senha, String user, boolean adm_flag, boolean colab_flag){
        int correspondencia = UsuarioControle.buscar(email, user);
        if(correspondencia==0){
            UsuarioControle.cadastrar(nome, cpf, email, String.valueOf(senha), user, adm_flag, colab_flag);
        }
        return correspondencia;
    }
}
