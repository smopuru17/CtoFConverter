import java.util.Scanner;

public class FuelCost
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double gallons = 0;
        double fuelEff = 0;
        double price = 0;
        String trash = "";
        boolean done = false;
   do {
       System.out.println("Please enter the amount of gallons: ");


       if (in.hasNextDouble())
       {
           gallons = in.nextDouble();
           done = true;
       }
       else {
           trash = in.nextLine();
           System.out.println("You said your gallons was: " + trash);
           System.out.println("Try again");
       }
   }while(!done);
   done = false;
   do {
       System.out.println("Please enter the fuel efficiency in miles per gallon: ");
       if (in.hasNextDouble())
       {
           fuelEff = in.nextDouble();
           done = true;

       }
       else
       {
           trash = in.nextLine();
           System.out.println("You said your Fuel Efficiency in Miles was: " + trash);
           System.out.println("Try again");
       }
   }while(!done);
       done = false;
    do {
        System.out.println("Please enter the cost per gallon: ");
        if (in.hasNextDouble())
        {
            price = in.nextDouble();
            done = true;

        }
        else
        {
            trash = in.nextLine();
            System.out.println("You said your price per gallon was: " + trash);
            System.out.println("Try again");
        }
    }while(!done);

    double costPerMile = gallons * price;
    double distancePerMile = gallons * fuelEff;

    System.out.println("The total cost of gas per 100miles: $" + costPerMile);
    System.out.println("Maximum distance that the car can travel " + distancePerMile + " miles.");
    }
}

