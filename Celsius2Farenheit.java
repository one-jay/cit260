import java.util.Scanner;
/*
a. Prompt the user to enter an input value
b. Get the input from the console and save value in a variable
c. Calculate the results using one or more equations
d. Print the results to the console.
*/
public class Celsius2Farenheit {
  /**
  The program starts in the main function
  @param args the command line arguments
  */
  public static void main(String[] args) {
    // print out the welcome message
    System.out.println("This program converts degrees celsius to farenheit");

    // create an input file for the console
    Scanner inFile;
    inFile = new Scanner(System.in);

    // prompt to enter the first number
    System.out.println("\nEnter the temperature in degrees Celsius:");
    // get the value entered for the first number
    double celsiusTemp = inFile.nextDouble();

    // convert degrees celsius to farenheit
    double fahrenheitTemp = (9.0/5.0) * celsiusTemp + 32;

    // display product to the console
    System.out.println("\n++++++++++++++++++");
    System.out.println("\t" + "The temperature is " + fahrenheitTemp
                      + " degrees farenheit");
    System.out.println("++++++++++++++++++\n");
  }
}
