package Udemy;
public class MethodDiffinitionTest {
  public static void main(String[] args){ //エントリーポイント・・・プログラムの入口
    System.out.println("mainメソッド開始");
    add();
    System.out.println("mainメソッド終了");
  }

  public static void add(){
    System.out.println("addメソッド開始");
    int number1 = 5;
    int number2 = 10;
    int sum = 0;
    sum = number1 + number2;
    System.out.println("number1:" + number1);
    System.out.println("number2:" + number2);
    System.out.println("sum" + sum);
    add2();
    System.out.println("addメソッド終了");
    //メソッドの閉じカッコ：呼び出したところに戻る
  }

  public static void add2(){
    System.out.println("add2メソッド開始");
    int number1 = 15;
    int number2 = 25;
    int sum = 0;
    sum = number1 + number2;
    System.out.println("number1:" + number1);
    System.out.println("number2:" + number2);
    System.out.println("sum" + sum);
    System.out.println("add2メソッド終了");
  }
}
