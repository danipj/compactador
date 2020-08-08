//Daniela Palumbo 11161
import java.io.IOException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author u11161
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        manipulaArq arq = new manipulaArq();
        arq.organizaVetor(arq.contarLetras("C:\\Temp\\TESTE.txt"));
    }
}
