// src/main/java/Main.java
package main.java;

import main.java.controle .*; //importa todas as classes de controle/
import main.java.objetos .*; // importa todas as classes de objetos/
import main.java.visao .*;   // importa todas as classes de visao/


public class Main{
    
    public static void main(String args[]){
        Leitura ler = Leitura.geraLeitura();
        UsuarioControle.cadastrar("administrador", "0", "admin@", "adminSenha", "admin", true, false);
        
        
        MenuControle.menuInicial.setVisible(true);
  }
}