package Stacks;

public class StackArrays {

    int [] arr;
    int topOfStack;

    public StackArrays(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The stack is created with a size of " + size);
    }


//    Homework:
//    Pop method
//    Peek method
//    Use the stack data structure to check whether the word is a palindrome or not
//    Implement a stacked data structure with linked list instead of arrays.



//    Push method
    public void push(int value) {
        if(isFull()) {
            System.out.println("Stack is full.");
        } else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("Value is successfully inserted.");
        }

    }


//    IsEmpty method
    public Boolean isEmpty() {
        if (topOfStack == -1) {
            System.out.println("Stack is empty.");
            return true;
            } else  {
            System.out.println("Stack is not empty.");
            return false;
        }
    }


//    isFull
    public Boolean isFull() {
        if (topOfStack == arr.length - 1) {
            System.out.println("Stack is full.");
            return true;
        } else {
            System.out.println("Stack is not full.");
            return false;
        }
    }


    public static void main(String[] args) {
        StackArrays stackArrays = new StackArrays(3);
    }
}

