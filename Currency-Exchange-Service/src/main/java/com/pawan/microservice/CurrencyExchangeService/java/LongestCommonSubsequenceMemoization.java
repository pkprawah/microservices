//public class LongestCommonSubsequenceMemoization {
//
//    public static void main(String[] args) {
//
//        String[] s1={"a","b","d","e"};
//        String[] s2={"a","b","h","e","c","f"};
//        int lcsCount = getLongestCommonSubsequenceMemoization(s1,s2,s1.length, s2.length);
//        System.out.println("Lcs Count is :: "+ lcsCount);
//        int[][] t = new int[s1.length+1][s2.length+1];
//    }
//
//    private static int getLongestCommonSubsequenceMemoization(String[] s1, String[] s2, int length1, int length2,int[][] t) {
//
//        if (length1==0||length2==0){
//            return 0;
//        }
//
//        if(t[length1][length2] !=-1){
//            return t[length1][length2];
//        }
//        if(s1[length1-1]==s2[length2-1]){
//            t[length1][length2] = 1+getLongestCommonSubsequence(s1,s2,n-1,m-1);
//        }
//        return  -1;
//    }
//}
