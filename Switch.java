public class Switch {
    public static void main(String[] args){
        int fruit = 7;
        String fruitIs;
         
        switch(fruit){
            case 1:
            fruitIs = "Apple";
            break;
            
            case 2:
            fruitIs = "Coconut";
            break;

            case 3:
            fruitIs = "Banana";
            break;

            case 4:
            fruitIs = "Orange";
            break;

            case 5:
            fruitIs = "Pomegranate";
            break;

            case 6:
            fruitIs = "Pineapple";
            break;

            case 7:
            fruitIs = "Grapes";
            break;

            default : 
            fruitIs = "Papaya";
        
        }
        System.out.println(fruitIs);
    }
}
