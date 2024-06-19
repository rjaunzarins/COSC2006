package LinkedLists;

public class LinkedList {

	private class Node {
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data = data;
		}
		
		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
	
	private Node head;
	private Node tail;
	
	/*
	 * No-Arg Constructor
	 */
	public LinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	/*
	 * Arg Constructor
	 * If arg is passed, add to front of list
	 */
	public LinkedList(int data) {
		insertFirst(data);
	}
	
	/*
	 * isEmpty Function
	 * Check to see if there are any Nodes in list
	 */
	public boolean isEmpty() {
		return head == null;
	}
	
	/*
	 * insertFirst Function
	 * Insert node at the beginning of the List
	 */
	public void insertFirst(int data) {
		//Create new node to store data
		Node node = new Node(data);
		//Adding to front of list so .next = current head
		node.next = head;
		//Reassign head to the node we just created
		head = node;
		//If tail is null, then it has not been assigned. Assign to current node
		if(tail == null)
			tail = head;
	}
	
	/*
	 * insertLast Function
	 * Insert node at the end of the List
	 */
	public void insertLast(int data) {
		//If list is empty, use insertFirst() to add -> more efficient
		if(isEmpty()) {
			insertFirst(data);
			return;
		}
		//Loop through List until at current tail	
		Node itr = head;
		while(itr.next != null)
			itr = itr.next;
		//Create new node to add as tail
		Node newNode = new Node(data, null);
		//Point current tail node (itr) to new node
		itr.next = newNode;
		//Assign tail to newNode we just created
		tail = newNode;
	}
	
	/*
	 * insertAt Function
	 * Inserts Node at specified location
	 */
	public void insertAt(int index, int data) {
		//If index doesn't exist, throw exception
		if(index > size())
			throw new IllegalArgumentException("Index greater than size");
		//If index is 0, use insertFirst()
		if(index == 0) {
			insertFirst(data);
			return;
		}
		//If index is last node, use insertLast()
		if(index == size()) {
			insertLast(data);
			return;
		}
		//Loop through to correct location
		Node itr = head;
		for(int i = 1; i < index; ++i) 
			itr = itr.next;
		//Create new node that points to what itr is currently pointing at
		Node newNode = new Node(data, itr.next);
		//Point itr to newNode
		itr.next = newNode;
	}
	
	/*
	 * size Function
	 * Return the number of Nodes in List
	 */
	public int size() {
		int size = 0;
		Node itr = head;
		while(itr.next != null) {
			++size;
			itr = itr.next;
		}
		return size;
	}
	
	/*
	 * removeFirst Function
	 * Remove First Node
	 */
	public void removeFirst() {
		
	}
	
	/*
	 * removeLast Function
	 * Remove Last Node
	 */
	public void removeLast() {
		
	}
	
	/*
	 * removeAt Function
	 * Remove Node at specified location
	 */
	public void removeAt(int index) {
		
	}
	
	/*
	 * toString Function
	 * Returns the contents of the List as a String
	 */
	public String toString() {
		return "";
	}
}
