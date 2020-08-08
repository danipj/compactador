/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operdoresdebit;

import java.util.Scanner;

/**
 *
 * @author andreia
 */
public class OperdoresDeBit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Digite um numero");
//        int input = scanner.nextInt();
//        mostraBits(input);
//        
//        operacoes();
//
        
       shift();
     
     // Conversão para binário com deslocamento de bit
    }
      
    private static void operacoes(){
        int choice = 0; // armazena o tipo de operação
        int first = 0; // armazena o primeiro inteiro da entrada
        int second = 0; // armazena o segundo inteiro da entrada
        int result = 0; // resultado da operação de armazenamento
        Scanner scanner = new Scanner(System.in); // cria o Scanner

        // continua a execução até o usuário sair
        while (true) {
            // obtém a operação selecionada
            System.out.println("\n\nEscolha a operação a realizar: ");
            System.out.printf("%s%s", "1—AND\n2—inlusivo OR\n",
                    "3—Exclusivo OR\n4—Complemento\n5—Sair\n");
            choice = scanner.nextInt();

            // realiza E sobre bits
            switch (choice) {
                case 1: // E
                    System.out.print("Digite dois inteiros: ");
                    first = scanner.nextInt(); // obtém o primeiro inteiro de entrada
                    mostraBits(first);
                    second = scanner.nextInt(); // obtém o segundo inteiro de entrada
                    mostraBits(second);
                    result = first & second; // realiza E sobre bits
                    System.out.printf("\n\n%d & %d = %d", first, second, result);
                    mostraBits(result);
                    break;
                case 2: // OU inclusivo

                    System.out.print("Digite dois inteiros: :");
                    first = scanner.nextInt(); // obtém o primeiro inteiro de entrada
                    mostraBits(first);
                    second = scanner.nextInt(); // obtém o segundo inteiro de entrada
                    mostraBits(second);
                    result = first | second; // realiza OU inclusivo sobre bits
                    System.out.printf("\n\n%d | %d = %d", first, second, result);
                    mostraBits(result);
                    break;

                case 3: // OU exclusivo
                    System.out.print("Digite dois inteiros: :");
                    first = scanner.nextInt(); // obtém o primeiro inteiro de entrada
                    mostraBits(first);
                    second = scanner.nextInt(); // obtém o segundo inteiro de entrada
                    mostraBits(second);
                    result = first ^ second; // realiza OU exclusivo sobre bits
                    System.out.printf("\n\n%d ^ %d = %d", first, second, result);
                    mostraBits(result);
                    break;
                case 4: // Complemento    
                    System.out.print("Digite um inteiro: :");
                    first = scanner.nextInt(); // obtém o inteiro de entrada
                    mostraBits(first);
                    result = ~first; // realiza o complemento de bits no primeiro
                    System.out.printf("\n\n~%d = %d", first, result);
                    mostraBits(result);
                    break;
                case 5:
                default:
                    return;
            } // fim de switch
        } // fim do while 
    }
    
    
    private static void shift(){
        int choice = 0; // armazena o tipo de operação
        int input = 0; // armazena o inteiro de entrada
        int result = 0; // resultado da operação de armazenamento
        Scanner scanner = new Scanner(System.in); // cria o Scanner

        // continua a execução até o usuário sair
        while (true) {
            // obtém a operação de deslocamento
            System.out.println("\n\nEscolha a operação a ser realizada:");
            System.out.println("1—Left Shift (<<)");
            System.out.println("2—Signed Right Shift (>>)");
            System.out.println("3—Unsigned Right Shift (>>>)");
            System.out.println("4—Exit");
            choice = scanner.nextInt();

            // realiza a operação de deslocamento
            switch (choice) {
                case 1: // <<
                    System.out.print("Digite um inteiro: ");
                    input = scanner.nextInt(); // obtém o inteiro de entrada
                    result = input << 1; // desloca para a esquerda uma posição
                    System.out.printf("\n%d << 1 = %d", input, result);
                    break;
                case 2: // >>
                    System.out.print("Digite um inteiro: ");
                    input = scanner.nextInt(); // obtém o inteiro de entrada
                    result = input >> 1; // desloca para a direita com sinal uma posição
                    System.out.printf("\n%d >> 1 = %d", input, result);
                    break;
                case 3: // >>>
                    System.out.print("Digite um inteiro::");
                    input = scanner.nextInt(); // obtém o inteiro de entrada
                    result = input >>> 1; // desloca para a direita sem sinal uma posição
                    System.out.printf("\n%d >>> 1 = %d", input, result);
                    break;
                case 4:
                default: // a operação padrão é <<
                    return; // exit application
            } // fim de switch

            // exibe o inteiro de entrada e o resultado em bits
            mostraBits(input);
            mostraBits(result);
        } // fim do while
    }
    
    private static void mostraBits(int input){
        // exibe a representação em bits de um inteiro
        System.out.print("\nSeus bits são: ");

        // cria um valor inteiro com 1 no bit mais à esquerda e 0s em outros locais
        int displayMask = 1 << 31;

        // para cada bit exibe 0 ou 1
        for (int bit = 1; bit <= 32; bit++) {
            // utiliza displayMask para isolar o bit
            System.out.print((input & displayMask) == 0 ? "0" : "1");

            input <<= 1; // desloca o valor uma posição para a esquerda

            if (bit % 8 == 0) {
                System.out.print(" ");
            }
       
         }
         System.out.println();
        
    }
}