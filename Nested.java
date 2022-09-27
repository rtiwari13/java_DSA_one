public class Nested {
    public static void main(String[] args){
        int a = 5;
        int b =9;
         int c= 3;
        
         if(a>b){
            if(a>c) {
                System.out.println(a);
            }
         }
         else if(b>a||b>c) System.out.println(b);
         else  System.out.println(c); 

    }
    
}
