package ru.ssau;

public class LinkedListToStackAdapter extends LinkedList implements Stack {
    @Override
    public void push(Object element) {
        addToFront(element);
    }

    @Override
    public Object pop() {
        return removeFromFront();
    }
}
