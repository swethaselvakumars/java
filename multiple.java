package inheritance;

import polymorphism.*;
class activa{
    activa(){
        System.out.println("version1");
    }
     public void activa1g(){
       
        System.out.println("activa-v1");
    }
}

 class activa2g{
    activa2g(){
        System.out.println("version2");
    }
    public void activa2g(){
        int a=0;
       
        System.out.println("activa-v2");
    }
}
class activa3g extends activa2g{
    activa3g(){
        System.out.println("version3");
    }
    protected void activa3g(){
       System.out.println("activa-v3");
        super.activa2g();
        
    }
}
class activa4g extends activa3g{
    activa4g(){
        System.out.println("version4");
    }
    public void activa4gs(){
        System.out.println("activa-v4");
    }
  
    
}



public class multiple {
    public static void main(String[] args) {
       
        subclass1 mm=new subclass1();
        mm.mm();

    }
}
