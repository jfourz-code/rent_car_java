public class Sopir {
    private String namaSopir;
    private int hargaLayanan;

    // constructor sopir
    public Sopir(String namaSopir, int hargaLayanan) {
        this.namaSopir = namaSopir;
        this.hargaLayanan = hargaLayanan;
    }

    // method return nama sopir
    public String getNamaSopir() {
        return  namaSopir;
    }
    
    // method return harga layanan (jasa sopir)
    public int getHargaLayanan() {
        return hargaLayanan;
    }

    // method tampilkan nama sopir + harga layanan
    public void TampilkanNamaSopir() {
        System.out.println(namaSopir + " / HargaJasa: " + hargaLayanan);
    }
}
