package Recursion;

public class FactorialComputation {


    public int factorial(int n) {

//        second step
        if (n < 1) {
            return -1;
        }

//        third step
        if (n == 1) {
            return 1;
        }

//        first step
        return n * factorial(n-1);
    }

    public static void main(String[] args) {

        FactorialComputation factorialComputation = new FactorialComputation();
        int result = factorialComputation.factorial(7);
        System.out.println(result);
    }
}
