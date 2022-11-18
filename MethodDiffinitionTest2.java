public class MethodDiffinitionTest2 {
  public static void main(String[] args){ //エントリーポイント・・・プログラムの入口
    System.out.println("mainメソッド開始");
    int intSum = 0;
    double doubleSum = 0;
    //int[] numbers = new int[3];
    int number1 = Integer.parseInt(args[0]);
    int number2 = Integer.parseInt(args[1]);
    int number3 = Integer.parseInt(args[2]);
    //足し算する処理→結果の戻り値をsumに代入
    //sum = add(number1, number2);  //返された値をセットしてあげる。
    //sum = add((int)5.0, 10);
    intSum = add(number1, number2, number3, 500);
    //足し算した結果を画面に表示する処理
    printSum(intSum);
    //doubleSum = add(30.5,70.5);
    //足し算した結果を画面に表示する処理
    //printSum(doubleSum);
    //System.out.println("mainメソッド終了");
  }

  // public static int add(int[] numbers){
  //   System.out.println("int型[]のaddメソッド開始");
  //   int sum = 0;
  //   for(int i = 0; i < numbers.length; i++){
  //     System.out.println("numbers[" + i + "]:" + numbers[i]);
  //     sum += numbers[i];
  //   }
  //   System.out.println("int型[]のaddメソッド終了");
  //   //メソッドの閉じカッコ：呼び出したところに戻る
  //   return sum;
  // }

  public static int add(int... numbers){  //可変長引数の記載方法[...]
    System.out.println("int型[]のaddメソッド開始");
    int sum = 0;
    for(int i = 0; i < numbers.length; i++){
      System.out.println("numbers[" + i + "]:" + numbers[i]);
      sum += numbers[i];
    }
    System.out.println("int型[]のaddメソッド終了");
    //メソッドの閉じカッコ：呼び出したところに戻る
    return sum;
  }
  
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
