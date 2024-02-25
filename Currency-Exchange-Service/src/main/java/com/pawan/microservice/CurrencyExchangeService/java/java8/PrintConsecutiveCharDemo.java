package java8;

public class PrintConsecutiveCharDemo {

    public static void main(String[] args) {
        String input = "pqraaabbbbbcccaaaaabbbbbcccccddddd";
        String result=getString(input);
        System.out.println("result:: " +result );
    }
    public static  String getString(String str){
        String result="";
        String temp="";
        char[] ch = str.toCharArray();
        for(int i=0;i<ch.length-1;i++){
            if(i==ch.length-2){
                temp=String.valueOf(ch[i]);
            }
            if(ch[i]==ch[i+1]){
                continue;
            }
            else {
                result= result+ch[i];
            }

        }
        return  result+temp;
    }

}
