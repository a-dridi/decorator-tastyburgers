
public class Vegetables extends BurgerDecorator {

	public Vegetables(Burger b) {
		super(b);
	}

	@Override
	public String getName() {
		return "Healthy Vegetables Edition";
	}

	@Override
	public Integer getToppingsAmount() {
		return 4;
	}
}
