package Sample6;

public class Sample6_8 {
    public static void main(String[] args){
        Company c = new Company();
        Driver d1 = new Driver(c);
        d1.start();

        Driver d2 = new Driver(c);
        d2.start();
    }
}

class Company{
    private int sum = 0;
    public synchronized void add(int a){
        int tmp = sum;
        System.out.println("目前的合計金額是" + tmp + "元");
        System.out.println("賺到" + a + "元了");
        tmp = tmp + a;
        System.out.println("合計金額是" + tmp + "元");
        sum = tmp;
    }
}
class Driver extends Thread{
    private Company cp;
    public Driver(Company c){
        cp = c;
    }
    public void run(){
        for(int i = 0; i < 3; i++){
            cp.add(30);
        }
    }
}
