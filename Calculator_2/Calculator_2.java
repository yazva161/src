package Calculator_2;

import java.util.Scanner;

import static Calculator_2.NumbersArabicIsRoman.signExpr;


public class Calculator_2 {
    public static void main(String[] args) {
        NumbersArabicIsRoman nar = new NumbersArabicIsRoman ();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выражение с операндами от нуля до десяти: ");
        String expression = sc.nextLine();
        //nar.

        /*System.out.println(nar.getA());
        System.out.println(nar.getB());
        System.out.println(nar.isRoman());*/

        nar.resultExpr(expression);
    }
}
