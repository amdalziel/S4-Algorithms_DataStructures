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

    private Node currentState;

        public T undo() {
        if (currentState == null) {
            System.out.println("No state to return");
            return null;
        }

        Node previousState = currentState.prev;

        if(previousState == null) {
            System.out.println("Reached the initial state.");
            return null;
        } else {
            currentState = previousState;
        }

        return currentState.state;

    }


    public T redo() {

            if (currentState.next == null) {
                System.out.println("No state to redo.");
                return null;
            }

            currentState = currentState.next;
            return currentState.state;

    }



    public void performAction(T newState) {
            Node newNode = new Node(newState);

            newNode.prev = currentState;
            newNode.next = null;

            if (currentState != null) {
                currentState.next = newNode;
            }

            currentState = newNode;

    }

    public static void main(String[] args) {
            UndoRedoManager<String> undoRedoManager = new UndoRedoManager<>();

            undoRedoManager.performAction("Hello");
            undoRedoManager.performAction("Hi");
            undoRedoManager.performAction("Hiya");

        System.out.println("Current State: " + undoRedoManager.currentState.state);

        undoRedoManager.undo();

        System.out.println("Current State: " + undoRedoManager.currentState.state);

        undoRedoManager.redo();

        System.out.println("Current State: " + undoRedoManager.currentState.state);

        UndoRedoManager<Integer> integerUndoRedoManager = new UndoRedoManager<>();

        integerUndoRedoManager.performAction(5);
        integerUndoRedoManager.performAction(4);
        integerUndoRedoManager.performAction(3);
        integerUndoRedoManager.performAction(2);
        integerUndoRedoManager.performAction(1);

        System.out.println("Current State: " + integerUndoRedoManager.currentState.state);

        integerUndoRedoManager.undo();
        integerUndoRedoManager.undo();
        integerUndoRedoManager.undo();

        System.out.println("Current State: " + integerUndoRedoManager.currentState.state);

        integerUndoRedoManager.redo();

        System.out.println("Current State: " + integerUndoRedoManager.currentState.state);

        integerUndoRedoManager.redo();

        System.out.println("Current State: " + integerUndoRedoManager.currentState.state);







    }


}



