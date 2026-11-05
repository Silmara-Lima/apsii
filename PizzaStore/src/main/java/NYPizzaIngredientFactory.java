public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veegies[] createVeegies() {
        Veegies veegies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veegies;
    }

    public Pepperoni createPepperoni() {
        return new SlicePepperoni();
    }

    public Clam createClam() {
        return new FreshClam();
    }

}
