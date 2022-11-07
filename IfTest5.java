public class IfTest5 {
  public static void main(String[] args){
    int myAge = 50;
    //char myBloodType = 'AB';
    String myBloodType = "不明";
    if(myAge == 35 || myBloodType.equals("B")){ //年齢と血液型の片方が条件成立する場合
      System.out.println("私の年齢は35歳または血液型はB型です！。");
    } else if(myAge == 35 || myBloodType.equals("A")){
      System.out.println("私の年齢は35歳または血液型はA型です！");
    } else if(myAge == 40 || myBloodType.equals("O")){
      System.out.println("私の年齢は40歳または血液型はO型です");
    } else if(myAge == 40 || myBloodType.equals("AB")){
      System.out.println("私の年齢は40歳または血液型はAB型です");
    }else{
      System.out.println("私の年齢と血液型はあなたの考えていることとは違います");
    }
    System.out.println("私の出身地は・・・");
    
  }
}