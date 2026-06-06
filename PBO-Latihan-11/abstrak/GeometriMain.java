package abstrak;

public class GeometriMain {
    public static void main(String[] args) {
        Kotak kotak = new Kotak(4, 5);
        Segitiga segitiga = new Segitiga(3, 4);

        System.out.println("=== PENGUJIAN KOTAK ===");
        kotak.pindahkan(10, 20);
        kotak.draw();
        System.out.println("Jumlah Sisi Kotak: " + kotak.getJumlahSisi());
        System.out.println("Luas Kotak: " + kotak.getLuas());
        System.out.println("Keliling Kotak: " + kotak.getKeliling());

        System.out.println("\n=== PENGUJIAN SEGITIGA ===");
        segitiga.pindahkan(5, 5);
        segitiga.draw();
        System.out.println("Jumlah Sisi Segitiga: " + segitiga.getJumlahSisi());
        System.out.println("Luas Segitiga: " + segitiga.getLuas());
        System.out.println("Keliling Segitiga: " + segitiga.getKeliling());
    }
}