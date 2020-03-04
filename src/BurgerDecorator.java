
public abstract class BurgerDecorator implements Burger{

	protected Burger burger;
	
	public BurgerDecorator(Burger b) {
		this.burger=b;
	}
	
	@Override
	public String getName() {
		return burger.getName();
	}

	@Override
	public Integer getToppingsAmount() {
		return burger.getToppingsAmount();
	}

}
