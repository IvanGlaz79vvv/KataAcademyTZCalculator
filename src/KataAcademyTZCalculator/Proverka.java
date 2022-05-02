package KataAcademyTZCalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Proverka {
    public static int ProverkaKolichestvaOperaciy(StringBuilder input, int count){
        Pattern patternFindPlus = Pattern.compile("\\+");
        Matcher findMatcherPlus = patternFindPlus.matcher(input);
        while(findMatcherPlus.find()){count++;}
        return count;
    }

    public static void vyhodEsliBOlshe(int n){
        if(n > 1)
            try{throw new Exception();}
            catch (Exception e)
            {
                System.out.println("ОШИБКА: формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *).");
                System.exit(0);
            }
    }
}
