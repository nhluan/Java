import java.util.Scanner;

public class Exercise07 {
    public static void main (String[] str) {
        // n / n + 1
        //  n >= 1
        Scanner myInput = new Scanner(System.in);

        System.out.print("Enter number: ");

        int numberInput = myInput.nextInt();

        //handle
        if (numberInput >= 1) {
            // true
            float result = 0;
            /*
            i = 1
                1/2
            i = 2
                n / n + 1 => 2/3
            i = 3
                n / n + 1 => 3/4
             */
            for (int i = 1; i <= numberInput; i++) {
                result = result + (float) i / (i + 1);
            }

            System.out.print("Result: " + result);
        }
        else {
            System.out.print("Error range!!!");
        }
    }
}
