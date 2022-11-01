import java.util.Scanner;

public class Exercise19 {
    public static  void main (String[]str) {
        //Bài tập 15
        /*
        n > 0
        1 + 1/1 + 2 + 3 + .. + n
         */
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = myObj.nextInt();
        System.out.print("Enter number: ");
        int numberInput = myObj.nextInt();

//        System.out.println(numberInput);

        //check n
        if (numberInput > 0) {
            float sum = 0;
            // 1 - n
            for (int i = 1; i <= numberInput; i++) {
                // handle denominator
                float deno = 1;
                for (int j = 1; j <= ( i * 2); j++) {
                    deno = deno * j;
                }

                //handle numerator
                float nume = x * ( i * 2);

                //result
                sum = sum + (float) nume / deno;

            }
            // round
            sum = (float) Math.round(sum * 100) / 100;
            //show result
            System.out.println("Result: " + sum);
        }
        else if (numberInput == 0) {
            System.out.print("Result: 0");
        }
        else {
            System.out.println("Error range");
        }

    }
}
