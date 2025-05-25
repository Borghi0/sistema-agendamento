// src/main/java/controle/UsuarioControle.java
package main.java.controle;

import main.java.objetos .*; // importa todas as classes de objetos/
import main.java.visao .*;   // importa todas as classes de visao/

import java.util.List;
import java.util.LinkedList;


public class UsuarioControle{
    private static List<Usuario> usuarios = new LinkedList<>();
    
    public static void cadastrar(String nome, String cpf, String email, String senha, String user, boolean adm_flag, boolean colab_flag){
        usuarios.add(new Usuario(nome, cpf, email, senha, user, adm_flag, colab_flag));
    }
    
    public static Usuario buscar(String userEmail){
        for(Usuario usuario : usuarios){
            if(usuario.getUser().equals(userEmail)||usuario.getEmail().equals(userEmail))return usuario;
        }
        return null;
    }
    
    public static Usuario entrar(String userEmail, String senha){
        Usuario usuario = buscar(userEmail);
        
        if(usuario!=null && usuario.getSenha().equals(senha)) return usuario;
        else return null;
    }
}