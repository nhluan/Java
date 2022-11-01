import java.util.Scanner;

public class Exercise17 {
    public static  void main (String[]str) {
        //Bài tập 1.
        //Tính S(n) = 1 + 2 + 3 + 4 + … + n
        //Trong đó n được nhập từ người dùng với 3 < n và n < 50
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter number: ");

        int numberInput = myObj.nextInt();

        //check n
        if (numberInput < 1) {
            System.out.println("Result: 1");
        }
        else if (numberInput >= 1){
            int sum = 1;
            for (int i = 2; i <= numberInput; i++) {
                sum = sum * i;
            }

            // show data
            System.out.println("Result: " + sum);
        }
        else {
            System.out.print("Error range!!!");
        }
    }
}
