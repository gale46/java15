
class Add implements Runnable
{
   private int n;
   private int sum = 0;
   public Add(int a)
   {
      n=a;
   }
   public void run()
   {
      for(int i = 1;i <= n; i++)
      {
         sum += i;
      }
      System.out.println(sum);
   }
}

public class Class06
{
   public static void main(String args[])
   {
      Add a1 = new Add(5);//建立n = 5的物件
      Add a2 = new Add(10);
      Thread t1 = new Thread(a1);//實作run()
      Thread t2 = new Thread(a2);
      t1.start();//執行thread動作
      t2.start();
   }
}
