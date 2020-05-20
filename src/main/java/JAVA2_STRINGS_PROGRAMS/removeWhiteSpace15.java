package JAVA2_STRINGS_PROGRAMS;

public class removeWhiteSpace15 {
    public static void main(String[] args) {
        String str = "Remove white spaces";

        str = str.replaceAll(" ", "");

//      str = str.replaceAll("\\s+", "");

        System.out.println(str);
    }
}
