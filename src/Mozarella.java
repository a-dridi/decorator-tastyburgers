
public class Mozarella extends BurgerDecorator{
	
	public Mozarella(Burger b) {
		super(b);
	}
	
	@Override
	public String getName() {
		return "Mozarella Cheese";
	}

	@Override
	public Integer getToppingsAmount() {
		return 2;
	}

}
