package binarysearchtree;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();

        System.out.println("Root: " + myBST.getRoot());


        /*
            EXPECTED OUTPUT:
            ----------------
            Root: null

        */


        BinarySearchTree myBST2 = new BinarySearchTree();

        myBST2.insert(2);
        myBST2.insert(1);
        myBST2.insert(3);

        /*
            THE LINES ABOVE CREATE THIS TREE:
                         2
                        / \
                       1   3
        */


        System.out.println("Root: " + myBST2.getRoot().value);
        System.out.println("\nRoot->Left: " + myBST2.getRoot().left.value);
        System.out.println("\nRoot->Right: " + myBST2.getRoot().right.value);


        /*
            EXPECTED OUTPUT:
            ----------------
            Root: 2

            Root->Left: 1

            Root->Right: 3

        */


        BinarySearchTree myBST3 = new BinarySearchTree();

        myBST3.insert(2);
        myBST3.insert(1);
        myBST3.insert(3);
        myBST3.insert(47);
        myBST3.insert(21);
        myBST3.insert(76);
        myBST3.insert(18);
        myBST3.insert(27);
        myBST3.insert(52);
        myBST3.insert(82);


        System.out.println("BST Contains 27:");
        System.out.println(myBST3.contains(27));

        System.out.println("\nBST Contains 17:");
        System.out.println(myBST3.contains(17));


        /*
            EXPECTED OUTPUT:
            ----------------
            BST Contains 27:
            true

            BST Contains 17:
            false

        */

    }

}
