// package polymorphism;

//  public class subclass {
//     protected void student(){
//         System.out.println("school");
//     }
// }

// class subclass1 extends subclass{
//      public void display(){
//         student();
//      }
// }

package polymorphism;

public class subclass1 {
    protected void student() {
        System.out.println("school");
    }
    public void mm(){
        
    }
}

class subclass extends subclass1 {
    public void display() {
        student(); // Calls the protected method from Subclass
    }
}