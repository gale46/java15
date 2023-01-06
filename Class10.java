class CTest implements Runnable {
    public String id;// 建立字串id
    int time = 0;
    public CTest(String str) {
        id = str;// 將傳入的資料匯入id
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 10; j++) {
                try{
                    time = (int)(Math.random()*3);
                    Thread.sleep(time);
                    System.out.println(time);
                }catch{}
                System.out.println(id + " " + i);
            }

        }
    }
}

public class Class10 {
    public static void main(String[] args) {
        CTest hi = new CTest("Hello");// 建立物件
        CTest bye = new CTest("Good bye");
        Thread t1 = new Thread(hi);
        Thread t2 = new Thread(bye);
        t1.start(); 
        t2.start();
    }
}