package Stacks;

import java.util.Stack;

public class CheckForPalindrome {

    private Stack<String> word;

    public CheckForPalindrome(Stack<String> word) {
        this.word = word;
    }



    public Stack<String> getWord() {
        return word;
    }

    public void setWord(Stack<String> word) {
        this.word = word;
    }


    public int findWordMidLength(String word) {
        int lengthOfWord = word.length();
        int wordMidLength = 0;

        Boolean wordIsEven = wordHasEvenNumberOfLetters(lengthOfWord);

        wordMidLength = wordIsEven ? lengthOfWord / 2 : (int) Math.floor(lengthOfWord / 2);

        return wordMidLength;
    }

    public Boolean wordHasEvenNumberOfLetters(int lengthOfWord) {
        return lengthOfWord % 2 == 0 ? true : false;

    }

    public static void main(String[] args) {

        Stack<String> racecar = new Stack<>();
        racecar.push("racecar");

        CheckForPalindrome word1 = new CheckForPalindrome(racecar);



    }




}
