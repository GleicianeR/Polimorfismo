

public class Principal {

	public static void main(String[] args) {
		
		//
		Mouse c1 = new Mouse ("Magazine", 70.00, "Mouse Preto, usb 2.0" , "Óptico");
		Mouse c2 = new Mouse ("Kabum", 40.00, "Mouse Azul, usb 3.0" , "Óptico");
		Livro c3 = new Livro ("Saraiva", 25.00, " Livro Querido John, Romance", "Nicholas Sparks");
		Livro c4 = new Livro ("SM", 32.00, "Livro Harry Potter, Ficção", "J.K");
		
		//Listando os arrays
		Produto[] arrayPs = new Produto[4];
		arrayPs[0] = c1;
		arrayPs[1] = c2;
		arrayPs[2] = c3;
		arrayPs[3] = c4;
		

		
		System.out.println("Carrinho");
		System.out.println("-----------------------");
		
		for (int i = 0; i < arrayPs.length; i++) {

			System.out.println("Descrição: " + arrayPs[i].descricao);
			System.out.println("-----------------------------------");
			
			
		}	

	}

}
