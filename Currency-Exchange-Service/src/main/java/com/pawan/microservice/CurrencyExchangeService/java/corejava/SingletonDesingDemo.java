package corejava;

public class SingletonDesingDemo {

   static SingletonDesingDemo obj ;
   private  SingletonDesingDemo(){}

   public static SingletonDesingDemo getInstance(){

      if(obj==null){
         obj=new SingletonDesingDemo();
      }
      return obj;
   }
}
