package polymorphismm;
import java.util.*;
class bank{
     bank(){
        System.out.println("bank");
    }
    bank(String user,int id){
        System.out.println("banking"+user+id);
    }
    bank(int id,String amt){
        System.out.println();
    }
    public void gpay(){
        System.out.println("amt200");
    }
    public void gpay(String creditcard){
        System.out.println("using credit card");
    }
}
class a{
    public int alpha(){
       return 25;
    }
    public void beta(){
        System.out.println("first beta version");
    }

}
class b extends a{
    public  int alpha(){
       return 23;
    }
}

public class methodoverloading {
    public static void main(String[] args) {
        // Scanner objscan=new Scanner(System.in);
        // String bheem=objscan.next();
        // int chukki=objscan.nextInt();
        // bank objbank=new bank(bheem,chukki);
        // objbank.gpay("anu");
        
        b objb=new b();
        System.out.println(objb.alpha());
    }
}
