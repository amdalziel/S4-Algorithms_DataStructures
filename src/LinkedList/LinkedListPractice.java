package LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPractice {

    public static void main(String[] args) {

        LinkedList<Integer> linkedLst = new LinkedList<>();

        linkedLst.add(2);
        linkedLst.add(5);
        linkedLst.add(9);


        linkedLst.add(2, 10);

        System.out.println(linkedLst);

        System.out.println(linkedLst.contains(10));
        System.out.println(linkedLst.get(0));
        System.out.println(linkedLst);
        System.out.println(linkedLst.element());
        System.out.println(linkedLst.offerLast(100));
        System.out.println(linkedLst);
        Iterator<Integer> descendingLL = linkedLst.descendingIterator();

        while(descendingLL.hasNext()) {
            System.out.println(descendingLL.next());
        }

      Object linkedList2 = linkedLst.clone();
        System.out.println("Cloned:" + linkedList2);

        System.out.println(linkedList2.hashCode());



        for (String arg : args) {
            System.out.println(arg);
            System.out.println(arg.hashCode());

        }

    }






}
