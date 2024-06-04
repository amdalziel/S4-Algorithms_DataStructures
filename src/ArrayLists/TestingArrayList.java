package ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestingArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> testNum = new ArrayList<>(5);



        System.out.println(testNum);
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30));

        numbers.add(40);
        numbers.add(50);

        System.out.println(numbers);
        System.out.println(testNum);

        for(int i = 0; i < numbers.size(); i++) {
            int element = numbers.get(i);
            System.out.println(element);
        }

        System.out.println();

        for(int item : numbers) {
            System.out.println(item);
        }

        System.out.println();

        numbers.stream().forEach(num -> {
            System.out.println(num);
        });

        System.out.println();

        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            int element = it.next() + 100;
            System.out.println(element);
        }

        System.out.println(numbers.contains("pizza"));


    }

}
