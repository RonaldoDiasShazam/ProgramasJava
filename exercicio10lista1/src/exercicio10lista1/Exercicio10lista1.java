/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio10lista1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Exercicio10lista1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("************** Exercício 10 - Fahrenheit para Celsius **************");
        System.out.println();
        System.out.println();

        String fah2;
        double gCel;

        fah2 = JOptionPane.showInputDialog("Quantos graus Fahrenheit está fazendo: ");
        double fah = Double.parseDouble(fah2);

        gCel = ((fah - 32) / 9) * 5;

        System.out.println("Está fazendo " + gCel + "C°");
        // TODO code application logic here
    }

}
