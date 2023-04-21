
public class Animal {

	
		public String name;
		
		public Animal(String nameIn)
		{
			name=nameIn;
		}
		
		
		public String getName()
		{
			return name;
		}
		
		public String toString()
		{
			System.out.println("Animal name: " + name);
			return "Animal name: " + name;
			
		}
		
}



// System.out.println("Animal name: " + name);