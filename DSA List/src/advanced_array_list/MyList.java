package advanced_array_list;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public void add(int index, E element) {
        ensureCapacity();
        for (int i = index +1; i < elements.length; i++) {
            elements[i] = elements[i-1];
        }
        elements[index] = element;
    }

    public E remove(int index) {
        E element = null;
        if (index > 0 && index < elements.length) {
            element = (E) elements[index];
            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
        }
        size--;
        return element;
    }

    public int size() {
        return this.size;
    }

    public E clone() {
        Object[] newElements = new Object[size];
        newElements = Arrays.copyOf(elements, size);
        return (E) newElements;
    }

    public boolean contains(E element) {
        for (Object o : elements) {
            if (o.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E element) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E element) {
        ensureCapacity();
        elements[size] = element;
        size++;
        return true;
    }

    public void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public E get(int index) {
        E element = null;
        if (index > 0 && index < elements.length) {
            element = (E) elements[index];
        }
        return element;
    }

    public void clear() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }
}

