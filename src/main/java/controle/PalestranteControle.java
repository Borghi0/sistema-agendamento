package main.java.controle;

import main.java.objetos.Palestrante;
import java.util.List;
import java.util.LinkedList;
import main.java.exceptions.PalestranteExistenteException;

public class PalestranteControle {
    static PalestranteControle palestranteControleUnic;
    static final List<Palestrante> palestrantes = new LinkedList<Palestrante>();
    
    private PalestranteControle(){}
    
    public static PalestranteControle getPalestranteControle(){
        if(palestranteControleUnic == null) 
            palestranteControleUnic = new PalestranteControle();
        
        return palestranteControleUnic;
    }
    
    public List<Palestrante> getPalestrantes(){
        return palestrantes;
    }
    
    public Palestrante buscarCpf(String cpf){
        Palestrante pll = null;
        
        for(Palestrante pll_temp : palestrantes)
            if(pll_temp.getCpf().equals(cpf)) pll = pll_temp;
        
        return pll;
    }
    
    public Palestrante inserir(Palestrante pll) throws PalestranteExistenteException, IllegalArgumentException{
        String cpf = pll.getCpf();
        Palestrante correspondente = buscarCpf(cpf);
        
        if(correspondente == null) 
            if(Verificacao.validarCPF(cpf)) palestrantes.add(pll);
            else throw new IllegalArgumentException();
        else throw new PalestranteExistenteException();
        
        return pll;
    }
    
    public boolean deletar(Palestrante pll){
        boolean deletado = false;
        pll = buscarCpf(pll.getCpf());
        
        if(pll != null){
            palestrantes.remove(pll);
            deletado = true;
        }
        
        return deletado;
    }
}
