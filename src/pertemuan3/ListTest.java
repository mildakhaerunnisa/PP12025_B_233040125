package pertemuan3;

public class ListTest {
	
	public static void main(String[] args) {
	StrukturList list = new StrukturList();
	list.addTail(3);
	list.addTail(2);
	list.addTail(1);
	System.out.println("Elemen :");
	list.displayElement();
	
	StrukturList list2 = new StrukturList();
	list2.addTail(1);
	list2.addTail(4);
	list2.addTail(5);
	list2.addTail(7);
	System.out.println();
	list2.displayElement();
	
	StrukturList list3 = new StrukturList();
	list3.addHead(5);
	list3.addHead(4);
	list3.addHead(3);
	System.out.println();
	list3.displayElement();
	
	StrukturList list4 = new StrukturList();
	list4.addHead(7);
	list4.addHead(5);
	list4.addHead(4);
	list4.addHead(1);
	System.out.println();
	list4.displayElement();
	}
}
