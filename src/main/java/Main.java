// src/main/java/Main.java
package main.java;

import main.java.controle .*; //importa todas as classes de controle/
import main.java.objetos .*; // importa todas as classes de objetos/
import main.java.exceptions.*;

import java.time.LocalTime;
import java.time.LocalDate;


public class Main{
    
    public static void main(String args[]){
        
        UsuarioControle.getUsuarios().add(new Usuario("administrador", "0", "admin@", "adminSenha", "admin", true, false));
        
        // <editor-fold defaultstate="collapsed" desc="Cadastros para testes">
        
            UsuarioControle.getUsuarios().add(new Usuario("testeeeeeeeeeeeeeeeeeeeeeeeeeeee32131", "0", "amigo@", "amigos", "amigo", false, false));

            Palestrante p1 = new Palestrante("Ana Silva", "111.111.111-11", "Engenharia da Computação");
            try{Palestrante p2 = new Palestrante("Carlos Souza", "222.222.222-22", "Ciência da Computação");
            Palestrante p3 = new Palestrante("Mariana Lima", "333.333.333-33", "Segurança da Informação");
            Palestrante p4 = new Palestrante("João Mendes", "444.444.444-44", "Sistemas de Informação");
            Palestrante p5 = new Palestrante("Fernanda Rocha", "555.555.555-55", "Inteligência Artificial");

            PalestraControle.cadastrar("Inovação Tecnológica", "Auditório 1", LocalDate.of(2025, 6, 15), LocalTime.of(10, 0), 100, p1);
            PalestraControle.cadastrar("Futuro da Inteligência Artificial", "Sala 203", LocalDate.of(2025, 6, 16), LocalTime.of(14, 30), 80, p2);
            PalestraControle.cadastrar("Cibersegurança em 2025", "Auditório Principal", LocalDate.of(2025, 6, 17), LocalTime.of(9, 0), 120, p3);
            PalestraControle.cadastrar("Desenvolvimento Sustentável", "Sala Verde", LocalDate.of(2025, 6, 18), LocalTime.of(11, 15), 60, p4);
            PalestraControle.cadastrar("Blockchain na Prática", "Sala 101", LocalDate.of(2025, 6, 19), LocalTime.of(16, 0), 90, p5);
            PalestraControle.cadastrar("Realidade Virtual e Educação", "Sala 305", LocalDate.of(2025, 6, 20), LocalTime.of(13, 45), 70, p1);
            PalestraControle.cadastrar("5G e Internet das Coisas", "Auditório 2", LocalDate.of(2025, 6, 21), LocalTime.of(10, 30), 110, p2);
            PalestraControle.cadastrar("Privacidade de Dados", "Sala Azul", LocalDate.of(2025, 6, 22), LocalTime.of(15, 0), 85, p3);
            PalestraControle.cadastrar("Automação e Mercado de Trabalho", "Sala 204", LocalDate.of(2025, 6, 23), LocalTime.of(9, 30), 95, p5);
            PalestraControle.cadastrar("Tecnologia e Inclusão Social", "Sala 102", LocalDate.of(2025, 6, 24), LocalTime.of(14, 0), 75, p1);
            PalestraControle.cadastrar("Robótica Avançada", "Laboratório 3", LocalDate.of(2025, 6, 25), LocalTime.of(10, 15), 60, p2);
            PalestraControle.cadastrar("Ética na Tecnologia", "Auditório Principal", LocalDate.of(2025, 6, 26), LocalTime.of(11, 0), 100, p3);
            PalestraControle.cadastrar("Machine Learning Aplicado", "Sala 202", LocalDate.of(2025, 6, 27), LocalTime.of(14, 45), 80, p2);
            PalestraControle.cadastrar("Tecnologias Emergentes na Saúde", "Sala 106", LocalDate.of(2025, 6, 28), LocalTime.of(13, 30), 70, p1);
            PalestraControle.cadastrar("Design de Interfaces Inteligentes", "Sala 401", LocalDate.of(2025, 6, 29), LocalTime.of(9, 0), 65, p4);
            PalestraControle.cadastrar("Cidades Inteligentes", "Auditório 1", LocalDate.of(2025, 6, 30), LocalTime.of(15, 15), 120, p5);
            PalestraControle.cadastrar("Tecnologia e Meio Ambiente", "Sala Verde", LocalDate.of(2025, 7, 1), LocalTime.of(10, 45), 90, p3);
            PalestraControle.cadastrar("Carreiras em Tecnologia", "Sala 103", LocalDate.of(2025, 7, 2), LocalTime.of(14, 0), 85, p1);
            PalestraControle.cadastrar("Computação Quântica", "Auditório 2", LocalDate.of(2025, 7, 3), LocalTime.of(16, 30), 100, p5);
            PalestraControle.cadastrar("Empreendedorismo Tech", "Sala Azul", LocalDate.of(2025, 7, 4), LocalTime.of(11, 30), 95, p2);

            // Palestras sem palestrante (passando null)
            PalestraControle.cadastrar("Tecnologia no Agronegócio", "Sala 210", LocalDate.of(2025, 7, 5), LocalTime.of(9, 0), 70, null);
            PalestraControle.cadastrar("Educação Digital nas Escolas", "Sala 201", LocalDate.of(2025, 7, 6), LocalTime.of(14, 30), 80, null);
            PalestraControle.cadastrar("Realidade Aumentada em Museus", "Auditório 3", LocalDate.of(2025, 7, 7), LocalTime.of(10, 15), 90, null);
            PalestraControle.cadastrar("Tecnologia na Mobilidade Urbana", "Sala 107", LocalDate.of(2025, 7, 8), LocalTime.of(11, 45), 100, null);
            PalestraControle.cadastrar("Inclusão Digital para Idosos", "Sala 303", LocalDate.of(2025, 7, 9), LocalTime.of(13, 0), 60, null);
            PalestraControle.cadastrar("Impressão 3D e Suas Aplicações", "Laboratório 1", LocalDate.of(2025, 7, 10), LocalTime.of(15, 30), 50, null);
            PalestraControle.cadastrar("Jogos Digitais e Educação", "Sala 406", LocalDate.of(2025, 7, 11), LocalTime.of(16, 0), 75, null);
            PalestraControle.cadastrar("Tecnologia Assistiva", "Sala 109", LocalDate.of(2025, 7, 12), LocalTime.of(10, 30), 65, null);
            }catch(PalestraConcomitanteException pce){}
        // </editor-fold>
        
        
        MenuControle.menuInicial.setVisible(true);
  }
}