/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operdoresdebit;

import java.util.BitSet;
import java.util.Scanner;

/**
 *
 * @author andreia
 */
public class ComBitSet {

    public static void main(String args[]) {
        ///peneira();
        
        BitSet bs = new BitSet();
        System.out.println("Tamanho " + bs.size());
        bs.set(0);
        bs.set(70);
        System.out.println("Tamanho " + bs.size());
        System.out.println("bs: " + bs);
              
    }
    
    public static void peneira(){
        // obtém o inteiro de entrada
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um inteiro de  2 a 1023: ");
        int input = scanner.nextInt();

        // realiza a Peneira de Eratóstenes
        BitSet sieve = new BitSet(1024);
        int size = sieve.size();

        // configura todos os bits de 2 a 1023
        for (int i = 2; i < size; i++) {
            sieve.set(i);
        }

        // realiza a Peneira de Eratóstenes
        int finalBit = (int) Math.sqrt(size);
        
        for (int i = 2; i < finalBit; i++) {
            if (sieve.get(i)) {
                for (int j = 2 * i; j < size; j += i) {
                    sieve.clear(j);
                }
            } // fim do if
        } // fim do for

        int counter = 0;

        // exibe os números primos entre 2 e 1023
        for (int i = 2; i < size; i++) {
            if (sieve.get(i)) {
                System.out.print(String.valueOf(i));
                System.out.print(++counter % 7 == 0 ? "\n" : "\t");
            } // fim do if
        } // fim do for

        
        // exibe o resultado
        if (sieve.get(input)) {
            System.out.printf("\n%d é um número primo\n", input);
        } else {
            System.out.printf("\n%d NÃO é um número primo\n", input);
        }

    }
}
