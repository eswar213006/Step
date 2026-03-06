import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class u6

    public static void main(String[] args) {

        String str = "madam";

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
            queue.add(str.charAt(i));
        }

        boolean isPalindrome = true;

        while (!stack.isEmpty()) {
            if (stack.pop() != queue.remove()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is not a Palindrome");
        }
    }
}