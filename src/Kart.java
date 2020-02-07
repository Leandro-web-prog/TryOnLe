
public class Kart {
	
		public static void main(String[]args){
			
		int RotacaoPorMinuto = 30;
		
		if(RotacaoPorMinuto>48){
			System.out.println( "Novo record mundial");
		}
		else if(RotacaoPorMinuto>30 && RotacaoPorMinuto>=48){
			System.out.println("Excelente trabalho");
		}
		else if(RotacaoPorMinuto>0 && RotacaoPorMinuto>=30){
			System.out.println("Ainda Impressionante");
		}
		else{
			System.out.println("Continue tentando");
		}
		}

}
