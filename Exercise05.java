import java.util.Scanner;

public class Exercise05 {
    public static void main(String[]str) {
        // 1/2n+1
        // n >= 2
        Scanner myInput = new Scanner(System.in);

        System.out.print("Enter number: ");

        int numberInput = myInput.nextInt();

        // handle

        if (numberInput >= 2) {
            // true
            float result = 1;
            for (int i = 1; i < numberInput; i++) {
                result = result + (float) 1 / (2 * i + 1);
            }

            System.out.print("Result: " + result);
        }
        else {
            System.out.print("Error range!!!");
        }

    }
}
