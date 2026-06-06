package abstrak;

public abstract class BangunDatar {
    // Atribut asli bawaan proyek kamu
    int x, y;
    
    // Atribut tambahan sesuai instruksi soal
    private int jumlahSisi;
    
    // Constructor tambahan (jumlahSisi = sisi)
    public BangunDatar(int sisi) {
        this.jumlahSisi = sisi;
    }
    
    // Method konkrit bawaan proyek kamu
    public void pindahkan(int a, int b) {
        x = a;
        y = b;
        System.out.println("Posisi dipindahkan ke koordinat: (" + x + ", " + y + ")");
    }
    
    // Method konkrit tambahan untuk mengambil jumlah sisi
    public int getJumlahSisi() {
        return this.jumlahSisi;
    }
    
    // Method-method abstrak yang wajib di-override oleh subclass
    public abstract void draw();
    public abstract void resize();
    public abstract double getLuas();
    public abstract double getKeliling();
}