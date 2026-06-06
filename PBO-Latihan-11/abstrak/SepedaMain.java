package abstrak;

public class SepedaMain {
    public static void main(String[] args) {
        // Membuat objek dari class Sepeda
        Sepeda sepedaListrik = new Sepeda("Polygon", "i-Volt", true);
        Sepeda sepedaManual = new Sepeda("United", "Monanza", false);

        // Menampilkan informasi Sepeda Listrik (Otomatis)
        System.out.println("--- info Sepeda 1 ---");
        System.out.println("Merk: " + sepedaListrik.getMerk());
        System.out.print("Jenis: ");
        sepedaListrik.jenis();
        sepedaListrik.nyalakan();

        System.out.println();

        // Menampilkan informasi Sepeda Manual (Kayuh)
        System.out.println("--- info Sepeda 2 ---");
        System.out.println("Merk: " + sepedaManual.getMerk());
        System.out.print("Jenis: ");
        sepedaManual.jenis();
        sepedaManual.nyalakan();
    }
}