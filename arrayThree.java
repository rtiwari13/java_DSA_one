import java.util.Scanner;

public class arrayThree {
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        try{
        int[] arr = new int[5];

        for(int num : arr){
           arr[num]= in.nextInt();
        }

        //for each loop
        for(int num : arr){ //for every element in array
            System.out.println(num); //num is the element of array

        }
    }
    finally{
        in.close();
    }        
    }
}
