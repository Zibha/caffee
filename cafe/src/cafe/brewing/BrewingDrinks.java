package cafe.brewing;

public abstract class BrewingDrinks {

	public void prepare (){
		boilWater();
		addDregs();
		pourACup();
		addSugar();
		end();
	}
	
	protected void boilWater() {
		System.out.println("Woda zagotowana");
	}
	
	protected abstract void addDregs();
	
	protected void pourACup() {
		System.out.println("Wlano do fili¿anki");
	}
	
	
	protected void addSugar() {
		System.out.println("Dodano" + getSugarAmount()+ "³y¿eczkê cukru");
	}
	
	protected String getSugarAmount(){
		return "1";
		
	}
	protected abstract void end();
}
