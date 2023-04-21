import java.util.Arrays;

public class MergeSortSentinel {
  
	public static void printArray(int[] array){
		for(int i : array) {
			System.out.printf("%d ", i);
		}
		System.out.printf("n");
	}

	// Sorting an array of values using the
	// Merge Sort algorithm . This is the function initializer
	// for the mergeSorth method
	public static void sortArray(int[] array){
		mergeSort(array, 0, array.length - 1);
	}

	// Recursive function used by the sort function
	public static void mergeSort(int[] array, int llim, int hlim){
		if(llim < hlim) {
			int mlim = (llim + hlim) / 2;
			mergeSort(array, llim, mlim);
			mergeSort(array, mlim + 1, hlim);
			merge(array, llim, mlim, hlim);
		}
	}

	public static void merge(int[] array, int llim, int mlim, int hlim){
		// Additional Helper Arrays
		int larraySize = mlim - llim + 1;
		int rarraySize = hlim - mlim;
		int[] larray = new int[larraySize + 1];
		int[] rarray = new int[rarraySize + 1];

		// Sentinel values, to avoid additional checks
		// when we are merging larray and rarray
		larray[larraySize] = Integer.MAX_VALUE;
		rarray[rarraySize] = Integer.MAX_VALUE;

		for(int i = 0; i < larraySize; ++i){
			larray[i] = array[llim + i];
		}
		for(int i = 0; i < rarraySize; ++i){
			rarray[i] = array[i + mlim + 1];
		}

		// Building the resulting array from the previously
		// sorted sequences 
		for(int p = llim, m = 0, n = 0, k = llim; k <= hlim; ++k){
			if(larray[m] <= rarray[n]){
				array[k] = larray[m];
				m++;
			}
			else {
				array[k] = rarray[n];
				n++;
			}
		}
	}

	public static void main(String[] args){
		int[] array = new int[]{12, 8, 0, -5, 12, 3, 4, 23};
		sortArray(array);
		printArray(array);
	}
}





/*
 * 
 * 
 * This bit didn't work because 
 
	    public static void main(String[] args) {
	        int[] arr = {16, 44, 55, 12, 14};
	        mergeSortWithSentinel(arr);
	        System.out.println("Sorted Array: " + Arrays.toString(arr));
	    }

	    public static void mergeSortWithSentinel(int[] arr) {
	        int n = arr.length;
	        int[] auxiliary = new int[n];
	        mergeSortWithSentinel(arr, auxiliary, 0, n - 1);
	    }

	    private static void mergeSortWithSentinel(int[] arr, int[] auxiliary, int low, int high) {
	        if (low < high) {
	            int mid = (low + high) / 2;
	            mergeSortWithSentinel(arr, auxiliary, low, mid);
	            mergeSortWithSentinel(arr, auxiliary, mid + 1, high);
	            mergeWithSentinel(arr, auxiliary, low, mid, high);
	        }
	    }

	    private static void mergeWithSentinel(int[] arr, int[] auxiliary, int low, int mid, int high) {
	        int i = low, j = mid + 1;
	        int maxVal = Integer.MAX_VALUE; // simulated sentinel
	        System.arraycopy(arr, low, auxiliary, low, high - low + 1);
	        auxiliary[mid + 1] = maxVal; // set the sentinel in the right half of the array
	        for (int k = low; k <= high; k++) {
	            if (auxiliary[i] <= auxiliary[j]) {
	                arr[k] = auxiliary[i++];
	            } else {
	                arr[k] = auxiliary[j++];
	            }
	        }
	    }
	}
	
*/