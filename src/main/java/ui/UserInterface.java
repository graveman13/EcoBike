package ui;

import java.util.Scanner;

public class UserInterface {
    private final static String MAIN_PAGE =
            "Please make your choice:\n" +
                    "1 - Show the entire EcoBike catalog\n" +
                    "2 – Add a new folding bike\n" +
                    "3 – Add a new speedelec\n" +
                    "4 – Add a new e-bike\n" +
                    "5 – Find the first item of a particular brand\n" +
                    "6 – Write to file\n" +
                    "7 – Stop the program\n";

    private final static String[] BASIC_INFO =
            {
                    "Indicate the brand : ",
                    "Specify bike weight (in grams) : ",
                    "Indicate the availability of lights at front and back (TRUE/FALSE) : ",
                    "Specify color : ",
                    "Indicate the price : "
            };

    private final static String[] INFO_FOLDING_BIKE =
            {
                    "Indicate the size of the wheels (in inch) : ",
                    "The number of gears : "
            };

    private final static String[] INFO_EBIKE =
            {
                    "Indicate the maximum speed : ",
                    "Indicate the battery capacity (in mAh) : "
            };

    private Scanner scanner = new Scanner(System.in);

    public void run() {
        System.out.println(MAIN_PAGE);
        System.out.print("Specify the index : ");
        int idx = scanner.nextInt();
        System.out.println("need");
    }

    public String addBike() {
        System.out.print("");
        return "";
    }
}
