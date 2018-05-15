package arraycoursera;

import coursera.FileResource;

public class WordPlay {

    String[] getCommon(){
        FileResource resource = new FileResource("data/common.txt");
        String[] common = new String[20];
        int index = 0;
        for(String s : resource.words()){
            common[index] = s;
            index +=1;
        }
        return common;
    }

    public int indexOf(String[] list, String word) {
        for (int k=0; k<list.length; k++) {
            if (list[k].equals(word)) {
                return k;
            }
        }
        return -1;
    }

    public void countWords(FileResource resource, String[] common, int[] counts){
        for(String word : resource.words()){
            word = word.toLowerCase();
            int index = indexOf(common,word);
            if (index != -1) {
                counts[index] += 1;
            }
        }
    }

    public void countShakespeare(){
        String[] plays = {"caesar.txt","errors.txt","hamlet.txt","likeit.txt","macbeth.txt","romeo.txt"};

        String[] common = getCommon();
        int[] counts = new int[common.length];
        for(int k=0;k<plays.length;k++){
            FileResource resource = new FileResource("data/"+plays[k]);
            countWords(resource,common,counts);
            System.out.println("done with "+plays[k]);
        }

        for(int k=0; k < common.length; k++){
            System.out.println(common[k] + "\t" + counts[k]);
        }
    }

    public int[] countLetters(String message){

        String alph = "abcdefghijklmnopqrstuvwxyz";
        int[] counts = new int[26];
        for(int k=0; k<message.length(); k++){
            char ch = Character.toLowerCase(message.charAt(k));
            int dex = alph.indexOf(ch);
            if(dex != -1){
                counts[dex] += 1;
            }
        }
        return counts;
    }

    public String decript(String encrypted){
        CaesarCipher cc = new CaesarCipher();
        int[] freqs = countLetters(encrypted);
        int maxDex = maxIndex(freqs);
        int dkey = maxDex - 4;
        if(maxDex < 4) {
            dkey = 26 - (4-maxDex);
        }
        return cc.encrypt(encrypted, 26-dkey);
    }

    public int maxIndex(int[] vals){
        int maxDex = 0;
        for(int k=0;k<vals.length;k++){
            if(vals[k] > vals[maxDex]){
                maxDex = k;
            }
        }
        return maxDex;
    }

    public boolean isVowel(char ch){
        boolean res = false;
        String vowel = "aeiou";
        for (int i=0;i < vowel.length();i++){
            char curr = vowel.charAt(i);
            boolean isUp = Character.isUpperCase(ch);
            if(isUp) curr = Character.toUpperCase(curr);
            if(curr == ch) res = true;
        }

        return res;
    }

    public String replaceVowels(String phrase, char ch){
        StringBuilder sb = new StringBuilder(phrase);
        for (int i=0;i<phrase.length();i++){
            char curr = phrase.charAt(i);
            if(isVowel(curr)){
                sb.setCharAt(i,ch);
            }
        }
        return sb.toString();
    }

//    public void emphasize(System phrase, char ch){
//
//    }
}
