package JAVA5_NUMBER_PROGRAM;

public class SmallestOfThreeNumberByTernary {
    public static void main(String[] args) {
        int a = 809, b=373, c=2;
        SmallestNumOfThree(a,b,c);

    }
    public static void SmallestNumOfThree(int n1, int n2, int n3){
        int result = (n1<n2) ? (n1<n3 ? n1:n3) : (n2<n3 ? n2:n3);
        System.out.println("The smallest of three Number is : " + result);
    }
}
