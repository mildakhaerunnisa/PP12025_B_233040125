package pertemuan3;

public class Node {
	
	private int data;
	private Node Next;
	
	//inisialisasi Node
	public Node(int data) {
		this.data = data;
	}
	
	public void setData (int data) {
		this.data=data;
	}
	
	public int getData() {
		return data;
	}
	
	public void setNext (Node Next) {
		this.Next = Next;
	}
	
	public Node getNext() {
		return Next;
	}
	
}
