// src/main/java/objetos/Palestrante.java
package main.java.objetos;


public class Palestrante extends Pessoa{
    // atributos
    private String formacao;
 
    
    //construtor
    public Palestrante(){
        this.formacao = "";
    }
    public Palestrante(String nome, String cpf, String formacao){
        super(nome, cpf);
        this.formacao = formacao;
    }

    // getters
    public String getFormacao(){
        return formacao;
    }
    
    //setters
    public void setFormacao(String formacao){
        this.formacao = formacao;
    }
}