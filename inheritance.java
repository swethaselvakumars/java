package oops;

class facebook1 {
    facebook1(){
        System.out.println("hi 2000");
  }
  public void like(){
System.err.println("like");
  }
}


class facebook2 extends facebook1{
    facebook2(){
        System.out.println("hello");
    }
    public void share(){
        System.out.println("image");
    }
}


class facebook3 extends facebook2{
facebook3(){
    System.out.println("hey");
}
public void comment(){
    System.out.println("comment");
}
}
public class inheritance {

    public static void main( String[] arg){

     facebook3 threef=new facebook3();

        threef.share();
        threef.like();
        threef.comment();
    }
}