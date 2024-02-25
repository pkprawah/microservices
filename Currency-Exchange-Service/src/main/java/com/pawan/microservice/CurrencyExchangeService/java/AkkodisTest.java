public class AkkodisTest {

    public static void main(String[] args) {
        String s ="ab34cd5efgh120hijk540";
        int num=0;
        int maxnumber=Integer.MIN_VALUE;

            for (int i=0;i<s.length();i++){
            //check index has digit or char
            if(Character.isDigit(s.charAt(i))){
                //if digit yes then

                char chardigit = s.charAt(i);
                char chardigit0 =  '0';
                System.out.println("+++++" + chardigit);
                System.out.println("+++++" + chardigit0);
                num=num*10+(s.charAt(i)-'0');
            }
            else {
                maxnumber=Math.max(num,maxnumber);
                num=0;
            }
        }
    }


}
