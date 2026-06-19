package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanMandiri1 {
    public static void main(String[] args) {

        // -------------------------------------------------------
        // Latihan 1.4 No. 1 — Cek keberadaan dan ukuran laporan.txt
        // -------------------------------------------------------
        System.out.println("=== Latihan 1 ===");
        File berkas = new File("laporan.txt");
        if (berkas.exists()) {
            System.out.println("Berkas ada, ukuran: " + berkas.length() + " byte");
        } else {
            System.out.println("Berkas laporan.txt tidak ditemukan.");
        }

        // -------------------------------------------------------
        // Latihan 1.4 No. 2 — Buat folder bernama arsip
        // -------------------------------------------------------
        System.out.println("\n=== Latihan 2 ===");
        File folder = new File("arsip");
        if (folder.mkdir()) {
            System.out.println("Folder 'arsip' berhasil dibuat.");
        } else {
            System.out.println("Folder 'arsip' gagal dibuat (mungkin sudah ada).");
        }

        // -------------------------------------------------------
        // Latihan 1.4 No. 3 — Buat berkas sementara.txt lalu hapus
        // -------------------------------------------------------
        System.out.println("\n=== Latihan 3 ===");
        File sementara = new File("sementara.txt");
        try {
            sementara.createNewFile();
            System.out.println("Sebelum dihapus, ada? " + sementara.exists());
            sementara.delete();
            System.out.println("Sesudah dihapus, ada? " + sementara.exists());
        } catch (IOException e) {
            System.out.println("Kesalahan: " + e.getMessage());
        }
    }
}
