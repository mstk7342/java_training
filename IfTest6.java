public class IfTest6 {
  public static void main(String[] args){
    int a = 5;
    int b = 11;
    a++;
    b--;
    //インクリメントとデクリメントは単体で使用した方がいい。
    if(a == 6 && b == 10){  //前置と後置で比較する→短略評価は？(||)左が成立すると右は無視(&&)左が不成立だと右は無視
       System.out.println("条件成立！");
       System.out.println("a:" + a);
       System.out.println("b" + b);
    }else{
      System.out.println("条件不成立！");
      System.out.println("a:" + a);
      System.out.println("b" + b);
    }
  }
}