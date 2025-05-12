// src/main/java/objetos/Usuario.java
package main.java.objetos;

public class Usuario extends Pessoa{
    // atributos
    private String email;
    private String senha;
    private String user;
    private boolean adm_flag;
    
    
    //construtor
    public Usuario(){
        this.email = "";
        this.senha = "";
        this.user = "";
        this.adm_flag = false;
    }
    public Usuario(String email, String senha, String user, boolean adm_flag){
        this.email = email;
        this.senha = senha;
        this.user = user;
        this.adm_flag = adm_flag;
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
}