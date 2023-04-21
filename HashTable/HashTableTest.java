
public class HashTableTest {

    public static void main(String[] args) {
        HashTable hashTable = new HashTable(9);   //create an instance of the hashtable with a size of 9. stored as variable hashtable
        //this will create key based on the table size of modulo % 9

         
        //so for the test example you will have multiple collisions here: 10,28,37[1]...... 
        hashTable.insert(5);
        hashTable.insert(28);
        hashTable.insert(19);
        hashTable.insert(15);
        hashTable.insert(20);
        hashTable.insert(33);
        hashTable.insert(12);
        hashTable.insert(17);
        hashTable.insert(10);

        System.out.println("Size of hash table: " + hashTable.size());

        int key = 20; //make a variable key to check if it exist in the hashtable
        if (hashTable.search(key)) {   //calling the method to search
            System.out.println("Key " + key + " is present in the hash table.");
        } else {
            System.out.println("Key " + key + " is not present in the hash table.");
        }

        hashTable.printKeys();
        
        hashTable.delete(28);
        System.out.println("Size of hash table after deletion: " + hashTable.size());
        hashTable.printKeys();
    }
}


