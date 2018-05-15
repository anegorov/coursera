public class IsValue2stepen {
    public static void isStep(){
        int value=0;
        boolean res;
        String str = Long.toBinaryString(Math.abs(value)).replace("0","");

        if(str.length()==1) res = true; else res = false;

        System.out.println(value);
        System.out.println(str);
        System.out.println(res);

        System.out.println('A' + '1' + "2");
                System.out.println("A" + ('\t' + '\u0003'));
                        System.out.println("A" + 12);
                                System.out.println('A' + "12");

    }
}
