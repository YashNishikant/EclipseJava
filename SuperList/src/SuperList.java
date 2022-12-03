import java.util.EmptyStackException;

public class SuperList<E> {

	ListNode<E> root, end;
	int size;

	public SuperList() {
		root = null;
		end = null;
		size = 0;
	}

	public void add(E value) {

		ListNode<E> temp = new ListNode<E>(value);

		if (size == 0 || root == null) {
			root = temp;
			end = root;
		} else {

			end.setNext(temp);
			temp.setPrev(end);
			end = temp;
		}

		size++;
	}

	public E poll() {
		
		if(isEmpty())
			return null;
		
		size--;
		E val = root.getValue();
		root = root.getNext();
		return val;
	}

	public E pop() {
		
		if(isEmpty())
			throw new EmptyStackException();
		
		size--;
		E val = end.getValue();
		end = end.getPrev();
		return val;
	}

	public E get(int index) {
		ListNode<E> indexNode = root;
		E value = null;

		if(index > size-1) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		for (int i = 0; i < index+1; i++) {
			value = indexNode.getValue();
			indexNode = indexNode.getNext();
		}
		return value;
	}
	
	public boolean contains(E value) {
		ListNode<E> indexNode = root;
		
		for (int i = 0; i < size; i++) {

			if(indexNode.getValue() == value)
				return true; 
			
			indexNode = indexNode.getNext();
		}
	
		return false;
		
	}
	
	public void set(int index, E value) {
		ListNode<E> indexNode = root;

		if(index > size-1) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		for (int i = 0; i < index; i++) {
			indexNode = indexNode.getNext();
		}
		indexNode.setValue(value);
	}

	public E remove(int index) {
		ListNode<E> indexNode = root;
		E val = null;
		if (size <= index) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		size--;
		
		if (size == 1 && index == 0) {
			clear();
		} else if (index == 0) {
			val = root.getValue();
			root = root.getNext();
		} else if (index == size) {
			val = end.getValue();
			end = end.getPrev();
		} else {
			
			for (int i = 0; i < index; i++) {
				indexNode = indexNode.getNext();
			}

			val = indexNode.getValue();
			
			indexNode.getPrev().setNext(indexNode.getNext());
			indexNode.getNext().setPrev(indexNode.getPrev());
			
		}
	
		return val;
		
	}

	public void add(int index, E value) {

		ListNode<E> temp = new ListNode<E>(value);

		size++;

		if (size == 1) {
			root = temp;
			end = root;
		} else if (size < index) {
			throw new ArrayIndexOutOfBoundsException();
		} else if (index == 0) {
			if (size > 0) {
				root.setPrev(temp);
				temp.setNext(root);
				root = temp;
			} else {
				push(value);
			}
		}

		else if (index == size - 1) {
			end.setNext(temp);
			temp.setPrev(end);
			end = temp;
		} else {
			ListNode<E> indexNode = root;
			for (int i = 0; i < index; i++) {
				indexNode = indexNode.getNext();
			}

			temp.setPrev(indexNode.getPrev());
			indexNode.getPrev().setNext(temp);
			indexNode.setPrev(temp);
			temp.setNext(indexNode);

		}
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		if (size > 0)
			return false;
		else
			return true;
	}

	public void clear() {
		root = null;
		end = null;
		size = 0;
	}

	public void push(E value) {
		add(value);
	}

	public E queuePeek() {
		return root.getValue();
	}

	public E stackPeek() {
		return end.getValue();
	}

	public String toString() {

		if (size == 0) {
			return "[]";
		}

		String res = "";
		ListNode<E> indexNode = root;
		res += "[";
		if (size > 1)
			res += indexNode.getValue() + ", ";
		else {
			res += indexNode.getValue();
		}

		for (int i = 0; i < size - 1; i++) {
			if (i < size - 2) {
				res += indexNode.getNext().getValue() + ", ";
			} else {
				res += indexNode.getNext().getValue();
			}

			indexNode = indexNode.getNext();
		}
		res += "]";
		return res;
	}

	public class ListNode<E> {

		ListNode<E> next;
		ListNode<E> prev;
		E value;

		public ListNode(E value) {
			this.value = value;
			next = null;
			prev = null;
		}

		public E getValue() {
			return value;
		}

		public void setValue(E value) {
			this.value = value;
		}
		
		public ListNode<E> getNext() {
			return next;
		}

		public ListNode<E> getPrev() {
			return prev;
		}

		public void setPrev(ListNode<E> prev) {
			this.prev = prev;
		}

		public void setNext(ListNode<E> next) {
			this.next = next;
		}

	}

}
