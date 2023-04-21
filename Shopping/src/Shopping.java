import java.util.ArrayList;

public class Shopping {

	private ArrayList shoppingList;
	
	public Shopping () {
		shoppingList = new ArrayList();
	}
	
	public void addItem (String item)
	{
		shoppingList.add(item);
	}
	
	
	public int numberOfItems() {
		return shoppingList.size();
	}
	

	public static void main(String[] args) {
		Shopping sh=new Shopping();
		
	}

}


