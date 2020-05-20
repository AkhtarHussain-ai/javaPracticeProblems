//Use Cases :
//Direct cases : “123” --- >> 123
//White spaces : “    12      3”  --->> 123
//Special Character : “123@!123” --- >> 123
//Positive and negative cases : “+- 123”  -- >> 123 or  -123
//Value is out of range : 12345555566777888   > Integer.MAX_VALUE  (2^31 -1)
//                       -12345555566777888  < Integer.MAX_VALUE (-2^31)


package JAVA2_STRINGS_PROGRAMS;

public class ATOI43 {
    public static int stringToInt(String s){
        s = s.trim();
        if(s == null || s.length() ==0){
            return 0;
        }
        double result = 0;
        boolean isNegative = false;

        int firstIndex = 0;
        if (s.charAt(0) == '+' || s.charAt(0) == '-'){
            firstIndex++;
        }

        if(s.charAt(0) == '-'){
            isNegative = true;
        }

        for(int i=firstIndex;i<s.length();i++){

            if(s.charAt(i) < '0' || s.charAt(i) >'9'){
                break;
            }
            int digitValue = s.charAt(i) - '0';
            result = result*10 + digitValue;
        }

        if (isNegative){
            result = -result;
        }
        if( result > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if( result < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return (int)result;
    }

    public static void main(String[] args) {
        String s = " 123a";
        System.out.println(stringToInt(s));
    }
}
