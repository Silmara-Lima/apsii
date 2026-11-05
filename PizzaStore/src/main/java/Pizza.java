
public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Veegies veegies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clam clam;
	
	abstract void prepare();
	
	void bake() {
		System.out.println("Assar por 25 minutos a 350°");
	}
	
	void cut() {
		System.out.println("Cortar a pizza na caixa oficial da pizzaria");
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	public String toString() {
		return name;
		
	}

}
