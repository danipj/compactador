//Daniela Palumbo 11161
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author u11161
 */
public class manipulaArq {
      
    public ArrayList lerArq(String x) throws IOException{
        FileInputStream arquivoFisico = new FileInputStream(x);
        BufferedInputStream buffReader = new BufferedInputStream(arquivoFisico);
        DataInputStream   data = new DataInputStream(buffReader);
         byte vetByte[];
         vetByte = new byte[arquivoFisico.available()];
         data.read(vetByte);   
         ArrayList vetLido = new ArrayList(); 
         for (char c : new String(vetByte).toCharArray())
        {
            vetLido.add(c);
        }
            return vetLido;
    }

    public int[] contarLetras(String s) throws IOException{
       ArrayList vet = lerArq(s);
       int[] contador = new int[999999];
       for (int i=0;i<vet.size();i++){
           char v = (char)vet.get(i);
           contador[v]++;}
       return contador;
       /*for (int i =32; i<258; i++)
           System.out.println((char)i+" "+contador[i]);*/
    }
    
    public void organizaVetor(int[] v){
       Arrays.sort(v,0,v.length);
    }
}
