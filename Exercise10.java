import java.util.Scanner;

public class Exercise10 {

    public static  void main (String[]str) {
        //x ^ n

        Scanner myInput = new Scanner(System.in);
        System.out.print("Enter number x: ");
        int x = myInput.nextInt();
        System.out.print("Enter number n: ");
        int n = myInput.nextInt();
        //handle

        if (n == 0) {
            System.out.print("Result: 1");
        }
        else {
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result = result * x;
            }

            System.out.print("Result: " + result);
        }

    }

}
