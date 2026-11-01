# 🚗 Rent Car Java

Program CLI (Command Line Interface) berbasis Java untuk menyewa kendaraan. Dibuat sebagai proyek Ujian Tengah Semester (UTS) dengan menerapkan konsep Pemrograman Berorientasi Objek (OOP).

Pengguna dapat memilih kendaraan, menentukan lama sewa, memilih apakah ingin menyewa **lepas kunci** atau **dengan sopir**, lalu membayar dan menerima struk.

---

## ✨ Fitur

- **Sewa Lepas Kunci**: sewa kendaraan tanpa sopir dan mendapat **diskon 15%** dari total harga.
- **Sewa Dengan Sopir**: sewa kendaraan sekaligus memilih sopir. Biaya jasa sopir ditambahkan ke total.
- **Stok Kendaraan**: melihat sisa stok setiap kendaraan.
- **Validasi stok**: kendaraan dengan stok kosong tidak bisa disewa.
- **Validasi input**: pilihan menu/kendaraan di luar daftar, hari sewa ≤ 0, dan uang pembayaran yang kurang akan ditolak.
- **Struk transaksi**: menampilkan rincian sewa, jumlah dibayar, dan kembalian.
- Stok otomatis berkurang setiap kali transaksi berhasil.

---

## 📁 Struktur Proyek

```
rent_car_java/
├── Main.java        # Program utama: menu, alur transaksi, dan data awal
├── Kendaraan.java   # Class kendaraan: harga, stok, perhitungan, dan struk
└── Sopir.java       # Class sopir: nama dan tarif jasa
```

| File | Deskripsi |
|------|-----------|
| `Main.java` | Berisi `main()`, menu interaktif, dan method `forListKendaraan()` serta `forListSopir()` untuk menyiapkan data awal. |
| `Kendaraan.java` | Menyimpan nama, harga sewa per hari, dan stok. Berisi method perhitungan harga, pengecekan/pengurangan stok, serta pencetakan total dan struk. |
| `Sopir.java` | Menyimpan nama sopir dan harga layanan, dilengkapi getter dan method untuk menampilkan data. |

---

## 🛠️ Prasyarat

- **JDK 8** atau lebih baru
- Terminal / Command Prompt

Cek instalasi Java:

```bash
java -version
javac -version
```

---

## ▶️ Cara Menjalankan

1. Clone repository:

   ```bash
   git clone https://github.com/jfourz-code/rent_car_java.git
   cd rent_car_java
   ```

2. Compile semua file:

   ```bash
   javac Main.java Kendaraan.java Sopir.java
   ```

3. Jalankan program:

   ```bash
   java Main
   ```

---

## 🖥️ Cara Penggunaan

Saat program dijalankan, menu utama akan muncul:

```
========= Sewa Kendaraan =========
1. Sewa Lepas Kunci
2. Sewa Dengan Sopir
3. Stok Kendaraan
4. Keluar

Pilih Menu:
```

### 1. Sewa Lepas Kunci
1. Pilih kendaraan dari daftar.
2. Masukkan jumlah hari sewa.
3. Program menampilkan total harga dan **diskon 15%**.
4. Masukkan jumlah uang yang dibayar.
5. Jika uang cukup, struk dicetak beserta kembalian dan stok berkurang satu.

### 2. Sewa Dengan Sopir
1. Pilih kendaraan dari daftar.
2. Masukkan jumlah hari sewa.
3. Pilih sopir dari daftar.
4. Program menampilkan rincian: harga sewa, jumlah hari, jasa sopir, dan total.
5. Masukkan jumlah uang yang dibayar. Jika cukup, struk dicetak dan stok berkurang satu.

### 3. Stok Kendaraan
Menampilkan nama, harga sewa, dan sisa stok seluruh kendaraan.

### 4. Keluar
Mengakhiri program.

---

## 💰 Rumus Perhitungan

| Jenis Sewa | Rumus |
|------------|-------|
| Lepas Kunci | `(harga sewa × hari) − 15%` |
| Dengan Sopir | `(harga sewa × hari) + jasa sopir` |
