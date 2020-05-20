import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test2 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();

//        for(int i=1;i<=20;i++){
//            a.add(i);
//        }

        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);

        System.out.println(removeOdd(a));


    }

    public static List<Integer> removeOdd(List<Integer>  a) {

        for (int i=0;i<a.size();i++ ){
                if(i%2 !=0){
                    a.remove(i);
                    if(i+1 < a.size()){
                        a.remove(i+1);
                        i = i++;
                    }
                }
        }
      return a;
        }

}


