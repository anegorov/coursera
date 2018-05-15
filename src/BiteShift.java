public class BiteShift {
    public static void shift(){
        int bitIndex=1, a = 1;
        int b=0, value=0,res;
        b=a<<2;
        res = value^b;


        a=1<<bitIndex-1;
        res = value^a;

        System.out.println("a="+a);
        System.out.println(Long.toBinaryString(a));
        //System.out.println("b="+b);
        //System.out.println(Long.toBinaryString(b));
        System.out.println("res="+res);
        System.out.println(Long.toBinaryString(res));
    }
}
//13 1101
// 9 1001
//000011
//000101
//000001