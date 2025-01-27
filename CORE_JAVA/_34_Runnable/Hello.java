
public class Hello {
    public static void main(String[] args) {
        
        //Reference of the interface and object of a class
        // Runnable obj1=new A();
        // Runnable obj2=new B();
        
        // Runnable obj=new Runnable(){
        //     public void run(){
        //         for (int i = 1; i <=5; i++) {
        //             System.out.println("hi");
        //             try{
        //                 Thread.sleep(10);
        //             }
        //             catch(InterruptedException e){
        //                 e.printStackTrace();
        //             }
        //         }
        //     }
        // };

        
        //In lambda Expression we can convert this runnable in lambda expression because Runnable is a functional interface.
        Runnable obj1=()->{
            for (int i = 1; i <=5; i++) {
                System.out.println("hi");
                try{
                    Thread.sleep(10);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        Runnable obj2=()->{
            for (int i = 1; i <=5; i++) {
                System.out.println("hello");
                try{
                    Thread.sleep(10);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        
        //Runnable interface doesn't have thread method you need to create seperate thread and we can use these features
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();
    }
}

// class A implements Runnable{ //Thread class implements Runnable interface and it is having a run method
//     public void run(){
//         for (int i = 1; i <=5; i++) {
//             System.out.println("hi");
//             try{
//                 Thread.sleep(10);
//             }
//             catch(InterruptedException e){
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B implements Runnable{
//     public void run(){
//         for (int i = 1; i <=5; i++) {
//             System.out.println("hello");
//             try{
//                 Thread.sleep(10);//after every execution step means once you print hi A thread will go into waiting stage and then B thread will print "Hello" 
//             }
//             catch(InterruptedException e){
//                 e.printStackTrace();
//             }
//         }
//     }
// }

