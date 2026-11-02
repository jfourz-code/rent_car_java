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

        // menyimpan list sopir dari func forListSopir()
        Sopir[] listSopir = forListSopir();

        // pemicu looping
        boolean mulai = true;

        // looping dimulai
        do {

        System.out.println("");
        System.out.println("========= Sewa Kendaraan =========");
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
        System.out.println("");

        // jika user memilih menu pertama
        if (pilihMenu == 1) {
            System.out.println("");
            // print list kendaraan
            System.out.println("=============== List Kendaraan ===============");
            for (int i = 0; i < listKendaraan.length; i++) {
                System.out.print((i + 1) + ". ");
                listKendaraan[i].TampilkanNama();
            }
            
            System.out.println("");
            // user memilih kendaraan
            System.out.print("Pilih Kendaraan: " );
            int pilihMobil = input.nextInt();

            // pilihan kendaraan user 
            int pilihanMobilUser = pilihMobil - 1;

            // cek kondisi jika user memilih kendaraan diluar dari menu
            if (pilihMobil <= 0 || pilihMobil > (listKendaraan.length)) {
                System.out.println("Pilihan Tidak Valid");
            // jika stok kosong maka tampilkan pesan stok kosong
            } else if (!listKendaraan[pilihanMobilUser].cekStok()) {
                System.out.println("Maaf Stok Kendaraaan Sedang Kosong..");
            } else { // selain itu lanjut ke hari sewa dan pembayaran
                System.out.print("Berapa Hari Sewa: ");
                int sewa = input.nextInt();
                // cek jika hari sewa kurang dari sama dengan 0
                if (sewa <= 0) {
                    System.out.println("Input Tidak Valid");
                } else {
                    // jika valid lanjut ke bagian ini
                    System.out.print("Masukkan Diskon: ");
                    int diskonUser = input.nextInt();
                    if (diskonUser < 0 || diskonUser > 100) {
                        System.out.println("Diskon Tidak Valid!");
                    } else {
                        // menghitung diskon
                        double diskon =  listKendaraan[pilihanMobilUser].sewaLepas(sewa, diskonUser);
                        // menghitung total harga setelah diskon
                        listKendaraan[pilihanMobilUser].TotalHargaSewa(sewa, diskonUser, diskon);

                        System.out.println("");
                        // user membayar
                        System.out.print("Uang yang dibayar: ");
                        double bayar = input.nextDouble();

                        // cek kondisi
                        if (bayar < diskon) { // jika kurang maka akan ada pesan bahwa uang kurang
                            System.out.println("Maaf uang anda kurang..");
                        } else { // jika tidak maka, akan menampilkan struk dan berhasil sewa
                            listKendaraan[pilihanMobilUser].TotalHargaSewaDiskon(sewa,diskonUser, diskon, bayar);
                            // dan kurangin stok dari kendaraannya 
                            listKendaraan[pilihanMobilUser].KurangiStok();
                        }
                    }
                }
            }

        
        } else if (pilihMenu == 2)  {
            System.out.println("");
            // print list kendaraan
            System.out.println("=============== List Kendaraan ===============");
            for (int i = 0; i < listKendaraan.length; i++) {
                System.out.print((i + 1) + ". ");
                listKendaraan[i].TampilkanNama();
            }

            System.out.println("");
            // user memilih kendaraan
            System.out.print("Pilih: " );
            int pilihMobil = input.nextInt();

            // pilihan kendaraan user 
            int pilihanMobilUser = pilihMobil - 1;

            // cek kondisi jika user memilih kendaraan diluar dari menu
            if (pilihMobil <= 0 || pilihMobil > (listKendaraan.length)) {
                System.out.println("Pilihan Tidak Valid");
            // jika stok kosong maka tampilkan pesan stok kosong
            } else if (!listKendaraan[pilihanMobilUser].cekStok()) {
                System.out.println("Maaf Stok Mobil Kosong...");
            } else { // selain itu lanjut ke hari sewa dan pembayaran
                System.out.print("Berapa Hari Sewa: ");
                int sewa = input.nextInt();
                // cek jika hari sewa kurang dari sama dengan 0
                if (sewa <= 0) {
                    System.out.println("Input Tidak Valid");
                }  else {
                    // jika valid lanjut ke bagian ini
                    System.out.println("");

                    // list sopir
                    System.out.println("=============== Pilih Sopir ===============");
                    for (int i = 0; i < listSopir.length; i++) {
                        System.out.print((i + 1) + ". ");
                        listSopir[i].TampilkanNamaSopir();
                    }

                    // user memmilih sopir
                    System.out.println();
                    System.out.print("Pilih Sopir: ");
                    int pilihanSopir = input.nextInt();

                    // menyimpan pilihan sopir user
                    int pilihanSopirUser = pilihanSopir - 1;
                    // menyimpan nama sopir
                    String namaSopir = listSopir[pilihanSopirUser].getNamaSopir();
                    // menyimpan harga layanan sopir
                    double jasaSopir = listSopir[pilihanSopirUser].getHargaLayanan();
                    // menyimpan harga sewa mobil
                    double hargaSewaMobil = listKendaraan[pilihanMobilUser].hargaSewaKendaraan();

                    // cek kondisi jika user memilih sopir diluar dari menu
                    if (pilihanSopir <= 0 || pilihanSopir > listSopir.length) {
                        System.out.println("Pilihan tidak valid!");
                    } else {
                        // menghitung total harga
                        double harga = listKendaraan[pilihanMobilUser].sewaPlusSopir(sewa, hargaSewaMobil);
                        // menampilkan total ke user
                        listKendaraan[pilihanMobilUser].TotalHargaSewaPlusSopir(namaSopir, sewa, jasaSopir);

                        System.out.println("");
                        // user membayar
                        System.out.print("Uang yang dibayar: ");
                        double bayar = input.nextDouble();

                        // cek kondisi
                        if (bayar < harga) { // jika kurang maka akan ada pesan bahwa uang kurang
                            System.out.println("Maaf uang anda kurang..");
                        } else { // jika tidak maka, akan menampilkan struk dan berhasil sewa
                            listKendaraan[pilihanMobilUser].TotalHargaSewaPlusSopirStruk(namaSopir, sewa, jasaSopir, bayar);
                            // dan kurangin stok dari kendaraannya 
                            listKendaraan[pilihanMobilUser].KurangiStok();
                        }
                    }
                }
            }
        } else if (pilihMenu == 3) {
            // tampilkan stok 
            for (int i = 0; i < listKendaraan.length; i++) {
                listKendaraan[i].TampilkanStok();
            }
        } else if (pilihMenu == 4 ) {
            // user keluar
            input.close();
            // set pemicu ke false
            mulai = false;
            // pesan bahwa sudah keluar dari menu
            System.out.println("Anda Keluar.....");
        }
        } while (mulai);

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