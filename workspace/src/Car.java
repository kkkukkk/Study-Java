public class Car {
    String brand;
    String color;
    int price;
    String pw;
    boolean check;

    boolean checkpw(String pw){
        return this.pw.equals(pw);
    }
    //시동 켜기
    boolean engineStart(){
        return !check; 
    }

    boolean engineStop(){
        return check;
    }
}
    //시동 끄기
