
public class instanceVar {

   public int age; //declaration of instance variable
   
   public instanceVar()
   {
    this.age = 19; //initialization
   }

   //main method
   public static void main(String[] args)
   {
    //object creation
    instanceVar diffAge = new instanceVar();
     
    System.out.println( diffAge.age);
   }
}

// instance variables are non static and declared in a class but outside any method,constructor||block

// creted when an object of class of created  and get destroyed with objects

// access specifiers may be used for instance variables.

// default value is zero

// can be accessed only by creating objects.