package KataAcademyTZCalculator;

public class Reshenie {
    static int reshenie(int a, int b, int plus, int minus, int umn, int del) {
        //System.out.println("a, b, plus, minus, umn, del = " + a + b + plus + minus + umn + del);
        int res = 0;
        if (plus > 0) res = a + b;
        if (minus > 0) res = a - b;
        if (umn > 0) res = a * b;
        if (del > 0) res = a / b;
        //System.out.println(res + " " + a + " " + b);
        return res;
    }
}
