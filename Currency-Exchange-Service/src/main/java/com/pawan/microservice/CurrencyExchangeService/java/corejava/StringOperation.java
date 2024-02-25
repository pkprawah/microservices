package corejava;

public class StringOperation {

    public static void main(String[] args) {
        if(checkString("pawan","waant"))
        {
            System.out.println("Yes");
        }else{
            System.out.println("NO");
        }

    }

    public static boolean checkString(String s1,String s2){

        for(int i=0;i<s2.length();i++){
            if(!s1.contains(String.valueOf(s2.charAt(i)))){
                return false;
            }
        }

        return true;
    }
}
