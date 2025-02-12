package pertemuan2;

public class NodeMain {
	public static void main(String[] args) {
		
		//membuat 5 buah node 
		Node n1 = new Node(5);
		Node n2 = new Node(7);
		Node n3 = new Node(9);
		Node n4 = new Node(8);
		Node n5 = new Node(2);
		Node n6 = new Node(3);
		
		//membuat relasi node  n1 dengan node n2
		n1.setNext(n2 );
		
		//membuat relasi node n2 dengan node n3
		n2.setNext(n3);
		
		//membuat relasi node n3 dengan node n4
		n3.setNext(n4);
		
		//membuat relasi node n4 dengan node n5
		n4.setNext(n5);
		
		//membuat relasi node n5 dengan node n6
		n5.setNext(n6);
		
		//membuat relasi node n6 dengan node n1
		n1.setNext(n1);
		
		//menampilkan Node dengan pointer p
		Node p = n1;
		while (p != null)
		{
			System.out.printf("%d ",p.getNilai());
			p = p.getNext();
		}
		//menampilkan node yang akan berhenti di node ke n4
		System.out.println();
		while (p != n4) 
		{
			System.out.printf("%d ",p.getNilai());
			p = p.getNext();
		}
	}
}