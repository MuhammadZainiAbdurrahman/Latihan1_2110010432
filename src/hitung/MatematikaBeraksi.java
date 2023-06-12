package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika zaini = new Matematika(3,2);
        
        System.out.println("Hasil Penjumlahan : "+zaini.setPenjumlahan());
        System.out.println("Hasil Pengurangan : "+zaini.setPengurangan());
        System.out.println("Hasil Pengalian : "+zaini.setPerkalian());
        System.out.println("Hasil Penbagian : "+zaini.setPembagian());
        
       
    }
}
