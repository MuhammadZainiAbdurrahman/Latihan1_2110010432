package hitung;

public class Matematika {
    private double bill1, bill2;
            
     public Matematika(double bill1, double bill2){
     this.bill1= bill1;
     this.bill2= bill2;
             
             }
     
     public double setPenjumlahan(){
         return bill1+bill2;
     }
     
      public double setPengurangan(){
         return bill1 - bill2;
     }
     
       public double setPerkalian(){
         return bill1 * bill2;
     }
      
      
        public double setPembagian(){
         return bill1 / bill2;
     }
       
}
