package a5;

public class Main {
  public static void main(String[] args) {
    /*
    This is a basic example of how to create a BST and add values to it.
    You should add more examples and use this class to debug your code
    */
    BST<Integer> bst = new NonEmptyBST<Integer>(5);
    bst = bst.insert(4);
    bst = bst.insert(7);
    bst = bst.insert(1);
    printDepthFirstInOrder(bst);
  }

  // Prints the tree in depth first in-order traversal
  static void printDepthFirstInOrder(BST<Integer> tree) {
	  if (tree.isEmpty()) {
		  return;
	  }
	  
	  printDepthFirstInOrder(tree.getLeft());
	  System.out.print(tree.getElement().toString() + " ");
	  printDepthFirstInOrder(tree.getRight());
  }
}
