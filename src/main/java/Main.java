// src/main/java/Main.java
package main.java;

import main.java.controle .*; //importa todas as classes de controle/
import main.java.objetos .*; // importa todas as classes de objetos/


public class Main{
    
    public static void main(String args[]){        
        UsuarioControle.getUsuarios().add(new Usuario("administrador", "0", "admin@", "adminSenha", "admin", true, false));
        
        MenuControle.menuInicial.setVisible(true);
  }
}