package JAVA3_ARRAYS_PROGRAMS;

public class rightRotate9b {
    public static String rotate(String s, int n){
        char[] charArray = s.toCharArray();
        int size = charArray.length;

        for (int i=0;i<n;i++){
            int j;

            char last = charArray[size-1];
            for(j=size-1;j>0;j--){
                charArray[j] = charArray[j-1];
            }
            charArray[j] = last;
        }
        String resultString = "";
        for(int i=0;i<size;i++){
           resultString += charArray[i];
        }

        return resultString;
    }

    public static void main(String[] args) {
        String s = "amazon";
        String desiredString = "onamaz";
        String result = rotate(s,2);
        if(result.equalsIgnoreCase(desiredString)){
            System.out.println("Yes");
        }

    }
}
