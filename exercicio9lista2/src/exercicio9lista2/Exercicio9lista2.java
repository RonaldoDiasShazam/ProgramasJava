
package exercicio9lista2;

import java.util.Scanner;

/**
 *
 * @author Thiago Anselmo
 */
public class Exercicio9Lista2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       System.out.println("Faça um programa para verificar o peso ideal de uma pessoa com base na altura e sexo");
       System.out.print("Insira o sexo da pessoa 1 - para homem e 2 para mulher: ");
       int a = teclado.nextInt();
       System.out.print("Insira a altura: ");
       float h = teclado.nextFloat();
       if (a == 1)
       {
           double b = (72.7 * h)-58;
           System.out.println(" O peso ideal é :" + b );
        }
       else
       {
           double b = (62.1*h)-44.7;
           System.out.println(" O peso ideal é :" + b );
       }
    }
    
}
