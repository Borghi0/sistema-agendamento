// src/main/java/visao/Leitura.java
package main.java.visao;
        
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Leitura{

    private static Leitura leiUnic;

    private Leitura(){}

    public static Leitura geraLeitura(){
        if(leiUnic == null){
            leiUnic = new Leitura();
        }
        return leiUnic;
    }


    public String entDados(String rotulo){

        System.out.print(rotulo);

        InputStreamReader tec = new InputStreamReader(System.in);
        BufferedReader bufTec = new BufferedReader(tec);

        String ret = "";

        try{
            ret = bufTec.readLine();
        }
        catch(IOException ioe){
            System.out.println("ERRO JVM ou de RAM");
        }
        return ret;
    }
}