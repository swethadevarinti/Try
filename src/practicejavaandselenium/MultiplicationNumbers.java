package practicejavaandselenium;

import java.util.Scanner;

public class MultiplicationNumbers {

	public static void main(String[] args) {
		
    int a =10;
    int b=20;
     int c=a*b;
     System.out.println(c);
   
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter first number");
    int num1 = input.nextInt();
    System.out.println("Enter second number");
    int num2 = input.nextInt();
     
    int multiplicationnumber = num1*num2;
    System.out.println(multiplicationnumber);
	}

}
