import main.java.jagru.MyAux;

import java.util.List;

public class CTaskShape {
    public static void answer(){
        int q;
        String str1, str2;
        int x,y;

        Shape sh = new Shape();
        MyAux ma = new MyAux();
        List<String> ls = ma.readFileToArrayList("C:\\Users\\anegorov\\Downloads\\perimeter_quiz\\datatest4.txt");

        for (String s: ls){
            q = s.indexOf(",");
            str1 = s.substring(0,q).trim();
            str2 = s.substring(q+1).trim();
            System.out.println(s.substring(0,q) + "   " + s.substring(q+1));
            x = Integer.parseInt(str1);
            y = Integer.parseInt(str2);
            sh.addPoint(new Point(x,y));
        }

        PerimeterRunner pr = new PerimeterRunner();
        System.out.println(pr.getPerimeter(sh));


    }

    public static void dist(){

        Point a = new Point(-3, 3);
        Point b = new Point(-4, -3);
        Point c = new Point(4, -2);
        Point d = new Point(6, 5);

        System.out.println(a.distance(b));
        System.out.println(b.distance(c));
        System.out.println(c.distance(d));
        System.out.println(d.distance(a));




    }
}
