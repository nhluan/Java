import java.util.Scanner;

public class Exercise06 {
    public static  void main(String[]str) {
        //1/ n * (n + 1)
        // n > 6
        Scanner myInput = new Scanner(System.in);

        System.out.print("Enter number: ");

        //read data
        int numberInput = myInput.nextInt();

        //handle
        if (numberInput > 6) {
            // true
            float result = 0;

            for (int i = 1; i <= numberInput; i++) {
                result = result + (float) 1 / (i * (i + 1));
            }

            // show
            System.out.print("Result: " + result);
        }
        else {
            System.out.print("Error range!!!");
            /*
            1/ 2
            1/ 6
            i = 3
                3 * (4) = 12
                => 1/12
            i = 4
                4 * 5
            i = 5
                5 * 6
            i = 6
                6 * 7
            i = 7
                7 * 8

             */
        }

    }
}
