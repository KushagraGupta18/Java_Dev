package _40_Record_Classes;

public class Hello {
    public static void main(String[] args) {
        Alien a1=new Alien(1,"Navin");
        Alien a2=new Alien(1,"Navin");
        System.out.println(a1.equals(a2));//false they are two different objects in different memory  
        System.out.println(a1);
        Alien a3=new Alien();
        System.out.println(a3);
        System.out.println(a1.name());

    } 
}

// class Alien{
//     private final int id;
//     private final String name;
//     public Alien(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }
//     public int getId() {
//         return id;
//     }
//     public String getName() {
//         return name;
//     }
//     @Override
//     public String toString() {
//         return "Alien [id=" + id + ", name=" + name + "]";
//     }
//     @Override
//     public int hashCode() {
//         final int prime = 31;
//         int result = 1;
//         result = prime * result + id;
//         result = prime * result + ((name == null) ? 0 : name.hashCode());
//         return result;
//     }
//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         Alien other = (Alien) obj;
//         if (id != other.id)
//             return false;
//         if (name == null) {
//             if (other.name != null)
//                 return false;
//         } else if (!name.equals(other.name))
//             return false;
//         return true;
//     }
// }


//In java if you represent the class which only holds data basically a data carrier class we can create simply a record

// record Alien(int id, String name){}//in record instance variable as components behind the scene we got all the methods in record


record Alien(int id, String name) implements Cloneable{
    
    public Alien(int id, String name){
        if(id==0){
            throw new IllegalArgumentException("id cannot be zero");
        }
        this.id=id;
        this.name=name;
    }
    // public Alien{
    //     if(id==0){
    //         throw new IllegalArgumentException("id cannot be zero");
    //     }
    // }
    public Alien(){//A non-canonical constructor must start with an explicit invocation to a constructor
        this(0,"");
    }
}
