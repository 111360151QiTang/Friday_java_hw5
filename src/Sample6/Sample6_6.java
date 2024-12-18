package Sample6;

class Sample6_6 {
    public static void main(String[] args){
        Car car1 = new Car("13號車");
        Thread t1 = new Thread(car1);
        t1.start();

        for(int i = 0; i < 4; i++) {
            System.out.println("結束main()的處理工作");
        }
    }
}
class Car implements Runnable{
    private String name;
    public Car(String n){
        name = n;
    }
    public void run(){
        for(int i = 0; i < 4; i++){
            System.out.println("正在進行" + name + "的處理");
        }
    }
}
