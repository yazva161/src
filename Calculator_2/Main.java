package Calculator_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите выражение с операндами от нуля до десяти: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = Main.calc(s);
    }
    public static String calc (String input){
        NumbersArabicIsRoman nar = new NumbersArabicIsRoman();

        try {
            input = nar.resultExpr(input);

        } catch (ArrayIndexOutOfBoundsException e){
            throw new ArrayIndexOutOfBoundsException("Строка не является выражением.");
        }
        return input;
    }
}
