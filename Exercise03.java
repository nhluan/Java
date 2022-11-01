import java.util.Scanner;

public class Exercise03 {
    public static void main (String[]str) {
        //Bài tập 3
        // sn = 1 + 1/2 + 1/3 + .. + 1/n
        // n >= 7

        //tao object scanner
        Scanner myInput = new Scanner(System.in);

        System.out.print("Enter number: ");

        //read data
        int numberInput = myInput.nextInt();

        //handle
        if (numberInput >= 7) {
            float result = 1;
            // ban dau = 1
            for (int i = 2; i <= numberInput; i++) {
                result = result + (float) 1 / i;
            }

            // show data
            System.out.print("Result: " + result);
        }
        else {
            System.out.print("Error range");
        }
    }
}
