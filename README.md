# UAS-ALGO 
Laporan Pengerjaan Aplikasi Laundry Sederhana

Tujuan:
Membuat aplikasi sederhana untuk mengelola transaksi laundry, termasuk pencatatan pesanan, perhitungan biaya, dan pembuatan laporan transaksi.

Fitur:
Daftar Layanan: Menampilkan daftar jenis layanan laundry yang tersedia beserta harganya.
Pesan Laundry: Memungkinkan pelanggan untuk memesan layanan laundry dengan memasukkan nama, nomor telepon, berat cucian, dan jenis layanan yang diinginkan.
Lihat Laporan Transaksi: Menampilkan laporan transaksi yang berisi informasi detail setiap pesanan, termasuk nama pelanggan, nomor telepon, berat cucian, jenis layanan, dan total biaya.
Teknologi yang Digunakan:

Bahasa Pemrograman: Java
IDE: IntelliJ IDEA (atau IDE Java lainnya)
Implementasi:

Struktur Data:
jenisLayanan (array 2D): Menyimpan data jenis layanan dan harga.
transaksi (ArrayList): Menyimpan data transaksi. Setiap transaksi direpresentasikan sebagai array string yang berisi nama pelanggan, nomor telepon, berat cucian, jenis layanan, dan total biaya.
Fungsi-fungsi:
tampilkanLayanan(): Menampilkan daftar layanan laundry.
hitungBiaya(berat, layanan): Menghitung total biaya berdasarkan berat cucian dan jenis layanan.
catatTransaksi(nama, noTelp, berat, layanan, totalBiaya): Mencatat transaksi ke dalam ArrayList transaksi.
tampilkanLaporan(): Menampilkan laporan transaksi.
Logika Program:
Program menampilkan menu utama kepada pengguna.
Pengguna memilih menu yang diinginkan.
Program menjalankan fungsi yang sesuai dengan pilihan menu.
Proses diulang hingga pengguna memilih keluar dari program.
Kendala:

Keterbatasan fitur: Aplikasi ini masih sangat sederhana dan belum memiliki fitur-fitur tambahan seperti manajemen pengguna, diskon, atau notifikasi.
Tampilan antarmuka yang kurang menarik: Aplikasi ini masih menggunakan antarmuka berbasis teks (console).
Pengembangan Selanjutnya:

Menambahkan fitur-fitur tambahan seperti manajemen pengguna, diskon, atau notifikasi.
Membuat antarmuka pengguna yang lebih menarik (misalnya dengan menggunakan Java Swing atau JavaFX).
Menggunakan database untuk menyimpan data transaksi agar data tidak hilang saat program ditutup.
Kesimpulan:

Aplikasi LaundryApp telah berhasil diimplementasikan dengan fitur-fitur dasar seperti pencatatan pesanan, perhitungan biaya, dan pembuatan laporan transaksi. Meskipun masih terdapat beberapa keterbatasan, aplikasi ini dapat berfungsi dengan baik dan dapat menjadi dasar untuk pengembangan aplikasi laundry yang lebih kompleks di masa depan.
