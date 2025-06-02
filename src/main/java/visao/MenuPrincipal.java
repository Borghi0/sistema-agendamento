// src/main/java/visao/MenuPrincipal.java
package main.java.visao;

import main.java.controle .*;
import main.java.objetos .*;

public class MenuPrincipal{
    public static int menuUsuario(Usuario usuario){
        if(usuario==null) return -1;
        Leitura ler = Leitura.geraLeitura();
        if(usuario.getAdm_flag()) return menuAdmin(usuario, ler);
        if(usuario.getColab_flag()) return menuColaborador(usuario, ler);
        return menuParticipante(usuario, ler);
    }
    
    private static int menuAdmin(Usuario usuario, Leitura ler){
        int o; // opção escolhida no menu
    
        do{
            System.out.println("\n1 - Atualizar palestras");
            System.out.println("2 - Cadastrar colaboradores");
            System.out.println("0 - Sair");
            o = Integer.parseInt(ler.entDados("Escolha uma opção: "));
            
            switch (o){
                case 1:
                    
                    break;
                    
                case 2:
                    
                    break;
                    
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }while(o!=0);
        return 0;
    }
    private static int menuColaborador(Usuario usuario, Leitura ler){
        int o; // opção escolhida no menu
    
        do{
            System.out.println("\n1 - Cadastrar palestra");
            System.out.println("2 - Inscrever-se como palestrante");
            System.out.println("0 - Sair");
            o = Integer.parseInt(ler.entDados("Escolha uma opção: "));
            
            switch (o){
                case 1:
                    
                    break;
                    
                case 2:
                    
                    break;
                    
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }while(o!=0);
        return 0;
    }
    private static int menuParticipante(Usuario usuario, Leitura ler){
        int o; // opção escolhida no menu
    
        do{
            System.out.println("\n1 - Inscrever-se em palestras");
            System.out.println("2 - Ver certificados");
            System.out.println("0 - Sair");
            o = Integer.parseInt(ler.entDados("Escolha uma opção: "));
            
            switch (o){
                case 1:
                    
                    break;
                    
                case 2:
                    
                    break;
                    
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }while(o!=0);
        return 0;
    }
}
