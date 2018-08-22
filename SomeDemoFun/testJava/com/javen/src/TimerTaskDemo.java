/**
 * Created by jinweih on 2018/8/14.
 * Timer类是一种线程设施，可以用来实现在某一个时间或者某一时间后安排某一任务执行一次或者定期重复执行。
 * 该功能需要和TimerTask配合使用  TimerTask用来实现Timer安排的一次或者重复执行的任务
 * 每一个Timer对象对应一个线程，因此计数器所执行的任务应该迅速完成，否则可能会延迟后续任务的执行。
 * 而这些后续的任务有可能堆在一起，等到该任务完成后才能快速连续执行
 */

import java.util.Timer;
import java.util.TimerTask;

import static java.lang.System.exit;

/**
 * Timer类中的常用方法
 *
 * public Timer()  构造 用来创建一个定时器并启动该定时器
 * public void cancel()   普通 用来终止定时器，并放弃所有的已安排的任务，对当前正在执行的任务没有任何影响
 * public int purge()      将所有已经取消的任务移除，一般用来释放内存空间
 * public void schedule(TimerTask task, Date time)   普通  安排一个任务在指定时间执行，如果已经超过该时间，则立即执行
 * public void schedule(TimerTask task, Date time, long period)  普通   安排一个任务在指定的时间执行，然后以固定的频率（单位：ms）重复执行
 * public void schedule(TimerTask task, long delay)  普通  安排一个任务在一段时间（单位：ms）后执行
 * public void schedule(TimerTask task, long delay, long period) 普通 安排一个任务在一段时间后执行，然后以固定的频率（单位：ms）重复执行
 * public void scheduleAtFixedRate(TimerTask task, Date firstTime, long period) 普通  安排一个任务在指定时间执行，然后以近似固定频率
 * public void scheduleAtFixedRate(TimerTask task, long delay, long period)
 */

class MyTask extends TimerTask {
    private String name;
    private static int count;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void run() {
        if (10 > count) {
            System.out.println("TimerTask 定时执行！ " + count++);
        } else {
            this.cancel();
        }
    }
}
public class TimerTaskDemo {
    public static void main(String args[]) {
        Timer timer = new Timer();
        MyTask myTask = new MyTask();
        timer.schedule(myTask, 10000, 1000);
    }
}
