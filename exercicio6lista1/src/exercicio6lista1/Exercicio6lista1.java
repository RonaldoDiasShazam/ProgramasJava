/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6lista1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Exercicio6lista1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("************** Exercício 4 - Ler 2 numeros que representa uma base e um expoente de uma potêcia **************");
        System.out.println();
        System.out.println();

        String bas2, exp2;
        double resultado;

        bas2 = JOptionPane.showInputDialog("Informe a BASE da Potência: ");
        double bas = Double.parseDouble(bas2);
        exp2 = JOptionPane.showInputDialog("Informe o EXPOÊNTE da Potência: ");
        int expoent = Integer.parseInt(exp2);

        resultado = (bas * expoent);

        System.out.println(bas + " elevado à " + expoent + " = " + resultado);
        // TODO code application logic here
    }

}
