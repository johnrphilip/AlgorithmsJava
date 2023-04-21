


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






/* code graveyard

double[][] sales = new double[5][3];

*/
