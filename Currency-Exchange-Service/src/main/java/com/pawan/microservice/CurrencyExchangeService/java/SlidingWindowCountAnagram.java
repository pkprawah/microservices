import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class SlidingWindowCountAnagram {

    public static void main(String[] args) {

        String str = "aabaabaa";
        String pattern = "aaba";

        List<Integer> count = findAnagram(str,pattern);

        System.out.println("result :: " + count);
    }

    private static List<Integer> findAnagram(String str, String pattern) {

        int i=0;
        int j=0;
        int size= str.length();
        int k = pattern.length();
        List<Integer> result = new ArrayList<>();
        Map<Character,Integer> patternMap = new HashMap<>();

        for (char ch: pattern.toCharArray()) {

            patternMap.merge(ch,1,Integer::sum);
        }

        System.out.println("pattern Map :: "+patternMap);
        int count = patternMap.size();

        int answer=0;

        while(j<size){

            //char ch = ;
            if(patternMap.containsKey(str.charAt(j))){
                int val = patternMap.get(str.charAt(j));
                val = val-1;
                patternMap.put(str.charAt(j), val);
            }

            if(patternMap.get(str.charAt(j))==0){
                count--;
            }

            if(j-i+1<k){
                j++;
            }

            else if(j-i+1==k){

                if(count==0){
                    answer++;

                }

                if(patternMap.containsKey(str.charAt(i))){
                    patternMap.put(str.charAt(i),patternMap.get(str.charAt(i))+1);

                    if(patternMap.get(str.charAt(i))==1){
                        count++;
                    }
                }

                i++;
                j++;

            }





        }
        result.add(answer);
        return  result;
    }
}
