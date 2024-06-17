package LinkedList;

public class UndoRedoManager <T> {

    private class Node {
        private T state; // value
        private Node next;
        private Node prev;

        private Node (T state) {
            this.state = state;
        }

    }

//    private Node currentState;
//        public T undo() {
//        if (currentState == null) {
//            System.out.println("No state to return");
//            return null;
//        }
//
//        Node previousState = currentState.prev;
//        if(previousState == null) {
//            System.out.println("Reached the initial state.");
//            return null;
//        }
//
//
//    }

    public static void main(String[] args) {

    }


}



