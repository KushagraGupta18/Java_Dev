
class Student{
    int rollno;
    String name;
    int marks;
}
public class Hello {
    
    public static void main(String[] args) {
        
        Student s1=new Student();
        s1.rollno=1;
        s1.name="kush";
        s1.marks=100;

        Student s2=new Student();
        s2.rollno=2;
        s2.name="aman";
        s2.marks=90;
        
        Student s3=new Student();
        s3.rollno=3;
        s3.name="ram";
        s3.marks=70;


        Student[] arr=new Student[3];
        arr[0]=s1;
        arr[1]=s2;
        arr[2]=s3;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].rollno+" "+arr[i].name +" "+arr[i].marks);
        }


        for(Student stud:arr){
            System.out.println(stud.rollno+" "+stud.name +" "+stud.marks);
        }
        
    }
}
