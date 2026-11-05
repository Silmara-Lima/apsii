public class ILPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new MassaGrossa();
    }

    public Sauce createSauce() {
        return new MolhoDeTomate();
    }

    public Cheese createCheese() {
        return new Mussarela();
    }

    public Veegies[] createVeegies() {
        Veegies veegies[] = { new AzeitonasPretas(), new Espinafre(), new Berinjela() };
        return veegies;
    }

    public Pepperoni createPepperoni() {
        return new CalabresaFatiada();
    }

    public Clam createClam() {
        return new MariscosCongelados();
    }

}