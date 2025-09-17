package id.ac.polban.model;

public class MahasiswaKaryawan extends Mahasiswa{
    private String perusahaan;

    public MahasiswaKaryawan(String NIM, String nama, String perusahaan){
        super(NIM, nama);
        this.perusahaan = perusahaan;
    }

    public String getPerusahaan(){
        return this.perusahaan;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Bekerja di: " + this.perusahaan);
    }
}
