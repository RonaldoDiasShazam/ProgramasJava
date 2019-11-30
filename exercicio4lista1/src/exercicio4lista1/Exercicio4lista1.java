/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4lista1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Exercicio4lista1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("************** Exercicio 4 - Le 1 valores e mostra o seu antecessor **************");
        System.out.println();
        System.out.println();

        String a1;
        double b;

        a1 = JOptionPane.showInputDialog("Me fale um valor qualquer meu consagrado? ");
        double a = Double.parseDouble(a1);
        System.out.println();

        b = a - 1;

        System.out.println(" O antecessor de " + a + " é " + b);
        // TODO code application logic here
    }

}
