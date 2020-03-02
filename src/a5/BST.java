package a5;

public interface BST<T extends Comparable<T>> {
  /**
   * Returns the number of elements in the tree.
   *
   * @return the number of elements in the tree
   */
  int size();

  /**
   * Inserts element into the tree in the appropriate position.
   * Either returns the mutated tree after insertion or a new tree
   * with the inserted element if necessary.
   * 
   * @param element to be added to the tree
   * @return void
   **/
  BST<T> insert(T element);

  /**
   * Removes the element from the tree if it is present.
   * Either returns the possibly mutated tree after removal or an empty tree.
   *
   * @param element to be removed from tree
   * @return true if successfully removed element, false otherwise
   */
  BST<T> remove(T element);

  /**
   * Returns the smallest value in the tree. If the tree is empty
   * return null;
   *
   * @return the smallest value in the tree, null if the tree is empty
   */
  T findMin();

  /**
   * Returns the largest value in the tree. If the tree is empty
   * return null;
   *
   * @return the smallest value in the tree, null if the tree is empty
   */
  T findMax();

  /**
   * Returns true if the tree contains the specified element. 
   *
   * @param element whose presence in this tree is to be tested
   * @return true if this tree contains the specified element
   */
  boolean contains(T element);

  /**
   * Returns the longest path from the root value to a leaf in the tree
   *
   * @return the longest path from the root to a leaf.
   */
  int getHeight();

  BST<T> getLeft();

  BST<T> getRight();

  T getElement();
  
  boolean isEmpty();
}
