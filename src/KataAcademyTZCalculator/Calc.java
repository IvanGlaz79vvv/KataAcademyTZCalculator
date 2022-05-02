package KataAcademyTZCalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calc {
     static int plus = 0;
     static int minus = 0;
     static int umn = 0;
     static int del = 0;
     static int aInt;
     static int bInt;

    private String a;
    private String b;

    private static boolean arim = false;
    private static boolean brim = false;

    private static String resultString = null;

    private static int count = 0;
    private static int n = 0;

    {
        this.plus = plus;
        this.minus = minus;
        this.umn = umn;
        this.del = del;
        this.a = a;
        this.b = b;
        this.arim = arim;
        this.brim = brim;
        this.aInt = aInt;
        this.bInt = bInt;

    }

    public void calc(String input) {
        StringBuilder line = new StringBuilder(input);

        /*for(int i = 0; i < line.length(); i++){
            plus = line.indexOf("+", plus+1);
            count++;
        }*/


        plus = line.indexOf("+");
        //System.out.println("\nplus = " + plus);
            if (plus > 0) {
                a = line.substring(0, plus);
                b = line.substring(plus + 1);
                n = Proverka.ProverkaKolichestvaOperaciy(line, count, plus);
                Proverka.vyhodEsliBOlshe(n);
            }

            minus = line.indexOf("-");
        //System.out.println("minus = " + minus);
            if (minus > 0) {
                a = line.substring(0, minus);
                b = line.substring(minus + 1);
                    //System.out.println(a + "\n" + b);
                n = n + Proverka.ProverkaKolichestvaOperaciy(line, count, minus);
                Proverka.vyhodEsliBOlshe(n);
                }

            umn = line.indexOf("*");
        //System.out.println("umn = " + umn);
            if (umn > 0) {
                a = line.substring(0, umn);
                b = line.substring(umn + 1);
            //System.out.println(a + "\n" + b);
                n = n + Proverka.ProverkaKolichestvaOperaciy(line, count, umn);
                Proverka.vyhodEsliBOlshe(n);
            }

            del = line.indexOf("/");
        //System.out.println("del = " + del);
            if (del > 0) {
                a = line.substring(0, del);
                b = line.substring(del + 1);
            //System.out.println(a + "\n" + b);
                n = n + Proverka.ProverkaKolichestvaOperaciy(line, count, del);
                Proverka.vyhodEsliBOlshe(n);
            }

        if(plus < 0 && minus < 0 && umn < 0 && del < 0)
            try{throw new Exception();}
        catch (Exception e)
        {
            System.out.println("Cтрока не является математической операцией.\nЗавершение программы.");
            System.exit(0);
        }

                switch (a) {
                    case "I":
                        a = "1";
                        arim = true;
                        //System.out.println("Римская цифра a = " + a);
                        break;
                    case "II":
                        a = "2";
                        arim = true;
                        //System.out.println("Римская цифра a = " + a);
                        break;
                    case "III":
                        a = "3";
                        arim = true;
                        //System.out.println("Римская цифра a = " + a);
                        break;
                    case "IV":
                        a = "4";
                        arim = true;
                        //System.out.println("Римская цифра a = " + a);
                        break;
                    case "V":
                        a = "5";
                        arim = true;
                        //System.out.println("Римская цифра a = " + a);
                        break;
                    case "VI":
                        a = "6";
                        arim = true;
                        //System.out.println("Римская цифра a = " + a);
                        break;
                    case "VII":
                        a = "7";
                        arim = true;
                        //System.out.println("Римская цифра a = " + a);
                        break;
                    case "VIII":
                        a = "8";
                        arim = true;
                        //System.out.println("Римская цифра a = " + a);
                        break;
                    case "IX":
                        a = "9";
                        arim = true;
                        //System.out.println("Римская цифра a = " + a);
                        break;
                    case "X":
                        a = "10";
                        arim = true;
                        //System.out.println("Римская цифра a = " + a);
                        break;
                    default: arim = false;
                        break;
                }

                switch (b) {
                    case "I":
                        b = "1";
                        brim = true;
                        //System.out.println("Римская цифра b = " + b);
                        break;
                    case "II":
                        b = "2";
                        brim = true;
                        //System.out.println("Римская цифра b = " + b);
                        break;
                    case "III":
                        b = "3";
                        brim = true;
                        //System.out.println("Римская цифра b = " + b);
                        break;
                    case "IV":
                        b = "4";
                        brim = true;
                        //System.out.println("Римская цифра b = " + b);
                        break;
                    case "V":
                        b = "5";
                        brim = true;
                        //System.out.println("Римская цифра b = " + b);
                        break;
                    case "VI":
                        b = "6";
                        brim = true;
                        //System.out.println("Римская цифра b = " + b);
                        break;
                    case "VII":
                        b = "7";
                        brim = true;
                        //System.out.println("Римская цифра b = " + b);
                        break;
                    case "VIII":
                        b = "8";
                        brim = true;
                        //System.out.println("Римская цифра b = " + b);
                        break;
                    case "IX":
                        b = "9";
                        brim = true;
                        //System.out.println("Римская цифра b = " + b);
                        break;
                    case "X":
                        b = "10";
                        brim = true;
                        //System.out.println("Римская цифра b = " + b);
                        break;
                    default: brim = false;
                        break;
                }

        //System.out.println("До перевода в Integer:\na = " + a + "\nb = " + b);

        //System.out.println("\n(b)arim = " + arim + "\nbrim = " + brim);
        if(arim == false)
        {
            try
            {
                aInt = Integer.parseInt(a.trim());
            }
            catch (NumberFormatException e) {
                System.out.println("\nОШИБКА: Введено не целое число. (" + "a = " + a + ")" + "\nЗавершение программы.");
                System.exit(0);
            }
        }

        if(brim == false)
        {
            try
            {
                bInt = Integer.parseInt(b.trim());
            }
            catch (NumberFormatException e) {
                System.out.println("\nОШИБКА: Введено не целое число. (" + "b = " + b + ")" + "\nЗавершение программы.");
                System.exit(0);
            }
        }


        if (arim == true && brim != true || arim != true && brim == true)
        try {throw new Exception();}
        catch (Exception e)
        {
        System.out.println("ОШИБКА: нельзя совмещать римские и арабские цифры.\nЗавершение программы.");
        System.exit(0);
        }


                if(aInt > 10 || bInt > 10)
                    try{throw new Exception();}
                catch (Exception e)
                {
                    System.out.println("ОШИБКА: разрешены числа от 1 до 10 включительно.\nЗавершение программы.");
                    System.exit(0);
                }

                int resultInt = Reshenie.reshenie(aInt, bInt, plus, minus, umn, del);

                if (resultInt < 0 && (arim == true && brim == true)) {
                    System.out.println("Если заданы римские цифры результат не может быть меньше 0.\nЗавершение программы.");
                    System.exit(0);
                }

        resultString = Integer.toString(resultInt);

                if (resultInt > 0 && (arim != true && brim != true)) {
                System.out.println(resultInt);
                }

                if (resultInt > 0 && (arim == true && brim == true)) {
                    switch (resultInt) {
                        case 1:
                            resultString = "I";
                            break;
                        case 2:
                            resultString = "II";
                            break;
                        case 3:
                            resultString = "III";
                            break;
                        case 4:
                            resultString = "IV";
                            break;
                        case 5:
                            resultString = "V";
                            break;
                        case 6:
                            resultString = "VI";
                            break;
                        case 7:
                            resultString = "VII";
                            break;
                        case 8:
                            resultString = "VIII";
                            break;
                        case 9:
                            resultString = "IX";
                            break;
                        case 10:
                            resultString = "X";
                            break;
                        case 11:
                            resultString = "XI";
                            break;
                        case 12:
                            resultString = "XII";
                            break;
                        case 13:
                            resultString = "XIII";
                            break;
                        case 14:
                            resultString = "XIV";
                            break;
                        case 15:
                            resultString = "XV";
                            break;
                        case 16:
                            resultString = "XVI";
                            break;
                        case 17:
                            resultString = "XVII";
                            break;
                        case 18:
                            resultString = "XVIII";
                            break;
                        case 19:
                            resultString = "XIX";
                            break;
                        case 20:
                            resultString = "XX";
                            break;
                    }
                    System.out.println(resultString);
                }
    }
}