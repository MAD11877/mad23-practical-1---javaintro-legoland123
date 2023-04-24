import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> data = new ArrayList<>();
    System.out.print("Enter a number: ");
    int input = 0;
    for(var i = 1; i <= input; i++){
      System.out.print(": ");
      int number = 0;
      data.add(number);
    }
    
    var highest_num = 0;
    var mode = -1; 
    for(int i : data){
      var times = 0;
      for(int x : data){
        if(i == x) { times++; }
      }
      if(times > mode) {
        highest_num = i;
        mode = times;
      }
    }
    System.out.println("The interger " + highest_num + " appeared " + mode + " times");
  }
}
