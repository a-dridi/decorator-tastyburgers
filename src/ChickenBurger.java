
public class ChickenBurger implements Burger {	
	
	public ChickenBurger() {
	}
	
	@Override
	public String getName() {
		return "Standard Chicken Burger";
	}

	@Override
	public Integer getToppingsAmount() {
		return 0;
	}

}
