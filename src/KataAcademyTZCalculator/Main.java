package KataAcademyTZCalculator;

public class Main {

    public static void main(String[] args){
        //while (true) {
            String input = Vvod.inCount();
            Calc c = new Calc();
            System.out.print("Ответ: " + input + " = ");
            c.calc(input);
        //}
    }
}