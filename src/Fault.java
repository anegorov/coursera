import static java.lang.Math.round;
import static java.lang.Math.abs;

public class Fault {
    public static void fault(){
        double a,b,c,sum,raz;
        boolean res=false;
        long rnd;

        a = 0.1;
        b = 0.2;
        c = 0.3002;

        sum = a + b;
        raz = abs(c-sum);
        rnd = round(raz*10000);
        if(rnd<=0) res = true;

        System.out.println("a+b="+sum);
        System.out.println("raz="+raz);
        System.out.println("rnd="+rnd);
        System.out.println("res="+res);
    }
}
