import java.util.Scanner;
public class arrayTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        try{
        int[] arr = new int[5];
          
        for(int i = 0; i<arr.length; i++){
           arr[i] = in.nextInt();
        }
         for(int i = 0; i<arr.length; i++){
             System.out.println(arr[i]);
          }
       
    } finally{
        in.close();
    }
} 
    
    
}



