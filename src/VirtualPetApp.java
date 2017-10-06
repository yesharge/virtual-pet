import java.util.Scanner;

public class VirtualPetApp {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPet pet = new VirtualPet();

		System.out.println("Hello, welcome to Virtual Pet" + "\nEnter a name for your zebra.");
		String petName = input.nextLine();

		System.out.println("Below are the needs and levels of " + petName + " the zebra. ");
		System.out.println("Hunger: " + pet.hunger() + "\nThirst: " + pet.thirst() + "\nBoredom: " + pet.boredom()
				+ "\nSickness: " + pet.sickness() + "\nTiredness: " + pet.tiredness());
String userInput;
		do {
		System.out.println(
				"What do you want to do? " + "\n1. Feed " + petName + "\n2. Play with " + petName + "\n3. Put " + petName
						+ " to sleep" + "" + "\n4. Take " + petName + " to the doctors" +"\n5. Check "+petName+" levels "+"\n6. Exit the game");
		 userInput = input.nextLine();
		
			if (userInput.equals("1")) {
				pet.feedMe();
				pet.tick();
			}
			else if(userInput.equals("2")) {
				pet.playWithMe();
				pet.tick();
			}
			else if (userInput.equals("3")) {
				pet.sleep();
				pet.tick();
			}
			else if (userInput.equals("4")) {
				pet.takeToDoctor();
				pet.tick();
			}
			else if (userInput.equals("5")) {
				System.out.println("Hunger: " + pet.hunger() + "\nThirst: " + pet.thirst() + "\nBoredom: " + pet.boredom()
				+ "\nSickness: " + pet.sickness() + "\nTiredness: " + pet.tiredness());
		System.out.println();
			}
			 if (pet.hunger()>=90) {
				System.out.println(petName+" is starving! Feed them asap!"); 
			 }
			 if (pet.tiredness()>75) {
				 System.out.println(petName+ " is really tired. Nap time");
			 }
		
	}while (!userInput.equals("6"));

	}
}
