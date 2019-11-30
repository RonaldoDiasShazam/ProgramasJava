/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3lista1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Exercicio3lista1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("************** Exercícios 3 - A = 10 e B = 20, em seguida troca esse valores de variavel **************");
        System.out.println();
        System.out.println();

        double a = 10, b = 20, c = 0;

        System.out.println("A = 10 ");
        System.out.println();
        System.out.println("B = 20 ");
        System.out.println();
        System.out.println();

        c = a;
        b = a;
        a = b;
        System.out.println("B = " + b + "      A = " + a);

        // TODO code application logic here
    }

}
