package corejava;

public class MainDemo {

    public static void main(String[] args) {

        MainDemo MainDemo = new MainDemo();
        MainDemo MainDemo1 = new MainDemo();

        if(MainDemo==MainDemo1){
            System.out.println("Both same ref");
        }
        if(MainDemo.equals(MainDemo1)){
            System.out.println("both content same");
        }
        System.out.println("Hello");
    }



}
