package Udemy;

public class ForTest {
  public static void main(String[] args){
    for(int i = 1; i <= 10; i++){
      // int n = i + 1;
      // System.out.println("繰り返し" + n + "周目");
      if( i == 5){
        //break; //ループを中断する。
        System.out.println("次のループに進む");
        continue; //次のループ（周）に進む
        //特定の処理など飛ばしたい時に使う。（例）ECサイトなどの購入リストで削除した商品を除く時に使う。
      }
      System.out.println("繰り返し" + i + "周目");
    }
  }
}
