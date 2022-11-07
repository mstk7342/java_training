package Udemy;

public class DoWhileTest {
  public static void main(String[] args){
    System.out.println("多い番号");
    int number = 11; //番号(1から始まる)
    do{
      System.out.println(number + "!!");
      number--; //numberに１を減算する
    }while(number <= 10 && number >= 1); // ()の中の条件判定結果がtrueの場合：doに戻る（繰り返す）/ falseの場合：そのまま下へ
  }
}