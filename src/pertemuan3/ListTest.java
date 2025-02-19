package pertemuan3;

public class ListTest {
    public static void main(String[] args) {
    	
    	//Test-1
        StrukturList list = new StrukturList();
        System.out.println("Elemen :");
        list.addTail(3);
        list.addTail(2);
        list.addTail(1);
        list.displayElement();
        System.out.println();

        //Test-1
        StrukturList list2 = new StrukturList();
        System.out.println("\nElemen :");
        list2.addTail(1);
        list2.addTail(4);
        list2.addTail(5);
        list2.addTail(7);
        list2.displayElement();
        System.out.println();

        //Test-3
        StrukturList list3 = new StrukturList();
        System.out.println("\nElemen :");
        list3.addHead(5);
        list3.addHead(4);
        list3.addHead(3);
        list3.displayElement();
        System.out.println();

        //Test-3
        StrukturList list4 = new StrukturList();
        System.out.println("\nElemen :");
        list4.addHead(7);
        list4.addHead(5);
        list4.addHead(4);
        list4.addHead(1);
        list4.displayElement();
    }
}
