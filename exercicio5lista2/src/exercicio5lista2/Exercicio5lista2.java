
package exercicio5lista2;

import java.util.Scanner;

/**
 *
 * @author Thiago Anselmo
 */
public class Exercicio5Lista2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("faça um programa para classicar um nadador conforme sua idade");
        System.out.print("Informe a idade do nadador: ");
        int a = teclado.nextInt();
        if (a <= 4)
        {
            System.out.println("Não possui idade minima para competir ");
        }
        else if (a <=7)
        {
            System.out.println("O nadador pertence a categoria infantil A ");
        }
        else if (a <= 10)
        {
           System.out.println("O nadador pertence a categoria infantil B "); 
        }
        else if (a <= 13)
        {
            System.out.println("O nadador pertence a categoria juvenil A ");
        }
        else if (a <= 17)
        {
            System.out.println("O nadador pertence a categoria Juvenil B ");
        }
        else
        {
            System.out.println("O nadador pertence a adulto ");
        }
                
    }
    
}
