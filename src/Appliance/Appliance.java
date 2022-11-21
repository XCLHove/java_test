package Appliance;

public interface Appliance {
    void recive(String key);
}
class Tv implements Appliance{
    int volume = 7;
    boolean status = false;
    public void recive(String key) {
        if (!status){
            if (key.equals("on")){
                status = true;
                System.out.println("已经为您打开电视！");
            }
            else {
                System.out.println("请打开电视再操作！");
            }
        }
        else{
            if (key.equals("off")){
                status = false;
                System.out.println("已经为您关闭电视！");
            }
            else if (key.equals("on")){
                System.out.println("电视已打开！");
            }
            else if(key.equals("up")){
                if(volume < 15){
                    volume++;
                    //System.out.println("当前音量:" + volume);
                }
                else{
                    System.out.println("已为最大音量:" + volume);
                }
            }
            else{
                if(volume > 1){
                    volume--;
                    //System.out.println("当前音量:" + volume);
                }
                else{
                    volume = 0;
                    System.out.println("已静音！");
                }
            }
        }
    }
    public String toString() {
        if(status){
            return "电视机已打开，" + "音量:" + volume;
        }
        else{
            return "电视机处于关闭状态！";
        }
    }
}
class Fan implements Appliance{
    int speed = 1;
    boolean status = false;
    public void recive(String key) {
        if (!status){
            if (key.equals("on")){
                status = true;
                System.out.println("已经为您打开风扇！");
            }
            else {
                System.out.println("请打开风扇再操作！");
            }
        }
        else{
            if (key.equals("off")){
                status = false;
                System.out.println("已经为您关闭风扇！");
            }
            else if (key.equals("on")){
                System.out.println("风扇已打开！");
            }
            else if(key.equals("up")){
                if(speed < 3){
                    speed++;
                    //System.out.println("当前风速:" + speed + "档");
                }
                else{
                    System.out.println("已为最大风速:" + speed + "档");
                }
            } else{
                if(speed > 1){
                    speed--;
                    //System.out.println("当前风速:" + speed + "档");
                }
                else{
                    System.out.println("已为最小风速:" + speed + "档");
                }
            }
        }
    }
    public String toString() {
        if(status){
            return "风扇已打开，" + "风速:" + speed;
        }
        else{
            return "风扇处于关闭状态！";
        }
    }
}
class AirCond implements Appliance{
    int tempe = 25;
    boolean status = false;
    public void recive(String key) {
        if (!status){
            if (key.equals("on")){
                status = true;
                System.out.println("已经为您打开空调！");
            }
            else {
                System.out.println("请打开空调再操作！");
            }
        }
        else{
            if (key.equals("off")){
                status = false;
                System.out.println("已经为您关闭空调！");
            }
            else if (key.equals("on")){
                System.out.println("空调已打开！");
            }
            else if(key.equals("up")){
                if(tempe < 30){
                    tempe++;
                    //System.out.println("当前温度:" + tempe + "度");
                }
                else{
                    System.out.println("已为最高温度:" + tempe + "度");
                }
            }
            else{
                if(tempe > 18){
                    tempe--;
                    //System.out.println("当前温度:" + tempe + "度");
                }
                else{
                    tempe = 17;
                    System.out.println("已为最低温度:" + tempe + "度");
                }
            }
        }
    }
    public String toString() {
        if(status){
            return "空调已打开，" + "温度:" + tempe;
        }
        else{
            return "空调处于关闭状态！";
        }
    }
}
class user{
    Appliance appliance;
    void toward(Appliance app){
        appliance = app;
    }
    void Press(String key){
        appliance.recive(key);
    }
}
class Demo {
    public static void  main(String args[]){
        user u1 =new user();
        Tv tv = new Tv();
        Fan fan =new Fan();
        AirCond airCond =new AirCond();
        //
        u1.toward(tv);
        System.out.println(tv);
        u1.Press("down");
        u1.Press("up");
        u1.Press("off");
        u1.Press("on");
        for(int i = 0;i < 10;i++){
            u1.Press("up");
        }
        for(int i = 0;i < 17;i++){
            u1.Press("down");
        }
        u1.Press("off");
        //
        u1.toward(fan);
        System.out.println(fan);
        u1.Press("down");
        u1.Press("up");
        u1.Press("off");
        u1.Press("on");
        for(int i = 0;i < 3;i++){
            u1.Press("up");
        }
        for(int i = 0;i < 4;i++){
            u1.Press("down");
        }
        u1.Press("off");
        //
        u1.toward(airCond);
        System.out.println(airCond);
        u1.Press("down");
        u1.Press("up");
        u1.Press("off");
        u1.Press("on");
        for(int i = 0;i < 7;i++){
            u1.Press("up");
        }
        for(int i = 0;i < 15;i++){
            u1.Press("down");
        }
        u1.Press("off");
    }
}