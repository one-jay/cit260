import java.util.Scanner;
/*
a. Prompt the user to enter an input value
b. Get the input from the console and save value in a variable
c. Prompt the user to enter the next input value
d. Get the input from the console and save value in a different variable.
e. Calculate the results using one or more equations
f. Print the results to the console.
*/
public class L01Assignment {
  /**
  The program starts in the main function
  @param args the command line arguments
  */
  public static void main(String[] args) {
    // print out the welcome message
    System.out.println("This program takes two numbers as inputs and multiplies them together");

    // create an input file for the console
    Scanner inFile;
    inFile = new Scanner(System.in);

    // prompt to enter the first number
    System.out.println("\nEnter the first number:");
    // get the value entered for the first number
    double firstNumber = inFile.nextDouble();

    // prompt to enter the second number
    System.out.println("\nEnter the second number");
    // get the value entered for the second number
    double secondNumber = inFile.nextDouble();

    // multiply the first and second number
    double product = firstNumber * secondNumber;
    // display product to the console
    System.out.println("\n++++++++++++++++++");
    System.out.println("\t" + "The product is " + product);
    System.out.println("++++++++++++++++++\n");
  }
}
