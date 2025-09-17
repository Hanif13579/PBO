package id.ac.polban.service;

import id.ac.polban.model.*;

public class Presensi {
    private Mahasiswa mahasiswa;
    private boolean status;
    private PresensiDate tanggal;

    public Presensi(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.status = false; 
        this.tanggal = new PresensiDate();
    }

    public void catatKehadiran() {
        this.status = true;
    }
    
    public boolean isHadir() {
        return status;
    }

    public void tampilkanInfoPresensi() {
        this.mahasiswa.tampilkanInfo();
        System.out.println("Tanggal: " + this.tanggal.getTanggalPresensi());
        System.out.println("Status Kehadiran: " + (status ? "Hadir" : "Tidak Hadir"));
    }
}