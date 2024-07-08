package Stacks;

import java.util.Stack;

public class PalindromeValidator {

    private String word;
    private Stack<Character> lettersInStack = new Stack<>();

    public PalindromeValidator(String word) {
        this.word = word;

        for (int i = 0; i < word.length(); i++) {
            this.lettersInStack.push(word.charAt(i));
        }
    }


    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Stack<Character> getLettersInStack() {
        return lettersInStack;
    }

    public void setLettersInStack(Stack<Character> lettersInStack) {
        this.lettersInStack = lettersInStack;
    }

    public Boolean checkPalindrome() {
        int wordMidLength = findWordMidLength(this.word);

        for (int i = 0; i < wordMidLength; i++) {
            if (this.lettersInStack.get(i) != this.lettersInStack.getLast()) {
                System.out.println(this.word + " is NOT a palindrome.");
                return false;
            } else {
                lettersInStack.pop();
            }
        }
        System.out.println(this.word + " IS a palindrome.");
        return true;
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

        PalindromeValidator word1 = new PalindromeValidator("music");
        PalindromeValidator word2 = new PalindromeValidator("amy");
        PalindromeValidator word3 = new PalindromeValidator("radar");
        PalindromeValidator word4 = new PalindromeValidator("racecar");

        word1.checkPalindrome();
        word2.checkPalindrome();
        word3.checkPalindrome();
        word4.checkPalindrome();


    }




}
