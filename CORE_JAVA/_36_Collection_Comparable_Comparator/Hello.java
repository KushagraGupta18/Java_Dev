
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class Hello {
    public static void main(String[] args) {
        //Colletion is an interface i can't instansiated it.
        // Collection nums=new 

        // Collection nums=new ArrayList<>();
        //It will give warning because we don't define the type of collection .This says value you are added are not number they are object type. 
        
        //By angular braces(generics) we can take any type that we have to work with.
        // Collection<Integer> nums=new ArrayList<>();
        //ArrayList is a class which implements a List . List does have a method called get so for using index value i have to make object by reference of List.
        List<Integer> nums=new ArrayList<>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        nums.add(6);
        // System.out.println(nums.indexOf(5));
        for(int i=0;i<nums.size();i++){
            System.out.println(nums.get(i));
        }
        System.out.println("******************");


        Iterator<Integer> values=nums.iterator();
        while(values.hasNext()){
            System.out.println(values.next());
        }


        System.out.println("******************");
        Set<Integer> nums1=new HashSet<>();
        nums1.add(6);
        nums1.add(5);
        nums1.add(8);
        nums1.add(2);
        nums1.add(6);
        for(int n:nums1){
            System.out.println(n);
        }

        //Map is a interface and we can't instanciate it so we have to instantiate a HashMap that is a class
        Map<String, Integer> students=new HashMap<>();
        // Map<String, Integer> students1=new Hashtable<>();
        //If you want to use synchronized version you can use Hashtable and if you want normal version then you can use HashMap

        students.put("kush", 96);
        students.put("navib", 97);
        students.put("bino", 68);
        students.put("kiran", 65);
        students.put("kush", 99);
        System.out.println(students);
        

        List<Integer> list=new ArrayList<>();
        list.add(43);
        list.add(31);
        list.add(72);
        list.add(29);
        //Collections is a class which have many methods from which sort() method is also there
        // Collections.sort(list);
        
        //For changing the logic of sort() method we have to use Comparator

        //Comparator is a interface so we can make instatiate of a class or use anonymous class
        Comparator<Integer> com=new Comparator<Integer>(){
            public int compare(Integer i, Integer j) {
                // return 1;//it will swap 
                // return -1;//it will not swap
                //return i-j;//it will swap two values when i> jbecuase if i > j then we have i-j >0 then it will swap it and we got all elements in ascending order because larger element reach to the end at every iterations
                //return j-i;//it will swap two values when i < j becuase if i < j then we have i-j <0 then it will not swap it and we got all elements in descending order because smaller element reach to the end at every iteration
                if(i%10 > j%10){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };

        Collections.sort(list,com);
        System.out.println(list);


        List<String> ll=new ArrayList<>();
        ll.add("kush");
        ll.add("kusha");
        ll.add("kushag");
        ll.add("kushagr");
        ll.add("kushagra");
        // Comparator<String> com1=new Comparator<String>(){
            
        //     public int compare(String a, String b){
        //         if(a.length()> b.length()){
        //             return 1;
        //         }    
        //         else{
        //             return -1;
        //         }
        //     }
        // };
        
        //As comparator is a function interface so we can use lambda expression
        // Comparator<String> com1=(String a, String b)->{
        //     return a.length()>b.length()?1:-1;
        // };
        
        //Entire Comparator is convert into one line
        Comparator<String> com1=(String a, String b)->a.length()>b.length()?1:-1;

        Collections.sort(ll,com1);
        System.out.println(ll);
        //comparator is a concept or an interface using which we can build our own logic

        List<Student> stu=new ArrayList<>();
        stu.add(new Student(21,"Kush"));
        stu.add(new Student(12,"John"));
        stu.add(new Student(18,"Paru"));
        stu.add(new Student(20,"Kiran"));
        for(Student s:stu){
            System.out.println(s);
        }
        Collections.sort(stu,new Comparator<Student>(){
            public int compare(Student s1, Student s2){
                // if(s1.age> s2.age){
                //     return 1;
                // }
                // else{
                //     return -1;
                // }
                return s1.age-s2.age;
            }
        });
        System.out.println("****************");
        for(Student s:stu){
            System.out.println(s);
        }


        List<Student1> stud=new ArrayList<>();
        stud.add(new Student1(21, "Kush"));
        stud.add(new Student1(12,"John"));
        stud.add(new Student1(18,"Paru"));
        stud.add(new Student1(20,"Kiran"));
        Collections.sort(stud);
        System.out.println("**************");
        for(Student1 s:stud){
            System.out.println(s);
        }
    }
}

class Student{
    int age;
    String name;
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
}




class Student1 implements Comparable<Student1>{
    int age;
    String name;
    public Student1(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student1 [age=" + age + ", name=" + name + "]";
    }
    @Override
    public int compareTo(Student1 that) {
        if(this.age> that.age){
            return 1;
        }
        else{
            return -1;
        }
    }
}