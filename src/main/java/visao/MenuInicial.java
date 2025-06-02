// src/main/java/visao/MenuInicial.java
package main.java.visao;

import main.java.controle .*;

public class MenuInicial{
    public static void menuEntrar(Leitura ler){
        
        if(MenuPrincipal.menuUsuario(UsuarioControle.entrar(ler.entDados("User/email: "), ler.entDados("Senha: ")))==-1){
            System.out.println("Email, user ou senha incorretos");
        } else System.out.println("Saindo");
        
    }
    
    public static void menuCadastrar(Leitura ler){
        
    }
}
