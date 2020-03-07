package a5;

public class NonEmptyBST<T extends Comparable<T>> implements BST<T> {
	private T _element;
	private BST<T> _left;
	private BST<T> _right;
	private int size;

	public NonEmptyBST(T element) {

		_left = new EmptyBST<T>();
		_right = new EmptyBST<T>();
		_element = element;
		this.size = 0;
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
		return _left.size() + _right.size() + 1;
	}

	@Override
	public T findMin() {
		if (_left.isEmpty()) {
			return _element;
		} else {
			return _left.findMin();
		}
	}

	@Override
	public T findMax() {
		if (_right.isEmpty()) {
			return this._element;
		} else {
			return _right.findMax();
		}
	}

	@Override
	public boolean contains(T element) {
		if (size() == 0) {
			return false;
		}
		if (element.compareTo(_element) == 0) {
			return true;
		}
		if (element.compareTo(_element) == 1) {
			return _right.contains(element);
		}
		if (element.compareTo(_element) == -1) {
			return _left.contains(element);
		}
		return false;
	}


	@Override
	public BST<T> insert(T element) {
		if (element.compareTo(_element) == 1) {
			if ( _right.isEmpty()) {
			this._right = new NonEmptyBST<T>(element);
			return this;
			}
			_right.insert(element);
			}

			if (element.compareTo(_element) == -1) {
			if ( _left.isEmpty()) {
			this._left = new NonEmptyBST<T> (element);
			return this;
			}
			_left.insert(element);
			}

			return this;
			}

	

	@Override
	public BST<T> remove(T element) {
		if(element.compareTo(_element) == 1) {
			_right = _right.remove(element);
			} else if(element.compareTo(_element) == -1) {
			_left = _left.remove(element);
			} else {



			if (_left.isEmpty() && _right.isEmpty()) {
			return new EmptyBST<T>();
			} 
			else if (_right.isEmpty()) {
			_element = _left.getElement();
			_left = _left.getLeft();
			return this;
			}
			else if(_left.isEmpty()) {
			_element = _right.getElement();
			_right = _right.getRight();
			return this;

			} 
			 else {
			_element = _right.findMin();
			_right = _right.getRight();
			return this;

			}
			}
			return this;
			}
			
	}


