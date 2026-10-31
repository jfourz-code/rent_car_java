public class Kendaraan {
    private String namaKendaraan;
    private double hargSewa;
    private int stok;

    // constructor
    Kendaraan(String namaKendaraan, long hargaSewa, int stok) {
        this.namaKendaraan = namaKendaraan;
        this.hargSewa = hargaSewa;
        this.stok = stok;
    }

    // method return hargaSewa
    public double hargaSewaKendaraan() {
        return hargSewa;
    }

    // method sewa lepas + hitung diskon 15%
    public double sewaLepas(int hariSewa) {
        return (hariSewa * hargSewa) - ((hariSewa * hargSewa) * 0.15); 
    }

    // methiod sewaPlusSopir hitung totalnya
    public double sewaPlusSopir(int hariSewa, double hargaSopir) {
        return  (hariSewa + hariSewa) + hargaSopir;
    }

    // method menampilkan total harga sewaLepas
    public void TotalHargaSewa(int hariSewa, double diskonTotal) {
        double Total = hargSewa * hariSewa;
        System.out.println("");
        System.out.println("=================================");
        System.out.println("Nama Kendaraan: " + namaKendaraan);
        System.out.printf("Total : %.0f x %d = %.0f%n", hargSewa, hariSewa, Total);
        System.out.println("Selamat Anda Mendapatkan Diskon 15%");
        System.out.printf("Total Bayar Menjadi : %.0f%n", diskonTotal);
    }

    // method menampilkan struk total semuanya + diskon pada sewaLepas
    public void TotalHargaSewaDiskon(int hariSewa, double totalDiskon, double bayar) {
        System.out.println("");
        System.out.println("=================================");
        System.out.println("Nama Kendaraan: " + namaKendaraan);
        System.out.printf("Total + Diskon : %.0f x %d + 15%% Diskon = %.0f%n", hargSewa, hariSewa, totalDiskon);
        System.out.printf("Jumlah yang dibayar : %.0f%n", bayar);
        System.out.printf("Kembalian: %.0f%n", (bayar - totalDiskon));
        System.out.println("Selamat!");
    }

    // method menampilkan total harga sewa plus sopir
    public void TotalHargaSewaPlusSopir(String namaSopir, int hariSewa, double jasaSopir) {
        double Total = (hargSewa * hariSewa) + jasaSopir;
        System.out.println("");
        System.out.println("===============================");
        System.out.println("Nama Kendaraan : " + namaKendaraan);
        System.out.println("Nama Sopir : " + namaSopir);
        System.out.printf("Harga Sewa Kendaraan : %.0f%n", hargSewa);
        System.out.printf("Jumlah Hari Sewa : %d%n", hariSewa);
        System.out.printf("Harga Jasa Sopir : %.0f%n", jasaSopir);
        System.out.printf("Total: %.0f%n", Total);
    }

    // method menampilkan struk total semunanya di sewa plus sopir
    public void TotalHargaSewaPlusSopirStruk(String namaSopir, int hariSewa, double jasaSopir, double bayar) {
        double Total = (hargSewa * hariSewa) + jasaSopir;
        System.out.println("");
        System.out.println("===============================");
        System.out.println("Nama Kendaraan : " + namaKendaraan);
        System.out.println("Nama Sopir : " + namaSopir);
        System.out.printf("Harga Sewa Kendaraan : %.0f%n", hargSewa);
        System.out.printf("Jumlah Hari Sewa : %d%n", hariSewa);
        System.out.printf("Harga Jasa Sopir : %.0f%n", jasaSopir);
        System.out.printf("Total: %.0f%n", Total);
        System.out.printf("Jumlah yang dibayar : %.0f%n", bayar);
        System.out.printf("Kembalian: %.0f%n", (bayar - Total));
        System.out.println("Selamat!");
    }

    // method untuk menampilkan list kendaraan dan harga sewa
    public void TampilkanNama() {
        System.out.printf("%s / Harga Sewa: %.0f%n", namaKendaraan, hargSewa);
    }

    // method untuk mengurangi stok kendaraan
    public void KurangiStok() {
        stok--;
    }

    // method untuk menampilkan list stok kendaraan
    public void TampilkanStok() {
        System.out.println("Nama Kendaraan: " + namaKendaraan);
        System.out.printf("Harga Sewa: %.0f%n", hargSewa);
        System.out.println("Stok: " + stok);
    }
}
