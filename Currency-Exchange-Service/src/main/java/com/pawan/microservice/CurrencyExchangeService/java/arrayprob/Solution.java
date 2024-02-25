//
//package arrayprob;
//
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class Solution {
//
//
//    public static boolean sameElements(Integer[] array1, Integer[] array2) {
//        //TODO: Implement your solution here
//
//        boolean result = false;
//        int arr1Size = array1.length;
//        int arr2Size = array2.length;
//
//
//
//        List<Integer> list1 = Arrays.asList(array1);
//        List<Integer> list2 = Arrays.asList(array2);
//       List s= list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        System.out.println(" sorting ::: "+ s);
//        list2.stream().sorted(Comparator.reverseOrder());
//       // Integer maxlist1 = s.get(0);
//        Integer maxlist2 = list1.get(0);
//        Integer max = Math.max(maxlist1,maxlist2);
//        Integer[] maxArray = new Integer[max];
//        for (int i =0; i<max;i++){
//            maxArray[i]=0;
//        }
//
//        for (int i=0;i<arr1Size-1; i++){
//            for(int j=i;j<arr2Size-1;j++){
//                if(array1[i]==array2[j]){
//                    maxArray[array1[i]]++;
//                }
//            }
//        }
//
//
//        return false;
//    }
//
//    public static void main(String[] args) {
//
//        Integer[] a1 = {1,2,3,2,1};
//        Integer[] a2 = {1,2,3};
//        Integer[] a3 = {1,2,3,4};
//
//        //Integer[] a2 = {1, 2, 3,5};
//        //Integer[] a3 = {1, 0, 8, 4};
//        boolean result = sameElements(a3, a2);
//      //  Assert.assertTrue(sameElements(a1,a2));
//      //  Assert.assertTrue(sameElements(a2,a1));
//      //  Assert.assertFalse(sameElements(a1,a3));
//        //Assert.assertFalse(sameElements(a3,a2));
//        System.out.println("Arrays elements are equal or not ::" + result);
//
//    }
//}
//
///* @Test
//    void testYourProgram() {
//        Integer[] a1 = {1,2,3,2,1};
//        Integer[] a2 = {1,2,3};
//        Integer[] a3 = {1,2,3,4};
//
//        Assert.assertTrue(sameElements(a1,a2));
//        Assert.assertTrue(sameElements(a2,a1));
//        Assert.assertFalse(sameElements(a1,a3));
//        Assert.assertFalse(sameElements(a3,a2));
//
//        //Add More Cases Here
//    }*//*
//
//
//
//    //Implement a solution to remove duplicate elements in a list. Do not change any method signatures
//
//import java.util.*;
//import org.junit.Test;
//import org.junit.Assert;
//
//    public class Solution {
//        <T> void removeDuplicates(List<T> list) {
//            for(T element: list) {
//                if(isDuplicate(list,element)) {
//                    list.remove(element);
//                }
//            }
//        }
//
//        <T> boolean isDuplicate(List<T> list, T element) {
//            //TODO: Implement a solution to check if a given element is a duplicate
//            return false;
//        }
//
//        @Test
//        public void testYourProgram() {
//            List<Integer> testList = new ArrayList<>(Arrays.asList(1,3,2,2));
//            removeDuplicates(testList);
//            Assert.assertEquals(new ArrayList<>(Arrays.asList(1,3,2)), testList);
//        }
//    }
//}
//*/
