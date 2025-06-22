// src/main/java/objetos/Usuario.java
package main.java.objetos;

import java.util.LinkedList;
import java.util.List;


public class Usuario extends Pessoa{
    // atributos
    private String email;
    private String senha;
    private String user;
    private boolean adm_flag;     // flag de admin
    private boolean colab_flag;  // flag de colaborador
    
    private List<Palestra> palestras;
    
    //construtor
    public Usuario(){
        this.email = "";
        this.senha = "";
        this.user = "";
        this.adm_flag = false;
        this.colab_flag = false;
        palestras = new LinkedList<>();
    }
    public Usuario(String nome, String cpf, String email, String senha, String user, boolean adm_flag, boolean colab_flag){
        super(nome, cpf);
        this.email = email;
        this.senha = senha;
        this.user = user;
        this.adm_flag = adm_flag;
        this.colab_flag = colab_flag;
        palestras = new LinkedList<>();
    }

    //getters
    public String getEmail(){
        return email;
    }

    public String getSenha(){
        return senha;
    }

    public String getUser(){
        return user;
    }
    
    public boolean getAdm_flag(){
        return adm_flag;
    }
    public boolean getColab_flag(){
        return colab_flag;
    }
    public List<Palestra> getPalestras(){
        return palestras;
    }

    //setters
    public void setEmail(String email){
        this.email = email;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public void setUser(String user){
        this.user = user;
    }

    public void setAdm_flag(boolean adm_flag){
        this.adm_flag = adm_flag;
    }
    public void setColab_flag(boolean colab_flag){
        this.colab_flag = colab_flag;
    }
}