import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Test15Demo {

    public static void main(String[] args) {
        String input = "pqraaabbbbbcccaaaaabbbbb";
        //String output = "pqrabca";

        String re=getString(input);
        System.out.println("re  :: " + re);

        //List<String> result=sortStringWords(input1);
       // System.out.println("result :: " + result);
    }

    private static List<String> sortStringWords(String input1) {

       String[] str= input1.split(" ") ;

       // List<String> list = Arrays.stream(str).sorted(Collections.reverseOrder()).collect(Collectors.toList());
        List<String> list=Arrays.stream(str).sorted((str1, str2) -> str1.toLowerCase().compareTo(str2.toLowerCase())).collect(Collectors.toList());
       return list;
    }


    public static  String getString(String str){
        String result="";
        char[] ch = str.toCharArray();
        for(int i=0;i<ch.length-1;i++){
            if(ch[i]==ch[i+1]){

               continue;

            }
            else {

                result= result+ch[i];
                ;
            }
        }
        return  result;
    }



}
