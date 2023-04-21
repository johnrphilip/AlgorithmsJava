package Numbers;


import java.util.Scanner; //import the scanner

public class Operators 
{
public static void main(String[] args) //calling the main method
{
Scanner scan = new Scanner(System.in);
//creates scanner object that reads from the standard input command line


	
	System.out.println("Enter an operator (+, -, *, /): "); //prompts user
	String operator = scan.nextLine(); //reads a string from the command line and stores it in variable operator
	

	System.out.println("Enter first integer: ");
	int num1 = scan.nextInt(); //reads an integer and names it num1

	System.out.println("Enter second integer: ");
	int num2 = scan.nextInt(); //reads second integer

	int result;  //defines and intializes the result integer to store the calculation
	switch (operator) {   //switch loop using the different operators
	  case "+":
	    result = num1 + num2;
	    break;
	  case "-":
	    result = num1 - num2;
	    break;
	  case "*":
	    result = num1 * num2;
	    break;
	  case "/":
	    result = num1 / num2;
	    break;
	  default: //if none of the cases match the value then it puts out this line
	    System.out.println("Invalid");
	    return;
	}

	System.out.println("Result: " + result); 
	
}
}
