
package exercicio7lista2;

import java.util.Scanner;

/**
 *
 * @author Thiago Anselmo
 */
public class Exercicio7Lista2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("verificar se um funcionario esta qualificado para aposentadoria");
        System.out.print("Imforme o código do funcionario: ");
        int e = teclado.nextInt();
        System.out.print("Imforme a data de nascimento do funcionario: ");
        int a = teclado.nextInt();
        System.out.print("Imforme a data do primeiro registro: ");
        int b = teclado.nextInt();
        int c = 2018 - a;
        int d = 2018 - b;
        if (c >=65)
        {
            System.out.println("O funcionaro com código " + e + " que tem " + c + " anos e possui " + d + " anos de empresa pode requerer aposentadoria");
        }
        else if ( d >= 30)
        {
            System.out.println("O funcionaro com código " + e + " que tem " + c + " anos e possui " + d + " anos de empresa pode requerer aposentadoria");
        }
        else if (c >= 60 && d >= 25)
        {
            System.out.println("O funcionaro com código " + e + " que tem " + c + " anos e possui " + d + " anos de empresa pode requerer aposentadoria");
        }
        else
        {
            System.out.println("O funcionaro com código " + e + " que tem " + c + " anos e possui " + d + " anos de empresa e não pode requerer aposentadoria");
        }
    }
    
}
