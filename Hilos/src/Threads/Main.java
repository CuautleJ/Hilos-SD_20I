package Threads;

import static java.lang.System.exit;

public class Main {
    
    public static void main(String[] args){
        
        String keyWord = "";
        /*Instancia de Hilos*/
        HiloA h1 = new HiloA();
        HiloB h2 = new HiloB();
        HiloC h3 = new HiloC();
        /*Inicio de hilos*/
        h1.start();
        while(h1.isAlive()){
            keyWord = h1.getPalabra();
        }
        if(!h1.isAlive()){
            h2.setCompara(keyWord);
            h2.start();
        }
        while(h2.isAlive()){
            
        }
        if(!h1.isAlive() && !h2.isAlive()){
            h3.start();
        }
    }
    
}
