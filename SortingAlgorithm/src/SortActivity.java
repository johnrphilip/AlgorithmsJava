public class SortActivity {

    public static void main(String[] args) {
        int[] A = {31, 41, 59, 26, 41, 58}; //create the array of integers

        for (int i = 1; i < A.length; i++) {   // set the loop, initial, iteration length, and behaviour
            int key = A[i];						//this is the key discussed which will change and update 
            int j = i - 1;						//this is the number to the 'left' of the key variable. will also update
            while (j >= 0 && A[j] > key) {	//here we have the inner loop conditions. if the number on the left is bigger than the key then.....
                A[j + 1] = A[j];			//this reassigns j to the right as we move along	
                j = j - 1;					//moving left after reassigning  the element in the array to check the condition
            }
            A[j + 1] = key;					//when the inner while loop ends you reassign the key and then start over
        }

        System.out.println("Sorted array: ");    	//printing out the new array..........
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
   
	}
}