package FFHS;

/**
* use Stack and Queue to check whether a String is a palindrome
*
 *  "dad"
 *          stack: push(d), push(a), push(d) : d, a, d
 *          queue: add(d), add(a), add(d) : d, a, d
 *
 *          the key here is:
 *          when we pop items from the stack, we pop them with reverse order, because it's LIFO,
 *          while queue is FIFO.
 *          So when we compare the 2 pops, we compare the reverse with the original String.
 *
* */

import java.util.LinkedList;

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
        LinkedList<Character> queue = new LinkedList<Character>();
        String lowerCase = string.toLowerCase();

        for (int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                queue.addLast(c);
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.removeFirst())) {
                return false;
            }
        }

        return true;
    }
}
