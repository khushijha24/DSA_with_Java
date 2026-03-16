package hashtable;

public class Main {

    public static void main(String[] args) {

        // ---------------- Constructor -----------------------
        HashTable myHashTable = new HashTable();

        myHashTable.printTable();

        //------------------------ Set ---------------------------
        HashTable table2;
        // Test 1: Add single key to empty table2
        System.out.println("Test 1: Insert Single Key");
        table2 = new HashTable();
        table2.set("apple", 5);
        System.out.println("Expected: 'apple' with value 5");
        table2.printTable();
        System.out.println();

        // Test 2: Insert multiple keys
        System.out.println("Test 2: Insert Multiple Keys");
        table2 = new HashTable();
        table2.set("apple", 5);
        table2.set("banana", 3);
        System.out.println("Expected: 'apple'=5 and 'banana'=3");
        table2.printTable();
        System.out.println();

        // Test 3: Collision handling
        System.out.println("Test 3: Handle Collisions");
        table2 = new HashTable();
        table2.set("apple", 5);
        table2.set("orange", 4);
        System.out.println("Expected: 'apple' and 'orange' both stored");
        table2.printTable();
        System.out.println();

        // Test 4: Multiple chained nodes
        System.out.println("Test 4: Hardware Store Chain");
        table2 = new HashTable();
        table2.set("nails", 100);
        table2.set("tile", 50);
        table2.set("lumber", 80);
        System.out.println("Expected: nails, tile, lumber all present");
        table2.printTable();
        System.out.println();

        // Test 5: Values remain independent
        System.out.println("Test 5: Independent Values");
        table2 = new HashTable();
        table2.set("nails", 100);
        table2.set("tile", 50);
        table2.set("lumber", 80);
        System.out.println("Expected: nails=100, tile=50, lumber=80");
        table2.printTable();
        System.out.println();

        // Test 6: Insert many items
        System.out.println("Test 6: Insert Many Items");
        table2 = new HashTable();
        for (int i = 0; i < 20; i++) {
            table2.set("item" + i, i * 10);
        }
        System.out.println("Expected: 20 items across buckets");
        table2.printTable();
        System.out.println();

        // Test 7: Retrieval after many insertions
        System.out.println("Test 7: Retrieve Keys from Chains");
        table2 = new HashTable();
        table2.set("nails", 100);
        table2.set("tile", 50);
        table2.set("lumber", 80);
        table2.set("bolts", 200);
        table2.set("screws", 140);
        System.out.println("Expected: nails, tile, lumber, bolts, screws");
        table2.printTable();
        System.out.println();

        //-------------------------get----------------------------

        HashTable table3;

        System.out.println("These tests confirm get() retrieves values");
        System.out.println("for existing keys, returns 0 for missing");
        System.out.println("keys, and works with chained buckets.");
        System.out.println();

        // Test 1: Get a single key
        System.out.println("Test 1: Get Single Key");
        table3 = new HashTable();
        table3.set("nails", 100);
        System.out.println("Expected: 100");
        System.out.println("Actual: " + table3.get("nails"));
        System.out.println();

        // Test 2: Get multiple keys
        System.out.println("Test 2: Get Multiple Keys");
        table3 = new HashTable();
        table3.set("nails", 100);
        table3.set("tile", 50);
        table3.set("lumber", 80);
        System.out.println("Expected: tile=50, lumber=80");
        System.out.println("Actual tile: " + table3.get("tile"));
        System.out.println("Actual lumber: " + table3.get("lumber"));
        System.out.println();

        // Test 3: Get non-existent key
        System.out.println("Test 3: Get Non-Existent Key");
        table3 = new HashTable();
        table3.set("nails", 100);
        System.out.println("Expected: 0");
        System.out.println("Actual: " + table3.get("screws"));
        System.out.println();

        // Test 4: Get keys in chained bucket (collisions)
        System.out.println("Test 4: Get Keys with Collisions");
        table3 = new HashTable();
        table3.set("nails", 100);
        table3.set("tile", 50);
        table3.set("lumber", 80);
        System.out.println("Expected: nails=100, tile=50, lumber=80");
        System.out.println("Actual nails: " + table3.get("nails"));
        System.out.println("Actual tile: " + table3.get("tile"));
        System.out.println("Actual lumber: " + table3.get("lumber"));
        System.out.println();

        // Test 5: Get after many insertions
        System.out.println("Test 5: Get After Many Insertions");
        table3 = new HashTable();
        for (int i = 0; i < 20; i++) {
            table3.set("item" + i, i * 10);
        }
        System.out.println("Expected: 150 for item15");
        System.out.println("Actual item15: " + table3.get("item15"));
        System.out.println("Expected: 0 for missing and empty keys");
        System.out.println("Actual missing: " + table3.get("missing"));
        System.out.println("Actual empty: " + table3.get(""));
        System.out.println();
    }
}
