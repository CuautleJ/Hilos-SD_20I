package Threads;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HiloB extends Thread{
    
    private String compara = "";
    private boolean cond;
    
    public void run(){
        rwFile();
    }
    
    public void rwFile(){
        
        FileWriter FW;
        BufferedReader br;
        String aux;
        try{
            br = new BufferedReader(new FileReader("words.txt"));
            while((aux = br.readLine()) != null){
                if(compara.equals(aux)){
                    cond = true;
                    break;
                }
            }
            br.close();
            if(cond){
                System.out.println("La palabra \""+compara+"\" ya existe.");
            }else{
                FW = new FileWriter("words.txt", true);
                BufferedWriter bw = new BufferedWriter(FW);
                PrintWriter pw = new PrintWriter(bw);
                pw.append(compara+"\n");
                pw.close();
                bw.close();
                FW.close();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public String getCompara() {
        return compara;
    }

    public void setCompara(String compara) {
        this.compara = compara;
    }
}
