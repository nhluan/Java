import java.util.Scanner;

public class Exercise12 {

    public static  void main (String[]str) {
        //x ^ n

        Scanner myInput = new Scanner(System.in);
        System.out.print("Enter number x: ");
        int x = myInput.nextInt();
        System.out.print("Enter number n: ");
        int n = myInput.nextInt();
        //handle

        if (n == 0) {
            System.out.print("Error");
        }
        else {
            long result = 0;

            for (int i = 1; i <= n; i++) {
                long temp = 1;
                for (int j = 1; j <= i; j++) {
                    temp = temp * x;
                }
                result = result + temp;
            }

            System.out.print("Result: " + result);
        }

    }

}
