import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		String newLine = System.getProperty("line.separator");
		Scanner scanner = new Scanner(System.in);
		String petName;
		int userAction;

		// User Instructions
		VirtualPet virtualPet1 = new VirtualPet();
		System.out.println("Please name your pet:");
		petName = scanner.next();

		System.out.println("You need to keep " + petName + " "
				+ "alive by keeping its hunger, thirst, tiredness and boredom levels below 100." + newLine
				+ "Use the following commands to decrease " + petName + "'s levels:" + "" + newLine + newLine + "Feed "
				+ petName + " = 1" + newLine + "Give " + petName + "water = 2" + newLine + "Put " + petName
				+ " to sleep = 3" + newLine + "Play with " + petName + "= 4" + newLine + "Pet Status = 9" + newLine
				+ newLine + "What would you like your first action with " + petName + "to be ?");

		// Begin Game
		do {
			userAction = scanner.nextInt();

			// show pet age
			System.out.print(petName + " is now ");
			if (virtualPet1.years != 0) {
				System.out.println(virtualPet1.years + "years ");
			}
			if (virtualPet1.months != 0) {
				System.out.print(virtualPet1.months + "months ");
			}
			if (virtualPet1.weeks != 0) {
				System.out.print(virtualPet1.weeks + "weeks ");
			}
			if (virtualPet1.days != 0)
				System.out.print(virtualPet1.days + "days and ");
			System.out.println(virtualPet1.hours + "hours old.");

			System.out.println("What would you like to do next?" + newLine + "Feed " + petName + " = 1" + newLine
					+ "Give " + petName + "water = 2" + newLine + "Put " + petName + " to sleep = 3" + newLine
					+ "Play with " + petName + "= 4" + newLine + "Pet Status = 9" + newLine);
			// start tick
			virtualPet1.tick(userAction);
			if (userAction == 1) {
				virtualPet1.feedPet();
			} else if (userAction == 2) {
				virtualPet1.waterPet();
			} else if (userAction == 3) {
				virtualPet1.sleepPet();
			} else if (userAction == 4) {
				virtualPet1.playPet();
			} else if (userAction == 9) {
				System.out.println("Hunger: " + virtualPet1.hunger + newLine + "thirst: " + virtualPet1.thirst + newLine
						+ "tiredness: " + virtualPet1.tiredness + newLine + "boredom: " + virtualPet1.boredom);
			} else {
				System.out.println("Please enter a valid command.");
			}

			// warning level conditionals
			if (virtualPet1.hunger >= 90) {
				System.out.println(petName + ": \"I'm starving, I need food!\"");
			}
			if (virtualPet1.thirst >= 90) {
				System.out.println(petName + ": \"I'm dehydrated, I need water!\"");
			}
			if (virtualPet1.tiredness >= 90) {
				System.out.println(petName + ": \"I'm exhausted, I need to sleep!\"");
			}
			if (virtualPet1.boredom >= 90) {
				System.out.println(petName + ": \"I'm extremely bored, I need to play!\"");
			}

		} while ((virtualPet1.hunger <= 99) & (virtualPet1.thirst <= 99) & (virtualPet1.tiredness <= 99)
				& (virtualPet1.boredom <= 99));

		// death age
		System.out.print(petName + " has died after ");
		if (virtualPet1.years != 0) {
			System.out.print(virtualPet1.years + "years ");
		}
		if (virtualPet1.months != 0) {
			System.out.print(virtualPet1.months + "months ");
		}
		if (virtualPet1.weeks != 0) {
			System.out.print(virtualPet1.weeks + "weeks ");
		}
		if (virtualPet1.days != 0)
			System.out.print(virtualPet1.days + "days and ");
		System.out.println(virtualPet1.hours + "hours.");

		scanner.close();
	}
}
