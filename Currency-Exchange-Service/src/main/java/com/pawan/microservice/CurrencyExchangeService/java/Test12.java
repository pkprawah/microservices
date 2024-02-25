import java.util.ArrayList;
import java.util.List;

public class Test12 {

    public static void main(String[] args) {
        int totalcount = 0;
        int num=1;
        List<Integer> primelist = new ArrayList<>();
        while(num<=50) {
           int count=0;
           for (int i =num; i >= 1; i--) {
                if (num % i == 0) {
                    count++;
                }}
            if (count==2) {
                primelist.add(num);
                totalcount++;
            }

            System.out.println(" primelist :: " + primelist + "\n" + " And total count is  :: " + totalcount);
            num++;
        }
    }

}
