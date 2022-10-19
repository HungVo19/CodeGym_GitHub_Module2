package advanced_linked_list;

import simple_linked_list.simpleLinkedList;

public class Test {
    public static void main(String[] args) {
        AdvancedLinkedList<Integer> ll = new AdvancedLinkedList<>();
        ll.add(10);
        ll.addFirst(11);
        ll.addLast(9);
        ll.add(8);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.printList();
        System.out.println("--------------");
        System.out.println(ll.contains(8));
        ll.removeObject(8);
        ll.printList();
        System.out.println("--------------");
        System.out.println(ll.contains(8));
        System.out.println("--------------");
        System.out.println(ll.indexOf(13));
        System.out.println(ll.indexOf(12));
        System.out.println(ll.indexOf(11));
        System.out.println(ll.indexOf(10));
        System.out.println(ll.indexOf(9));
        ll.printList();
        System.out.println("--------------");
        ll.clear();
        ll.add(0,11);
        ll.printList();
//        ll.add(0, 1000);
//        ll.printList();
//        System.out.println("--------------");
//        ll.add(1, 999);
////        ll.add(4,8);
//        ll.printList();
//        System.out.println("--------------");
//        ll.add(7, 777);
//        ll.printList();
//        System.out.println("--------------");
//        ll.add(0, 1111);
//        ll.printList();
//        System.out.println("--------------");
//        ll.addFirst(2222);
//        ll.addLast(333333);
//        ll.printList();
//        System.out.println("--------------");
//        ll.remove(0);
//        ll.printList();
//        System.out.println("--------------");


    }
}
