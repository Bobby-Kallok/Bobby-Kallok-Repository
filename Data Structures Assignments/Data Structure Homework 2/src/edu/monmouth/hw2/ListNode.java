package edu.monmouth.hw2;

import edu.monmouth.book.Book;

public class ListNode {

  private Node head;
  private int size = 0;

  public ListNode() {
    head = null;
  }
  
  public Node removeFirst() {
	  if (head != null) { //avoids null pointer exception
	  head = head.getNext();
	  size --;}
	return null;
  }
  
  
  public Node first() {
	return head;
  }
  
  public Node last() {
	  if (head == null) {// Avoids null pointer exception
		  return null;}
	  else {
	  }
	  Node temp = head;
	   while (temp.getNext() != null) {
		   temp = temp.getNext();
	   }
	return temp;
  }


  public void insert(Book element) {
    Node newNode = new Node(element);
    newNode.setNext(head);
    head = newNode;
    size ++;
  }

  public void insertEnd(Book element) {
	  Node temp = head;
	   while (temp.getNext() != null) {
		   temp = temp.getNext();
	   }
	   Node newNode = new Node(element);
	   newNode.setNext(null);
	   temp.setNext(newNode);
	  size ++;
	return; 
}

 public boolean isEmpty() { 
	Boolean state;
	if (size > 0) {
		state = true;
	}else {
		state = false;
	}
	return state;              
  }
  
  public int size() {
    return size;
  }
    
  public void clear() {
    head = null;
    size = 0;
  }

@Override
  public String toString() {
	StringBuilder logString = new StringBuilder();
    Node node;
    node = head;
    int count = 0;
    
    while (node != null) {
      count++;
      logString.append(count + " . " + node.getInfo() + "\n");
      node = node.getNext();
    }
    return logString.toString();
  }
}
