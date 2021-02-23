package teste1;

public class Pteste {

	public static void main(String[] args) {
		int dia=31;
		int mes=01;
		int ano=16;
	
		
			
	
			
				if (dia>31 || dia<1) {
					System.out.println("dia invalido");
				}
				
				else if (mes>=13 || mes<=0) {
					System.out.println("mes invalido");
				}
				
				else if (ano<0) {
					System.out.println("ano invalido");
				}
				else {
					System.out.println("correto");
				}
			
			

}
}
