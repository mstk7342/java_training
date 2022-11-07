package Udemy;

public class WhileTest {
  public static void main(String[] args){
    System.out.println("番号");
    int number = 11; //番号(1から始まる)
    while(number <= 10 && number >= 1){ //（）の中の条件判定結果がtrueの場合：ブロック実行（繰り返す）/falseの場合：ブロックスキップ
      System.out.println(number + "!!");
      number--; //iに１を加える
    }
  }
}
