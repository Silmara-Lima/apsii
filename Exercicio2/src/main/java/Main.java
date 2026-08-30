
public class Main {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario("Ana Costa", "F001", 2500, "01/03/2020");
		FuncionarioCLT clt1 = new FuncionarioCLT("Bruno Reis", "C001", 3000, 
				"10/06/2021", 220, 400);
		Gerente ger1 = new Gerente("Carla Mendes", "G001", 8000, "15/01/2018", 300, 500, 12, 0.20);
		Estagiario est1 = new Estagiario("Diego Alves", "E001", 0, "05/08/2024", 1500, 20);
		Diretor dir1 = new Diretor("José Santos", "D001", 11000, "21/03/2021", 1000, 0, 40, 0.20, 1500.0);
		
		System.out.println(func1);
		System.out.println(clt1);
		System.out.println(ger1);
		System.out.println(est1);
		System.out.println(dir1);
	}

}
