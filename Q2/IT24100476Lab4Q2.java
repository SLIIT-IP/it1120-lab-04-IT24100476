import java.util.Scanner;

public class IT24100476Lab4Q2  {
 
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);

   System.out.println("Please enter exam marks (out of 100): ");
   double examMarks = input.nextDouble();

   if (  examMarks >= 0 &&   examMarks <= 100 )
   {
          System.out.println("Please enter lab submission marks  (out of 100): ");                                                     
   }									

 else
     {
        System.out.print("Invalid input for exam mark. Terminating program.");
     }
   
  double labMarks = input.nextDouble();
 
  if (labMarks >= 0  && labMarks <= 100){
       System.out.print("Please enter the percentage given for the exam: ");
    }
  else
    {
      System.out.print("Invalid input for lab mark. Terminating program.");
    }
  
  double examPercentage = input.nextDouble();
 
  
   
   System.out.println("Please enter the percentage given for the lab submission: ");
   double labPercentage = input.nextDouble();
 
   // Calculating sum of percentages
   double sumOfPercentages = examPercentage + labPercentage;
   
   // Calculating Final  Exam Mark
   double finalExamMark = examMarks*examPercentage/100 + labMarks*labPercentage/100;
   
   if (sumOfPercentages >= 0 && sumOfPercentages <= 100) {
	  System.out.println("Final exam mark is : " + finalExamMark);   
   }
   else
   {
	   System.out.print("The percentage must add up to 100. Terminating program. ");  
   }
          
  }
 
}  