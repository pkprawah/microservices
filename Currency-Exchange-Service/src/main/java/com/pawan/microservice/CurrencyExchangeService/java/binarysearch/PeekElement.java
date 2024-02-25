package binarysearch;


import java.util.ArrayList;
import java.util.List;

public class PeekElement {
    public static void main(String[] args) {

        int[] array = {10,20,30,40,60,50,60,80,70};

       List<Integer> peekElementCount = getPeekElement(array);

        System.out.println("peek element is given array is  :: " + peekElementCount );

    }

    private static List<Integer> getPeekElement(int[] arr) {

        int start =0;
        int end =arr.length-1;
        int size = arr.length;
       // int mid=start + (end-start)/2;

        int res=0;
        List<Integer> peekElementList = new ArrayList<>();
        while (start<=end){
           int  mid = start + (end-start)/2;
            if(mid>0 && mid<size-1){

                if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){

                    res =mid;
                    start =mid+1;
                }
                else if(arr[mid]>arr[mid-1]){
                    start = mid+1;
                }else{
                    end =mid-1;
                }

            }

            // cornor cases

            else if(mid==0){
                if(arr[0]>arr[1]){
                    res=0;
                }
                else {
                    res =-1;
                }
            }
            else if(mid==size-1){

                if(arr[size-1]>arr[size-2]){
                    res=size-1;
                }
                start =mid+1;

            }


            peekElementList.add(res);


        }

        return peekElementList;

    }


}
