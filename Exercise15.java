import java.util.Scanner;

public class Exercise15 {
    public static  void main (String[]str) {
        //Bài tập 15
        /*
        n > 0
        1 + 1/1 + 2 + 3 + .. + n
         */
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter number: ");

        int numberInput = myObj.nextInt();

//        System.out.println(numberInput);

        //check n
        if (numberInput > 0) {
            float sum = 0;
            // 1 - n
            for (int i = 1; i <= numberInput; i++) {
                float temp = 0;
                for (int j = 1; j <= i; j++) {
                    temp = temp + j;
                }

                //add in sum
                sum = sum + (float) 1 / temp;

                //debug
                /*
                i = 1
                    + temp = 0
                    + for j
                        + j = 1 => temp = 1
                    + sum = 0 + 1
                i = 2
                    + temp = 0
                    + for j
                        + j = 1 => temp = 1
                        + j = 2 => temp = 3
                     + sum = 1 + 1/3 =
                 */
            }

            System.out.println("Result: " + sum);
        }
        else {
            System.out.println("Error range");
        }

    }
}
