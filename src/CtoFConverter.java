import java.util.Scanner;

public class CtoFConverter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double fa = 0;
        double ce = 0;
        double temp = 0;
        boolean done= false;
        String trash;
        System.out.print("Please enter the temperature in celsius:");
        do
        {
            if (in.hasNextDouble())
            {
                ce = in.nextDouble();

                done = true;
            }
            else
            {
                trash=in.nextLine();
                System.out.println("You said your temperature was: " +trash);
                System.out.println("Try again");}
        }
        while(!done);

        fa = (ce*9/5)+32;

        System.out.println("The temperature in fahrenheit is "+ fa);

        if(fa <= 32 )
        {
            System.out.println("This temperature is below freezing. ");
        }

        else if(fa >= 212)
        {
            System.out.println("This temperature is above boiling. ");
        }



    }
}

