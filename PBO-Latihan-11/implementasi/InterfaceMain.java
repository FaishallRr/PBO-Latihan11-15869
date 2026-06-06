package implementasi;

// Import class Kotak dari package abstrak agar bisa dipakai di sini
import abstrak.Kotak;

public class InterfaceMain {
    public static void main(String[] args) {
        // a. Mendefinisikan objek kotak (panjang = 4, lebar = 5)
        Kotak kotakKu = new Kotak(4, 5);
        
        System.out.println("=== UKURAN AWAL ===");
        // b. Cetak luas dan keliling objek semula
        System.out.println("Luas Kotak Semula     : " + kotakKu.getLuas());
        System.out.println("Keliling Kotak Semula : " + kotakKu.getKeliling());
        System.out.println();

        // c. Ubah ukuran panjang dan lebar sebesar 2x dari ukuran semula
        System.out.println("Melakukan proses resize...");
        kotakKu.resize(2.0);
        System.out.println();

        System.out.println("=== SETELAH RESIZE ===");
        // d. Cetak kembali luas dan keliling objek setelah diubah
        System.out.println("Luas Kotak Baru       : " + kotakKu.getLuas());
        System.out.println("Keliling Kotak Baru   : " + kotakKu.getKeliling());
    }
}