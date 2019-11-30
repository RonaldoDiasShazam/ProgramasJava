
package exercicio4lista2;

import java.util.Scanner;

/**
 *
 * @author Thiago Anselmo
 */
public class Exercicio4Lista2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("faça um programa que leia a nota de três alunos e fale se esta aprovado ou reprovado");
         System.out.print("Insira a codigo do aluno: ");
        float cod = teclado.nextFloat();
        System.out.print("Insira a primeira nota: ");
        float a = teclado.nextFloat();
        System.out.print("Insira a segunda nota: ");
        float b = teclado.nextFloat();
        System.out.print("Insira a terceira nota: ");
        float c = teclado.nextFloat();
        
        float d = (a + b + c)/3;
        if (d >= 5)
        {
            System.out.println("o aluno " + cod + " tiro as notas " + a + " " + b +" " + c + " média " + d + " Aprovado");
        }
        else
         {
            System.out.println("o aluno " + cod + " tiro as notas " + a +" "+ b + " " +c + " média " + d + " Reprovado");
        }   
    }
    
}
