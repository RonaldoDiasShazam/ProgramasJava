/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio7lista1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Exercicio7lista1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("************** Exercício 7 - Cofrinho **************");
        System.out.println();
        System.out.println();

        String u2, ci2, v2, d2, s2;
        double cofin;

        ci2 = JOptionPane.showInputDialog("Quantas de Mueda de R$0,05 vc tem? ");
        int cin = Integer.parseInt(ci2);
        d2 = JOptionPane.showInputDialog("Quantas de Mueda de R$0,10 vc tem? ");
        int dez = Integer.parseInt(d2);
        v2 = JOptionPane.showInputDialog("Quantas de Mueda de R$0,25 vc tem? ");
        int vin = Integer.parseInt(v2);
        s2 = JOptionPane.showInputDialog("Quantas de Mueda de R$0,50 vc tem? ");
        int sin = Integer.parseInt(s2);
        u2 = JOptionPane.showInputDialog("Quantas de Mueda de R$1,00 vc tem? ");
        int um = Integer.parseInt(u2);

        cofin = (cin * 0.05) + (um * 1) + (sin * 0.5) + (vin * 0.25) + (dez * 0.10);

        System.out.println("Você tem R$" + cofin);

        // TODO code application logic here
    }

}
