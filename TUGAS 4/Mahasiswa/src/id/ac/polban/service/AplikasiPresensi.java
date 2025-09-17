package id.ac.polban.service;

import id.ac.polban.model.*;
import java.util.Scanner;
import java.util.ArrayList; 

public class AplikasiPresensi {
    
    private Scanner scanner;
    private ArrayList<Presensi> daftarPresensi; 

    public AplikasiPresensi() {
        this.scanner = new Scanner(System.in);
        this.daftarPresensi = new ArrayList<>(); 
    }

    public void run() {
        boolean lanjut = true;
        while (lanjut) {
            inputSatuPresensi(); 
            
            System.out.print("\nInput data presensi lagi? (Y/T): ");
            String pilihan = scanner.nextLine();
            if (!pilihan.equalsIgnoreCase("Y")) {
                lanjut = false;
            }
            System.out.println("----------------------------------------");
        }
        
        tampilkanLaporanPresensi();
        
        System.out.println("Program selesai.");
        scanner.close();
    }

    private void inputSatuPresensi() {
        System.out.print("Pilih Tipe Mahasiswa [1=Reguler, 2=Karyawan]: ");
        String tipe = scanner.nextLine();
        
        System.out.print("Masukkan NIM Mahasiswa: ");
        String nim = scanner.nextLine();
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = scanner.nextLine();

        Mahasiswa mhs; 
        if (tipe.equals("2")) {
            System.out.print("Masukkan Nama Perusahaan: ");
            String perusahaan = scanner.nextLine();
            mhs = new MahasiswaKaryawan(nim, nama, perusahaan);
        } else {
            mhs = new Mahasiswa(nim, nama);
        }
        
        Presensi presensiMhs = new Presensi(mhs);
        
        System.out.println("\n--- Status Presensi Awal ---");
        presensiMhs.tampilkanInfoPresensi();
        
        System.out.print("\nCatat kehadiran untuk mahasiswa ini? (Y/T): ");
        String pilihanHadir = scanner.nextLine();
        if (pilihanHadir.equalsIgnoreCase("Y")) {
            presensiMhs.catatKehadiran();
            System.out.println(" Kehadiran berhasil dicatat!");
        }

        this.daftarPresensi.add(presensiMhs);
        
        System.out.println("\nData presensi untuk " + mhs.getNama() + " telah tersimpan.");
    }
    
    public void tampilkanLaporanPresensi() {
        System.out.println("\n\n--- LAPORAN AKHIR SELURUH PRESENSI ---");
        if (this.daftarPresensi.isEmpty()) {
            System.out.println("Tidak ada data presensi yang tersimpan.");
            return;
        }
        
        for (Presensi p : this.daftarPresensi) {
            p.tampilkanInfoPresensi(); 
            System.out.println("---------------------");
        }
    }
}