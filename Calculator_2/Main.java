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
        input = nar.resultExpr(input);
        return input;
    }Ljhf,jnfy
}
