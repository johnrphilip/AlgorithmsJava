import java.util.Arrays;

public class MergeNoSentinel {
	
    public static void main(String[] args) {
        int[] arr = {4, 6, 12, 43, 19, 65, 11, 22};
        mergeSortWithoutSentinel(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    private static void mergeSortWithoutSentinel(int[] arr) {
        int n = arr.length;
        int[] auxiliary = new int[n];
        mergeSortWithoutSentinel(arr, auxiliary, 0, n - 1);
    }

    private static void mergeSortWithoutSentinel(int[] arr, int[] auxiliary, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSortWithoutSentinel(arr, auxiliary, low, mid);
            mergeSortWithoutSentinel(arr, auxiliary, mid + 1, high);
            mergeWithoutSentinel(arr, auxiliary, low, mid, high);
        }
    }
/*
 * 
 * The auxiliary array in this code is a temporary array used in the mergeWithoutSentinel
 method to store a copy of a portion of the original array during the merging process.
 The original array is split into two sub-arrays and the auxiliary array is used to store a copy of one of the sub-arrays, 
 which is then merged with the other sub-array to produce the final, sorted array.
 */
    private static void mergeWithoutSentinel(int[] arr, int[] auxiliary, int low, int mid, int high) {
        int i = low, j = mid + 1;
        System.arraycopy(arr, low, auxiliary, low, high - low + 1);
        for (int k = low; k <= high; k++) {
            if (i > mid) {
                arr[k] = auxiliary[j++];
            } else if (j > high) {
                arr[k] = auxiliary[i++];
            } else if (auxiliary[i] > auxiliary[j]) {
                arr[k] = auxiliary[j++];
            } else {
                arr[k] = auxiliary[i++];
            }
        }
    }
}
