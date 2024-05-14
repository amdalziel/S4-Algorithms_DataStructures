package Arrays;

import java.util.Arrays;

public class TwoDimensionArray {
    int arr[][] = null;

    public TwoDimensionArray(int numOfRows, int numOfCol) {
        this.arr = new int[numOfRows][numOfCol];
        for (int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[0].length; col++){
            arr[row][col] = Integer.MIN_VALUE;
            }
        }

    }

    public void insert(int rowLocation, int colLocation, int valueToInsert){
        try{
            if(arr[rowLocation][colLocation] == Integer.MIN_VALUE) {
                arr[rowLocation][colLocation] = valueToInsert;
                System.out.println("The value " + valueToInsert + " has been successfully inserted.");
            } else {
                System.out.println("This cell is already occupied.");
            }

        } catch(Exception e){
            e.printStackTrace();
        }

    }

    public void traverse()
    {
        try{
            for (int row = 0; row < arr.length; row++) {
                for(int col = 0; col < arr[0].length; col++){
                    System.out.println(arr[row][col]);
                }
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }


    public boolean searchForElement(int value)
    {
        boolean elementFound = false;

        try {
            for (int row = 0; row < arr.length; row++) {
                for(int col = 0; col < arr[0].length; col++){
                    if(arr[row][col] == value){
                        elementFound = true;
                        System.out.println("Value " + value + " found at index [" + row + "], [" + col + "]" );
                    } else {
                        System.out.println("Value not found in the array.");
                    }
                    }
                }
        } catch(Exception e) {
            e.printStackTrace();

        }
        return elementFound;
    }


    public void deleteByIndex(int rowLocation, int colLocation) {
        try {
            arr[rowLocation][colLocation] = Integer.MIN_VALUE;
            System.out.println("Value at index [" + rowLocation + "], [" + colLocation + "] has been deleted.");

        } catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        TwoDimensionArray twoDimensionArray = new TwoDimensionArray(5, 5);
        twoDimensionArray.traverse();



    }

}
