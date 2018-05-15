public class AbcTest {
    public static void findAbc(String input) {
        int index = input.indexOf("abc");
        int i=0;
        while (true){
            if (index == -1 || index >= input.length() - 3){
                break;
            }
            //System.out.println("index " + index);
            String found = input.substring(index+1, index+4);
            System.out.println(found);
            index = input.indexOf("abc",index+3);
            //System.out.println("index after updating " + index);
            i++;
        }
        System.out.println("count = " + i);
    }

    public void test() {
        findAbc("abcd");
    }
}
