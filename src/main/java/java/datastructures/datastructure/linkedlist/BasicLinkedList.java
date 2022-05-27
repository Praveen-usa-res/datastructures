package java.datastructures.datastructure.linkedlist;

public class BasicLinkedList {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	Node head;
	public void addFirst(int value) {
		if( head == null){
			head = new Node(value);
			return;
		}
		Node current = new Node(value);
		current.next = head;
	}
	
	public void addLast(int value) {
		Node newNode = new Node(value);
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}
	
	public void addKthFromFirst(int value, int pos) {
		if(head == null) return;
		Node current = head;
		int counter = 0;
		while(counter < pos) {
			if(current == null) {
				System.out.println("There are no elemetns");
			}
			current = current.next;
			counter++;
		}
		Node newNode = new Node(value);
		newNode.next = current.next;
		
		current.next = newNode;
	}
	public void addKthFromLast(int value, int pos) {
		Node newNode = new Node(value);
		if(head == null) {
			System.out.println("There are no elements");
			return;
		}
		Node current = head;
		Node pointerNode = null;
	}

}

class Node{
	private int data;
	Node next;
	
	Node(int data){
		this.data = data;
		next = null;
	}
}
