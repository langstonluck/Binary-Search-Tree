package a5;

public class NonEmptyBST<T extends Comparable<T>> implements BST<T> {
	private T _element;
	private BST<T> _left;
	private BST<T> _right;

	public NonEmptyBST(T element) {

		_left = new EmptyBST<T>();
		_right = new EmptyBST<T>();
		_element = element;
	}

	@Override
	public int getHeight() {
		return Math.max(_left.getHeight(), _right.getHeight())+1;
	}

	@Override
	public BST<T> getLeft() {
		return _left;
	}

	@Override
	public BST<T> getRight() {
		return _right;
	}

	@Override
	public T getElement() {
		return _element;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public int size() {
		// Your code here.
	}

	@Override
	public T findMin() {
		// Your code here.
	}

	@Override
	public T findMax() {
		// Your code here.
	}

	@Override
	public boolean contains(T element) {
		// Your code here.
	}


	@Override
	public BST<T> insert(T element) {
		// Your code here
	}

	@Override
	public BST<T> remove(T element) {
		// Your code here
	}

}
