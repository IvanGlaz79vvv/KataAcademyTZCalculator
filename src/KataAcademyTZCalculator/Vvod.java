package KataAcademyTZCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vvod {


    static String inCount(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\nВведите выражение: ");
        String input = scan.nextLine().replaceAll("\\s+", "");
        if (input.equals("е") || input.equals("e")) {
            System.out.println("Завершение программы.");
            System.exit(0);
        }
        return input;
    }
}