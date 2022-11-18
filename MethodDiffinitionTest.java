public class MethodDiffinitionTest {
  public static void main(String[] args){ //エントリーポイント・・・プログラムの入口
    System.out.println("mainメソッド開始");
    int intSum = 0;
    double doubleSum = 0;
    int[] numbers = new int[3];
    numbers[0] = Integer.parseInt(args[0]);
    numbers[1] = Integer.parseInt(args[1]);
    numbers[2] = Integer.parseInt(args[2]);
    //足し算する処理→結果の戻り値をsumに代入
    //sum = add(number1, number2);  //返された値をセットしてあげる。
    //sum = add((int)5.0, 10);
    intSum = add(numbers);
    //足し算した結果を画面に表示する処理
    printSum(intSum);
    //doubleSum = add(30.5,70.5);
    //足し算した結果を画面に表示する処理
    //printSum(doubleSum);
    //System.out.println("mainメソッド終了");
  }

  public static int add(int[] numbers){
    System.out.println("int型[]のaddメソッド開始");
    int sum = 0;
    for(int i = 0; i < numbers.length; i++){
      System.out.println("numbers[" + i + "]:" + numbers[i]);
      sum += numbers[i];
    }
    //System.out.println("number1:" + number1);
    //System.out.println("number2:" + number2);
    //double sum = 0;
    System.out.println("int型[]のaddメソッド終了");
    //メソッドの閉じカッコ：呼び出したところに戻る
    return sum;
  }

/*  public static int add(int number1, int number2, int number3){
    System.out.println("int型のaddメソッド開始");
    System.out.println("number1:" + number1);
    System.out.println("number2:" + number2);
    System.out.println("number3:" + number3);
    int sum = 0;
    sum = number1 + number2 + number3;
    System.out.println("int型addメソッド終了");
    //メソッドの閉じカッコ：呼び出したところに戻る
    return sum;
  }

  public static double add(double number1, double number2){
    System.out.println("double型のaddメソッド開始");
    System.out.println("number1:" + number1);
    System.out.println("number2:" + number2);
    double sum = 0;
    sum = number1 + number2  ;
    System.out.println("double型のaddメソッド終了");
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
*/
  public static void printSum(int sum){
    System.out.println("int型のprintSumメソッド開始");
    System.out.println("sum" + sum);
    System.out.println("int型のprintSumメソッド終了");
  }

  public static void printSum(double sum){
    System.out.println("double型のprintSumメソッド開始");
    System.out.println("sum" + sum);
    System.out.println("double型のprintSumメソッド終了");
  }
  
}
