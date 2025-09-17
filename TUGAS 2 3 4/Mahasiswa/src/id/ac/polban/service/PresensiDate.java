package id.ac.polban.service;

import java.time.LocalDate;

public class PresensiDate {
    private LocalDate tanggalPresensi = LocalDate.now();

    public LocalDate getTanggalPresensi() {
        return tanggalPresensi;
    }
    
    public PresensiDate(){

    }
}
