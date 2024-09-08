package oops;


class activa{
    activa(){
        System.out.println("version1");
    }
    public void activa1g(){
        System.out.println("activa-v1");
    }
}

class activa2g extends activa{
    activa2g(){
        System.out.println("version2");
    }
    public void activa3g(){
        System.out.println("activa-v2");
    }
}
class activa3g extends activa2g{
    activa3g(){
        System.out.println("version3");
    }
    public void activa3g (){
        System.out.println("activa-v3");
    }
}
class activa4g extends activa3g{
    activa4g(){
        System.out.println("version4");
    }
    public void activa3g(){
        System.out.println("activa-v4");
    }
}



public class mainmultipleinheritance {
    public static void main(String[] args){
        activa4g activaobj=new activa4g();
        activaobj.activa3g();
    }
}
