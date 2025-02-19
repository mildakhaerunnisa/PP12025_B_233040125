package pertemuan3;

public class ListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        
        //Test 1
        list.addTail(3);
        list.addTail(2);
        list.addTail(1);
        System.out.println("Elemen :");
        list.displayElement();
        
        //Test 1
        StrukturList list2 = new StrukturList();
        list2.addTail(1);
        list2.addTail(4);
        list2.addTail(5);
        list2.addTail(7);
        System.out.println("\nElemen :");
        list2.displayElement();

        //Test 2
        StrukturList list3 = new StrukturList();
        list3.addHead(5);
        list3.addHead(4);
        list3.addHead(3);
        System.out.println("\nElemen :");
        list3.displayElement();

        //Test 3	
        StrukturList list4 = new StrukturList();
        list4.addHead(1);
        list4.addHead(2);
        list4.addHead(3);
        System.out.println("\nElemen :");
        list4.displayElement();
        
        //Test 3
        StrukturList list5 = new StrukturList();
        list5.addTail(7);
        list5.addTail(5);
        list5.addTail(4);
        list5.addTail(1);
        System.out.println("\nElemen :");
        list2.displayElement();

    }
}

