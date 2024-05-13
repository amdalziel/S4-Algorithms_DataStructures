package Arrays;

import java.util.*;

public class ComputeAverageTemp {

    public static int collectNumberTempFromUser() {

        int numTempEntered = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many values of temperature (celsius) will you enter: ");

        try{
            numTempEntered = Integer.parseInt(scanner.nextLine());

        } catch(Exception e) {
            e.printStackTrace();
        }

        return numTempEntered;
    }

    public static float[] collectAllTempFromUser(int numTemp) {

        Scanner scanner = new Scanner(System.in);

        float tempArray[] = new float[numTemp];

        try {
            for(int i = 0; i < numTemp; i++ )
            {
                System.out.println("Enter a temperature: ");
                float nextUserTemp = Float.parseFloat(scanner.nextLine());
                tempArray[i] = nextUserTemp;
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        return tempArray;

    }

    public static float calculateAverageTemp(float[] tempArray) {

        float totalTemp = 0;
        int numTemp = tempArray.length;
        float avgTemp = 0;

        try{
            for(int i = 0; i < numTemp; i++)
            {
                totalTemp += tempArray[i];
            }
            avgTemp = totalTemp / numTemp;
        } catch(Exception e)
        {
            e.printStackTrace();
        }

        return avgTemp;

    }

    public static void calculateNumValuesAboveAverageTemp(float[] tempArray, float avgTemp){

        int numTempAboveAvg = 0;

        try {
            for(int i = 0; i < tempArray.length; i++)
            {
                if(tempArray[i] > avgTemp)
                {
                    numTempAboveAvg ++;
                }
            }

            System.out.println("The average temperature is " + avgTemp);

            if(numTempAboveAvg == 0)
            {
                System.out.println("There are no values above the average temperature.");
            } else {
                System.out.println("There are " + numTempAboveAvg + " value(s) above the average temperature");
            }

        } catch(Exception e)
        {
            e.printStackTrace();
        }


    }


    public static void main(String args[]) {

        int numTemp = collectNumberTempFromUser();

        float[] tempArray = collectAllTempFromUser(numTemp);

        float avgTemp = calculateAverageTemp(tempArray);

        calculateNumValuesAboveAverageTemp(tempArray, avgTemp);

    }


}
