
public class linequadtest {

	public static void main(String[] args) {
	    LineQuad hashTable = new LineQuad(11);

	    hashTable.insertLinearProbing(10);
	    hashTable.insertLinearProbing(22);
	    hashTable.insertLinearProbing(31);
	    hashTable.insertLinearProbing(4);
	    hashTable.insertLinearProbing(15);
	    hashTable.insertLinearProbing(28);
	    hashTable.insertLinearProbing(17);
	    hashTable.insertLinearProbing(88);
	    hashTable.insertLinearProbing(59);

	    System.out.println("Hash table using linear probing:");
	    hashTable.printTable();
	    hashTable.printKeys();

	    hashTable = new LineQuad(11);

	    hashTable.insertQuadraticProbing(10);
	    hashTable.insertQuadraticProbing(22);
	    hashTable.insertQuadraticProbing(31);
	    hashTable.insertQuadraticProbing(4);
	    hashTable.insertQuadraticProbing(15);
	    hashTable.insertQuadraticProbing(28);
	    hashTable.insertQuadraticProbing(17);
	    hashTable.insertQuadraticProbing(88);
	    hashTable.insertQuadraticProbing(59);
	
	    System.out.println("Hash table using quadratic probing:");
	    hashTable.printTable();
	    hashTable.printKeys();
}
}


/*

 hashTable.insertLinearProbing(10);
	    hashTable.insertLinearProbing(22);
	    hashTable.insertLinearProbing(31);
	    hashTable.insertLinearProbing(4);
	    hashTable.insertLinearProbing(15);
	    hashTable.insertLinearProbing(28);
	    hashTable.insertLinearProbing(17);
	    hashTable.insertLinearProbing(88);
	    hashTable.insertLinearProbing(59);

	    System.out.println("Hash table using linear probing:");
	    hashTable.printTable();
	    hashTable.printKeys();

	    hashTable = new LineQuad(11);






*/