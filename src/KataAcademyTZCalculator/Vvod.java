package KataAcademyTZCalculator;

import java.util.Scanner;

class Vvod {

    static String inCount() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nВведите выражение: \n(для выхода нажмите е)");
        String input = scan.nextLine().replaceAll("\\s+", "");
        if (input.equals("е") || input.equals("e")) {
            System.out.println("Завершение программы.");
            System.exit(0);
        }

        int count = 0;
        String znakPlus = "\\+";
        int n = Proverka.ProverkaKolichestvaOperaciy(input, znakPlus, count);// ОШИБКА: проверка количества операций
        String znakMinus = "\\-";
        n = n + Proverka.ProverkaKolichestvaOperaciy(input, znakMinus, count);
        String znakUmn = "\\*";
        n = n + Proverka.ProverkaKolichestvaOperaciy(input, znakUmn, count);
        String znakDel = "\\/";
        n = n + Proverka.ProverkaKolichestvaOperaciy(input, znakDel, count);

        Proverka.vyhodEsliBolshe(n);// ОШИБКА: проверка количества операций

        return input;
    }
}