import java.util.Arrays;

public class Story {
    public static void getStory(){

        String[] roles = {
                "Городничий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука",
                "Лука Лукич"
        };
        String[] textLines = {
        "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
        "Аммос Федорович: Как ревизор? Аммос Федорович огого.",
        "Артемий Филиппович: Как ревизор?",
        "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
        "Аммос Федорович: Вот те на! ",
        "Артемий Филиппович: Вот не было заботы, так подай!",
        "Лука Лукич: Господи боже! еще и с секретным предписаньем!"
        };

        int count=0,num;
        String res="";


//ищи внутри себя

        for (int j=0;j<roles.length;j++){
            res=res+roles[j]+":\n";
            for (int k=0;k<textLines.length;k++){
                num=k+1;
                if (textLines[k].contains(roles[j]+":")) {
                    res=res+num+")  "+textLines[k].replace(roles[j],"")+"\n";
                    res=res.replace(" : ","");
                }
            }
            res=res+"\n";
        }
        res=res.substring(0,res.length()-2);
        System.out.println(res);
    }


}
