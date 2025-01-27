
public class Hello {
    public static void main(String[] args) {
        A obj1=new A();
        B obj2=new B();
        // obj1.setPriority(Thread.MAX_PRIORITY);//it said that this thread is having a highest priority.
        // System.out.println(obj1.getPriority());//range of priority is from 1(Minimum) to 10(highest) , 5 is the default priority of every thread
        // obj1.show();
        // obj2.show();
        //Firstly my code will run line by line sequentially but i want to execute both task parallelly for this i have to use multiple threads
        
        //start is a method belongs to a Thread class. It will create a new thread for you but it will calls a run() method. thats why in every thread run() method is necessary
        obj1.start();
        try{
            Thread.sleep(2);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        obj2.start();
        //Now things are running parellel behing the scene two methods are actually running at the same time. Behind the scene concept of scheduler is used
        //Scheduler says if you want to do anything you have to come to me first , At this time we have multiple core cpu. if i have 8 core cpu i can execute 8 threads at a same time. but if we have 2000 thread then it is used the time sharing method by the help of the concept scheduler.
        //Scheduler is responsible for allow a thread to execute.
        //Scheduler is allow which thread is have to execute

    }    
}

class A extends Thread{
    public void run(){
        for (int i = 0; i <=100; i++) {
            System.out.println("hi");
            try{
                Thread.sleep(10);//after every execution step means once you print hi A thread will go into waiting stage and then B thread will print "Hello" 
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for (int i = 0; i <=100; i++) {
            System.out.println("hello");
            try{
                Thread.sleep(10);//after every execution step means once you print hi B thread will go into waiting stage 
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

