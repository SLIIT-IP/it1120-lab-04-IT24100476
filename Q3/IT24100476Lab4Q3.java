import java.util.Scanner;

public class IT24100476Lab4Q3 {
      public static void main(String[]  args) {
         
           Scanner input = new Scanner( System.in);

           //  Prompt user to enter a number
           System.out.print("Enter a number: ");
           double number = input.nextDouble();

           String result = ( number > 0)? "Positive" : (number < 0)?  "Negative" :  "Zero" ;

            System.out.print("The number is: " + result);

   }
}
      