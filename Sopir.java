public class Sopir {
    private String namaSopir;
    private int hargaLayanan;

    Sopir(String namaSopir, int hargaLayanan) {
        this.namaSopir = namaSopir;
        this.hargaLayanan = hargaLayanan;
    }

    String getNamaSopir() {
        return  namaSopir;
    }
    
    int getHargaLayanan() {
        return hargaLayanan;
    }
}
