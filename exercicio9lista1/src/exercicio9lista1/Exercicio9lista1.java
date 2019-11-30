/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio9lista1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Exercicio9lista1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("************** Exercício 9 - Quantos dias de vida **************");
        System.out.println();
        System.out.println();

        String an2, di2, me2;
        int total;

        an2 = JOptionPane.showInputDialog("Quantos anos vc tem: ");
        int ano = Integer.parseInt(an2);
        me2 = JOptionPane.showInputDialog("Mes de nascimento: ");
        int mes = Integer.parseInt(me2);
        di2 = JOptionPane.showInputDialog("Quantidades de dias apos o seu aniversário: ");
        int dia = Integer.parseInt(di2);

        total = ((ano * 365) + (mes * 30) + dia);

        System.out.println("Vc tem" + total + " dias de vida");
        // TODO code application logic here
    }

}
