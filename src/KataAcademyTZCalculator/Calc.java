package KataAcademyTZCalculator;

class Calc {
    private static int plus;
    private static int minus;
    private static int umn;
    private static int del;
    int aInt;
    int bInt;

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

        plus = line.indexOf("+");
        //System.out.println("\nplus = " + plus);
        if (plus > 0) {
            a = line.substring(0, plus).toUpperCase();
            b = line.substring(plus + 1).toUpperCase();
        }

        minus = line.indexOf("-");
        //System.out.println("minus = " + minus);
        if (minus > 0) {
            a = line.substring(0, minus).toUpperCase();
            b = line.substring(minus + 1).toUpperCase();
            //System.out.println(a + "\n" + b);
        }

        umn = line.indexOf("*");
        //System.out.println("umn = " + umn);
        if (umn > 0) {
            a = line.substring(0, umn).toUpperCase();
            b = line.substring(umn + 1).toUpperCase();
            //System.out.println(a + "\n" + b);
        }

        del = line.indexOf("/");
        //System.out.println("del = " + del);
        if (del > 0) {
            a = line.substring(0, del).toUpperCase();
            b = line.substring(del + 1).toUpperCase();
            //System.out.println(a + "\n" + b);
        }

        Proverka.neYavlyaetsyOperaciey(a, b, plus, minus, umn, del);//ОШИБКА: Cтрока не является математической операцией. Завершение программы.

        Proverka.Celoe(a, b);//(a) ОШИБКА: Введено не целое число. Завершение программы.

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
            default:brim = false;
                break;
        }

        Proverka.chislaItoXrim(a, b);//(a) ОШИБКА: (a) больше Х. Или введено не целое число. Завершение программы.

        try{aInt = Integer.parseInt(a.trim());}
        catch (Exception e){
            System.out.println("ОШИБКА: Cтрока не является математической операцией.\nЗавершение программы.");
        }
        try{bInt = Integer.parseInt(b.trim());}
        catch (Exception e){
            System.out.println("ОШИБКА: Cтрока не является математической операцией.\nЗавершение программы.");
        }

        Proverka.chisla1to10(aInt, bInt);//ОШИБКА: допустимы числа от 1 до 10 включительно, не более. Завершение работы

        Proverka.sovmechatRimArab(arim, brim);//ОШИБКА: нельзя совмещать римские и арабские цифры. Завершение программы.

                int resultInt = Reshenie.reshenie(aInt, bInt, plus, minus, umn, del);//Решение.

                resultString = Integer.toString(resultInt);

        Proverka.rimResMenshe0(resultInt, arim, brim);//ОШИБКА: Если заданы римские цифры результат не может быть 0 или меньше. Завершение программы

                if(resultInt < 1 && resultInt > 0){
                    resultString = "0";
                    System.out.println(resultString);
                }

                if (resultInt >= 0 | resultInt <= -1 && (arim != true && brim != true)) {
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
                    if(resultInt < 1){resultString = "0";}
                    System.out.println(resultString);
                }
            }
    }