public class ConvertVer {

  public static void main(String[] args){
    int number1 =100; //約21億
    long number2 =200; //約900京
    System.out.println("number1:" + number1);
    System.out.println("number2:" + number2);

    number2 = number1; //longの変数にintの値を代入(long>int)
    System.out.println("long number2: ← int number1");
    System.out.println("number1:" + number1);
    System.out.println("number2:" + number2);

    number1 = 100;
    number2 = 200; 
    number1 = (int)number2; //intの変数にlongの値を「削って（キャスト）」代入(long>int)
    System.out.println("long number2: ← int number1:" + number1);
    System.out.println("number1:" + number1);
    System.out.println("number2:" + number2);

    double number3 = 10.5;
    number2 = (long)number3; //longの変数にdoubleの値を「削って（キャスト）」代入(long<double)
    System.out.println("double number3: ← long number2:");
    System.out.println("number2:" + number2);
    System.out.println("number3:" + number3);

  }

}
