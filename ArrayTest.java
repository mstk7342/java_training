public class ArrayTest {
  public static void main(String[] args){
    String name = "鈴木太郎";
    String email = "suzuki_taro@xxxx.com";
    String phone = "090-0000-9999";
    System.out.println(name);
    System.out.println(email);
    System.out.println(phone);

    System.out.println();

    String[] customer; //String型の配列を宣言
    //customer = "鈴木太郎"; //Sting[]とStringは=ではない
    //customer[0] = "鈴木太郎"; //配列を宣言した後、配列の初期化せずにいきなり代入できない。
    customer = new String[3];
    customer[0] = "鈴木太郎"; //[0]で1番目。0から開始する。これを「添字」または「index」という。その値が入る箱を「要素」という。
    customer[1] = "suzuki_taro@xxxx.com";
    customer[2] = "090-0000-9999";

    //System.out.println(customer[0]);
    //System.out.println(customer[1]);
    //System.out.println(customer[2]);

    //通常のforループのパターン
    for(int i = 0; i < customer.length; i++){ //customer.length・・・個数の上限まで繰り返してくれる。
      System.out.println(customer[i]);
    }

    System.out.println();

    //String customer2;
    //customer2 = {"鈴木太郎","suzuki_taro@xxxx.com", "090-0000-9999"}; //{}で初期化する場合、宣言と初期を分けられない！
    //String[] customer2;
    //customer2 = new String[] {"鈴木太郎","suzuki_taro@xxxx.com", "090-0000-9999"}; //new型名[]{}で初期化する場合、宣言と初期化に分けられる。
    String[] customer2 = {"鈴木太郎","suzuki_taro@xxxx.com", "090-0000-9999"}; //new 型名[]で初期化する場合、宣言と初期化を同時に行う
    // System.out.println(customer[0]);
    // System.out.println(customer[1]);
    // System.out.println(customer[2]);
    //拡張for文のパターン
    for(String customer2Value : customer2){
      System.out.println(customer2Value);
    }
  }
}