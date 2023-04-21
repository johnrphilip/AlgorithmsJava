
public class Billion {

	
	public static void iterateThroughByteArray(long size) {
	    byte[] byteArray = new byte[(int) size];
	    long startTime = System.currentTimeMillis();
	    for (long i = 0; i < byteArray.length; i++) {
	        // Do some operation on each byte element
	        byteArray[(int) i] = (byte) (i % 256);
	    }
	    long endTime = System.currentTimeMillis();
	    System.out.println("Time taken to iterate through " + size + " elements: " + (endTime - startTime) + " milliseconds");
	}

	public static void main(String[] args) {
	    iterateThroughByteArray(200_000_000_000L);
	}
}
