package recruitmentExercises;

public class MyTree {

  MyNode root;

  public void addNode(int key, String name) {

    MyNode newNode = new MyNode(key, name);

    if (root == null) {
      root = newNode;

    } else {

      MyNode focusNode = root;

      MyNode parent;

      while (true) {

        parent = focusNode;


        if (key < focusNode.key) {

          focusNode = focusNode.leftChild;

          if (focusNode == null) {
            parent.leftChild = newNode;
            return;
          }


        } else {

          focusNode = focusNode.rightChild;

          if (focusNode == null) {
            parent.rightChild = newNode;
            return;
          }
        }
      }
    }
  }


  public void inOrderTraverse(MyNode focusNode) {

    if (focusNode != null) {
      inOrderTraverse(focusNode.leftChild);
      System.out.println(focusNode);
      inOrderTraverse(focusNode.rightChild);
    }
  }

  public void postOrderTraverse(MyNode focusNode) {

    if (focusNode != null) {
      postOrderTraverse(focusNode.leftChild);
      postOrderTraverse(focusNode.rightChild);
      System.out.println(focusNode);
    }
  }

  public void preOrderTraverse(MyNode focusNode) {

    if (focusNode != null) {
      System.out.println(focusNode);
      preOrderTraverse(focusNode.leftChild);
      preOrderTraverse(focusNode.rightChild);

    }

  }

  public MyNode findNode(int key) {

    MyNode focusNode = root;

    while (focusNode.key != key) {

      if (key < focusNode.key) {
        focusNode = focusNode.leftChild;
      } else {
        focusNode = focusNode.rightChild;
      }

      if (focusNode == null) {
        return null;
      }
    }
    return focusNode;
  }


  class MyNode {

    private String name;
    private int key;

    MyNode leftChild;
    MyNode rightChild;

    public MyNode(int key, String name) {
      this.name = name;
      this.key = key;
    }

    @Override
    public String toString() {
      return "MyNode{" +
              "name='" + name + '\'' +
              ", key=" + key +
              '}';
    }


  }

  public static void main(String[] args) {

    MyTree theTree = new MyTree();

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
