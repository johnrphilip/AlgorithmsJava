import java.util.LinkedList;  //importing a singly linked list

public class HashTable {
    private LinkedList<Integer>[] table;  //a special imported variable array of linked lists in declared which will store the data in the has table
    private int size;    //keeps track of the hash table

    public HashTable(int capacity) {  //main method to create the table
        table = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            table[i] = new LinkedList<>();
        }
        size = 0;
    }

    public void insert(int key) {
        int index = key % table.length;   //here is where the collision happens
        table[index].add(key);   //here is where the collision is handled. the int is put into the linkedlist array if there is a collision
        size++;   //to help measure the table size
    }

    public boolean search(int key) {
        int index = key % table.length;
        return table[index].contains(key);  //this searches for the linked list index with the key if there were collisions
    }

    public void delete(int key) {
        int index = key % table.length;
        if (table[index].remove((Integer) key)) {
            size--;
        }
    }

    public int size() {
        return size;
    }
    
    public void printKeys() {
        for (int i = 0; i < table.length; i++) {
            System.out.print("Index " + i + ": ");
            for (Integer key : table[i]) {
                System.out.print(key + " ");
            }
            System.out.println();
        }
    }
    
}
