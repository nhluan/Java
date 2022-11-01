import java.util.Scanner;

public class Exercise13 {

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
                    temp = temp * ( x * x);
                }
                result = result + temp;

                /*
                x = 3
                n = 3

                //result = 0
                i = 1
                    + temp = 1
                    + 1 = 1 * (3 * 3) => temp = 9
                 i = 2
                    + temp = 1
                     + 1 = 1 * (3 * 3) => temp = 9
                     + j = 2
                     + temp = 9 * 9 => 81
                  i = 3
                    + temp = 1
                    + result = 81 + 9 = 90
                    + for j
                        j = 1 => temp = 1 => temp = 9
                        j = 2 => temp = 9 => temp = 9 * 9 => temp = 81
                        j = 3 => temp = 81 => temp = 81 * 9 => 729
                     result = 90 + 729 = 819
                  */
            }

            System.out.print("Result: " + result);
        }

    }

}
