import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Enter height (m): ");
    // var height = in.nextDouble();
    System.out.print("Enter weight (kg): ");
    // var weight = in.nextDouble();
    var bmi = weight / ( height * height );
    System.out.println("Bmi of user is " + bmi);
  }
}
