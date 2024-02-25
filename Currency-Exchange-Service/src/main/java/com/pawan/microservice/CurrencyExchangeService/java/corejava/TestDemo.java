package corejava;

public class TestDemo {

    public static void main(String[] args) {

        int num = 23;

        // If number is not Palindrome we go to the next
        // number using while loop
      while (isPalindrome(num) == 0) {
            num = num + 1;
        }

       // isPalindrome(num);

        // now we get the next Palindrome so let's print it
        System.out.print("Next Palindrome :");
        System.out.print(num);

    }


    static int isPalindrome(int num) {

        // Declaring variables
        int n, k, rev = 0;

        // storing num in n so that we can compare it later
        n = num;

        // while num is not 0 we find its reverse and store
        // in rev

       // String s="";
        while (num != 0) {
            k = num % 10;
           rev = (rev * 10) + k;
            //s= s +"" +k;
            num = num / 10;
        }

        // check if num and its reverse are same

        if (n == rev) {
            return 1;
        }
        else{
            return 0;
        }
       /* if (String.valueOf(n).equalsIgnoreCase(s)) {
            System.out.println("Given number is palindrone :: " + n);
            return 1;
        }*/

    }

    }


