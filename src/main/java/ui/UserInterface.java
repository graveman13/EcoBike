package ui;

import model.enums.OptionalTypeEnum;

import java.util.Arrays;
import java.util.Scanner;

public class UserInterface {
    private final static String MAIN_MENU =
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
        while (true) {
            System.out.println(MAIN_MENU);
            int idxMainMenu = scanner.nextInt();
            if (checkOptional(idxMainMenu)) {

            } else {

            }
        }
    }

    public String addBike(int idxMainMenu) {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.print("");
        for (int i = 0; i < BASIC_INFO.length; i++) {

            System.out.print(BASIC_INFO[i]);
            stringBuilder.append(scanner.nextLine()).append(" ");

            if (idxMainMenu == 2 && i == 0) {
                for (int j = 0; j < INFO_FOLDING_BIKE.length; j++) {
                    System.out.print(INFO_FOLDING_BIKE[j]);
                    stringBuilder.append(scanner.nextLine()).append(" ");
                }
            }

            if (idxMainMenu == 3 || idxMainMenu == 4) {
                if (i == 0) {
                    System.out.print(INFO_EBIKE[0]);
                    stringBuilder.append(scanner.nextLine()).append(" ");
                }
                if (i == 2) {
                    for (int j = 1; j < INFO_EBIKE.length; j++) {
                        System.out.print(INFO_EBIKE[j]);
                        stringBuilder.append(scanner.nextLine()).append(" ");
                    }
                }
            }
        }

        return stringBuilder.toString();
    }

    public void stopApplication() {
        System.exit(0);
    }

    private boolean checkOptional(int idx) {
        return Arrays.stream(OptionalTypeEnum.values()).anyMatch(e -> e.getOptional() == idx);
    }

    private OptionalTypeEnum findOptional(int idxOptional) {
        return Arrays.stream(OptionalTypeEnum.values())
                .filter(e -> e.getOptional() == idxOptional)
                .findFirst().get();
    }
}
