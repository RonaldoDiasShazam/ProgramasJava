/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5lista1;
import javax.swing.JFrame;
import javax.swing.JOptionPane; 
/**
 *
 * @author Aluno
 */
public class Exercicio5lista1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("************** Execício 5 - Ler o Comprimento, Largura, Altura e mostrar o VOLUME **************");
                    System.out.println();
                    System.out.println();

                    String c1, l1, a1;
                    double v;

                    a1 = JOptionPane.showInputDialog("Informe a ALTURA da caixa: ");
                    double a = Double.parseDouble(a1);
                    l1 = JOptionPane.showInputDialog("Informe a LARGURA da caixa: ");
                    double l = Double.parseDouble(l1);
					c1 = JOptionPane.showInputDialog("Informe o COMPRIMENTO: ");
                    double c = Double.parseDouble(c1);

                    v = c * l * a;

                    System.out.println("O volume da caixa é "+ v);

        // TODO code application logic here
    }
    
}
