class CTest extends Thread {
    public String id;//建立字串id
    public CTest(String str) {
        id = str;//將傳入的資料匯入id
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(id + " " + i);
            }

        }
    }
}

public class Class02 {
    public static void main(String[] args) {
        CTest hi=new CTest("Hello");//建立物件
        CTest bye=new CTest("Good bye");
        hi.run();//呼叫run()
        bye.run();
    }
}