package org.indranil.learning.topicwise.DataStructure.LinkedList;

class SLLNode{
	private int data;
	private SLLNode next;
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public SLLNode getNext() {
		return next;
	}
	public void setNext(SLLNode next) {
		this.next = next;
	}
	
	public void displayNode() {
		System.out.println("{"+ data + "}");
	}
}

public class SinglyLinkedList {
	private SLLNode head;
	
	public SinglyLinkedList() {
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	// used to insert at the beginning of the list
	public void insertAtBegin(int data) {
		SLLNode newNode = new SLLNode();
		newNode.setData(data);
		newNode.setNext(head);
		head = newNode;		
	}
	
	public void insertAtEnd(int data) {
		SLLNode current = head;
		while(current.getNext() != null)
			current = current.getNext(); // we'll loop until current's next reference is null
		
		SLLNode newNode = new SLLNode();
		newNode.setData(data);
		current.setNext(newNode);
	}
	
	public SLLNode deleteFromBegin() {
		SLLNode temp = head;
		head = head.getNext();
		return temp;
	}
	
	public void displaySLLList() {
		System.out.println("Singly Linked List (start --> end)");
		SLLNode current = head;
		while(current != null) {
			current.displayNode();
			current = current.getNext();
		}
		System.out.println();
	}	

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.insertAtBegin(100);
		list.insertAtBegin(50);
		list.insertAtBegin(99);
		list.insertAtBegin(88);
		list.insertAtEnd(99999);
		
		list.displaySLLList();
	}	
}
