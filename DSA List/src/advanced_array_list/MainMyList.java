package advanced_array_list;

public class MainMyList {
    public static void main(String[] args) {
        MyList<Integer> myLists = new MyList<>(5);
        myLists.add(1);
        myLists.add(2);
        myLists.add(3);
        myLists.add(4);
        myLists.add(5);
        myLists.add(6);
        display(myLists);
        myLists.add(2, 100);
        display(myLists);
        myLists.remove(4);
        myLists.add(1);
        display(myLists);
        System.out.println(myLists.size());
        System.out.println(myLists.get(2));
        System.out.println(myLists.indexOf(5));
        System.out.println(myLists.contains(6));
        System.out.println(myLists.contains(60));

    }

    public static void display(MyList<Integer> myList) {
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.getElements()[i] + ", ");
        }
        System.out.println();
    }

}
