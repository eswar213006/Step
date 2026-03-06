public // UC4: Character Array Based Palindrome Check

class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        String str = "madam";

        char[] characters = str.toCharArray();

        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is not a Palindrome");
        }
    }
} 
