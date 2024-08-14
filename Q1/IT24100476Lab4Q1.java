import java.util.Scanner;
   public class IT24100476Lab4Q1  {
      public static void main(String[] args){

    //create a scanner object to read input from the keyboard
    Scanner input = new Scanner(System.in);

    //Prompt user to enter number
    System.out.print("Enter a number: ");
    double number = input.nextDouble();

    //Check the number whether positive,negative or zero
    if(number>0){
         System.out.println("The number is: Positive");
         }

    else if(number<0){
         System.out.println("The number is: Negative");
         }

    else{
         System.out.println("The number is Zero");
        }
  
   }
}