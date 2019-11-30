
package exercicio3lista2;

import java.util.Scanner;

/**
 *
 * @author Thiago Anselmo
 */
public class Exercicio3Lista2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ler dois valores e verificar se são iguais ou qual e maior");
        System.out.print("Insira o primeiro valor: ");
        int a = teclado.nextInt();
         System.out.print("Insira o segundo valor: ");
        int b = teclado.nextInt();
        if(a==b)
        {
          System.out.print("Os valores são iguais");   
        }
        else if(a>b)
        {
          System.out.print("O numero " + a + " e o maior");
        }    
        else
         System.out.print("O numero " + b + " e o maior");   
    }
    
}
