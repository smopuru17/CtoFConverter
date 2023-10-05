import java.util.Scanner;

public class RectangleInfo {

    public static void main(String[] args) {
        int h = 0;
        int w = 0;
        int a = 0;
        double dia = 0;
        String trash = "";
        boolean done = false;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("What is the height of the rectangle: ");

            if (in.hasNextInt()) {
                h = in.nextInt();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("You entered an invalid height: " + trash);
                System.out.println("Try again.");
            }

        }
            while (!done) ;

            done = false;
            do {
                System.out.println("What is the width of the rectangle: ");

                if (in.hasNextInt()) {
                    w = in.nextInt();
                    done = true;
                } else {
                    trash = in.nextLine();
                    System.out.println("You entered an invalid width: " + trash);
                    System.out.println("Try again.");

                }

            }
                while (!done) ;

                a = h * w;
                dia = Math.sqrt((h * h) + (w * w));

                System.out.println("The area of the rectangle is " + a + " and the length of the diagonal of the rectangle is " + dia + ".");

            }


        }



