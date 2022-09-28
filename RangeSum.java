//sum of numbers from 0 to 100 
public interface RangeSum {
    public static void main(String[] args){
        int sum=0;
        for(int i=0;i<=100;i++){ 
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
