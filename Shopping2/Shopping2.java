import java.util.ArrayList;


public class Shopping2 {

	
private ArrayList shoppingList;
	
	public Shopping2 () {
		shoppingList = new ArrayList();
	}
	
	public void addItem (String item)
	{
		shoppingList.add(item);
	}
	
	
	public int numberOfItems() {
		return shoppingList.size();
	}
	
	
	public void showItem(int itemNumber)
    {
        if(itemNumber < 0) {
            // This is not a valid note number, so do nothing.
        }
        else if(itemNumber < numberOfItems()) {
            // This is a valid note number, so we can print it.
            System.out.println(shoppingList.get(itemNumber));
        }
        else {
            // This is not a valid note number, so do nothing.
        }
    }
	
	public void listItems()
    {
        int index = 0;
        while(index < shoppingList.size()) {
            System.out.println("Item number " + (index +1) + " is " +  shoppingList.get(index));
            index++;
        }
    }

	public static void main(String[] args) {
		Shopping2 sh=new Shopping2();
		sh.addItem("bananas");
		sh.addItem("apples");
		sh.addItem("bread");
		sh.numberOfItems();
		sh.showItem(2);
		sh.listItems();

}
	
}
/*
 *


public class Quarterly_Report {

	
	public static final int Electrical = 0;
	public static final int Kitchen = 1;
	public static final int Bathroom = 2;
	public static final int SoftFurnishing = 3;
	public static final int Accessories = 4;
	double[] columnTotal = new double[5];
	
	
	 public static void main( String args[] )
	   {
	double[][] sales = { { 67.0, 65.0, 63.0, 18.0, 16.0 }, { 63.0, 67.0, 63.0, 24.0, 23.0 },
			{ 78.0, 56.0, 65.0, 22.0, 21.0 },{ 78.0, 45.0, 71.0, 19.0, 19.0 },
			{ 103.0, 72.0, 69.0, 16.0, 19.0 },};
	
	
	
	double[] columnTotal = new double[5];
	for (int i = 0; i < 5; i++) {
	    for (int j = 0; j < 5; j++) {
	        columnTotal[j] += sales[i][j];
	    }
	}	
	
	   
	for (int i = 0; i < 5; i++) {
	    System.out.println("Column " + i + " total: " + columnTotal[i]);
	}
	   
	   }
		
		
		
}




 * 
 * 
 * 
 * */
 */

