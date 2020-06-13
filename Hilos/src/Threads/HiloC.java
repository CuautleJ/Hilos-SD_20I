package Threads;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HiloC extends Thread{
    
    public void run(){
        int contador = 0;
        try{
            BufferedReader br = new BufferedReader(new FileReader("words.txt"));
            while(br.readLine() != null){
                contador+=1;
            }
            System.out.println("Total de palabras: "+contador);
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
    
}
