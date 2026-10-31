import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // membuat menu
        String[] menu = {
            "Sewa Lepas Kunci",
            "Sewa Dengan Sopir",
            "Stok Kendaraan",
            "Keluar"
        };

        // menyiapkan scanner
        Scanner input = new Scanner(System.in);

        // menyimpan list kendaraan dari func forListKendaraan()
        Kendaraan[] listKendaraan = forListKendaraan();

        // looping menu
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }

        // user memilih menu
        System.out.println("");
        System.out.print("Pilih Menu: ");
        int pilihMenu = input.nextInt();
        // mengambil spasi dari input integer diatas
        input.nextLine();

        // jika user memilih menu pertama
        if (pilihMenu == 1) {
            System.out.println("");
            // print list kendaraan
            System.out.println("List Kendaraan");
            for (int i = 0; i < listKendaraan.length; i++) {
                System.out.print((i + 1) + ". ");
                listKendaraan[i].TampilkanNama();
            }
            
            System.out.println();
            // user memilih mobil
            System.out.print("Pilih: " );
            int pilihMobil = input.nextInt();

            // pilihan mobil user 
            int pilihanMobilUser = pilihMobil - 1;

            // cek kondisi jika user memilih mobil diluar dari menu
            if (pilihMobil <= 0 || pilihMobil > (listKendaraan.length)) {
                System.out.println("Pilihan Tidak Valid");
            } else { // selain itu lanjut ke hari sewa dan pembayaran
                System.out.print("Berapa Hari Sewa: ");
                int sewa = input.nextInt();
                // cek jika hari sewa kurang dari sama dengan 0
                if (sewa <= 0) System.out.println("Input Tidak Valid");


                System.out.println("");
                // menghitung diskon
                double diskon =  listKendaraan[pilihanMobilUser].sewaLepas(sewa);
                // menghitung total harga setelah diskon
                listKendaraan[pilihanMobilUser].TotalHargaSewa(sewa, diskon);

                System.out.println("");
                // user membayar
                System.out.print("Uang Bayar: ");
                double bayar = input.nextLong();

                // cek kondisi
                if (bayar < diskon) { // jika kurang makan akan ada pesan bahwa uang kurang
                    System.out.println("Maaf uang anda kurang..");
                } else { // jika tidak maka, akan menampilkan struk dan berhasil sewa
                    listKendaraan[pilihanMobilUser].TotalHargaSewaDiskon(sewa, diskon, bayar);
                    // dan kurangin stok dari kendaraannya 
                    listKendaraan[pilihanMobilUser].KurangiStok();
                }
            }
        }
    }

    static Kendaraan[] forListKendaraan() {
        Kendaraan[] listKendaraan = {
            new Kendaraan("Mazda MX-5",           3_000_000,  5),
            new Kendaraan("Toyota GR86",          3_500_000,  5),
            new Kendaraan("Ford Mustang GT",      5_500_000,  5),
            new Kendaraan("Chevrolet Camaro SS",  6_000_000,  5),
            new Kendaraan("BMW M4 Competition",   8_000_000,  5),
            new Kendaraan("Porsche 718 Cayman",   9_000_000,  2),
            new Kendaraan("Nissan GT-R",         25_000_000,  1),
            new Kendaraan("Porsche 911 Carrera", 15_000_000,  1),
            new Kendaraan("Audi R8",             20_000_000,  5),
            new Kendaraan("Lamborghini Huracán", 30_000_000,  1)
        };
        return listKendaraan;
    }

    static Sopir[] forListSopir() {
    Sopir[] listSopir = {
        new Sopir("Ketut Garing",   300_000),
        new Sopir("Made China",   350_000),
        new Sopir("Gede Cenik",    300_000),
        new Sopir("Komang Tiga",    400_000),
        new Sopir("Ketut Empat", 450_000),
        new Sopir("Nyoman Man",   500_000),
        new Sopir("Wayan Ancog",  250_000)
    };

    return listSopir;
}

}