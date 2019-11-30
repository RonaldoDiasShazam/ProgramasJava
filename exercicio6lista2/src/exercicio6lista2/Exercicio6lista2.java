
package exercicio6lista2;

import java.util.Scanner;

/**
 *
 * @author Thiago Anselmo
 */
public class Exercicio6Lista2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("faça um programa para ler se o aluto esta, insuficiente, regular, bom e ótimo");
        System.out.print("Insira a nota do aluno entre 0 e 100: ");
        int a = teclado.nextInt();
        if (a <= 49)
        {
            System.out.println(" O aluno tirou a nota " + a + " e está em estado insuficiente");
        }
        else if (a <= 64)
        {
             System.out.println(" O aluno tirou a nota " + a + " e está em estado regular");
        }
        else if (a <= 84)
        {
             System.out.println(" O aluno tirou a nota " + a + " e está em estado Bom");
        }
        else
        {
             System.out.println(" O aluno tirou a nota " + a + " e está em estado ótimo");
        }
        
    }
    
}
