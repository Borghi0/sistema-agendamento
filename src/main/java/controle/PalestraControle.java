// src/main/java/controle/PalestraControle.java
package main.java.controle;

import main.java.objetos.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;


public class PalestraControle {
    private static final List<Palestra> palestras = new LinkedList<>();
    private static PalestraControle palestraControleUnic;
    
    private void PalestraControle(){}
    
    public static PalestraControle getPalestraControle() {
        if (palestraControleUnic == null) {
            palestraControleUnic = new PalestraControle();
        }
        return palestraControleUnic;
    }
    
    public static List<Palestra> getPalestras() {
        return palestras;
    }
    
    public static void cadastrar(String titulo, String local, LocalDate data, LocalTime hora, int vagas){
        palestras.add(new Palestra(titulo, local, data, hora, vagas, getCodUnic()));
        ordenarBd();
    }
    public static int getCodUnic(){
        ordenarBd();
        
        int codUnic = 1;
        for(Palestra p : palestras){
            if(p.getCodigo() != codUnic){
                break;
            } else{
                codUnic++;
            }
        }
        return codUnic;
    }
    public static void ordenarBd(){
        palestras.sort((Palestra m1, Palestra m2) -> Integer.compare(m1.getCodigo(), m2.getCodigo()));
    }
    
}