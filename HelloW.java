// Brian Dinh CS112 HW 2
// Hello World Program


import java.util.Scanner;

public class HelloW
{
   public static void main (String[] args)
      {
         Scanner input = new Scanner (System.in);

	 System.out.println ("Please enter your user name.");

	 String username = input.nextLine();

	 System.out.println ("\nHello " + username );
      }
}