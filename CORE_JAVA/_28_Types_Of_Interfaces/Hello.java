
public class Hello {
    public static void main(String[] args) {
        // for(String str:args){   //java Hello.java 10 20 30 40
        //     System.out.println(str);
        // }   

        // A obj=new A(){
        //     public void show(){
        //         System.out.println("In show");
        //     }
        // };
        
        //lambda expression---> we just simplify the anonymous class and we can do only in functional interfaces
        //for using lambda expression , in objects there should be only one function that is functional interface and it will give us synatically sugar anonymous function
        A obj= ()->{    //lambda expression (behind the scene all the code will run, syntatically it is good that we dont want to write an extra stuff in our code from java 8 )
            System.out.println("in show");
        };
        obj.show();
        //for single statement we can also remove the curly braces how good the code is looking
        A obj1=()->System.out.println("in show");
        obj1.show();
        

        B obj2=new B(){
            public void show(int i){
                System.out.println("In B show"+i);
            }
        };  
        obj2.show(10);

        // B obj3=(int i)->{
        //         System.out.println("In B show"+i);
        //     };  
        // obj3.show(10);
        // B obj3=(int i)->System.out.println("In B show"+i);
        // B obj3=(i)->System.out.println("In B show"+i);
        B obj3= i ->System.out.println("In B show"+i);
        obj3.show(10);
        

        
        // C ob=(i,j)->{
        //     return i+j;
        // };
        //whenever there is only one statement and that is returning anything then we sould remove return when we dont want use curly braces
        C ob=(i,j)->i+j;
        System.out.println(ob.add(10,20));
    

        D obj10=n-> n*n;
        System.out.println(obj10.square(2));
        //Lambda Expression only works with the functional interface, if there are two methods in interface then lambda expression can't understand which method should have to run.
    }
}


//functional interface(SAM --->Single abstract method interface)
@FunctionalInterface//only one method
interface A{
    void show();
}

@FunctionalInterface
interface B{
    void show(int i);
}
//Sometimes you only want to shorten the code reduce the number of line.In java 8 we get an amazing feature lambda expression. we can use lambda expression only with functional interface

@FunctionalInterface
interface C{
    int add(int i,int j);
}
interface D{
    int square(int n);
}

// class B implements A{
//     public void show(){
//         System.out.println("In Show");
//     }
// }