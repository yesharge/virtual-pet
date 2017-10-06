
public class VirtualPet {
	private int hunger;
	private int thirst;
	private int waste;
	private int boredom;
	private int sickness;
	private int tiredness;
	
	
	public VirtualPet() {
	this.hunger =(int) Math.random()*100+1;
	this.thirst =(int) Math.random()*100+1;
	this.waste  =(int) Math.random()*100+1;
	this.boredom =(int) Math.random()*100+1;
	this.sickness =(int) Math.random()*100+1;
	this.tiredness =(int) Math.random()*100+1;
	}
	public void feedMe () {
		hunger-=50;
		thirst-=30;
		
	}
	public void playWithMe () {
		boredom-=45;
		sickness+=20;
		tiredness+=35;
		hunger+=30;
	}
	public void sleep () {
		tiredness-=45; 
	}
	public void takeToDoctor () {
		sickness-=75;
	}
	public void tick () {
		hunger+=10;
		thirst+=10;
		boredom+=10;
		sickness+=10;
		tiredness+=10;
		
	}
	public int hunger() {
		return hunger;
	}
	public int thirst() {
		
		return thirst;
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

}
