package LinkedList;

public class Main {
    public static void main(String[] args) {
//        SingleLinkedList singleLinkedList = new SingleLinkedList();
//        singleLinkedList.insertInLinkedList(1, 0);
//        singleLinkedList.insertInLinkedList(2, 1);
////        singleLinkedList.insertInLinkedList(3, 2);
////        singleLinkedList.insertInLinkedList(4, 3);
////        singleLinkedList.insertInLinkedList(100, 3);
//        singleLinkedList.traverseLinkedList();
//
//        singleLinkedList.deleteFromLinkedList(0);
//        singleLinkedList.traverseLinkedList();

        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.insertDLL(10, 0);
        doubleLinkedList.insertDLL(20, 1);
        doubleLinkedList.insertDLL(30, 2);
        doubleLinkedList.insertDLL(10, 3);

        doubleLinkedList.traverseDLL();
        doubleLinkedList.reverseTraverseDLL();

        doubleLinkedList.searchForValueDLL(10);
        doubleLinkedList.searchForValueDLL(40);

     doubleLinkedList.deleteOneElementFromDLL(10);

        doubleLinkedList.traverseDLL();



    }
}


//Assignment question number
//1. Uncomment line 10 "singleLinkedList.insertInLinkedList(5, 1)" and Investigate and fix
// why when inserting a value at a position that is already occupied, it throws a null pointer exception.
