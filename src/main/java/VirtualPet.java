
public class VirtualPet {

// Declaring 4+ attributes
	int hunger;
	int thirst;
	int tiredness;
	int boredom;
	// poop?

// Declaring 3+ methods including tick
	public void tick(int userAction) {
		hunger++;
		thirst++;
		tiredness++;
		boredom++;
		// poop?
	}

// NTS: include detlaTick 'Hunger =- (randomNumber)' Call this its genetics? 
	public void feedPet() {
		hunger--;
		tiredness--;
		boredom++;
	}

	public void waterPet() {
		thirst--;
		boredom++;
	}

	public void sleepPet() {
		tiredness--;
		boredom++;
	}

	public void playPet() {
		hunger++;
		thirst++;
		tiredness++;
		boredom--;
	}

}
