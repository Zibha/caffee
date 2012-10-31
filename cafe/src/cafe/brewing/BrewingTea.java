package cafe.brewing;

public class BrewingTea extends BrewingDrinks {

	@Override
	protected void addDregs() {
		System.out.println("Wsypano herbate");
		
	}
    
	@Override
	protected void pourACup(){
		System.out.println("Wlano do szklanki");
	}
	
	@Override
	protected void end() {
		System.out.println("Podano herbate");
		
	}

}
