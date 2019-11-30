
package exercicio8lista2;

import java.util.Scanner;

/**
 *
 * @author Thiago Anselmo
 */
public class Exercicio8Lista2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       System.out.println("faça um programa para calcular o valor gasto com maças e morangos");
       System.out.print("Insira a quantidade Kg de Morango comprado: ");
       float a = teclado.nextFloat();
       System.out.print("Insira a quantidade de Kg de Maça Comprada: ");
       float b = teclado.nextFloat();
        if (a > 5 && b > 5)
        {
        double c = ( a * 2.20) + ( b * 1.50 );
        double e = (c - 5);
                System.out.println("O Valor total gasto com frutas foi: " + e);
        }
        else if (a > 5 && b <= 5)
        {
        double c  = (a * 2.20) + (b * 1.80);
        double d = a + b;
                if (c > 25 || d > 8)
                {
                 double   e = (c - 5);
                   System.out.println("O Valor total gasto com frutas foi: " + e);
                }
                else
                    System.out.println("O Valor total gasto com frutas foi: " + c);
        }
        else if (a <= 5 && b > 5)
        {
        double c = (a * 2.50) + (b * 1.50);
        double d = a + b;
                if (c > 25 || d > 8)
                {
                 double e = (c - 5);
                    System.out.println("O Valor total gasto com frutas foi: " + e);
                }
                else
                    System.out.println("O Valor total gasto com frutas foi: " + c);

        }
        else if (a <= 5 && b <= 5)
        {
        double c = (a * 2.50) + (b * 1.80);
        double d = a + b;
                if (c > 25 || d > 8)
                {
                double e = (c - 5);
                    System.out.println("O Valor total gasto com frutas foi: " + e);
                }

                else
                    System.out.println("O Valor total gasto com frutas foi: " + c);
        }
    }
}