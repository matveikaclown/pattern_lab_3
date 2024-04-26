package ru.ssau;

public class LinkedList {
    private Node head;

    public void addToFront(Object element) {
        head = new Node(element, head);
    }

    public Object removeFromFront() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        Object element = head.data;
        head = head.next;
        return element;
    }

    public void addToEnd(Object element) {
        if (isEmpty()) {
            addToFront(element);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(element, null);
    }

    public Object removeFromEnd() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        if (head.next == null) {
            return removeFromFront();
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        Object element = current.next.data;
        current.next = null;
        return element;
    }

    public boolean isEmpty() {
        return head == null;
    }

    private static class Node {
        Object data;
        Node next;

        Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
