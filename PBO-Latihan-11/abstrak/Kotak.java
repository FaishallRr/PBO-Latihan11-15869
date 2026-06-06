package abstrak;

// 1. Wajib meng-import interface Resizeable karena letaknya di package sebelah
import implementasi.Resizeable;

// 2. Tambahkan kata kunci 'implements Resizeable' di baris class
public class Kotak extends BangunDatar implements Resizeable {
    private double panjang;
    private double lebar;

    // Constructor Kotak
    public Kotak(double panjang, double lebar) {
        super(4); // Mengirim angka 4 ke superclass karena Kotak memiliki 4 sisi
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // 3. WAJIB TAMBAHKAN METHOD INI (Implementasi dari interface Resizeable)
    @Override
    public void resize(double x) {
        // Mengubah ukuran panjang dan lebar sebesar x kali lipat dari ukuran semula
        this.panjang = this.panjang * x;
        this.lebar = this.lebar * x;
        System.out.println("-> Ukuran panjang dan lebar Kotak berhasil dikalikan " + x);
    }

    @Override
    public void draw() {
        System.out.println("Menggambar Kotak dengan ukuran " + panjang + " x " + lebar);
    }

    @Override
    public void resize() {
        System.out.println("Method resize bawaan superclass BangunDatar dijalankan.");
    }

    @Override
    public double getLuas() {
        return panjang * lebar;
    }

    @Override
    public double getKeliling() {
        return 2 * (panjang + lebar);
    }
}