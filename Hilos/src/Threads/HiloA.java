package Threads;

import java.util.Scanner;

public class HiloA extends Thread{
    
    private String palabra = "";
    
    public void run(){
        palabra = askWord();
    }
    
    public String askWord(){
        String word = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingresa una palabra: ");
        word = scan.nextLine();
        
        return word;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    
}
