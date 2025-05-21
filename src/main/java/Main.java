// src/main/java/Main.java
package main.java;

import main.java.controle .*; //importa todas as classes de controle/
import main.java.objetos .*; // importa todas as classes de objetos/
import main.java.visao .*;   // importa todas as classes de visao/


public class Main{
    public static void main(String args[]){
        Leitura ler = Leitura.geraLeitura();
        Usuario admin = new Usuario("admin@", "admin", "admin", true, false);
        
        int o; // opção escolhida no menu
    
        // Fazer menu de opção: "Entrar" e "Cadastrar-se"
        do{
            System.out.println("\n1 - Entrar");
            System.out.println("2 - Cadastrar-se");
            System.out.println("0 - Sair");
            o = Integer.parseInt(ler.entDados("Escolha uma opção: "));
            
            switch (o){
                case 1:
                    MenuEntrar.main();
                    break;
                    
                case 2:
                    
                    break;
                    
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }while(o!=0);
        
  }
}