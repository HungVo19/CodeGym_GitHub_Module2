package implement_Queue_using_LinkedList;

public class Solution {
    private static class Node {
        int data;
        Node link;
    }

    private static class Queue {
        private Node front;
        private Node rear;
    }

    public void enQueue (Queue q,int data) {
        Node newNode = new Node ();
        newNode.data  = data;
        if(q.front == null){
            q.front = newNode;
        } else {
            q.rear = newNode;
            q.rear.link = q.front;
        }
    }

    public int deQueue (Queue q) {
        return q.front.data;
    }

}
