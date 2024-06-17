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
                System.out.print(tempNode.value);
                if(i != size - 1) {
                    System.out.print(" < - > ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println();
    }



//    Reverse traverse a DLL

    public void reverseTraverseDLL() {
        if (head == null) {
            System.out.println("DLL does not exist.");
        } else {
            DoubleNode tempNode = tail;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" < - > ");
                }
                tempNode = tempNode.prev;
            }
        }
        System.out.println();
    }




//    Search for a node

    public Boolean searchForValueDLL(int value) {
        int valueFoundCount = 0;
        Boolean valueFound = false;

        if (head != null) {
            DoubleNode tempNode = head;
            for (int i = 0; i < size; i++){
                if (tempNode.value == value){
                    System.out.println("Found the node: " + tempNode.value + " at location: " + i );
                    valueFoundCount ++;
                }
                tempNode = tempNode.next;
            }
        }
        if (valueFoundCount >= 1) {
            valueFound = true;
        } else {
            System.out.println("Node not found");
        }
        return valueFound;

    }


//    Delete single element from DLL

    public void deleteOneElementFromDLL(int location) {

        if (head == null) {
            System.out.println("DLL not found.");
            return;
        }

        if (location >= size) {
            System.out.println("Error - not a valid location in the DLL.");
            return;
        }

        if (location == 0) {
            head = head.next;
            head.prev = null;
            size--;
            if (size == 0) {
                tail = null;
                System.out.println("DLL is now empty.");
            }
        } else if (location == size - 1) {
                tail = tail.prev;
                if (tail != null) {
                    tail.next = null;
                }
                size--;
                if (size == 0) {
                    head = null;
                }
            } else {
                DoubleNode tempNode = head;
                for (int i = 0; i < location - 1; i++) {
                    tempNode = tempNode.next;
                }
                tempNode.prev.next = tempNode.next;
                tempNode.next.prev = tempNode.prev;
                size--;
            }

            System.out.println("Node at location " + location + " deleted.");

        }



//    Delete entire DLL

    public void deleteEntireDLL() {
        if (head != null) {
            DoubleNode tempNode = head;
            while (tempNode != null) {
                DoubleNode nextNode = tempNode.next;
                tempNode.prev = null;
                tempNode.next = null;
                tempNode = nextNode;
            }
            head = null;
            tail = null;
            size = 0;
            System.out.println("Entire DLL is null.");

        } else {
            System.out.println("Node not found");
        }

    }


}




