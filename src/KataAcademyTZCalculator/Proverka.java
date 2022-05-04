package KataAcademyTZCalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Proverka {
    private static boolean arim = false;
    private static boolean brim = false;

    private static int aInt;
    private static int bInt;

    private static int error = 0;
    private static float x = 0F;
    private static float y = 0F;

    {
        this.arim = arim;
        this.brim = brim;
        this.aInt = aInt;
        this.bInt = bInt;
    }

    public static int ProverkaKolichestvaOperaciy(String input, String znak, int count) {
        Pattern p = Pattern.compile(znak);
        Matcher m = p.matcher(input);
        while (m.find()) {
            count++;
        }
        return count;
    }//ОШИБКА: проверка количества операций

    public static void vyhodEsliBolshe(int n) {
        if (n > 1)
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("ОШИБКА: формат математической операции не удовлетворяет заданию: два операнда и один оператор (+, -, /, *).");
                System.exit(0);
            }
    }//ОШИБКА: проверка количества операций

    public static void Celoe(String a, String b) {
        try {
            x = Float.parseFloat(a);
        } catch (Exception e) {
        }
        //System.out.println("x = " + x);
        if (x % 1 != 0)
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("(a) ОШИБКА: Введено не целое число.\n>>Работа завершена<<");
                System.exit(0);
            }

        try {
            y = Float.parseFloat(b);
        } catch (Exception e) {
        }
        //System.out.println("x = " + x);
        if (y % 1 != 0)
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("(b) ОШИБКА: Введено не целое число.\n>>Работа завершена<<");
                System.exit(0);
            }
    }//ОШИБКА: Введено не целое число. >>Работа завершена<<

    public static void neYavlyaetsyOperaciey(String a, String b, int plus, int minus, int umn, int del) {
        if (plus < 0 && minus < 0 && umn < 0 && del < 0)
            //System.out.println("plus + minus + umn + del \n" + plus + minus + umn + del);
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("ОШИБКА: Cтрока не является математической операцией.\n>>Работа завершена<<");
                System.exit(0);
            }
        if (plus == 0 || minus == 0 || umn == 0 || del == 0)
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("ОШИБКА: Cтрока не является математической операцией.\n>>Работа завершена<<");
            System.exit(0);
        }

    }//ОШИБКА: Cтрока не является математической операцией. >>Работа завершена<<

    public static void sovmechatRimArab(boolean arim, boolean brim) {
        if (arim == true && brim != true || arim != true && brim == true)
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("ОШИБКА: нельзя совмещать римские и арабские цифры.\n>>Работа завершена<<");
                System.exit(0);
            }
    }//ОШИБКА: нельзя совмещать римские и арабские цифры. >>Работа завершена<<

    public static void chisla1to10(int aInt, int bInt) {
        if (aInt > 10 || bInt > 10 || aInt < 1 || bInt < 1)
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("ОШИБКА: допустимы числа от 1 до 10 включительно.\n>>Работа завершена<<");
                System.exit(0);
            }
    }//ОШИБКА: допустимы числа от 1 до 10 включительно. >>Работа завершена<<

    public static void chislaItoXrim(String a, String b) {
        String regex = "[IVX]*";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(a);
        if (matcher.matches() == true && arim == false)
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("(a) ОШИБКА: допускаются римские цифры только от I до X включительно.\n>>Работа завершена<<");
                System.exit(0);
            }

        matcher = p.matcher(b);
        if (matcher.matches() == true && brim == false)
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("(b) ОШИБКА: допускаются римские цифры только от I до X включительно.\n>>Работа завершена<<");
                System.exit(0);
            }
    }//ОШИБКА: допускаются римские цифры только от I до X включительно. >>Работа завершена<<

    public static void rimResMenshe0(int resultInt, boolean arim, boolean brim){
        if (resultInt <= 0 && (arim == true && brim == true))
            try{throw new Exception();}
            catch (Exception e)
            {
                System.out.println("ОШИБКА: Если заданы римские цифры результат не может быть 0 или меньше.\n>>Работа завершена<<");
                System.exit(0);
            }
    }//ОШИБКА: Если заданы римские цифры результат не может быть 0 или меньше. >>Работа завершена<<
}