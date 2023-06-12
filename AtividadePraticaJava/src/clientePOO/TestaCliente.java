package clientePOO;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente Cliente1 = new Cliente ("Amanda", "amandaferreira@gmail.com", 21, "400.028.922-53", "(11)95349-5845");
		Cliente Cliente2 = new Cliente ("Morgana", "morgana8122@gmail.com", 43, "590.867.583-32", "(22)94563-4422");
	
	
		Cliente1.visualizar();
		Cliente2.visualizar();

		
	}
	

}