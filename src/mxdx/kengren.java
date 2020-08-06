package mxdx;

public class kengren {
    String name;
    int hp;
    int dp;
    int moveSpeed;
    void keng(){
        System.out.println("坑人");
    }
    //返回护甲值的方法
    int getHp(){
        return hp;
    }

    //增加移动速度
    void addMoveSpeed(int speed){
        moveSpeed = moveSpeed + speed;
    }

    public static void main(String[] args) {
        kengren green = new kengren();
        green.name = "盖伦";
        green.hp = 100;
        green.dp = 80;
        green.moveSpeed = 50;
        green.addMoveSpeed(50);
        green.keng();
    }
}


