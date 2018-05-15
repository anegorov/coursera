package main.java.jagru;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular {
    public String removeEmpty(){

        String[] patterns = new String[] {
                // This will remove empty elements that look like <ElementName/>
                "\\s*<\\w+/>",
                // This will remove empty elements that look like <ElementName></ElementName>
                "\\s*<\\w+></\\w+>",
                // This will remove empty elements that look like
                // <ElementName>
                // </ElementName>
                "\\s*<\\w+>\n*\\s*</\\w+>"
        };

        MyAux ma = new MyAux();

        String xml = ma.readFileToArrayList("service.xml").toString().replaceAll("\\s+","");
        xml = xml.replaceAll(">,<","><");

        String pat = "<Parameter><Code>\\w*</Code><\\w*></\\w*></Parameter>";
        Matcher matcher = Pattern.compile(pat).matcher(xml);

        xml = matcher.replaceAll("");

/*
        for (String pattern : patterns) {
            Matcher matcher = Pattern.compile(pattern).matcher(xml);
            xml = matcher.replaceAll("");
            }
*/
        return xml;


    }
}
