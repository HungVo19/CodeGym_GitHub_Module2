package advanced_linked_list;

public class AdvancedLinkedList<E> {
    private Node head;
    private int numNodes = 0;

    private class Node {
        private Node next;
        private E data;

        public Node(E data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public boolean add(E element) {
        if (head == null) {
            head = new Node(element);
        } else {
            addLast(element);
        }
        return true;
    }

    public void addFirst(E element) {
        Node temp = new Node(element);
        temp.next = head;
        head = temp;
        numNodes++;
    }

    public void addLast(E element) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNodes++;
    }

    public void add(int index, E element) {
        if (index == 0) {
            addFirst(element);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            Node holder = temp.next;
            temp.next = new Node(element);
            temp.next.next = holder;
        }
        numNodes++;
    }

    public void remove(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        numNodes--;
    }

    public void removeObject(E element) {
        if (head.getData() == element) {
            head = head.next;
        } else {
            Node temp = head;
            do {
                if (temp.next.getData() == element) {
                    temp.next = temp.next.next;
                    break;
                } else {
                    temp = temp.next;
                }
            } while (temp.next != null);
        }
        numNodes--;
    }

    public int getNumNodes() {
        return numNodes;
    }

    public boolean contains(E element) {
        Node temp = head;
        while (temp != null) {
            if (temp.getData().equals(element)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E element) {
        if (contains(element)) {
            int indexOf = 0;
            Node temp = head;
            while (temp != null) {
                if (temp.getData().equals(element)){
                    return indexOf;
                }
                indexOf ++;
                temp = temp.next;
            }
        }
        return -1;
    }

    public void clear(){
        head = null;
    }


//    public E clone(){
//
//    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.next;
        }
    }

}
