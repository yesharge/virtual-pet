import java.util.Random;

public class VirtualPet {
	//Instance Variables
	private int hunger;
	private int boredom;
	private int sickness;
	private int tiredness;
	private int selfCare;
	Random random = new Random();
//Constructor
	public VirtualPet() {

		this.hunger = random.nextInt(100) + 1;
		this.boredom = random.nextInt(100) + 1;
		this.sickness = random.nextInt(100) + 1;
		this.tiredness = random.nextInt(100) + 1;
	}

	public void feedMe() {
		if (hunger <=50) {
			hunger += 50;
		}
	}

	public void playWithMe() {
		if (boredom <= 55) {
			boredom += 45;
			selfCare += 1;
		}
		if (sickness >= 10) {
			sickness -= 10;
			selfCare -= 1;
		}
		if (tiredness >= 35) {
			tiredness -= 35;
			selfCare -= 1;
		}
		if (hunger >= 30) {
			hunger -= 30;
			selfCare -= 1;
		}
	}

	public void sleep() {
		if (tiredness <=55) {
		tiredness += 45;
		selfCare += 1;
		}
		if (hunger>=30) {
		hunger-=30;
		}
	}

	public void takeToDoctor() {
		if (sickness<=25) {
		sickness += 75;
		selfCare += 1;
		}
	}

	public void tick() {
		selfCare = random.nextInt(10) + 1;
		if (selfCare == 3) {
			System.out.println("I'm sorry. Your pet has been ran over by a car.");
			System.exit(0);
		}
		if (selfCare == 5) {
			if (hunger>=10) {
			hunger -= 10;
			}
			if (boredom>=10)  {
			boredom += 10; 
			}
			if (sickness >= 10) {
			sickness -= 10;
			}
			if (tiredness >10) {
			tiredness += 10;
		}
		}
	}

	public int hunger() {
		return hunger;
	}

	public int boredom() {
		return boredom;
	}

	public int sickness() {

		return sickness;
	}

	public int tiredness() {
		return tiredness;
	}

	public int selfCare() {
		return selfCare;
	}

}
