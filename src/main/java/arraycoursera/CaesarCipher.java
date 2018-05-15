package arraycoursera;

public class CaesarCipher {
    public String encrypt(String input, int key){
        StringBuilder encrypted = new StringBuilder(input);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shiftedAlphabet = alphabet.substring(key) + alphabet.substring(0,key);
        //System.out.println(shiftedAlphabet);

        for (int i=0;i<encrypted.length();i++){
            char currChar = encrypted.charAt(i);
            boolean isLow = Character.isLowerCase(currChar);
            if(isLow) currChar = Character.toUpperCase(currChar);
            int idx = alphabet.indexOf(currChar);

            if(idx != -1){
                char newChar = shiftedAlphabet.charAt(idx);
                if(isLow) {
                    newChar = Character.toLowerCase(newChar);

                }
                encrypted.setCharAt(i,newChar);
                //System.out.println(i+" "+currChar+" "+newChar);
            }

        }
        return encrypted.toString();
    }

    public String encryptTwoKeys(String input, int key1, int key2){
        boolean eval = true;
        StringBuilder encrypted = new StringBuilder(input);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shiftedAlphabet1 = alphabet.substring(key1) + alphabet.substring(0,key1);
        String shiftedAlphabet2 = alphabet.substring(key2) + alphabet.substring(0,key2);
        System.out.println(alphabet);
        System.out.println(shiftedAlphabet1);
        System.out.println(shiftedAlphabet2);
        for (int i=0;i<encrypted.length();i++){

            char currChar = encrypted.charAt(i);
            boolean isLow = Character.isLowerCase(currChar);
            if(isLow) currChar = Character.toUpperCase(currChar);
            int idx = alphabet.indexOf(currChar);
            if(idx != -1){
                char newChar1 = shiftedAlphabet1.charAt(idx);
                char newChar2 = shiftedAlphabet2.charAt(idx);
                if(isLow) {
                    newChar1 = Character.toLowerCase(newChar1);
                    newChar2 = Character.toLowerCase(newChar2);
                }
                if (eval){
                    encrypted.setCharAt(i,newChar1);
                }else{
                    encrypted.setCharAt(i,newChar2);
                }

                //System.out.println(i+" "+currChar+" "+newChar);

            }
            eval = !eval;

        }
        return encrypted.toString();
    }
}
