package advanced_array_list;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public int size() {
        return this.size;
    }

    public Object[] getElements() {
        return elements;
    }

    public void ensureCapacity(int minCapacity) {
        if (elements.length == size) {
            Object[] newElements;
            newElements = Arrays.copyOf(elements, minCapacity);
            elements = newElements;
        }
    }

    public void add(E element) {
        Object[] newElements = new Object[size + 1];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }
        newElements[size] = element;
        elements = newElements;
        size++;
    }

    public void add(int index, E element) {
        Object[] newElements = new Object[size + 1];
        if (index < 0 || index >= size) {
            System.out.println("Index is out of bound!");
        } else {
            for (int i = 0; i < index; i++) {
                newElements[i] = elements[i];
            }

            newElements[index] = element;

            for (int i = index + 1; i < newElements.length; i++) {
                newElements[i] = elements[i - 1];
            }
            size++;
            elements = newElements;
        }
    }

    public E remove(int index) {
        Object[] newElements = new Object[size - 1];
        E temp = null;
        if (index < 0 || index >= size) {
            System.out.println("Index is out of bound!");
        } else {
            temp = (E) elements[index];
            for (int i = 0; i < index; i++) {
                newElements[i] = elements[i];
            }
            for (int i = index + 1; i < size; i++) {
                newElements[i - 1] = elements[i];
            }
            elements = newElements;
            size--;
        }
        return temp;
    }

    public boolean contains(E element) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == element) {
                return true;
            }
        }
        return false;
    }

    public E get(int i) {
        if(i < 0 || i >= size) {
            System.out.println("Index is out of bound!");
        }
        return (E) elements[i];
    }

    public int indexOf (E element) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == element) {
                return i;
            }
        }
        return  -1;
    }

    public void clear() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public E clone() {
       Object[] newElements = Arrays.copyOf(elements,size);
       return (E) newElements;
    }
}