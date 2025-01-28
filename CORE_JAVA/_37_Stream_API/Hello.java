import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.function.Predicate;


public class Hello {
    public static void main(String[] args) {

        List<Integer> nums=Arrays.asList(4,5,7,2,6,3);
        // nums.forEach(n->System.out.println(n));
        //forEach() methdo takes an object of a Consumer
        
        // Consumer<Integer> con=new Consumer<Integer>(){
        //     public void accept(Integer n){
        //         System.out.println(n);
        //     }
        // };

        //As Consumer Interface is a function interface so we can make it as a lambda expression
        // Consumer<Integer> con=(Integer n)->System.out.println(n);
       
        // Consumer<Integer> con=n->System.out.println(n);
        // nums.forEach(con);//forEach needs an object and we are passing an object as con. forEach gives you one value at a time whatever value you are giving that goes to the consumer object and the consumer object has only one method which is accept

        // nums.forEach(n->System.out.println(n));


        
        
        // int sum=0;
        // for(int n:nums){
        //     if(n%2==0){
        //         n=n*2;
        //         sum=sum+n;
        //     }
        // }
        

        //We find a amazing thing that is Stream API for doing this calculation
        //Stream is an interface
        // nums.stream();//stream() returns an object of Stream
        Stream<Integer> s1=nums.stream();//By this we got all the values of list in this Stream s1.Now with this Stream you can perform any operation and the beauty is it will not going to affect the nums. So, whatever changes you make the Stream it will not affect nums
        // s1.forEach(n->System.out.println(n));
        
        //Once you use the Stream you can't reuse it and thats why the name is Stream(flow of water)
        // s1.forEach(n->System.out.println(n));
        //giving error (stream has already been operated upon or closed)

        Stream<Integer> s2=s1.filter(n->n%2==0);
        // s2.forEach(n->System.out.println(n));

        Stream<Integer> s3=s2.map(n->n*2);
        // s3.forEach(n->System.out.println(n));

        int result=s3.reduce(0,(c,e)->c+e);
        System.out.println(result);
        //Stream makes your work easy by using following methods


        //you can also write everything in one line
        int res=nums.stream()
                    .filter(n->n%2==0)
                    .map(n->n*2)
                    .reduce(0,(c,e)->c+e);
        System.out.println(res);


        //-----How Filter Works
        //filter method wants Predicate that contains a method test
        // Predicate<Integer> p=new Predicate<Integer>(){
        //     public boolean test(Integer n){
        //         return n%2==0;
        //     }
        // };
        //since predicate is a functional interface we can convert in lambda expression
        // Predicate<Integer> p=(Integer n)-> n%2==0;
        // Predicate<Integer>p=n-> n%2==0;
        // int ress=nums.stream()
        //             .filter(p)
        //             .map(n->n*2)
        //             .reduce(0,(c,e)->c+e);
        // System.out.println(ress);  
        


        //-----How map works
        //map needs an object of a Function that is having two type and a method called apply()

        // Function<Integer,Integer> fun=new Function<Integer,Integer>() {
            
        //     public Integer apply(Integer n){
        //         return n*2;
        //     }
        // };
        // Function<Integer,Integer> fun=(Integer n)->n*2;
        // Function<Integer,Integer> fun=n->n*2;
        // int ress=nums.stream()
        //             .filter(n->n%2==0)
        //             .map(fun)
        //             .reduce(0,(c,e)->c+e);
        // System.out.println(ress);




        //-----How reduce works
        //reduce take two parameter one is the type and second is the operation
        //and in .reduce(0, (c,e)->c+e);
        //0 is the initialization and c and e are two elements whom we are performing operation

        //sorting-->
        Stream<Integer> sortedValues=nums.stream()
                                         .filter(n->n%2==0)
                                         .sorted();
        sortedValues.forEach(n->System.out.println(n));


        //when we want to filtering with multiple thread then there is a method parallelStream()
        Stream<Integer> sortedValues1=nums.parallelStream()
                                         .filter(n->n%2==0);
        sortedValues1.forEach(n->System.out.println(n));
    }
}
