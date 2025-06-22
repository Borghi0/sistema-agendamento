// src/main/java/objetos/Pessoa.java
package main.java.objetos;


public abstract class Pessoa{
    // atributos
    private String nome;
    private String cpf;
    
    
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