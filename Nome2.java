public class Nome2 {
	public static void main (String args []){
		String nome = "William Ferrari";
		int anoDeNascimento = 1998;
		int anoAtual = 2018;
		int idade;
		
		idade = anoAtual - anoDeNascimento;
		
		int diasDeVidaAteDezembro = 365;
		int diasQuePassaram = 256;
		int diaFinal;
		
		diaFinal = diasQuePassaram - diasDeVidaAteDezembro;
		
		
		System.out.println ("sua idade é" + idade);
		System.out.println ("Faltam" + diaFinal + "dias");
		
		
	}//fecha main 
} //final