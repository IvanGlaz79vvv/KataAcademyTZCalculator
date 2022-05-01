package KataAcademyTZCalculator;

import java.util.ArrayList;
import java.util.List;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ProverkaOperaciy {

    public static void runProverka(Matcher x, List array){
        while (x.find())
        {
            array.add(x.start());
        }
//        System.out.println(array.get(0) + ": " + array);
//        System.out.println("array.size() = " + array.size());
        if(array.size() > 2)
            try{throw new Exception();}
            catch (Exception e)
            {
                System.out.println("ОШИБКА: Должна быть только одна операция.");
                //System.exit(1);
            }
    }

    public static void runSimbols(String input, List newArray){
        System.out.println((input.matches()));
        if(input.matches("^[IVX}{1,4}[ ][\\+\\-\\*\\/][ ][IVX]{1,4}"))
        try{throw new Exception();}
        catch (Exception e){
            System.out.println("ОШИБКА: допустимы только арабские цифры 0-9, " +
                               "римские цифры I-X, знаки арифметических операций(+,-,*,/)");
            //System.exit(1);
        }
    }
}
