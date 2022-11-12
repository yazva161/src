package Calculator_2;

public class MyException extends RuntimeException{
  public MyException (String s) {
      super(s);
  }

  public MyException (int index) {
      super("Строка не является выражением" + index);
  }


}
