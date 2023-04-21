
public class cat extends Animal 

{
	int livesLeft = 9;
	
	
	public cat (String name, int livesLeft) {
		super (name);
		this.livesLeft= livesLeft;
	}
	
	public int getLivesLeft() {
		return livesLeft;
	}
	
	public void loseLife() {
		livesLeft = livesLeft - 1;
		if (livesLeft==0) {
			System.out.println("the cat is dead");
		}
	}
	
		public String toString () {
			System.out.println("Animal name =" + name + "\n" + "lives left = " + livesLeft);
			 return "Animal name =" + name + "livesLeft = " + livesLeft;
			
		}
		
	
	
}
