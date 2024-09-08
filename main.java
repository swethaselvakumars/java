package abstraction;

abstract class annapoorna{
    annapoorna(){
        System.out.println("default");
    }
    public void chef(){
       System.out.println("rosemilk");
    }

    abstract public void watchman();
}

class devteam extends annapoorna{
      public void watchman(){
        System.out.println("proble sloved");
      }
}

public class main {
    public static void main(){
       devteam devobj=new devteam();
       devobj.watchman();
    }
}
