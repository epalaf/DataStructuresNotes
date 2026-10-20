package src;

public class LinkedList {
	Node HEAD;
	Node TAIL;
	
	public LinkedList() {
		this.HEAD = null; //empty list
		this.TAIL = null; //empty list
	}
	
	public void Show() {
		Node curNode = this.HEAD;
		//Node tail = this.TAIL;
		while(curNode != null) {
			System.out.printf("----%s-----\n", curNode.toString());
			System.out.printf("Value: %d - Next: %h\n", curNode.value, curNode.next);
			curNode=curNode.next;
		}
	}
	
	public void Append(int value) {
		Node newNode = new Node(value);
		Node curNode = this.HEAD; //Temporary Node Pointer
		if (this.HEAD==null) {
			this.HEAD=newNode;
			this.TAIL = newNode;
		}
		else {
			while(curNode.next!=null) {
				curNode = curNode.next;
			}
			curNode.next = newNode;
			this.TAIL = newNode;
		}
		//this.TAIL = newNode;
	}
	public void AppendWithTail(int value) { //Deborah designed this
		Node newNode = new Node(value);
		Node TailNode = this.TAIL;
		
		if (this.TAIL == null) {
			this.TAIL = newNode;
		}
		
		else {
			TailNode.next = newNode;
			this.TAIL = newNode;
		}
	}
	
	public Node Search (int value) { //always return currNode
		Node curNode = this.HEAD;
		
		while(curNode.value != value && curNode.next != null) {
			curNode  = curNode.next;
		}
		
		return curNode;
		
		
	} 
	
	public Node Delete (int value) { 
		Node curNode = this.HEAD;
		Node BackUp = this.HEAD;
		while(curNode.value != value && curNode.next != null) {
			BackUp = curNode;
			curNode  = curNode.next;
		}
		if (curNode.value == this.TAIL.value) {
			this.TAIL = BackUp;
			BackUp.next = null;
		}
		else {
			BackUp.next = curNode.next;
		}
		
		
		
		return curNode;
	} 

	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		Node test = new Node();
		
		list.Append(10);
		//list.Show();
		list.Append(20);
		list.Append(30);
		list.AppendWithTail(40);
		list.Show();
		test = list.Search(40);
		
		System.out.println("Your target Node will be '" + test + "' won't it?");
		test = list.Delete(40);
		System.out.println(test + " Has been deleted");
		list.Show();
		
	}

}


