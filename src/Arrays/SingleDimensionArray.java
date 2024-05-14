package Arrays;

import java.util.Arrays;

public class SingleDimensionArray {

    int arr[] = null;

    public SingleDimensionArray(int sizeOfArray)
    {
        arr = new int[sizeOfArray];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int valueToInsert) {
        try {
            if(arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToInsert;
                System.out.println("Successfully inserted");
            } else {
                System.out.println("Location is not available.");
            }

        } catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

    }

    public void traverse()
    {
        try {
            for(int i = 0; i < arr.length; i++)
            {
                System.out.println("Index " + i + ": " + arr[i]);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteArray()
    {
        try {
            arr = null;
            System.out.println("Entire array set to null.");
        } catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void deleteByIndex(int location)
    {
        try {
            arr[location] = Integer.MIN_VALUE;
            System.out.println("Value " + location + " has been returned to MIN_VALUE." );
        } catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public boolean searchForElement(int element) {
        boolean elementFound = false;

        try{
            for(int i = 0; i < arr.length; i++)
            {
                if(arr[i] == element)
                {
                    elementFound = true;
                    System.out.println("Element " + element + " found at index " + i);
                }
            }
            if(!elementFound)
            {
                System.out.println("Element not found.");
            }

        }
        catch(Exception e) {
            e.printStackTrace();
        }

        return elementFound;
    }

    public static void main(String[] args) {

        SingleDimensionArray singleDimensionArray = new SingleDimensionArray(5);

        singleDimensionArray.insert(0, 10);
        singleDimensionArray.insert(1, 5);
        singleDimensionArray.insert(2, 3);
        singleDimensionArray.insert(3, 5);
        singleDimensionArray.insert(4, 15);

        System.out.println(Arrays.toString(singleDimensionArray.arr));

        singleDimensionArray.traverse();

        singleDimensionArray.deleteByIndex(4);
        System.out.println(Arrays.toString(singleDimensionArray.arr));

        singleDimensionArray.searchForElement(5);
        singleDimensionArray.searchForElement(20);

        singleDimensionArray.deleteArray();

        System.out.println(Arrays.toString(singleDimensionArray.arr));

    }
}


