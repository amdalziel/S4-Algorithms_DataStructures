package LinkedList;

public class DoubleLinkedList {
    DoubleNode head;
    DoubleNode tail;
    int size;

//    Create a DLL
    public DoubleNode createDLL(int nodeValue) {
        head = new DoubleNode();
        DoubleNode newNode = new DoubleNode();
        newNode.value = nodeValue;
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
    }

//    Insert into DLL
    public void insertDLL(int nodeValue, int location) {
        DoubleNode newNode = new DoubleNode();
        newNode.value = nodeValue;
        if(head == null) {
            createDLL(nodeValue);
            return;
        } else if (location == 0) {
            newNode.next = head;
            newNode.prev = null;
            head.prev = tail;
            head = newNode;
        } else if (location >= size) {
            newNode.next = null;
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else {
            DoubleNode tempNode = head;
            int index = 0;
            while(index < location -1) {
                tempNode = tempNode.next;
                index ++;
            }
            newNode.prev = tempNode;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            newNode.next.prev = newNode;
        }
        size ++;
    }

//    Traverse a DLL

    public void traverseDLL(){
        if(head == null) {
            System.out.println("DLL does not exist.");
        } else {
            DoubleNode tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.println(tempNode.value);
                if(i != size - 1) {
                    System.out.println(" < - > ");
                }
                tempNode = tempNode.next;
            }

        }
        System.out.print("\n");
    }

//    Reverse traverse (start with the tail)
//    Search node
//    Delete method (single element)
//    Delete method (entire DLL) 




}
