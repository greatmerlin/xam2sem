package FFHS;

import java.util.LinkedList;

// idea: reverse the string and if it's the same, it's a palindrome.

public class Main {

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {

        LinkedList<Character> stack = new LinkedList<Character>();
        StringBuilder stringNoPunctuation = new StringBuilder(string.length());
        String lowerCase = string.toLowerCase();

        for (int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                stringNoPunctuation.append(c);
                stack.push(c);                      // a push b push c push  ---->    c->b->a           cba
            }
        }

        StringBuilder reversedString = new StringBuilder(stack.size());
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());         // using the pop() Method, i actually reverse the string.  --->          a<-b<-c  ---> abc
        }

        return reversedString.toString().equals(stringNoPunctuation.toString());
    }
}
