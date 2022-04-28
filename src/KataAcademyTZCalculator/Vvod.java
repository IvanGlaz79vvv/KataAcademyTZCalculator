package KataAcademyTZCalculator;

import java.util.Scanner;

public class Vvod {
    static String inCount(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        String input = scan.nextLine().replaceAll("\\s+", "");;
        return input;
    }
}
