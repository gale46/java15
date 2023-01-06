class D implements Runnable {
    private String id;
    private int time;

    public D(String string, int i) {
        id = string;
        time = i;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {}
                // TODO Auto-generated catch block
                System.out.println("thread" + id + " is running..");
            

        }
    }

}

public class Class09 {
    public static void main(String[] args) {
        D d1 = new D("1", 1000);
        D d2 = new D("2", 2500);
        Thread t1 = new Thread(d1);
        Thread t2 = new Thread(d2);
        t1.start();
        t2.start();

    }

}