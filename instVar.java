public class instVar {
     public boolean pass ;
      
     public instVar(){
        this.pass = true;
     }

     public static void main(String[] args){
        instVar result = new instVar();
        System.out.println(result.pass);
     }

    
}
