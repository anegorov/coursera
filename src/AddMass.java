import java.util.Arrays;

public class AddMass {
    public static void am(){
        int[] a2 = {1,2,3};
        int[] a1 = {4,5,6};
        int l1 = a1.length;
        int l2 = a2.length;
        int l3 = l1+l2;
        boolean f1 = false, f2 = false;

        int[] m3 = new int[l3];
        int a=0,b=0;
        for(int i=0;i<l3;i++){
            if(f1) {m3[i] = a2[b]; b++; continue;}
            if(f2) {m3[i] = a1[a]; a++; continue;}
            if(a1[a]<a2[b]) {
                m3[i]=a1[a];
                a++;
                if(a==l1) f1 = true;
            }else{
                m3[i]=a2[b];
                b++;
                if(b==l2) f2 = true;
            }
            System.out.println(m3[i]+" a="+a+" b="+b);
        }

    System.out.println(Arrays.toString(m3));

    }
}
