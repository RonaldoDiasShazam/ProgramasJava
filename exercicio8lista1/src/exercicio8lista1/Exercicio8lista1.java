/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio8lista1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Exercicio8lista1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("************** Exercício 8 - Combutivel **************");
        System.out.println();
        System.out.println();

        String t2, p2;
        double quantidadeTotal;

        t2 = JOptionPane.showInputDialog("Quanto ta a gasosa? ");
        double tanqueX = Double.parseDouble(t2);
        p2 = JOptionPane.showInputDialog("Quanto tu pagou? ");
        double precoLitro = Double.parseDouble(p2);

        quantidadeTotal = (tanqueX / precoLitro);

        System.out.println("Você colocou " + quantidadeTotal + " L");
        // TODO code application logic here
    }

}
