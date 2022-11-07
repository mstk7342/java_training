public class VariableTest{
  public static void main(String[] args){
    int myAge; //変数宣言：情報が入る箱の形を決めて、コンピューターに伝える
    myAge = 35; //変数の初期化
    myAge = 40; //変数の上書き
    // myAge = "ABC"; //不適切な型 → Javaは「静的型付け言語」なので、一度決めた型を変更できない。
    System.out.println(myAge);
  }
}