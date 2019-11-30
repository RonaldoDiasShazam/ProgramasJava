
package exercicio2lista2;

import java.util.Scanner;

/**
 *
 * @author Thiago Anselmo
 */
public class Exercicio2Lista2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Faça um algoritimo para ler dois times de futebol e e o numero de gols, e dizer qual o vencedor ou se teve empate");
        System.out.print("Insira o nome do time a: ");
        String time1 = teclado.nextLine();              
        System.out.print("Insira o nome do time b: ");
        String time2 = teclado.nextLine();
        
        System.out.print("Insira a quantidade de gols do time " + time1 + ": ");
        int a = teclado.nextInt();
        System.out.print("Insira a quantidade de gols do time " + time2 + ": ");
        int b = teclado.nextInt();
        
        if(a == b)
         System.out.println("O jogo acabou empatado ");  
        else 
            if (a > b)
                System.out.println("O time " + time1 + " foi o vencedor");
            else  
                System.out.println("O time " + time2 + " foi o vencedor");
        
    }
    
}
