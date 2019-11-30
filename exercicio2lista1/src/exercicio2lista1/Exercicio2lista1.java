/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2lista1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Exercicio2lista1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("************** Exercício 2 - Media de 3 Notas **************");
        System.out.println();
        System.out.println();

        String nu1, nu2, nu3;
        double rst;

        nu1 = JOptionPane.showInputDialog("1° NOTA: ");
        double n1 = Double.parseDouble(nu1);
        System.out.println();
        nu2 = JOptionPane.showInputDialog("2° NOTA: ");
        double n2 = Double.parseDouble(nu2);
        System.out.println();
        nu3 = JOptionPane.showInputDialog("3° NOTA: ");
        double n3 = Double.parseDouble(nu3);
        System.out.println();

        rst = ((n1 + n2 + n3) / 3);

        System.out.println("Suma MEDIA é " + rst);
        // TODO code application logic here
    }

}
