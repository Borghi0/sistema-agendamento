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
        PalestraControle.getPalestras().add(new Palestra("Inovação Tecnológica", "Auditório 1", LocalDate.of(2025, 6, 15), LocalTime.of(10, 0), 100));
        PalestraControle.getPalestras().add(new Palestra("Futuro da Inteligência Artificial", "Sala 203", LocalDate.of(2025, 6, 16), LocalTime.of(14, 30), 80));
        PalestraControle.getPalestras().add(new Palestra("Cibersegurança em 2025", "Auditório Principal", LocalDate.of(2025, 6, 17), LocalTime.of(9, 0), 120));
        PalestraControle.getPalestras().add(new Palestra("Desenvolvimento Sustentável", "Sala Verde", LocalDate.of(2025, 6, 18), LocalTime.of(11, 15), 60));
        PalestraControle.getPalestras().add(new Palestra("Blockchain na Prática", "Sala 101", LocalDate.of(2025, 6, 19), LocalTime.of(16, 0), 90));
        PalestraControle.getPalestras().add(new Palestra("Realidade Virtual e Educação", "Sala 305", LocalDate.of(2025, 6, 20), LocalTime.of(13, 45), 70));
        PalestraControle.getPalestras().add(new Palestra("5G e Internet das Coisas", "Auditório 2", LocalDate.of(2025, 6, 21), LocalTime.of(10, 30), 110));
        PalestraControle.getPalestras().add(new Palestra("Privacidade de Dados", "Sala Azul", LocalDate.of(2025, 6, 22), LocalTime.of(15, 0), 85));
        PalestraControle.getPalestras().add(new Palestra("Automação e Mercado de Trabalho", "Sala 204", LocalDate.of(2025, 6, 23), LocalTime.of(9, 30), 95));
        PalestraControle.getPalestras().add(new Palestra("Tecnologia e Inclusão Social", "Sala 102", LocalDate.of(2025, 6, 24), LocalTime.of(14, 0), 75));
        PalestraControle.getPalestras().add(new Palestra("Robótica Avançada", "Laboratório 3", LocalDate.of(2025, 6, 25), LocalTime.of(10, 15), 60));
        PalestraControle.getPalestras().add(new Palestra("Ética na Tecnologia", "Auditório Principal", LocalDate.of(2025, 6, 26), LocalTime.of(11, 0), 100));
        PalestraControle.getPalestras().add(new Palestra("Machine Learning Aplicado", "Sala 202", LocalDate.of(2025, 6, 27), LocalTime.of(14, 45), 80));
        PalestraControle.getPalestras().add(new Palestra("Tecnologias Emergentes na Saúde", "Sala 106", LocalDate.of(2025, 6, 28), LocalTime.of(13, 30), 70));
        PalestraControle.getPalestras().add(new Palestra("Design de Interfaces Inteligentes", "Sala 401", LocalDate.of(2025, 6, 29), LocalTime.of(9, 0), 65));
        PalestraControle.getPalestras().add(new Palestra("Cidades Inteligentes", "Auditório 1", LocalDate.of(2025, 6, 30), LocalTime.of(15, 15), 120));
        PalestraControle.getPalestras().add(new Palestra("Tecnologia e Meio Ambiente", "Sala Verde", LocalDate.of(2025, 7, 1), LocalTime.of(10, 45), 90));
        PalestraControle.getPalestras().add(new Palestra("Carreiras em Tecnologia", "Sala 103", LocalDate.of(2025, 7, 2), LocalTime.of(14, 0), 85));
        PalestraControle.getPalestras().add(new Palestra("Computação Quântica", "Auditório 2", LocalDate.of(2025, 7, 3), LocalTime.of(16, 30), 100));
        PalestraControle.getPalestras().add(new Palestra("Empreendedorismo Tech", "Sala Azul", LocalDate.of(2025, 7, 4), LocalTime.of(11, 30), 95));
        // fim do para testes
        
        
        MenuControle.menuInicial.setVisible(true);
  }
}