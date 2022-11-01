import java.util.Scanner;

public class Exercise04 {
    public  static  void main(String[]str) {
        //1/2n
        // n > 9
        Scanner myInput = new Scanner(System.in);

        System.out.print("Enter number: ");

        int numberInput = myInput.nextInt();

        //handle
        if (numberInput > 9) {
            float result = 0;
            for (int i = 1; i <= numberInput; i++) {
                result = result + (float) 1 / (i * 2);
            }

            System.out.print("Result: " + result);
        }
        else {
            System.out.print("Error range!!!");
        }
    }
}
