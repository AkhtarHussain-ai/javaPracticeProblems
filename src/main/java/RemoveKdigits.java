import java.util.Stack;

public class RemoveKdigits {

    public static String removeKdigits_Better(String num, int k) {
        int len = num.length();
        //corner case
        if(k==len)
            return "0";

        Stack<Character> stack = new Stack<>();
        int i =0;
        while(i<num.length()){
            //whenever meet a digit which is less than the previous digit, discard the previous one
            while(k>0 && !stack.isEmpty() && stack.peek()>num.charAt(i)){
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
            i++;
        }

        // corner case like "1111"
        while(k>0){
            stack.pop();
            k--;
        }

        //construct the number from the stack
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty())
            sb.append(stack.pop());
        sb.reverse();

        //remove all the 0 at the head
        while(sb.length()>1 && sb.charAt(0)=='0')
            sb.deleteCharAt(0);

        return sb.toString();
    }

    public static void main(String[] args) {
//        String input = "1453287";
        String input = "321";
        int k = 1;
        System.out.println("Input: " + input + ", k: " + k);
        System.out.println("Smallest number after removing "+ k + " digits: "+ removeKdigits_Better(input, k));
    }
}