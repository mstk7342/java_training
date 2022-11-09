public class VariableTest{
  public static void main(String[] args){
    //基本データ型の変数は初期化しなけらばならない
    int myAge; //変数宣言：情報が入る箱の形を決めて、コンピューターに伝える
    myAge = 35; //変数の初期化
    //myAge = 40; //変数の上書き
    // myAge = "ABC"; //不適切な型 → Javaは「静的型付け言語」なので、一度決めた型を変更できない。
    // myAge = myAge + 5;
    System.out.println(myAge);


    int[] ourAges =new int[5];  //数値(byte,short,int,long,float,double)のデータ型には0が初期値
    System.out.println(ourAges[1] + 5); //2番目を表示：初期値として０が元々代入されている。

    boolean[] isChild =new boolean[5];  //boolean型の場合、初期値はfalseが初期値
    System.out.println(isChild[1]); //2番目を表示：初期値としてfalseが元々代入されている。

    char[] letter = new char[5];  //charのデータ型には''が初期値
    System.out.println(letter[1]); //2番目を表示：初期値として''が元々代入されている。

    String[] text = new String[5];  //charのデータ型にはnullが初期値
    System.out.println(text[1]); //2番目を表示：初期値としてnullが元々代入されている。
  }
}