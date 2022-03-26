package DemoPack;

class Util{
    static void sleep(Long millis){
        try{
            Thread.sleep(millis);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
class Shared {
    synchronized void test1(Shared s2) {
        System.out.println("Test1 .....begins   "+Thread.currentThread().getName());
        Util.sleep(1000L);
        s2.test2();
        System.out.println("Test1....ends  "+Thread1.currentThread().getId());
    }

    synchronized void test2() {
        System.out.println("Test2....Begins   "+Thread.currentThread().getName());
        Util.sleep(1000L);
        System.out.println("Test2.....ends   "+Thread.currentThread().getId());
    }
}
class Thread1 extends Thread
        {
    private Shared s1;
    private Shared s2;

    public Thread1(Shared s1, Shared s2)
        {
            this.s1=s1;
            this.s2=s2;
        }
        public void run(){
        s1.test1(s2);
        }
        }
        class Thread2 extends Thread{
    private Shared s1;
    private Shared s2;
    public Thread2(Shared s1,Shared s2){
        this.s1=s1;
        this.s2=s2;
          }
          public void run(){
           s2.test1(s1);}
        }
public class DeadLockDemo {
    public static void main(String[] args)  {
        Shared s1 = new Shared();
        Shared s2 = new Shared();
        Thread1 t1 = new Thread1(s1,s2);
        t1.setName("DruCareT1");
        t1.start();
        System.out.println("Thread 1 state"+t1.getState());
       Thread2 t2 = new Thread2(s1,s2);
       t2.setName("DrucareT2");
        System.out.println("Thread 2 State  :"+t2.getState());
        Util.sleep(2000l);
        t2.start();
        Util.sleep(1000l);
    }
}

