//colocando tabelinha
import javax.swing.JFrame;
import javax.swing.JOptionPane; 

	public class Nome{
		public static void main (String args[]){
			//tabelinha
			JFrame janela = new JFrame();
			
			//tamanho, titulo e se a tabelimha é visivel ou não
			//janela.setSize (500,300);
			janela.setTitle ("Dias");
			janela.setVisible (true);
			
			//Variaveis
				String nome = null, nascimento, anoPass, ano; 
				int calculo1, calculo2;
				
				// Requisição do nome, data de nascimento & dias passados
				nome = JOptionPane.showInputDialog("Qual é o seu nome?");
				ano = JOptionPane.showInputDialog("Qual ano vc está?");
				nascimento = JOptionPane.showInputDialog(null,"Qual é seu ano de nascimento? ");
				anoPass = JOptionPane.showInputDialog(null,"Quantos dias já se passaram?");
				
				
				
				//converção das variaveis de stringa para numericos
				int birth = Integer.parseInt(nascimento);
				int pass = Integer.parseInt(anoPass);
				int year = Integer.parseInt(ano);
				
				//calculo do salario
				calculo1 =  year - birth;
				calculo2 = 365 - pass;
				
				JOptionPane.showConfirmDialog(null, nome + "Sua idade é "+ calculo1 );	

				JOptionPane.showConfirmDialog(null, "Falta "+ calculo2 + " dias" );					
				
		 
		


	}
}