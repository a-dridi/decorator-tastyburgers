
public class Exotic extends BurgerDecorator{

	public Exotic(Burger b) {
		super(b);
	}
	
	@Override
	public String getName() {
		return "Exotic Flavour Edition";
	}

	@Override
	public Integer getToppingsAmount() {
		return 5;
	}
	
	//Extended functionality - Only available in an Exotic Burger
	public Integer getSpicinessLevel() {
		return 10;
	}
	
}
