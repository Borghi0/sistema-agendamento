// src/main/java/controle/PalestraControle.java
package main.java.controle;

import main.java.objetos.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;
import main.java.exceptions.PalestraConcomitanteException;


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
    
    public static void cadastrar(String titulo, String local, LocalDate data, 
            LocalTime hora, int vagas, Palestrante palestrantes) 
            throws PalestraConcomitanteException{
        
        for(Palestra p : palestras){
            if(p.getLocal().equals(local) && p.getData().isEqual(data) && p.getHora().compareTo(hora) == 0)
                throw new PalestraConcomitanteException();
        }
        
        palestras.add(new Palestra(titulo, local, data, hora, vagas, getCodUnic(), palestrantes));
        ordenarBd();
    }
    
    public static Palestra cadastrar(Palestra p) throws PalestraConcomitanteException{
        cadastrar(p.getTitulo(), p.getLocal(), p.getData(), p.getHora(),
                p.getVagas(), p.getPalestrantes());
        
        return p;
    }
    
    public static boolean deletar(int codigo){
        Palestra p = buscaCodigo(codigo);
        boolean retornavel = false;
        
        if(p != null){
            retornavel = true;
            palestras.remove(p);
        }
        
        return retornavel;
    }
    
    public static Palestra atualizar(int codigo, Palestra nova){
        Palestra retorno = null;
        
        for(Palestra plt : palestras)
            if(plt.getCodigo() == nova.getCodigo()) retorno = plt;
        
        try{
            palestras.set(codigo, retorno);
        } catch(ArrayIndexOutOfBoundsException aioobe){}
        
        return retorno;
    }
    
    public static Palestra buscaCodigo(int codigo){
        Palestra retornavel = null;
        
        for(Palestra p : palestras)
            if(p.getCodigo() == codigo) retornavel = p;
        
        return retornavel;
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