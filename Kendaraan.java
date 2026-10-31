public class Kendaraan {
    private String namaKendaraan;
    private double hargSewa;
    private int stok;

    Kendaraan(String namaKendaraan, long hargaSewa, int stok) {
        this.namaKendaraan = namaKendaraan;
        this.hargSewa = hargaSewa;
        this.stok = stok;
    }

    double hargaSewaKendaraan() {
        return hargSewa;
    }


    public double sewaLepas(int hariSewa) {
        return (hariSewa * hargSewa) - ((hariSewa * hargSewa) * 0.15); 
    }

    public void TotalHargaSewa(int hariSewa, double diskonTotal) {
        double Total = hargSewa * hariSewa;
        System.out.println("");
        System.out.println("=================================");
        System.out.println("Nama Kendaraan: " + namaKendaraan);
        System.out.printf("Total : %.0f x %d = %.0f%n", hargSewa, hariSewa, Total);
        System.out.println("Selamat Anda Mendapatkan Diskon 15%");
        System.out.printf("Total Bayar Menjadi : %.0f%n", diskonTotal);
    }

    public void TotalHargaSewaDiskon(int hariSewa, double totalDiskon, double bayar) {
        System.out.println("");
        System.out.println("=================================");
        System.out.println("Nama Kendaraan: " + namaKendaraan);
        System.out.printf("Total + Diskon : %.0f x %d + 15%% Diskon = %.0f%n", hargSewa, hariSewa, totalDiskon);
        System.out.printf("Jumlah yang dibayar : %.0f%n", bayar);
        System.out.printf("Kembalian: %.0f%n", (bayar - totalDiskon));
        System.out.println("Selamat!");
    }

    void TampilkanNama() {
        System.out.printf("%s / Harga Sewa: %.0f%n", namaKendaraan, hargSewa);
    }

    int KurangiStok() {
        return stok - 1;
    }

    public void TampilkanStok() {
        System.out.println("Nama Kendaraan: " + namaKendaraan);
        System.out.println("Harga Sewa: " + hargSewa);
        System.out.println("Stok: " + stok);
    }
}
