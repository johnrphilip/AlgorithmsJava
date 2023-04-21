
public class Heap4 {

	  public static void main(String[] args) {
	    int[] arr = {5, 13, 2, 25, 7, 17, 20, 8, 4};
	    int n = arr.length;

	    heapsort(arr, n);

	    System.out.println("Sorted array is: ");
	    for (int i = 0; i < n; i++) {
	      System.out.print(arr[i] + " ");
	    }
	  }

	  private static void heapsort(int[] arr, int n) {
	    for (int i = n / 2 - 1; i >= 0; i--) {
	      heapify(arr, n, i);
	    }

	    for (int i = n - 1; i >= 0; i--) {
	      int temp = arr[0];
	      arr[0] = arr[i];
	      arr[i] = temp;
	      heapify(arr, i, 0);
	    }
	  }

	  private static void heapify(int[] arr, int n, int i) {
	    int largest = i;
	    int left = 2 * i + 1;
	    int right = 2 * i + 2;

	    if (left < n && arr[left] > arr[largest]) {
	      largest = left;
	    }

	    if (right < n && arr[right] > arr[largest]) {
	      largest = right;
	    }

	    if (largest != i) {
	      int swap = arr[i];
	      arr[i] = arr[largest];
	      arr[largest] = swap;
	      heapify(arr, n, largest);
	    }
	  }
}