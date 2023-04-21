import java.util.Arrays;

public class LineQuad {
    private int[] table;
    private int m;

    public LineQuad(int m) {
        this.m = m;
        table = new int[m];
        Arrays.fill(table, -1);
    }

    private int hash(int key) {
        return key % m;
    }

    private int linearProbing(int key, int i) {
        return (hash(key) + i) % m;
    }

    private int quadraticProbing(int key, int i) {
        return (hash(key) + i * i) % m;
    }

    public void insertLinearProbing(int key) {
        int i = 0;
        while (i < m) {
            int j = linearProbing(key, i);
            if (table[j] == -1) {
                table[j] = key;
                return;
            }
            i++;
        }
        System.out.println("Insert failed for key " + key + " using linear probing");
    }

    public void insertQuadraticProbing(int key) {
        int i = 0;
        while (i < m) {
            int j = quadraticProbing(key, i);
            if (table[j] == -1) {
                table[j] = key;
                return;
            }
            i++;
        }
        System.out.println("Insert failed for key " + key + " using quadratic probing");
    }

    public void printKeys() {
        System.out.println("Keys in the hash table: ");
        for (int i = 0; i < m; i++) {
            if (table[i] != -1) {
                System.out.print(table[i] + " ");
            }
        }
        System.out.println();
    }

    public void printTable() {
        System.out.println(Arrays.toString(table));
    }
}