// Number ranges between 1 to 3999;

package JAVA2_STRINGS_PROGRAMS;
public class IntegerToRoman38 {
    public static String intergerRoman(int num){

        String[] units = {"","I","II","III","IV","V","VI","VII", "VIII", "IX"};
        String[] tens  = {"","X","XX", "XXX", "XL","L", "LX", "LXX", "LXXX", "XC"};
        String[] hunderds = {"", "C", "CC", "CCC","CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] thousands = {"","M", "MM", "MMM"};

        return  thousands[num/1000] + hunderds[(num%1000)/100]   +tens[(num%100)/10]  +units[num%10];
    }

    public static void main(String[] args) {
        int num = 1904;
        System.out.println(intergerRoman(num));
    }

}
