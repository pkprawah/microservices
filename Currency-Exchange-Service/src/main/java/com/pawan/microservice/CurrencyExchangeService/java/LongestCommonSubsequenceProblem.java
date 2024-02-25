public class LongestCommonSubsequenceProblem {

    public static void main(String[] args) {

        String[] s1={"a","b","d","e"};
        String[] s2={"a","b","h","e","c","f"};
        int lcsCount = getLongestCommonSubsequence(s1,s2,s1.length, s2.length);
        System.out.println("Lcs Count is :: "+ lcsCount);
    }

    private static int getLongestCommonSubsequence(String[] s1, String[] s2,int n,int m) {

        if (n==0||m==0){
            return 0;
        }

        if(s1[n-1]==s2[m-1]){
            return 1+getLongestCommonSubsequence(s1,s2,n-1,m-1);
        }
        else{
           return Math.max(getLongestCommonSubsequence(s1,s2,n,m-1),getLongestCommonSubsequence(s1,s2,n-1,m));
        }
    }
}
