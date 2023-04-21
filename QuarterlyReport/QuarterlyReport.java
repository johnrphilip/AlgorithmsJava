


public class QuarterlyReport //class name

{


	static double[] columnTotal = new double[5];   //stores five column totals
	static String[] columnNames = {"Electrical", "Kitchen", "Bathroom", "Soft Furnishing", "Accessories"}; //holds the names of the columns
	static String[] rowNames = {"April", "May", "June", "July", "August", "September"};
	
	 //make a 2D array 
	static double[][] sales = { { 67.0, 65.0, 63.0, 18.0, 16.0 }, { 63.0, 67.0, 63.0, 24.0, 23.0 },
			{ 78.0, 56.0, 65.0, 22.0, 21.0 },{ 78.0, 45.0, 71.0, 19.0, 19.0 },
			{ 103.0, 72.0, 69.0, 16.0, 19.0 },};
	

	
	//here you can find the column total
	public static double[] getColumnTotal() {
		 double[] columnTotal = new double[5];  //creates a variable to hold the five column totals in an array[]
	for (int i = 0; i < 5; i++) {    //this outer loop iterates through the rows of the array
	    for (int j = 0; j < 5; j++) {    //this inner loop iterates through the columns of the sales array
	        columnTotal[j] += sales[i][j];   //here the column total changes by the column total = the column total + the next reference point of the index
	        //so for example it references a point in the array [0,0] which is 67 and then adds the next point
	        //for each value of j (the second reference point in the array), sales [i][0] is added to the columnTotal[0]
	        //the difference between this and the row total is only in the [i vs j] reference in the last line
	        //this allows the total to add up all of the i's here before moving to the next j
	        //so it moves columnTotal[0 (j will stay zero through this run)]== [0,0] +  [1][0]  +  [2][0]....[4][0]
	        // then it will move to columnTotal[1] where j will stay 1 through all of the indices
	    }
	   
	}
	 for (int i = 0 ; i < columnTotal.length; i++) {
	    	System.out.println(columnNames[i] + ": " + columnTotal[i]);
	    }
	return columnTotal;
	
	}	
	
	//find the row total method
	
	public static double[] getRowTotal() {
	double[] rowTotal = new double[5];
for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 5; j++) {
        rowTotal[i] += sales[i][j];
    }//the difference here is that it is i in the indices which remains the same number through each iteration
    //so for example rowTotal[0] will run through adding up [0][0] [0][1] [0][2] [0][3] [0][4] 
    //while rowTotal[1) will add up all the indices  [1][0] [1][1] [1][2] [1][3] [1][4]
}
	for (int i = 0 ; i < rowTotal.length; i++) {
		System.out.println(rowNames[i] + ": " + rowTotal[i]);
	}
return rowTotal;
	}
	
	
	//find the hightest column method
	public static void getHighestColumn() {
		double[] columnTotals = getColumnTotal();  //here I am calling the method above to get the columnTotal array
		double highest = columnTotals[0]; //here I am setting this variable to the first number in the array of column totals
		int highestIndex = 0; //an integer is needed to store the number of the index holding the highest column rather than a double
		for (int i = 1; i < columnTotals.length; i++) {    
		    if (columnTotals[i] > highest) {  //i will start at 0 and then move through each number in the array 
		        highest = columnTotals[i];
		        highestIndex = i;
		    }
		}
		System.out.println("The highest sales of all five departments is: " + columnNames[highestIndex] + " who had " + highest + " in sales");
	}
	
	//find the lowest column method
	public static void getLowestColumn() {
		double[] columnTotals = getColumnTotal();  //here I am calling the method above to get the columnTotal array
		double lowest = columnTotals[0]; //here I am setting this variable to the first number in the array of column totals
		int lowestIndex = 0; //an integer is needed to store the number of the index holding the highest column rather than a double
		for (int i = 1; i < columnTotals.length; i++) {    
		    if (columnTotals[i] < lowest) {  //i will start at 0 and then move through each number in the array 
		        lowest = columnTotals[i];
		        lowestIndex = i;
		    }
		}
		System.out.println("The lowest sales of all five departments is: " + columnNames[lowestIndex] + " who had " + lowest + " in sales");
	}
	

	//find the highest row method
	public static void getHighestRow() {
		double[] rowTotals = getRowTotal();  //here I am calling the method above to get the columnTotal array
		double highest = rowTotals[0]; //here I am setting this variable to the first number in the array of column totals
		int highestIndex = 0; //an integer is needed to store the number of the index holding the highest column rather than a double
		for (int i = 1; i < rowTotals.length; i++) {    
		    if (rowTotals[i] > highest) {  //i will start at 0 and then move through each number in the array 
		        highest = rowTotals[i];
		        highestIndex = i;
		    }
		}
		System.out.println("The highest month is: " + rowNames[highestIndex] + " which had " + highest + " in sales");
	}
	
	//add total sales
	public static double addTotalSales(double[][] sales) {
		double sum = 0;
		for (int i = 0; i < sales.length; i++) {
			for (int j= 0; j < sales[i].length; j++) {
				sum += sales[i][j];
			}
		}
		System.out.println("The total sales is " + sum);
		return sum;
	}
	
	//add sales tax
	public static double addSalesTax(double[][] sales, double taxRate) {
		  double sum = addTotalSales(sales);
		  System.out.println("The total sales with tax of " + taxRate + " is " + sum * (1 + taxRate / 100));
		return sum;
		}

	 
	
	
	public static void main( String args[] ) //entry point for the program
	   {
		QuarterlyReport qr= new QuarterlyReport();
		qr.getColumnTotal();
		qr.getRowTotal();
		qr.getHighestColumn();
		qr.getLowestColumn();
		qr.getHighestRow();
		qr.addTotalSales(sales);
		qr.addSalesTax(sales, 17);
}


}
/*

graveyard
	
	public static final int Electrical = 0;
	public static final int Kitchen = 1;
	public static final int Bathroom = 2;
	public static final int SoftFurnishing = 3;
	public static final int Accessories = 4;

	//change the array value. pretty clunky but the best I could come up with
	public void changeValue(int row, int column, double newValue)  //public method. put in the three parameters
			
	{
		  sales[row][column] = newValue;   //then here it changes the value in the array
		}
	
	//here you can convert any integers accidentally put into the array
	public static void convertIntegers(double[][] sales) //the parameters are the the sales array
	{
	    for (int i = 0; i < sales.length; i++) {  //loop through the sales array
	        for (int j = 0; j < sales[i].length; j++) {  //2d array requires i and j loops
	            if (sales[i][j] == (int) sales[i][j]) {   //comparison to see if the number is an integer
	                sales[i][j] = (double) (int) sales[i][j];   //if so then assignment is to make the integer into a double
	            }
	        }
	    }
	}
	 

*/