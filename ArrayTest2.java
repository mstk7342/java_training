public class ArrayTest2 {
  public static void main(String[] args){

    int a = 3;
 /*    String[] customer; //String型の配列を宣言
    customer = new String[3];　//上限が三個
    switch(a){
      case 1:
        customer[0] = "鈴木太郎"; //[0]で1番目。0から開始する。これを「添字」または「index」という。その値が入る箱を「要素」という。
        customer[1] = "suzuki_taro@xxxx.com";
        customer[2] = "090-0000-9999";
      case 2:
        customer[0] = "鈴木太郎"; 
        customer[1] = "suzuki_taro@xxxx.com";
      case 3:
      customer[0] = "鈴木太郎"; 

    }
    // customer[0] = "鈴木太郎"; //[0]で1番目。0から開始する。これを「添字」または「index」という。その値が入る箱を「要素」という。
    // customer[1] = "suzuki_taro@xxxx.com";
    // customer[2] = "090-0000-9999";

    //通常のforループのパターン
    for(int i = 0; i < customer.length; i++){ //customer.length・・・個数の上限まで繰り返してくれる。
      if(customer[i] != null){ //nullを表示しなくなる。
        System.out.println(customer[i]);
      }
    }*/

    //System.out.println();

    //String[] customer2 = {"鈴木太郎","suzuki_taro@xxxx.com", "090-0000-9999"}; //new 型名[]で初期化する場合、宣言と初期化を同時に行う


    String[] customer2;
    switch(a){
      case 1:
        customer2 = new String[]{"鈴木太郎","suzuki_taro@xxxx.com", "090-0000-9999"};
        break;
      case 2:
        customer2 = new String[]{"鈴木太郎","suzuki_taro@xxxx.com"};
        break;
      default:
        customer2 = new String[]{"鈴木太郎"}; 
        break;

    }

    //拡張for文のパターン
    for(String customer2Value : customer2){
      System.out.println(customer2Value);
    }
  }
}