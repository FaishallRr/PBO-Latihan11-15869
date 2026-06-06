# PBO Lab 11 - Abstract & Interface

Praktikum Pemrograman Berorientasi Objek — Konsep **Abstract Class**, **Abstract Method**, dan **Interface** dalam Java.

## Sekilas Project

Project ini mendemonstrasikan 3 konsep OOP Java:

1. **Abstract class** `Kendaraan` — tidak bisa diinstansiasi langsung, harus diturunkan ke subclass (`Sepeda`)
2. **Abstract method** di `BangunDatar` — subclass (`Kotak`, `Segitiga`) wajib override method abstrak seperti `getLuas()` dan `getKeliling()`
3. **Interface** `Resizeable` — `Kotak implements Resizeable` dengan method `resize(double x)` untuk mengubah ukuran

---

## Cara Menjalankan

```bash
# Kompilasi semua file
javac abstrak/*.java implementasi/*.java

# Jalankan masing-masing main class
java abstrak.KendaraanMain    # Error: abstract class (Pertanyaan 1.1)
java abstrak.SepedaMain       # Demo Sepeda (Pertanyaan 1.2)
java abstrak.GeometriMain     # Demo BangunDatar (Pertanyaan 1.3)
java implementasi.InterfaceMain  # Demo Interface (Pertanyaan 2.1)
```

---

## UML

### Pertanyaan 1.2 — Hierarki Kendaraan

```
+----------------+       +------------------+
|   Kendaraan    |       |     Sepeda       |
| (abstract)     |<------| extends Kendaraan|
+----------------+       +------------------+
| # merk         |       | - isAuto: boolean|
| # model        |       +------------------+
| # jumlahRoda   |       | + jenis(): void  |
+----------------+       | + nyalakan():void|
| + nyalakan()    |       +------------------+
|   (abstract)   |
+----------------+
```

### Pertanyaan 1.3 — Hierarki BangunDatar

```
+-------------------+       +--------------------+
|   BangunDatar     |       |      Kotak         |
|   (abstract)      |<------| extends BangunDatar|
+-------------------+       +--------------------+
| - jumlahSisi: int |       | - panjang: double  |
| # x, y: int       |       | - lebar: double    |
+-------------------+       +--------------------+
| + BangunDatar(int)|       | + getLuas(): double|
| + getJumlahSisi() |       | + getKeliling():   |
| + pindahkan()     |       |       double       |
| + draw() abstract |       | + resize(double)   |
| + resize() abstr. |       +--------------------+
| + getLuas() abstr.|                  |
| + getKeliling()   |                  | implements
|       abstract    |       +--------------------+
+-------------------+       |    Resizeable      |
                            |   (interface)      |
                    +------>|--------------------+
                    |       | + resize(double x) |
                    |       +--------------------+
                    |
+-------------------+       +--------------------+
|   BangunDatar     |       |     Segitiga       |
|   (abstract)      |<------| extends BangunDatar|
+-------------------+       +--------------------+
                            | - alas: double     |
                            | - tinggi: double   |
                            +--------------------+
                            | + getLuas(): double|
                            | + getKeliling():   |
                            |       double       |
                            +--------------------+
```

### Pertanyaan 2.1 — Interface Resizeable

```
+--------------------+       +--------------------+
| <<interface>>      |       |      Kotak         |
|    Resizeable      |       |--------------------|
|--------------------|<------| - panjang: double  |
| + resize(double x) |       | - lebar: double    |
+--------------------+       +--------------------+
                             | + resize(double)   |
                             +--------------------+
```

---

## Author

Tugas Lab 11 PBO — Abstract & Interface
