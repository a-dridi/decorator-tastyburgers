
public class TastyBurgers {

	public static void main(String[] args) {
		Burger burgerA = new Mozarella(new ChickenBurger());
		Burger burgerB = new Exotic(new ChickenBurger());
		Burger burgerC = new Vegetables(new ChickenBurger());
		System.out.println("Burger A Name: " + burgerA.getName() + " - Toppings No.: " + burgerA.getToppingsAmount());
		System.out.println("Burger B Name: " + burgerB.getName() + " - Toppings No.: " + burgerB.getToppingsAmount());
		System.out.println("Burger C Name: " + burgerC.getName() + " - Toppings No.: " + burgerC.getToppingsAmount());
		//The function which was extended (class: Exotic) can be accessed only if you define an object directly with the class name "Exotic":
		Exotic burgerBExtended = new Exotic(new ChickenBurger());
		System.out.println("Burger B Extended - Name: " + burgerBExtended.getName() + " - Toppings No.: " + burgerBExtended.getToppingsAmount() + " - Spiciness Level: " + burgerBExtended.getSpicinessLevel());

	}
}
