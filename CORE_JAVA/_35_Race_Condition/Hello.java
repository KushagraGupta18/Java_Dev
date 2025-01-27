
public class Hello {
    public static void main(String[] args) throws InterruptedException{
        Counter c=new Counter();

        Runnable obj1=()->{
            for (int i = 1; i <=1000; i++) {
                c.increament();
            }
        };
        Runnable obj2=()->{
            for (int i = 1; i <=1000; i++) {
               c.increament();
            }
        };
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();
        // System.out.println(c.count);//it will print some value but not 2000

        //for completing the work of t1 and t2 and it comes back after that count will print for this we can do join() method.
        //join() method----> It allows your main thread to wait for the other two thread to comeback and join. 
        t1.join();
        t2.join();
        // System.out.println(c.count);//it will print approx 2000 //Threads are sometime unpredictable we can't control directly because for two thread it will execute once at same condition suppose count=3 in both threads they both are increament that at same time then count will be 4 and then our output will be inappropriate it will give some lesser value then 2000 sometime
        //this is the problem for save this we have to work with one thread at one time for this we used one keyword synchronized.
        //By synchronized keyword our threads are working seperately
        //By synchronized keyword , we are working with two thread with shared variable and we make them as synchronized. So basically we save this from RACE CONDITION.
        System.out.println(c.count); 
    }
}
class Counter{
    int count;
    public synchronized void increament(){//now by synchronized keyword increment method will call by one thread at one time not by both. If t1 is working with increment t2 has to wait
        count++;
    }
}