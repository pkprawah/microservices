package arrayprob;

import java.util.List;

public class TCSTest {

    //Remove duplicate elements from the integer array without using collections
    // or built-in functions,int[] intArr = {6,1,5,3,1,4,2,8,5,6};
    private static int[] intArr = {6,1,5,3,1,4,2,8,5,6};

    public static void main(String[] args) {
       // TCSTest TCSTest= new TCSTest();

                getUniqueElemnet(intArr);
    }



    public static int[] getUniqueElemnet(int[] intArr){

        int count=0;
        for (int i = 0; i < intArr.length-1; i++) {

            for (int j = intArr.length-1; j>0 && i!=j ; j-- ) {

                if(intArr[i]==intArr[j]){
                    intArr[j]=-1;

                }


            }

        }

        // iterate array
        for (int i = 0; i <intArr.length ; i++) {
            System.out.print("\t" +intArr[i]);
        }


        return intArr;
    }

}
