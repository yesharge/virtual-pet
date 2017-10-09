import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPet pet = new VirtualPet();

		System.out.println("Hello, welcome to Virtual Pet" + "\nEnter a name for your zebra.");
		String petName = input.nextLine();

		System.out.println("Below are the needs and levels of " + petName + " the zebra. ");
		System.out.println("Hunger: " + pet.hunger() + "\nBoredom: " + pet.boredom() + "\nSickness: " + pet.sickness()
				+ "\nTiredness: " + pet.tiredness());
		System.out.println();
		
		String userInput;
		do {
			System.out.println("What do you want to do? " + "\n1. Feed " + petName + "\n2. Play with " + petName
					+ "\n3. Put " + petName + " to sleep" + "" + "\n4. Take " + petName + " to the doctors"
					+ "\n5. Check " + petName + " levels " + "\n6. Exit the game");
			userInput = input.nextLine();
			pet.tick();
			if (userInput.equals("1")) {
				pet.feedMe();
			}

			if (userInput.equals("2")) {
				pet.playWithMe();
			}

			if (userInput.equals("3")) {
				pet.sleep();
			}
			if (userInput.equals("4")) {
				pet.takeToDoctor();
			}
			if (userInput.equals("5")) {
				System.out.println("Hunger: " + pet.hunger() + "\nBoredom: " + pet.boredom() + "\nSickness: "
						+ pet.sickness() + "\nTiredness: " + pet.tiredness());
				System.out.println();
			}
			if (pet.hunger() <= 30) {
				System.out.println(petName + " is getting hungry! Feed them asap!");
			}
			if (pet.tiredness() <= 25) {
				System.out.println(petName + " is really tired. Nap time");
			}
			if (pet.sickness() <= 5) {
				System.out.println(petName + " is really ill. " + petName + " should see a doctor soon.");
			}
			if (pet.boredom() <= 30) {
				System.out.println(petName + " is get lonely. Play time!");
			}

		} while (!userInput.equals("6"));
		input.close();
		System.exit(0);
	}
}
