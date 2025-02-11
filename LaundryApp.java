import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jajang
 *
 */
import java.util.ArrayList;
import java.util.Scanner;

public class LaundryApp {

    // Array untuk menyimpan data jenis layanan dan harga
    static String[][] jenisLayanan = {
            {"Cuci Kering", "10000"},
            {"Cuci Setrika", "12000"},
            {"Cuci Lengkap", "15000"}
    };

    // ArrayList untuk menyimpan data transaksi
    static ArrayList<String[]> transaksi = new ArrayList<>();

    // Fungsi untuk menampilkan daftar layanan
    static void tampilkanLayanan() {
        System.out.println("Daftar Layanan Laundry:");
        for (int i = 0; i < jenisLayanan.length; i++) {
            System.out.println((i + 1) + ". " + jenisLayanan[i][0] + " - Rp " + jenisLayanan[i][1]);
        }
    }

    // Fungsi untuk menghitung total biaya
    static int hitungBiaya(int berat, int layanan) {
        int hargaPerKg = Integer.parseInt(jenisLayanan[layanan - 1][1]);
        int totalBiaya = berat * hargaPerKg;
        return totalBiaya;
    }

    // Prosedur untuk mencatat transaksi
    static void catatTransaksi(String nama, String noTelp, int berat, int layanan, int totalBiaya) {
        String[] dataTransaksi = {nama, noTelp, String.valueOf(berat), String.valueOf(layanan), String.valueOf(totalBiaya)};
        transaksi.add(dataTransaksi);
        System.out.println("Transaksi berhasil dicatat.");
    }

    // Prosedur untuk menampilkan laporan transaksi
    static void tampilkanLaporan() {
        System.out.println("\n--- Laporan Transaksi ---");
        if (transaksi.isEmpty()) {
            System.out.println("Belum ada transaksi yang tercatat.");
        } else {
            for (String[] data : transaksi) {
                System.out.println("Nama: " + data[0] + ", No. Telp: " + data[1] +
                        ", Berat: " + data[2] + " kg, Layanan: " + jenisLayanan[Integer.parseInt(data[3]) - 1][0] +
                        ", Biaya: Rp " + data[4]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Aplikasi Laundry Sederhana ---");
            System.out.println("1. Daftar Layanan");
            System.out.println("2. Pesan Laundry");
            System.out.println("3. Lihat Laporan Transaksi");
            System.out.println("4. Keluar");

            System.out.print("Masukkan pilihan: ");
            int pilihan = input.nextInt();
            input.nextLine(); // Membersihkan newline

            switch (pilihan) {
                case 1:
                    tampilkanLayanan();
                    break;
                case 2:
                    System.out.print("Nama pelanggan: ");
                    String nama = input.nextLine();
                    System.out.print("Nomor telepon: ");
                    String noTelp = input.nextLine();
                    System.out.print("Berat cucian (kg): ");
                    int berat = input.nextInt();
                    tampilkanLayanan();
                    System.out.print("Pilih layanan (1-3): ");
                    int layanan = input.nextInt();
                    int totalBiaya = hitungBiaya(berat, layanan);
                    System.out.println("Total biaya: Rp " + totalBiaya);
                    catatTransaksi(nama, noTelp, berat, layanan, totalBiaya);
                    break;
                case 3:
                    tampilkanLaporan();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan aplikasi ini.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
