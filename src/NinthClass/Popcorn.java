package NinthClass;
/* Your mission and you have to accept it:
 *         Add a main method to the Popcorn class to cook a bag of Popcorn. Don't change the existing methods.
 */

class Microwave {
	
	
	private Popcorn thingtobeCooked;
public static void main(String[] args) {

	Microwave macro = new Microwave();
macro.putInMicrowave(macro.thingtoBeCooked);
	int cookTimeInMinutes = 2;
macro.setTime(2);
macro.startMicrowave();
}

private int cookTime;
Popcorn thingtoBeCooked = new Popcorn("normal");
Microwave() {
		System.out.println("Microwave says: a Macrowave has been made.");
	}
void putInMicrowave(Popcorn thingToBeCooked) {
		System.out.println("Microwave says: popcorn put in microwave.");
		this.thingtobeCooked = thingToBeCooked;
	}

	void setTime(int cookTimeInMinutes) {
		this.cookTime = cookTimeInMinutes;
		System.out.println("Microwave says: cook time is set to " + cookTime + " minutes.");
		
	}

	void startMicrowave() {
		if (thingtobeCooked == null)
			System.out.println("Microwave says: there's nothing in the microwave!");
		for (int i = 0; i < cookTime*10 + 1; i++) {
			thingtobeCooked.applyHeat();
		}
	}
}

public class Popcorn {

	private int kernels = 20;
	private String flavor;

	Popcorn(String flavor) {
		this.flavor = flavor;
		System.out.println("Popcorn says: making package of " + this.flavor + " popcorn.");
	}


	public void applyHeat() {
		pause();

		if (kernels == 0) {
			System.out.println("Popcorn says: Time to eat popcorn!");
		} else {
			System.out.println("POP!" + kernels);
			kernels--;
		}
	}

	private void pause() {
		try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}




