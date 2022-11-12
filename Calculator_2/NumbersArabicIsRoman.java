package Calculator_2;

public class NumbersArabicIsRoman {

   /* private String [] expr;*/
    private int a, b;
    private static boolean isRoman;


    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
    public void setRoman(boolean roman) {
        isRoman = roman;
    }


    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
    public boolean isRoman() {
        return isRoman;
    }

    public static int signExpr(String expr, String[] actions) {
        int actionIndex = -1;
        for (int i = 0; i < actions.length; i++) {
            if (expr.contains(actions[i])) {
                actionIndex = i;

                break;
            }

        }
        return actionIndex;
    }

    public void resultExpr(String s) {
        Converter converter = new Converter();

        String[] actions = {"+", "-", "/", "*"};
        String[] regexActions = {"\\+", "-", "/", "\\*"};
        String[] data = s.split(regexActions[signExpr(s, actions)]);

        if (data.length > 2) {
            throw new MyException("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }

        if (converter.isRoman(data[0]) == converter.isRoman(data[1])) {

           setRoman(converter.isRoman(data[0]));

            if (isRoman()) {
                setA (converter.romanToInt(data[0]));
                setB (converter.romanToInt(data[1]));
            } else {
                setA(Integer.parseInt(data[0]));
                setB(Integer.parseInt(data[1]));
            }

            if (getA() > 10 || getB() > 10) {
                throw new MyException("Введите выражение с операндами от нуля до десяти.");
            }
            int result;
            switch (actions[signExpr(s, actions)]) {
                case "+":
                    result = getA() + getB();
                    break;
                case "-":
                    result = getA() - getB();
                    break;
                case "*":
                    result = getA() * getB();
                    break;
                default:
                    result = getA() / getB();
                    break;
            }
            if (isRoman()) {
                if (result > 0) {
                    System.out.println(converter.intToRoman(result));
                } else {
                    throw new MyException("В римской системе счисления нет отрицательных чисел");
                }
            } else {
                System.out.println(result);
            }
        } else {
            throw new MyException("Тип чисел не совпадает");
        }
    }
}


