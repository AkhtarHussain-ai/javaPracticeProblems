package JAVA10_INTERVIEW_QUESTION;

//WAP to print a2b2c3a3 when given string is aabbcccaaa

public class pb1 {

    public static void countOfChar(String str){

        int length = str.length();

        StringBuffer stringBuffer = new StringBuffer();

        int count =1;
        for(int i=0;i<length;i++){

            if(i == length-1){
                stringBuffer.append(str.charAt(i) + ""+count );
                break;
            }
            if(str.charAt(i) == str.charAt(i+1)){
                count++;
            }
            else {
                stringBuffer.append(str.charAt(i)+""+count);
                count=1;
            }
        }


        System.out.println(stringBuffer.toString());

    }
    
    public static void main(String[] args)
    {
        String st = "aabbcccaaa";
        countOfChar(st);

    }
}
