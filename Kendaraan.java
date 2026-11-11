public class Kendaraan {
    private String namaKendaraan;
    private double hargaSewa;
    private int stok;

    // constructor
    Kendaraan(String namaKendaraan, long hargaSewa, int stok) {
        this.namaKendaraan = namaKendaraan;
        this.hargaSewa = hargaSewa;
        this.stok = stok;
    }

    // method return hargaSewa
    public double hargaSewaKendaraan() {
        return hargaSewa;
    }

    // method sewa lepas + hitung diskon
    public double sewaLepas(int hariSewa, int diskon) {
        return (hariSewa * hargaSewa) - ((hariSewa * hargaSewa) * diskon / 100);
    }

    // methiod sewaPlusSopir hitung totalnya
    public double sewaPlusSopir(int hariSewa, double hargaSopir) {
        return  (hariSewa * hargaSewa) + hargaSopir;
    }

    // method menampilkan total harga sewaLepas
    public void TotalHargaSewa(int hariSewa,int diskon, double diskonTotal) {
        double Total = hargaSewa * hariSewa;
        System.out.println("");
        System.out.println("=============== Total Sewa Lepas ===============");
        System.out.println("Nama Kendaraan: " + namaKendaraan);
        System.out.printf("Total : %.0f x %d = %.0f%n", hargaSewa, hariSewa, Total);
        System.out.println("Selamat Anda Mendapatkan Diskon " + diskon + "%");
        System.out.printf("Total Bayar Menjadi : %.0f%n", diskonTotal);
        System.out.println("-------------------------------------------------");
    }

    // method menampilkan struk total semuanya + diskon pada sewaLepas
    public void TotalHargaSewaDiskon(int hariSewa, int diskon, double totalDiskon, double bayar) {
        System.out.println("");
        System.out.println("=============== Struk Sewa Lepas ===============");
        System.out.println("Nama Kendaraan: " + namaKendaraan);
        System.out.printf("Harga Sewa: %.0f%n", hargaSewa);
        System.out.println("Jumlah Hari Sewa: " + hariSewa);
        System.out.printf("Total : %.0f%n", hargaSewa * hariSewa);
        System.out.println("Diskon: " + diskon + "%");
        System.out.printf("Total + Diskon: %.0f%n", totalDiskon);
        System.out.printf("Tunai : %.0f%n", bayar);
        System.out.printf("Kembali: %.0f%n", (bayar - totalDiskon));
        System.out.println("------------------ Terima Kasih ------------------");
    }

    // method menampilkan total harga sewa plus sopir
    public void TotalHargaSewaPlusSopir(String namaSopir, int hariSewa, double jasaSopir) {
        double Total = (hargaSewa * hariSewa) + jasaSopir;
        System.out.println("");
        System.out.println("=============== Total Sewa + Sopir ===============");
        System.out.println("Nama Kendaraan : " + namaKendaraan);
        System.out.println("Nama Sopir : " + namaSopir);
        System.out.printf("Harga Sewa Kendaraan : %.0f%n", hargaSewa);
        System.out.printf("Jumlah Hari Sewa : %d%n", hariSewa);
        System.out.printf("Harga Jasa Sopir : %.0f%n", jasaSopir);
        System.out.printf("Total: %.0f%n", Total);
        System.out.println("---------------------------------------------------");
    }

    // method menampilkan struk total semunanya di sewa plus sopir
    public void TotalHargaSewaPlusSopirStruk(String namaSopir, int hariSewa, double jasaSopir, double bayar) {
        double Total = (hargaSewa * hariSewa) + jasaSopir;
        System.out.println("");
        System.out.println("=============== Struk Sewa + Sopir ===============");
        System.out.println("Nama Kendaraan : " + namaKendaraan);
        System.out.println("Nama Sopir : " + namaSopir);
        System.out.printf("Harga Sewa Kendaraan : %.0f%n", hargaSewa);
        System.out.printf("Jumlah Hari Sewa : %d%n", hariSewa);
        System.out.printf("Harga Jasa Sopir : %.0f%n", jasaSopir);
        System.out.printf("Total: %.0f%n", Total);
        System.out.printf("Tunai : %.0f%n", bayar);
        System.out.printf("Kembali: %.0f%n", (bayar - Total));
        System.out.println("------------------ Terima Kasih ------------------");
    }

    // method untuk menampilkan list kendaraan dan harga sewa
    public void TampilkanNama() {
        System.out.printf("%s / Harga Sewa: %.0f%n", namaKendaraan, hargaSewa);
    }

    // method untuk mengurangi stok kendaraan
    public void KurangiStok() {
        stok--;
    }

    // method cek stok sebelum masuk ke pembayaran
    public boolean cekStok() {
        return stok != 0;
    }

    // method untuk menampilkan list stok kendaraan
    public void TampilkanStok() {
        System.out.println("Nama Kendaraan: " + namaKendaraan);
        System.out.printf("Harga Sewa: %.0f%n", hargaSewa);
        System.out.println("Stok: " + stok);
        System.out.println("------------------------------------");
    }
}
