//colocando tabelinha
import javax.swing.JFrame;
import javax.swing.JOptionPane; 

	public class Salario{
		public static void main (String args[]){
			//tabelinha
			JFrame janela = new JFrame();
			
			//tamanho, titulo e se a tabelimha é visivel ou não
			//janela.setSize (500,300);
			janela.setTitle ("Salario");
			janela.setVisible (true);
			
			//Variaveis
				String nome = null, vHora, dTrabalho; 
				double salario;
				
				// Requisição do nome, horas trabalhadas e dias
				nome = JOptionPane.showInputDialog("Qual é o seu nome?");
				vHora = JOptionPane.showInputDialog(null,"Digite quanto você ganha por hora: ");
				dTrabalho = JOptionPane.showInputDialog(null,"Digite quantos dias você  TRABALHOU: ");
				
				
				
				//converção das variaveis de stringa para numericos
				int dTrabalhoD = Integer.parseInt(dTrabalho);
				double vHoraD = Double.parseDouble(vHora);
				
				
				//calculo do salario
				salario = (vHoraD * 8 * dTrabalhoD);
				
				JOptionPane.showConfirmDialog(null, nome + " Seu SALÁRIO mensal é de R$"+ salario );	

				JOptionPane.showConfirmDialog(null, "Feito por RONALDO FEIO, VINICIUS DEPRESSIVO & RAFAEL ESTRANHO" );					
				
		 
		


	}
}