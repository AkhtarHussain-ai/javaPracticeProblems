package JAVA2_STRINGS_PROGRAMS;

public class removeCharFromString33 {
    public static void main(String[] args) {
        String s = "SPIDERLIES";

        char[] ch = s.toCharArray();
        int size = ch.length;

        char key = 'S';

        int i=0;
        String res = "";

        while (i!=size){
            if(ch[i] != key){
                res = res + ch[i];
            }
            i++;
        }
        System.out.println(res);
    }
}
