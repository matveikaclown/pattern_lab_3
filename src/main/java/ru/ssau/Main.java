package ru.ssau;

public class Main {
    public static void main(String[] args) {
        LinkedListToStackAdapter stack = new LinkedListToStackAdapter();
        stack.push("ЭЛЕМЕНТ 1");
        stack.push("ЭЛЕМЕНТ 2");
        stack.push("ЭЛЕМЕНТ 3");
        try {
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

