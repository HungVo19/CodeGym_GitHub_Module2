package advanced_array_list;

public class MyList <E>{
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList(){

    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }
}
