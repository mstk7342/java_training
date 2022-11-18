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
    int k = 1;
    System.out.println("kの初期値" + k);
    while(k < 5){
      int l = 5;
      System.out.println("while:" + k + "周目.lの値:" + l);
      k++;
    }
      //System.out.println("ブロックを抜けた後のlの値" + l);  //スコープ外
      System.out.println("プログラム終了");
      System.out.println("kの終了値" + k);
    }
  }
}
