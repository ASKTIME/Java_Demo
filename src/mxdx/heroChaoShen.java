package mxdx;

public class heroChaoShen {
    String name;
    int hp;
    int dp;
    int moveSpeed;
    void keng(){
        System.out.println("坑人");
    }

    void legendray(){
        System.out.println("你已超神");
    }
    //获取当前血量
    int getHp(){
        return hp;
    }

    void recovery(float blood){
        System.out.println("当前血量：" + blood);
    }


    public static void main(String[] args) {
        heroChaoShen green = new heroChaoShen();
        green.name = "盖伦";
        green.hp = 100;
        green.getHp();
        green.recovery(100);
        green.legendray();
    }
}
