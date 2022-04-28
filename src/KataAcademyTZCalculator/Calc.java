package KataAcademyTZCalculator;

public class Calc {
    private static int plus;
    private static int minus;
    private static int umn;
    private static int del;

    private static String a;
    private static String b;

    private static boolean arim = false;
    private static boolean brim = false;

    private static String resultString = null;

    {
        this.plus = plus;
        this.minus = minus;
        this.umn = umn;
        this.del = del;
        this.a = a;
        this.b = b;
        this.arim = arim;
        this.brim = brim;
    }

    public static String calc(String input){
        String line = input.replaceAll("\\s+", "");
        //System.out.println(line);
        plus = line.indexOf("+");

        if (plus > 0) {
            a = line.substring(0, plus);
            b = line.substring(plus + 1);
            //System.out.println(a + "\n" + b);
        }


        minus = line.indexOf("-");
        if (minus > 0) {
            a = line.substring(0, minus);
            b = line.substring(minus + 1);
            //System.out.println(a + "\n" + b);
        }
        umn = line.indexOf("*");
        if (umn > 0) {
            a = line.substring(0, umn);
            b = line.substring(umn + 1);
            //System.out.println(a + "\n" + b);
        }
        del = line.indexOf("/");
        if (del > 0) {
            a = line.substring(0, del);
            b = line.substring(del + 1);
            //System.out.println(a + "\n" + b);
        }
                                                                                /*System.out.println("plus = " + plus);
                                                                                System.out.println("minus = " + minus);
                                                                                System.out.println("umn = " + umn);
                                                                                System.out.println("del = " + del);*/

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
            default: break;
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
            default: break;
        }
                                                                                /*System.out.println("arim = " + arim +"\n" +
                                                                                                    "brim = " + brim);*/

        if (arim == true && brim != true || arim != true && brim == true)
        {
            System.out.println("ОШИБКА: нельзя совмещать римские и арабские цифры!");
            System.exit(0);
        }
        int aInt = Integer.parseInt(a);// переводим первое в int
        int bInt = Integer.parseInt(b);// переводим второе в int

        int resultInt = Reshenie.reshenie(aInt, bInt, plus, minus, umn, del);
        //System.out.println("resultInt = " + resultInt);
        //System.out.println("resultString = " + resultString);
        if( resultInt < 0 && (arim == true && brim == true)){
            System.out.println("Если заданы римские цифры результат не может быть меньше 0");
            System.exit(0);
        }

        resultString = Integer.toString(resultInt);
        if( resultInt > 0 && (arim == true && brim == true)) {
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
        }
        return resultString;
    }
}