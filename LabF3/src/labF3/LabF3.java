package labF3;

import java.util.Scanner;

public class LabF3
{

        public static void main(String[] args)
        {

                String promptThirsty;
                String promptBreakfast;
                Scanner in = new Scanner(System.in);

                System.out.printf("I am Hungry \n");

                System.out.printf("Get in line \n");

                System.out.printf("Buy lunch \n");

                System.out.printf("Thirsty? Y/N Had breakfast y/n");
                promptThirsty = in.nextLine();
                promptBreakfast = in.nextLine();

                if (promptThirsty.equals("Y") && promptBreakfast.equals("y")  )
                {
                        System.out.printf("Buy diet coke \n");
                }

                else if (promptThirsty.equals("N") && promptBreakfast.equals("n") )
                {
                        System.out.printf("Buy coke \n");
                }

                else
                {
                        System.out.printf("Buy water \n");
                }


                System.out.printf("Eat lunch \n");

                System.out.printf("Return tray \n");

                System.out.printf("Leave \n");



        }

}
//Good
