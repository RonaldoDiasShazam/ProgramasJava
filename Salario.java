//colocando tabelinha
import javax.swing.JFrame;
import javax.swing.JOptionPane; 

	public class Salario{
		public static void main (String args[]){
			//tabelinha
			JFrame janela = new JFrame();
			
			//tamanho, titulo e se a tabelimha � visivel ou n�o
			//janela.setSize (500,300);
			janela.setTitle ("Salario");
			janela.setVisible (true);
			
			//Variaveis
				String nome = null, vHora, dTrabalho; 
				double salario;
				
				// Requisi��o do nome, horas trabalhadas e dias
				nome = JOptionPane.showInputDialog("Qual � o seu nome?");
				vHora = JOptionPane.showInputDialog(null,"Digite quanto voc� ganha por hora: ");
				dTrabalho = JOptionPane.showInputDialog(null,"Digite quantos dias voc�  TRABALHOU: ");
				
				
				
				//conver��o das variaveis de stringa para numericos
				int dTrabalhoD = Integer.parseInt(dTrabalho);
				double vHoraD = Double.parseDouble(vHora);
				
				
				//calculo do salario
				salario = (vHoraD * 8 * dTrabalhoD);
				
				JOptionPane.showConfirmDialog(null, nome + " Seu SAL�RIO mensal � de R$"+ salario );	

				JOptionPane.showConfirmDialog(null, "Feito por RONALDO FEIO, VINICIUS DEPRESSIVO & RAFAEL ESTRANHO" );					
				
		 
		


	}
}