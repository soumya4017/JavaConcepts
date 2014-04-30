package com.java.ds.linkedList;

public class TestSinglyLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;

    public static void main(String[] args) {
	TestSinglyLinkedList<String> myMovieList = new TestSinglyLinkedList<String>();
	myMovieList.add("Housefull");
	myMovieList.add("titanic");
	myMovieList.add("thor");

	System.out.println("The elements in this linked list are :");
	myMovieList.traverse();

	myMovieList.addFirst("12 angry men");

	System.out.println("The elements in this linked list are :");
	myMovieList.traverse();

	myMovieList.addAfter("titanic", "jurassic park");
	System.out.println("The elements in this linked list are :");
	myMovieList.traverse();

	System.out.println("deleting the last element from the list");
	myMovieList.remove();
	System.out.println("The elements in this linked list are :");
	myMovieList.traverse();

	System.out.println("deleting the first element from the list");
	myMovieList.removeFirst();
	System.out.println("The elements in this linked list are :");
	myMovieList.traverse();

	System.out.println("deleting element after jurassic park");
	myMovieList.removeAfter("jurassic park");
	System.out.println("The elements in this linked list are :");
	myMovieList.traverse();
    }

    /**
     * @param <T>
     * @param args
     * 
     *            Adding at the end of the list
     */
    private void add(T value) {
	Node<T> newNode = new Node<T>();
	newNode.setValue(value);
	System.out.println("Adding element at the end of the list :" + value);

	if (head == null) {
	    head = newNode;
	    tail = newNode;
	} else {
	    tail.setNextRef(newNode);
	    tail = newNode;
	}

    }

    /**
     * @param value
     * 
     *            Adding at the beginning of the list
     */
    private void addFirst(T value) {
	Node<T> newNode = new Node<T>();
	newNode.setValue(value);
	System.out.println("Adding to beginning of the list :" + value);

	if (head == null) {
	    head = newNode;
	    tail = newNode;
	} else {
	    newNode.setNextRef(head);
	    head = newNode;
	}
    }

    /**
     * @param referValue
     * @param newValue
     * 
     *            Adding after a particular node in the list
     */
    private void addAfter(T referValue, T newValue) {

	System.out.println("Adding element " + newValue + " after "
		+ referValue);

	Node<T> temp = head;
	Node<T> refNode = null;

	// Search for the node having value referValue

	while (true) {
	    if (temp == null) {
		break;
	    }
	    if (temp.compareTo(referValue) == 0) {
		refNode = temp;
		break;
	    } else {
		temp = temp.getNextRef();
	    }
	}

	// Got the target node, after that node, we have to add the new node
	if (refNode != null) {
	    Node<T> newNode = new Node<T>();
	    newNode.setValue(newValue);
	    newNode.setNextRef(refNode.getNextRef());
	    if (refNode == tail) {
		tail = newNode;
	    }
	    refNode.setNextRef(newNode);
	} else {
	    System.out.println("not Found");
	}

    }

    /**
     * Removing from the end
     */
    private void remove() {
	if (head == null) {
	    System.out.println("underflow");
	} else {
	    Node<T> temp = head;
	    while (temp.getNextRef() != null) {
		tail = temp;
		temp = temp.getNextRef();
	    }
	    tail.setNextRef(null);
	}

    }

    /**
     * Removing from the beginning
     */
    private void removeFirst() {
	if (head == null) {
	    System.out.println("Empty list, nothing to remove");
	} else {
	    Node<T> temp = head;
	    head = temp.getNextRef();
	    if (head == null) {
		tail = temp;
	    }
	    // temp.setNextRef(null);
	}

    }

    /**
     * @param referValue
     *            Removing the element after a particular element
     */
    private void removeAfter(T referValue) {
	Node<T> temp = head;
	Node<T> targetNode = null;
	// Search for the node
	while (true) {
	    if (temp.compareTo(referValue) == 0) {
		targetNode = temp;
		break;
	    } else {
		temp = temp.getNextRef();
	    }
	}

	// Got the target node
	if (targetNode != null) {
	    temp = targetNode.getNextRef();
	    if (temp == null) {
		tail = targetNode;
		System.out
			.println("The element sent is the last element of the list. So nothing to delete");
	    } else {
		targetNode.setNextRef(temp.getNextRef());
	    }
	}
    }

    /**
     * Traversing the linked list for addAfter(T element, T newElement),
     * removeAfter(T element) and removeAfter(T element)
     */
    private void traverse() {
	Node<T> temp = head;
	while (true) {
	    if (temp == null) {
		break;
	    } else {
		System.out.println(temp.getValue());
		temp = temp.getNextRef();
	    }
	}
    }

}

class Node<T> implements Comparable<T> {
    private T value;
    private Node<T> nextRef;

    public T getValue() {
	return value;
    }

    public void setValue(T value) {
	this.value = value;
    }

    public Node<T> getNextRef() {
	return nextRef;
    }

    public void setNextRef(Node<T> nextRef) {
	this.nextRef = nextRef;
    }

    @Override
    public int compareTo(T o) {
	if (this.getValue().equals(o)) {
	    return 0;
	} else {
	    return 1;
	}

    }

}
