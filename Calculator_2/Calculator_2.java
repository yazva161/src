package Calculator_2;

import java.util.Scanner;

public class Calculator_2 {
    public static void main(String[] args) {
        NumbersArabicIsRoman nar = new NumbersArabicIsRoman ();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выражение с операндами от нуля до десяти: ");
        String expression = sc.nextLine();

        try {
            nar.resultExpr(expression);

        } catch (ArrayIndexOutOfBoundsException e){
            throw new ArrayIndexOutOfBoundsException("Строка не является выражением.");
        }
    }
}
