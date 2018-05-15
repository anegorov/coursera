package arraycoursera;

import org.junit.Ignore;
import org.junit.Test;

public class CaesarCipherTest {

    @Ignore
    @Test
    public void testCaesar(){
        int key = 15;
        String message = "At noon be in the conference room with your hat on for a surprise party. YELL LOUD!";
//        FileResource fr = new FileResource();
//        String message = fr.asString();
        CaesarCipher cc = new CaesarCipher();
        String encripted = cc.encrypt(message,key);
        System.out.println(encripted);
        String decripted = cc.encrypt(encripted,26-key);
        System.out.println(decripted);
    }

    @Ignore
    @Test
    public void encryptTwoKeysTest(){
        int key1 = 8;
        int key2 = 21;
        String message = "At noon be in the conference room with your hat on for a surprise party. YELL LOUD!";
//        FileResource fr = new FileResource();
//        String message = fr.asString();
        CaesarCipher cc = new CaesarCipher();
        String encripted = cc.encryptTwoKeys(message,key1,key2);
        System.out.println(encripted);

    }

    @Ignore
    @Test
    public void testVowel(){
        WordPlay wp = new WordPlay();
        String str = wp.replaceVowels("Hello World",'*');
        System.out.println(str);
    }


}
