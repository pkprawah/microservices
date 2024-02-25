package corejava;

public class test5 {

    public static void main(String[] args) {
        String str = "ayyabxxbbchhhjkkkkl";



        char c=' ';
        int index=-1;
        for(char ch : str.toCharArray()){
            if(str.indexOf(ch) == str.lastIndexOf(ch)){
               c=ch;
                break;

            }
            else{
                index += 1;
            }
        }

        if(index == str.length()-1){
            System.out.println("all char duplicate");
        }
        else{
            System.out.println("non first repeating is "+ c);
        }

        //System.out.println(""+ s);

    }
}
