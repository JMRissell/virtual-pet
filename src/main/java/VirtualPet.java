import java.util.Random;

public class VirtualPet {

	// Declaring 4+ attributes
	public Random random = new Random();

	// Declaring pet attributes
	int randomGenes = random.nextInt(5) + 1;
	int hunger;
	int thirst;
	int tiredness;
	int boredom;
	boolean poop;

	// Declaring variables for time to use in tick method
	int hours;
	int days;
	int weeks;
	int months;
	int years;


	// Declaring 3+ methods including tick
	public void tick(int userAction) {
		// Time tracking
		hours += 6;
		if (hours == 24) {
			days++;
			hours = 0;
		}
		if (days == 7) {
			weeks++;
			days = 0;
		}
		if (weeks == 4) {
			months++;
			weeks = 0;
		}
		if (months == 12) {
			years++;
			months = 0;
		}
		// Increment levels
		hunger += randomGenes;
		thirst += randomGenes;
		tiredness += randomGenes;
		boredom += randomGenes;
	}

	public void feedPet() {
		hunger -= randomGenes;
		tiredness -= randomGenes;
		boredom += randomGenes;
	}

	public void waterPet() {
		thirst -= randomGenes;
		boredom += randomGenes;
	}

	public void sleepPet() {
		tiredness -= randomGenes;
		boredom += randomGenes;
	}

	public void playPet() {
		hunger += randomGenes;
		thirst += randomGenes;
		tiredness += randomGenes;
		boredom -= randomGenes;
	}

}
