package main.java.jagru;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;
import java.util.Properties;

public class MyAux {
    public static void readProp() throws IOException {
        InputStream input = new FileInputStream("client.property");
        Properties prop = new Properties();

        prop.load(input);

        System.out.println(prop.getProperty("pup"));
    }

    public List readFileToArrayList(String p){
        File f = new File(p);
        List<String> strings = null;
        try {
            strings = Files.readAllLines(f.toPath(), Charset.defaultCharset());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strings;
    }

}
