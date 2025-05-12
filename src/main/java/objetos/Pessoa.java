// src/main/java/objetos/Pessoa.java
package main.java.objetos;

import java.util.List;

public abstract class Pessoa{
    // atributos
    private String nome;
    private String cpf;
  
    //private List<Palestra> palestras;
    
    
    //construtor
    public Pessoa(){
        this.nome = "";
        this.cpf = "";
    }
    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    
    //getters
    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }
    
    //setters
    public void setNome(String nome){
        this.nome = nome;
    }
   
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
}