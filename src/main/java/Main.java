// src/main/java/Main.java
package main.java;

import main.java.controle .*; //importa todas as classes de controle/
import main.java.objetos .*; // importa todas as classes de objetos/
import main.java.visao .*;   // importa todas as classes de visao/

import java.time.LocalTime;
import java.time.LocalDate;

public class Main{
    
    public static void main(String args[]){
        //Leitura ler = Leitura.geraLeitura();
        UsuarioControle.getUsuarios().add(new Usuario("administrador", "0", "admin@", "adminSenha", "admin", true, false));
        
        // para testes
        UsuarioControle.getUsuarios().add(new Usuario("testeeeeeeeeeeeeeeeeeeeeeeeeeeee32131", "0", "amigo@", "amigos", "amigo", false, false));
        PalestraControle.cadastrar("Inovação Tecnológica", "Auditório 1", LocalDate.of(2025, 6, 15), LocalTime.of(10, 0), 100, null);
        PalestraControle.cadastrar("Futuro da Inteligência Artificial", "Sala 203", LocalDate.of(2025, 6, 16), LocalTime.of(14, 30), 80, null);
        PalestraControle.cadastrar("Cibersegurança em 2025", "Auditório Principal", LocalDate.of(2025, 6, 17), LocalTime.of(9, 0), 120, null);
        PalestraControle.cadastrar("Desenvolvimento Sustentável", "Sala Verde", LocalDate.of(2025, 6, 18), LocalTime.of(11, 15), 60, null);
        PalestraControle.cadastrar("Blockchain na Prática", "Sala 101", LocalDate.of(2025, 6, 19), LocalTime.of(16, 0), 90, null);
        PalestraControle.cadastrar("Realidade Virtual e Educação", "Sala 305", LocalDate.of(2025, 6, 20), LocalTime.of(13, 45), 70, null);
        PalestraControle.cadastrar("5G e Internet das Coisas", "Auditório 2", LocalDate.of(2025, 6, 21), LocalTime.of(10, 30), 110, null);
        PalestraControle.cadastrar("Privacidade de Dados", "Sala Azul", LocalDate.of(2025, 6, 22), LocalTime.of(15, 0), 85, null);
        PalestraControle.cadastrar("Automação e Mercado de Trabalho", "Sala 204", LocalDate.of(2025, 6, 23), LocalTime.of(9, 30), 95, null);
        PalestraControle.cadastrar("Tecnologia e Inclusão Social", "Sala 102", LocalDate.of(2025, 6, 24), LocalTime.of(14, 0), 75, null);
        PalestraControle.cadastrar("Robótica Avançada", "Laboratório 3", LocalDate.of(2025, 6, 25), LocalTime.of(10, 15), 60, null);
        PalestraControle.cadastrar("Ética na Tecnologia", "Auditório Principal", LocalDate.of(2025, 6, 26), LocalTime.of(11, 0), 100, null);
        PalestraControle.cadastrar("Machine Learning Aplicado", "Sala 202", LocalDate.of(2025, 6, 27), LocalTime.of(14, 45), 80, null);
        PalestraControle.cadastrar("Tecnologias Emergentes na Saúde", "Sala 106", LocalDate.of(2025, 6, 28), LocalTime.of(13, 30), 70, null);
        PalestraControle.cadastrar("Design de Interfaces Inteligentes", "Sala 401", LocalDate.of(2025, 6, 29), LocalTime.of(9, 0), 65, null);
        PalestraControle.cadastrar("Cidades Inteligentes", "Auditório 1", LocalDate.of(2025, 6, 30), LocalTime.of(15, 15), 120, null);
        PalestraControle.cadastrar("Tecnologia e Meio Ambiente", "Sala Verde", LocalDate.of(2025, 7, 1), LocalTime.of(10, 45), 90, null);
        PalestraControle.cadastrar("Carreiras em Tecnologia", "Sala 103", LocalDate.of(2025, 7, 2), LocalTime.of(14, 0), 85, null);
        PalestraControle.cadastrar("Computação Quântica", "Auditório 2", LocalDate.of(2025, 7, 3), LocalTime.of(16, 30), 100, null);
        PalestraControle.cadastrar("Empreendedorismo Tech", "Sala Azul", LocalDate.of(2025, 7, 4), LocalTime.of(11, 30), 95, null);
        // fim do para testes
        
        
        MenuControle.menuInicial.setVisible(true);
  }
}