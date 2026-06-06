package abstrak;

public abstract class Kendaraan {
    private String merk;
    private String model;
    private int jumlahRoda;
    
    // Getter dan Setter untuk merk
    public String getMerk() {
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    // Getter dan Setter untuk model (Ini yang bikin error kalau hilang)
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    
    // Getter dan Setter untuk jumlahRoda (Ini juga wajib ada)
    public int getJumlahRoda() {
        return jumlahRoda;
    }
    public void setJumlahRoda(int jumlahRoda) {
        this.jumlahRoda = jumlahRoda;
    }

    // Method abstrak bawaan tugas
    public abstract void nyalakan();
}