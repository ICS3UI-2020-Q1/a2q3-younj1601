import java.util.Scanner;
/**
 * This program will put to numbers in the right order
 * @author Jackson
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);
    
    //prompt for first integer
    System.out.println("Please enter an integer:");
    //get integer from user
    int num1 = input.nextInt();

    //prompt for second integer
    System.out.println("Please enter another integer:");
    //get next integer from user
    int num2 = input.nextInt();

    if (num1 <= num2){
      // numbers are the same so order doesn,t matter
      //num1 goes first because smaller
      System.out.println("Your numbers in ascending order are " + num1 + ", " + num2);
    } else {
      //num2 is smaller is small so it goes first
      System.out.println("Your numbers in ascending order are " + num2 + ", " + num1);
    }
  
  }
}
