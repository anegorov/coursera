public class Polindrom {
    public static void getPol(){

        boolean res=false;
        String text1, text = "Madam, I'm Adam!";
        text = text.replaceAll("[^a-zA-Z0-9]","");
        text = text.toUpperCase();

        StringBuilder str = new StringBuilder(text);
        text1 = str.reverse().toString();

        if(text.equals(text1)) res = true;

        System.out.println(text);
        System.out.println(text1);

    }

}
