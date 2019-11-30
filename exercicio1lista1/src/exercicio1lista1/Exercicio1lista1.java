/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1lista1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Exercicio1lista1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("************** Exercicio 1 - Vai ler 2 numeros e imprimir a soma **************");
        System.out.println();
        System.out.println();

        String nu1, nu2;
        double resultado;

        nu1 = JOptionPane.showInputDialog("Digite um numero: ");
        double n1 = Double.parseDouble(nu1);
        System.out.println();
        nu2 = JOptionPane.showInputDialog("Digite outro numero: ");
        double n2 = Double.parseDouble(nu2);
        System.out.println();

        resultado = n1 + n2;

        System.out.println("Você tem R$ " + resultado);
    }

}
