import java.util.Scanner;

public class Exercise08 {

    public static  void main (String[]str) {
        //2n + 1/ 2n + 2
        // n > 5

        Scanner myInput = new Scanner(System.in);

        System.out.print("Enter number: ");

        int numberInput = myInput.nextInt();

        //handle
        if (numberInput > 5) {
            // true
            float result = 0;

            /*
             */

            for (int i = 1; i <= numberInput; i++) {
                result = result + (float) (2 * i + 1) / (2 * i + 2);
            }

            System.out.print("Result: " + result);
        }
        else {
            System.out.print("Error range!!!");
        }
    }

}
