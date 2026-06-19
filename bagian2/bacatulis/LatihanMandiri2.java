package bagian2.bacatulis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class LatihanMandiri2 {
    public static void main(String[] args) {

        // -------------------------------------------------------
        // Latihan 2.4 No. 1 — Tulis 5 nama hari, lalu baca kembali
        // -------------------------------------------------------
        System.out.println("=== Latihan 1: Tulis 5 Nama Hari ===");
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};

        try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt"))) {
            for (String h : hari) {
                penulis.println(h);
            }
            System.out.println("5 nama hari berhasil ditulis ke hari.txt");
        } catch (IOException e) {
            System.out.println("Gagal menulis: " + e.getMessage());
        }

        System.out.println("\nIsi hari.txt setelah ditulis:");
        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {
            String baris;
            while ((baris = pembaca.readLine()) != null) {
                System.out.println(baris);
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }

        // -------------------------------------------------------
        // Latihan 2.4 No. 2 — Tambah (append) 2 nama hari lagi
        // -------------------------------------------------------
        System.out.println("\n=== Latihan 2: Append 2 Nama Hari ===");
        try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt", true))) {
            penulis.println("Sabtu");
            penulis.println("Minggu");
            System.out.println("Sabtu dan Minggu berhasil ditambahkan.");
        } catch (IOException e) {
            System.out.println("Gagal menambah: " + e.getMessage());
        }

        System.out.println("\nSeluruh isi hari.txt setelah append:");
        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {
            String baris;
            while ((baris = pembaca.readLine()) != null) {
                System.out.println(baris);
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }

        // -------------------------------------------------------
        // Latihan 2.4 No. 3 — Hitung jumlah baris dalam hari.txt
        // -------------------------------------------------------
        System.out.println("\n=== Latihan 3: Hitung Jumlah Baris ===");
        int jumlah = 0;
        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {
            while (pembaca.readLine() != null) {
                jumlah++;
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }
        System.out.println("Jumlah baris: " + jumlah);
    }
}
