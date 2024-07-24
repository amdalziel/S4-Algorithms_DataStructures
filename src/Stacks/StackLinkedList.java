package Stacks;

import java.util.LinkedList;

public class StackLinkedList {

    LinkedList<String> linkedList;

    public StackLinkedList() {
        this.linkedList = new LinkedList<>();
        System.out.println("LinkedList stack initialized");
    }


    public LinkedList<String> getLinkedList() {
        return linkedList;
    }

    public void setLinkedList(LinkedList<String> linkedList) {
        this.linkedList = linkedList;
    }


    public void printStack() {
        System.out.println("Stack values: ");
        for (String value : linkedList) {
            System.out.println(value);
        }
    }


    //    Push method
    public void push(String value) {
        try {
            linkedList.push(value);
            System.out.println(value + " added to the stack.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //    Pop method
    public void pop() {
        if (linkedList.isEmpty()) {
            System.out.println("LinkedList is empty.");
        } else {
            try {
                linkedList.pop();
                System.out.println("Top of stack removed.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    //    Peek method
    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            try {
                System.out.println("Top of stack: ");
                System.out.println(linkedList.peek());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    //    Delete stack
    public void deleteStack() {
        try {
            this.linkedList = null;
            System.out.println("Entire stack set to NULL.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //    IsEmpty method
    public Boolean isEmpty() {
        if (linkedList.isEmpty()) {
            System.out.println("Stack is empty.");
            return true;
        } else  {
            return false;
        }
    }



    public static void main(String[] args) {

        StackLinkedList stackLinkedList = new StackLinkedList();
        stackLinkedList.push("Hello");
        stackLinkedList.push("World");
        stackLinkedList.push("!");

        stackLinkedList.printStack();

        stackLinkedList.push(":)");

        stackLinkedList.printStack();

        stackLinkedList.peek();

        stackLinkedList.pop();

        stackLinkedList.printStack();












    }
}
