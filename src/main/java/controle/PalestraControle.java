// src/main/java/controle/PalestraControle.java
package main.java.controle;

import java.util.LinkedList;
import java.util.List;
import main.java.objetos.*;


public class PalestraControle {
    private static final List<Palestra> palestras = new LinkedList<>();
    private static PalestraControle palestraControleUnic;
    
    
    
    public static PalestraControle getPalestraControle() {
        if (palestraControleUnic == null) {
            palestraControleUnic = new PalestraControle();
        }
        return palestraControleUnic;
    }
    
    public static List<Palestra> getPalestras() {
        return palestras;
    }
    
    
}