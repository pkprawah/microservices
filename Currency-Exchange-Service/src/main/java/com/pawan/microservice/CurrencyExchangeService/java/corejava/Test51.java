package corejava;

import java.util.Arrays;

public class Test51 {

    public static void main(String[] args) {


        String[] str = {"flower","flow","fly","floor"};

        Arrays.sort(str);

        StringBuilder res= new StringBuilder();

        for (int i=0; i<str.length;i++){

            if(str[0].charAt(i)==str[str.length-1].charAt(i)){
                res.append(str[0].charAt(i));
            }
            else {
                break;
            }
        }

        System.out.println("prefix of given string array : "+res.toString());
    }
}
