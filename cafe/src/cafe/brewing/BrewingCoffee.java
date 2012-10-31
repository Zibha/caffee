package cafe.brewing;

public class BrewingCoffee extends BrewingDrinks {

	@Override
	protected void addDregs() {
		System.out.println("Wsypano kawe");
		
	}

	@Override
	protected void end() {
		System.out.println("Podano kawe");
		
	}

}
