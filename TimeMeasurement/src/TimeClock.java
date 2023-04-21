
public class TimeClock {

	public static void iterateThroughByteArray(int size) {
	    byte[] byteArray = new byte[size];
	    long startTime = System.currentTimeMillis();
	    for (int i = 0; i < byteArray.length; i++) {
	        // Do some operation on each byte element
	        byteArray[i] = (byte) (i % 256);
	    }
	    long endTime = System.currentTimeMillis();
	    System.out.println("Time taken to iterate through " + size + " elements: " + (endTime - startTime) + " milliseconds");
	}

	public static void main(String[] args) {
	    iterateThroughByteArray(65_000_000);
	}
}