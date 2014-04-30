package com.java.ds.linkedList;

public class TestDoublyLinkedList<T> {
    private EachNode<T> head;
    private EachNode<T> tail;

    /**
     * @param args
     */
    public static void main(String[] args) {
	TestDoublyLinkedList<String> myMovieList = new TestDoublyLinkedList<String>();
	myMovieList.myAdd("Bazigar");
	myMovieList.myAdd("Darr");
	myMovieList.myAdd("DDLJ");
    }

    private void myAdd(T value) {
	EachNode<T> newNode = new EachNode<T>();
	newNode.setElement(value);
	if (head == null) {

	}
    }
}

class EachNode<T> {
    private T element;
    private EachNode<T> prevRef;
    private EachNode<T> nextRef;

    public T getElement() {
	return element;
    }

    public void setElement(T element) {
	this.element = element;
    }

    public EachNode<T> getPrevRef() {
	return prevRef;
    }

    public void setPrevRef(EachNode<T> prevRef) {
	this.prevRef = prevRef;
    }

    public EachNode<T> getNextRef() {
	return nextRef;
    }

    public void setNextRef(EachNode<T> nextRef) {
	this.nextRef = nextRef;
    }

}
