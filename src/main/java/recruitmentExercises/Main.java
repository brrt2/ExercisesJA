package recruitmentExercises;

public class Main {

  public static void main(String[] args) {
    MyArrayList<Integer> myList = new MyArrayList<>();
    myList.add(5);
    myList.add(10);
    myList.add(12);
    myList.add(20);
    myList.add(30);
    myList.add(50);
    myList.add(60);
    myList.add(90);
    myList.add(100);
    myList.add(110);
    myList.add(120);
    myList.add(130);

//    System.out.println(myList.get(0));
//    myList.remove(0);
//    System.out.println(myList.get(0));
//    myList.set(0,50);
//    System.out.println(myList.get(0));

    MyLinkedList<String> myLinkedList = new MyLinkedList<>();
    myLinkedList.add("jeden");
    myLinkedList.add("dwa");
    myLinkedList.add("trzy");
    myLinkedList.add("cztery");
    myLinkedList.add("piec");
    myLinkedList.add("szesc");

    System.out.println(myLinkedList.size);
    System.out.println(myLinkedList.remove("dwa"));
    System.out.println(myLinkedList.size);


    BinaryTree theTree = new BinaryTree();

    theTree.addNode(50, "Boss");

    theTree.addNode(25, "Vice President");

    theTree.addNode(15, "Office Manager");

    theTree.addNode(30, "Secretary");

    theTree.addNode(75, "Sales Manager");

    theTree.addNode(85, "Salesman 1");

    // Different ways to traverse binary trees

    // theTree.inOrderTraverseTree(theTree.root);

    // theTree.preorderTraverseTree(theTree.root);

    // theTree.postOrderTraverseTree(theTree.root);

    // Find the node with key 75

    System.out.println("\nNode with the key 75");

    System.out.println(theTree.findNode(75));



  }
}
