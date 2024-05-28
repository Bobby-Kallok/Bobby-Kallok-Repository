package edu.monmouth.hw2;
import edu.monmouth.book.*;

public class Node 
{
  /* change this attribute to store a reference to a Book */
  private Book info;
  private Node next;
  
  /* change this constructor so it accepts a reference to a Book */
  public Node(Book info) {
    this.info = info;
    next = null;
  }
 
  /* change this method so it accepts a reference to  Book */
  public void setInfo(Book info) {
    this.info = info;
  }

  /* change this method so it returns a reference to a Book */
  public Book getInfo() {
    return info;
  }

  public void setNext(Node link) {
    this.next = link;
  }

  public Node getNext() {
    return next;
  }
  
  @Override 
  public String toString() {
	  /* change to invoke Book's toString */
	  return info.toString();
  }
}
