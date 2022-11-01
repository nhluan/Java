import java.util.Scanner;

public class Exercise11 {

    public static  void main (String[]str) {
        //2n + 1/ 2n + 2
        // n > 5

        Scanner myInput = new Scanner(System.in);

        System.out.print("Enter number: ");

        int numberInput = myInput.nextInt();

        //handle
        if (numberInput > 1) {
            int result = 0;


            for (int i = 1; i <= numberInput; i++) {
                int mul = 1;
                for (int j = 1; j <= i; j++) {
                    mul = mul * j;
                }

                result = result + mul;
            }

            System.out.print("Result: " + result);
        }
        else {
            System.out.print("Error range!!!");
        }
    }

}
