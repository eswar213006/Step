public

class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        
        String str = "level";

       
        String reverse = "";

        
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        
        if (str.equals(reverse)) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is not a Palindrome");
        }
    }
} 
    

