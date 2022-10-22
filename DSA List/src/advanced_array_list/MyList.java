package advanced_array_list;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        if(size == elements.length) {
            ensureCapacity();
        }
        for (int i = index +1; );
    }

    public void ensureCapacity () {
        int newSize = size * 2;
        elements = Arrays.copyOf(elements, newSize);
    }


    public Object[] getElements() {
    }
}

