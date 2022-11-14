package Udemy;
public class MethodDiffinitionTest {
  public static void main(String[] args){ //エントリーポイント・・・プログラムの入口
    System.out.println("mainメソッド開始");
    // int number1 = 5;
    // int number2 = 10;
    int sum = 0;
    //足し算する処理→結果の戻り値をsumに代入
    //sum = add(number1, number2);  //返された値をセットしてあげる。
    sum = add((int)5.0, 10);
    //足し算した結果を画面に表示する処理
    printSum(sum);
    sum = add(30, 70 );
    //足し算した結果を画面に表示する処理
    printSum(sum);
    System.out.println("mainメソッド終了");
  }

  public static int add(int number1, int number2){
    System.out.println("addメソッド開始");
    System.out.println("number1:" + number1);
    System.out.println("number2:" + number2);
    int sum = 0;
    sum = number1 + number2;
    System.out.println("addメソッド終了");
    //メソッドの閉じカッコ：呼び出したところに戻る
    return sum;
  }

  // public static void add2(){
  //   System.out.println("add2メソッド開始");
  //   int number1 = 15;
  //   int number2 = 25;
  //   int sum = 0;
  //   sum = number1 + number2;
  //   System.out.println("number1:" + number1);
  //   System.out.println("number2:" + number2);
  //   System.out.println("sum" + sum);
  //   System.out.println("add2メソッド終了");
  // }

  public static void printSum(int sum){
    System.out.println("printSumメソッド開始");
    System.out.println("sum" + sum);
    System.out.println("printSumメソッド終了");
  }
}
