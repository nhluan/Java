import java.util.Enumeration;
import java.util.Scanner;

public class Exercise14 {

    public static  void main (String[]str) {
        //x ^ n

        Scanner myInput = new Scanner(System.in);
        System.out.print("Enter number x: ");
        int x = myInput.nextInt();
        System.out.print("Enter number n: ");
        int n = myInput.nextInt();
        //handle


        long result = 0;

        //duyet cong
        for (int i = 0; i <= n; i++) {
            //duyet chi tiet
            long temp = 1;
            for (int j = 1; j <= (2 * i + 1); j++) {
                temp = temp * x;
            }



            result = result + temp;
        }

        System.out.print("Result: " + result);

    }

}
