import java.util.Scanner;

public class MetricConverter
{

    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    int meters = 0;
    double feet = 0;
    double miles = 0;
    double inch = 0;
    String trash = "";
    boolean done = false;

    do {
     System.out.print("Please enter a integer value of meters: ");
     if(in.hasNextInt()) {
         meters = in.nextInt();
         if (meters < 0) {
             System.out.println("Meter lengths cannot be a negative value. ");
             System.out.println("Try again");
         } else {
             done = true;
         }
     }
     else
     {
             trash = in.nextLine();
             System.out.println("You entered an invalid value: " + trash);
             System.out.println("Try again");
     }
     }while(!done);


    feet = meters / 3.281;
    miles = meters / 1609;
    inch = meters * 39.37;

        System.out.printf("%-5s%-6d\n", "Meters:", meters);
        System.out.printf("%-5s%-6f\n", "Miles:", miles);
        System.out.printf("%-5s%-6f\n", "Feet:", feet);
        System.out.printf("%-5s%-6f\n", "Inches:", inch);

     }





    }







