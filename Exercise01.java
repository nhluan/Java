import java.util.Scanner;

public class Exercise01 {
    public static  void main (String[]str) {
        //Bài tập 1.
        //Tính S(n) = 1 + 2 + 3 + 4 + … + n
        //Trong đó n được nhập từ người dùng với 3 < n và n < 50
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter number: ");

        int numberInput = myObj.nextInt();

        System.out.println(numberInput);

        //check n
        if (numberInput <= 3 || numberInput >= 50) {
            System.out.println("Error range");
        }
        else {
            int sum = 1;
            for (int i = 2; i <= numberInput; i++) {
                sum = sum + i;
            }

            // show data
            System.out.println("Result: " + sum);
        }

    }
}
