package bagian3.kontak;

public class MainKontak {
    public static void main(String[] args) {

        // -------------------------------------------------------
        // Membuat objek pengelola dan mengisinya
        // -------------------------------------------------------
        BukuKontak buku = new BukuKontak("kontak.txt");
        buku.tambahKontak(new Kontak("Andi",  "0811111", "andi@email.com"));
        buku.tambahKontak(new Kontak("Budi",  "0822222", "budi@email.com"));
        buku.tambahKontak(new Kontak("Citra", "0833333", "citra@email.com"));
        buku.tampilkanSemua();
        buku.simpanKeBerkas();

        System.out.println();

        // -------------------------------------------------------
        // Objek baru yang kosong, lalu memuat dari berkas
        // -------------------------------------------------------
        BukuKontak bukuLain = new BukuKontak("kontak.txt");
        bukuLain.muatDariBerkas();
        bukuLain.tampilkanSemua();
        System.out.println("Jumlah kontak: " + bukuLain.jumlahKontak());

        System.out.println();

        // -------------------------------------------------------
        // Latihan 3.4 No. 1 — Uji cariKontak
        // -------------------------------------------------------
        System.out.println("=== Uji Cari Kontak ===");
        bukuLain.cariKontak("Budi");
        bukuLain.cariKontak("Rini");   // tidak ditemukan

        System.out.println();

        // -------------------------------------------------------
        // Latihan 3.4 No. 3 — Uji hapusKontak
        // -------------------------------------------------------
        System.out.println("=== Uji Hapus Kontak ===");
        bukuLain.hapusKontak("Andi");
        bukuLain.tampilkanSemua();
        System.out.println("Jumlah kontak setelah hapus: " + bukuLain.jumlahKontak());
    }
}
