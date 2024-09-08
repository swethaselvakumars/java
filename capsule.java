package encapsulation;
class sivagi{
    private String name="seha";
    public String getname(){
        return name;
    }
    public void setname(String namez){
        name=namez;
    }
}
class school{
   private int passmark=35;
   public int getpassmark(){
    return passmark;
   }
  public void setpassmark(int passmark){
 this.passmark=passmark;
  }  
}
class password{
   private String gmailpassword="panda";
    public String getpassword(){
        return gmailpassword;
    }
    public void setpassword(String gmailpassword){
    this.gmailpassword=gmailpassword;
    }
}
public class capsule {
    public static void main(String[] args) throws InterruptedException {
    sivagi objsivagi=new sivagi();
    // objsivagi.name="dev";
    // System.out.println(objsivagi.name);
    // System.out.println(objsivagi.getname());
   
    // school objschool=new school();
    // System.out.println(objschool.getpassmark());
    // objschool.setpassmark(45);
    // System.out.println(objschool.getpassmark());

    // password objpassword=new password();

    // System.out.println(objpassword.getpassword());
    // objpassword.setpassword("ballons");
    // System.out.println(objpassword.getpassword());
    for (int i=0;i<10;i++){
        Thread.sleep(1000);
        System.out.print(".");
    }
    }
}

// class,object,inheritance,polymorphism,abstraction,encapsulation