class ternaryoperator{
    public String ternaryop(){
    String com="help me";
    String comp="help me";
String compare=(com == comp)?"right":"wrong";
return compare;
}
}


class arithmetic{
    public int arith(){
        int num=4/2;
        return num;
    }
}

public class relationaloperator {
    public static void main(String []args){
        // int a=8;
        // int b=24;
        // boolean c= (a != b);
        // boolean d= (a == b);
        // System.out.println(c);
        // System.out.println(d);

        ternaryoperator ternaryobj=new ternaryoperator();
        System.out.print(ternaryobj.ternaryop());
        

        
        arithmetic arithobj=new arithmetic();
        System.out.println(arithobj.arith());
    
    }
}

