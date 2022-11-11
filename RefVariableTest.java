public class RefVariableTest {
  public static void main(String[] args){
    //基本データ型変数の宣言と初期化
    int num1 = 1;
    int num2 = num1;
    num2 += 1;
    System.out.println("num1:" + num1); //1?
    System.out.println("num2:" + num2); //2?

    //参照型(アドレスで参照している)変数の宣言と初期化
    int[] numArray1 = {1, 2};
    int[] numArray2 = numArray1;
    numArray2[1] += 1;
    numArray2 = null; //アドレスがなくなる
    for(int i = 0; i < numArray1.length; i++){
      System.out.println("numArray1[" + i + "]:" + numArray1[i]); //1, 2? → 1, 3
      System.out.println("numArray2:" + i + "]:" + numArray2[i]); //1, 3?
    }

  }
}
