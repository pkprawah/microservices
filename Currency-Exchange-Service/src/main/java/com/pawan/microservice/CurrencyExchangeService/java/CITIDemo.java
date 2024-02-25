import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class CITIDemo {

    public static void main(String[] args) {

        int[] arr = {1,1,1,1,2,2,4,4,8,9,10};
        int givenNumber = 8;[8,8];
        List<Integer> resultBS= new ArrayList<>();
      // List result= findFirstNLastIndex(arr,givenNumber);
       Integer firstIndexResult= findFirstIndexUsingBinarySearch(arr,givenNumber);
        System.out.println("First index of given element is :: " + firstIndexResult);
        Integer lastIndexResult= findlastIndexUsingBinarySearch(arr,givenNumber);
        System.out.println("last index of given element is :: " + lastIndexResult);
        resultBS.add(firstIndexResult);
        resultBS.add(lastIndexResult);
        System.out.println("First and Last index of given element is :: " + resultBS);
       // System.out.println("result ::" +result); [0,3]


    }

    private static List<Integer> findFirstNLastIndex(int[] arr,int given) {
        int firstposition=-1;
        int lastPosition=-1;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==given){
                firstposition=i;
                lastPosition=i;
                if(i!=0)
                lastPosition=i;
            }
        }

        List result = new ArrayList();
        result.add(firstposition);
        result.add(lastPosition);
        return result;
    }


    private static Integer findFirstIndexUsingBinarySearch(int[] arr,int element) {

        int start =0;
        int end = arr.length-1;
        int result=-1;

        int mid= start + (end-start)/2;
        while(start<=end){

            if(element == arr[mid]){
                result = mid;

                end= mid-1;
            }
            else if(element<arr[mid]){
                end =mid-1;
            }else{
                start=mid+1;
            }
            mid= start + (end-start)/2;
        }

        return result;
    }

    private static Integer findlastIndexUsingBinarySearch(int[] arr,int element) {

        int start =0;
        int end = arr.length-1;
        int result=-1;

        int mid= start + (end-start)/2;
        while(start<=end){

            if(element == arr[mid]){
                result = mid;
                start=mid+1;
            }
            else if(element<arr[mid]){
                end =mid-1;
            }else{
                start=mid+1;
            }
            mid= start + (end-start)/2;
        }

        return result;
    }
}
