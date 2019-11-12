/**
 * @author zth
 * @date 2019/10/20 18:35
 */
//实现死锁
public class Test2 {
    public static String lock1 = "lock1";
    public static String lock2 = "lock2";

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Thread1());
        Thread thread2 = new Thread(new Thread2());
        thread1.start();
        thread2.start();

    }

}
class Thread1 implements Runnable{

    @Override
    public void run() {
        synchronized(Test2.lock1){
            System.out.println("Thread1获得了第一个锁");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (Test2.lock2){
                System.out.println("Thread1获得第二个锁");
            }
        }
    }
}
class Thread2 implements Runnable{

    @Override
    public void run() {
        synchronized(Test2.lock2){
            System.out.println("Thread2获得了第二个锁");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (Test2.lock1){
                System.out.println("Thread2获得第一个锁");
            }
        }
    }
}
