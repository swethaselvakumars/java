package abstraction;

interface a {
    public void sbi();  
}
interface b{
  
   
    private void indianbank(){
        System.out.println("hii");
    }
    
}
class c implements a,b{
  public void sbi(){
    System.out.println("moneycheck");
  }
}

abstract class bank {
    abstract public void vijay();
    public  void ajith(){
        System.out.println("canada bank");
    }

}
class netbank extends bank implements a{
    public void gpay(){

    }
    public void vijay(){
        System.out.println("tvk");
    }
    public void sbi(){
        
    }

}
public class inter {
    public static void main(String[] args) {
        netbank onj=new netbank();
        onj.ajith();
        onj.vijay();

        c objc=new C();
        objc.sbi();
      
    }
}
















