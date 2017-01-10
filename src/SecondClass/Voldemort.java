package SecondClass;



public class Voldemort {

	private boolean cloakOn;
	
	Voldemort() {
		System.out.println("making Bellatrix LeStrange...");
	}

	void castSpell(String spell){
System.out.println("casting spell: " + spell);
	}

	void makeInvisible(boolean invisible) {
		this.cloakOn = invisible;
		
		if (cloakOn)
			System.out.println("Bellatrix kills Harry");
		else
			System.out.println("Bellatrix kills Ron");
	}

	void spyOnSnape() {
		System.out.println("Bellatrix sees Voldemort kill Minerva");
	}
 void takeOverHogwarts(){
	 System.out.println("BELLATRIX HAS TAKEN OVER HOGWARTS AND HAS KILLED EVERYBODY SO THAT THE DEATH EATERS WILL RULE THE WORLD");
 }
	public static void main(String[] args) {
		Voldemort Bellatrix = new Voldemort();
		Bellatrix.makeInvisible(true);
		Bellatrix.spyOnSnape();
		Bellatrix.makeInvisible(false);
		Bellatrix.castSpell("AVADA KEDAVRA!!!!!");
        Bellatrix.takeOverHogwarts();		
		// 1. make harry potter
		// 2. become invisible
		// 3. spy on professor snape
		// 4. become visible again
		// 5. cast a “stupefy” spell
	
	}

}






