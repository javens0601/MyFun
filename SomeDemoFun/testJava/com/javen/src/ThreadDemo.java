/**
 * Created by jinweih on 2018/8/12.
 * 多线程
 * 线程同步 synchronized
 */
class MyThread  implements  Runnable {
    private int ticket = 5;
    public void  run (){
        for (int i =0 ; i < 100; i++){
            this.sale();
        }
    }
    public synchronized void sale() {
        if (ticket > 0) {
            try {
                Thread.sleep(50);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("卖票 --->> " + ticket--);
            System.out.println("覆写 Runnable 接口run方法！-->> " + Thread.currentThread().getName());
        } else {

        }
    }
}

public class ThreadDemo {
    public static void main(String args[]){
        MyThread myThread1 = new MyThread();
        Thread t1 = new Thread(myThread1, "MyThread_ONE");
        Thread t2 = new Thread(myThread1, "MyThread_TWO");
        Thread t3 = new Thread(myThread1, "MyThread_THR");
        t1.start();
        t2.start();
        t3.start();
    }
}
