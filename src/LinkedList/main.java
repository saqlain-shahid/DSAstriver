package LinkedList;

public class main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(51);
        list.insertFirst(52);
        list.insertFirst(53);
        list.insertFirst(54);
        list.insertFirst(55);
        list.insertFirst(56);
        list.insertLast(100);
        list.insertFirst(101);
        list.insert(3,3);
        list.deleteFirst();
        System.out.println(list.deleteLast());
        list.deleteLast();
        list.display();
        list.delete(4);
        list.display();
        list.insertRec(69,0);
        list.display();

//        DLL li = new DLL();
//        li.insertFirst(4);
//        li.insertFirst(45);
//        li.insertFirst(48);
//        li.insertFirst(49);
//        li.insertFirst(494);
//        li.insertLast(477);
//        li.insert(48,55);
//        li.display();


//        CLL li = new CLL();
//        li.insert(45);
//        li.insert(42);
//       li.delete(45);
//        li.display();

    }
}
