
public class Principal {

	public static void main(String[] args) {
		
		Banco b1= new Banco("Silmara", "000", 30); //criar
		Banco b2= new Banco();
		
		System.out.println(b1.getNome()); // imprimir nome
		
		b1.setNome("Lima"); //atualizar nome
				
		System.out.println(b1.getNome()); // imprimir nome atualizado
		

	}

}

// no terminal clicar na tv azul do terminal, clicar em git bash
