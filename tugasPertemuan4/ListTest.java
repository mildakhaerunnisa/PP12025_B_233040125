package tugasPertemuan4;

public class ListTest {
	public static void main(String[] args) {
	 
		StrukturList list = new StrukturList();
        list.addHead(2.1);
        list.addMid(3.4, 2);
        list.addTail(4.5);
        System.out.println("Elemen :");
        list.displayElement();

        StrukturList listB = new StrukturList();
        listB.addHead(3.4);
        listB.addMid(2.1, 2);
        listB.addMid(1.1, 3);
        listB.addTail(4.5);
        listB.addTail(5.5);
        System.out.println("\nElemen :");
        listB.displayElement();
	}
}
