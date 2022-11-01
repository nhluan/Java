import java.util.Scanner;

public class Exercise02 {
    public static void main (String[]str) {
        //Bài tập 2.
        //Tính S(n) = 12 + 22 + 32 + … + n2
        //Trong đó n được nhập từ người dùng với 5 <= n và n <= 20.

        //Nhap tu ban phim

        Scanner myInput = new Scanner(System.in);
        System.out.print("Enter number: ");

        //read user input
        int numberInput = myInput.nextInt();

        //handle
        if (numberInput >= 5 && numberInput <= 20) {
            // dung truong hop
            int sum = 0;
            int currentValue = 12;

            for (int i = 0; i < numberInput; i++) {
                sum = sum + currentValue;
                currentValue = currentValue + 10;
            }
            // in ket qua
            System.out.print("Result: " + sum);
        }
        else {
            System.out.println("Error range!!!");
        }

    }
}
