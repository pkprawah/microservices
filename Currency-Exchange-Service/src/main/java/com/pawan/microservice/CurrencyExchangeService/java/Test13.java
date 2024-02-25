import java.util.ArrayList;
import java.util.List;

public class Test13 {

    public static void main(String[] args) {

//        List<Integer> givenLists = new ArrayList<>();
//        givenLists.add(1);
//        givenLists.add(2);
//        givenLists.add(4);
//        givenLists.add(5);
//        givenLists.add(6);
//


        Integer[] arr= {2,1,3,4,6,7};

        int first= arr[0];
        int second =1;
        //for all xor element in the array
        for (int i=1;i<arr.length;i++){

            first=first^arr[i];
        }

        for (int i=2;i<=arr.length+1;i++){

            second=second^i;
        }

        int missingelement = first^second;

        System.out.println("Missisng elememt :: " + missingelement);






    }
}
