import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		Livro livro = new Livro();
		CD cd = new CD();
		
		System.out.println("Dados do Livro");		
		System.out.print("Nome: ");
		livro.setNome(entrada.nextLine());
		System.out.print("Preço: ");
		livro.setPreco(entrada.nextDouble());
		entrada.nextLine();
		System.out.print("Autor: ");
		livro.setAutor(entrada.nextLine());
		
		System.out.println("Dados do CD");		
		System.out.print("Nome: ");
		cd.setNome(entrada.nextLine());
		System.out.print("Preço: ");
		cd.setPreco(entrada.nextDouble());
		entrada.nextLine();
		System.out.print("Número de faixas: ");
		cd.setNumFaixas(entrada.nextInt());
					
		System.out.println("Informações do CD");
		cd.exibeInformacoes();
		
		entrada.close();

	}

}
