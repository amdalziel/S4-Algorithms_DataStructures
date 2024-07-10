package Stacks;

public class StackArrays {

    int [] arr;
    int topOfStack;

    public StackArrays(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The stack is created with a size of " + size);
    }


    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getTopOfStack() {
        return topOfStack;
    }

    public void setTopOfStack(int topOfStack) {
        this.topOfStack = topOfStack;
    }

    public void printStack() {
        for (int value : arr) {
            System.out.println(value);
        }
    }



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


//    Pop method
    public void pop() {
        if (isEmpty()) {

        }
    }


//    Peek method
    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println(topOfStack);  // change!
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
        stackArrays.printStack();
        System.out.println(stackArrays.getTopOfStack());

        stackArrays.push(100);
        stackArrays.printStack();
        System.out.println(stackArrays.getTopOfStack());

        stackArrays.push(200);
        stackArrays.printStack();
        System.out.println(stackArrays.getTopOfStack());

    }
}

