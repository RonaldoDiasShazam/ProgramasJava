
package exercicio1lista2;

import java.util.Scanner;

/**
 *
 * @author Thiago Anselmo
 */
public class Exercicio1Lista2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Faça um programa para ler um numero e escrever se é positivo, negativo, zero");
        int a = teclado.nextInt();
        
        if (a == 0)
        {
            System.out.print("o numero e zero");
        }
        
        else if (a > 0)
        {
           System.out.print("o numero e positivo"); 
        }
        else
          {
           System.out.print("o numero e negativo"); 
        }  
    } 
}
