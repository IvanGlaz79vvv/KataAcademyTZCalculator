package KataAcademyTZCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vvod {
    static String inCount() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nВведите выражение: "); /*\n(Для выхода нажмите \"e\")");*/
        String input = scan.nextLine().replaceAll("\\s+", "");
        /*if (input.equals("е") || input.equals("e")){
            System.out.println("Завершение программы.");
            System.exit(0);*/

        Matcher m1 = Pattern.compile("(?=(\\+))").matcher(input);
        Matcher m2 = Pattern.compile("(?=(\\-))").matcher(input);
        Matcher m3 = Pattern.compile("(?=(\\*))").matcher(input);
        Matcher m4 = Pattern.compile("(?=(\\/))").matcher(input);


        List plus = new ArrayList();
        plus.add(0, "plus");
        List minus = new ArrayList();
        minus.add(0, "minus");
        List umn = new ArrayList();
        umn.add(0, "umn");
        List del = new ArrayList();
        del.add(0, "del");

        //System.out.println("m1 = " + m1);

        ProverkaOperaciy.runProverka(m1, plus);
        ProverkaOperaciy.runProverka(m2, minus);
        ProverkaOperaciy.runProverka(m3, umn);
        ProverkaOperaciy.runProverka(m4, del);

        ProverkaOperaciy.runSimbols(input);

      return input;
            }
    }