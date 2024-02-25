public class Demo1 {

    public static void main(String[] args) {
        String[] strArray = {
                "Sun",
                "Apple",
                "JBoss",
                "Whatsup",
                "Apple", // duplicate
                "BEA Weblogic",
                "pawan", // duplicate
                "Apple"
        };

        int size=strArray.length;

        for (int i=0;i<size;i++){
            for (int j=i+1;j<size;j++){
                if(strArray[j]==strArray[i]){
                   strArray[j]=strArray[size-1];
                   size--;
                   j--;
                }
            }
        }

        System.out.println("After removing duplicate elements :: "+ strArray);
        for (int i=0;i<size;i++){
            System.out.println("After removing duplicate elements :: "+ strArray[i]);
        }
    }
}
