public class YearVesokosniy {
    public static void getYear(){

        int year=400;

        int res;
        int ost4, ost100, ost400;
        int ves4, ves100, ves400;
        ost4 = year % 4;
        ost100 = year % 100;
        ost400 = year % 400;



        boolean isVes=false;

        ves4 =year/4;
        ves100=year/100;
        ves400=year/400;

        /*
        if (year%4 != 0){
            res = year/4;
        }else {

            if ((year % 4 == 0 & year % 100 != 0) | (year % 400 == 0)) isVes = true;

            if (isVes) res = year / 4;
            else res = year / 4 - 1;
        }
        */

        res = ves4 - ves100 + ves400;

        System.out.println("year: " + year);
        System.out.println("ost4: " + ost4);
        System.out.println("ost100: " + ost100);
        System.out.println("ost400: " + ost400);
        System.out.println("isVes: " + isVes);
        System.out.println("res: " + res);

    }
}
