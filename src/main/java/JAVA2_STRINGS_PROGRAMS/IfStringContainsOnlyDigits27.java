package JAVA2_STRINGS_PROGRAMS;

public class IfStringContainsOnlyDigits27 {
    public static void main(String[] args) {
        String str = "12345";
        int size = str.length();
        int i =0;
      while(i != size){
          if(str.charAt(i) >='0' && str.charAt(i) <='9'){
              i++;
          }
          else {
              System.out.println("The string doesn't contain only digits");
              System.exit(0);
          }

      }
        System.out.println("String has only digits");
        }

    }

