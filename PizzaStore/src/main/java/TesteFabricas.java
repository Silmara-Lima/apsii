public class TesteFabricas {

    public static void main(String[] args) {
        mostrar("Nova York", new NYPizzaIngredientFactory());
        mostrar("Chicago", new ILPizzaIngredientFactory());
    }

    static void mostrar(String regiao, PizzaIngredientFactory fabrica) {
        System.out.println("=== " + regiao + " ===");
        System.out.println("Massa: " + fabrica.createDough());
        System.out.println("Molho: " + fabrica.createSauce());
        System.out.println("Queijo: " + fabrica.createCheese());
        System.out.println("Pepperoni: " + fabrica.createPepperoni());
        System.out.println("Mariscos: " + fabrica.createClam());

        System.out.print("Vegetais: ");
        for (Veegies v : fabrica.createVeegies()) {
            System.out.print(v + "; ");
        }
        System.out.println("\n");
    }
}
