package pertemuan2;

public class NodeMain {
	public static void main(String[] args) {
		
		//Membuat 2 Buah Node n1 & n2
		Node n1 = new Node(5);
		Node n2 = new Node(7);
		
		//Menambahkan 2 Buah Node n3 & n4		
		Node n3 = new Node(9);
		Node n4 = new Node(8);
		
		//Menambahkan 2 Buah Node n5 & n6
		Node n5 = new Node(2);
		Node n6 = new Node(3);
		
		//Membuat relasi untuk node n1 dan n2
		n1.setNext(n2);
		
		//Membuat relasi untuk node n2 dan n3
		n2.setNext(n3);
		
		//Membuat relasi untuk node n3 dan n4
		n3.setNext(n4);
		
		//Membuat relasi untuk node n5 dan n6
		n5.setNext(n6);
		
		//Membuat relasi untuk node n6 dan n
		n6.setNext(n1);
		
		//Menampilkan Node dengan pointer p dan p1
		Node p = n1;
		Node p1 = n5;
		while(p != null)
		{
			System.out.printf("%d ", p.getNilai());
			p = p.getNext();
		}
		System.out.println("");
		while(p1 != n4)
		{
			System.out.printf("%d ", p1.getNilai());
			p1 = p1.getNext();
		}
	}
	
}