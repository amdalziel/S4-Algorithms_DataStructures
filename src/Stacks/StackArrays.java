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
        System.out.println("Stack values: ");
        for (int i = 0; i <= topOfStack; i++) {
            System.out.println(arr[i]);
        }
    }


//    Push method
    public void push(int value) {
        if(isFull()) {
            System.out.println("Stack is full.");
        } else {
            try {
                arr[topOfStack + 1] = value;
                topOfStack++;
                System.out.println("Value is successfully inserted.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


//    Pop method
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            try {
                System.out.println("Top of stack removed.");
                topOfStack--;
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
                System.out.println(arr[topOfStack]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


//    Delete stack
    public void deleteStack() {
        try {
            this.arr = null;
            this.topOfStack = -1;
            System.out.println("Entire stack set to NULL");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


//    IsEmpty method
    public Boolean isEmpty() {
        if (topOfStack == -1) {
            return true;
            } else  {
            return false;
        }
    }


//    isFull method
    public Boolean isFull() {
        if (topOfStack == arr.length - 1) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        StackArrays stackArrays = new StackArrays(3);
        stackArrays.printStack();

        stackArrays.push(1);
        stackArrays.push(2);
        stackArrays.push(3);

        stackArrays.printStack();

        stackArrays.peek();

        stackArrays.pop();

        stackArrays.peek();

        stackArrays.deleteStack();

    }
}

