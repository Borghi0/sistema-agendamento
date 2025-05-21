// src/main/java/controle/MenuEntrar.java
package main.java.controle;

import main.java.visao .*;

public class MenuEntrar {
    public static void main(){
        Leitura ler = Leitura.geraLeitura();
        
        ler.entDados("User/email: ");
        ler.entDados("Senha: ");
        
    }
}
