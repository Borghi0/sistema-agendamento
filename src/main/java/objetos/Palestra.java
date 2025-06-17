// src/main/java/objetos/Palestra.java
package main.java.objetos;

import java.time.LocalTime;
import java.time.LocalDate;
import java.util.List;


public class Palestra{
    // atributos
    private String titulo;
    private String local;
    private LocalDate data;
    private LocalTime hora;
    private int vagas;
    private int codigo;

    // Construtor
    public Palestra(){
        this.titulo = "";
        this.local = "";
        this.data = LocalDate.now();
        this.hora = LocalTime.now();
        this.vagas = 0;
    }
    public Palestra(String titulo, String local, LocalDate data, LocalTime hora, int vagas, int codigo){
        this.titulo = titulo;
        this.local = local;
        this.data = data;
        this.hora = hora;
        this.vagas = vagas;
        this.codigo = codigo;
    }

    // Getters
    public String getTitulo(){
        return titulo;
    }

    public String getLocal(){
        return local;
    }

    public LocalDate getData(){
        return data;
    }

    public LocalTime getHora(){
        return hora;
    }

    public int getVagas(){
        return vagas;
    }
    public int getCodigo(){
        return codigo;
    }

    // Setters
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setLocal(String local){
        this.local = local;
    }

    public void setData(LocalDate data){
        this.data = data;
    }

    public void setHora(LocalTime hora){
        this.hora = hora;
    }

    public void setVagas(int vagas){
        this.vagas = vagas;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
}