package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Matematika Kitha = new Matematika(9,4);
        
        System.out.println("Hasil Penjumlahan : " +Kitha.setPenjumlahan());
        System.out.println("Hasil Pengurangan : " +Kitha.setPengurangan());
        System.out.println("Hasil Perkalian : " +Kitha.setPerkalian());
        System.out.println("Hasil Pembagian : " +Kitha.setPembagian());
    }
}
