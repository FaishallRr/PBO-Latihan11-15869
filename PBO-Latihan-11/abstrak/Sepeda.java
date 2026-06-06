package abstrak;

public class Sepeda extends Kendaraan {
    // Atribut sesuai diagram
    private boolean isAuto;

    // Constructor untuk menginisialisasi status sepeda
    public Sepeda(String merk, String model, boolean isAuto) {
        setMerk(merk);
        setModel(model);
        setJumlahRoda(2); // Sepeda normal umumnya beroda 2
        this.isAuto = isAuto;
    }

    // Mengimplementasikan method abstrak dari class Kendaraan
    @Override
    public void nyalakan() {
        if (isAuto) {
            System.out.println("Sepeda otomatis dinyalakan dengan menekan tombol power.");
        } else {
            System.out.println("Sepeda kayuh siap dikendarai (tidak perlu dinyalakan).");
        }
    }

    // Method jenis() sesuai ketentuan soal
    public void jenis() {
        if (this.isAuto) {
            System.out.println("Sepeda otomatis");
        } else {
            System.out.println("Sepeda kayuh");
        }
    }
}