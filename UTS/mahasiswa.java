public class mahasiswa {
    String namaMahasiswa;
    int nimMahasiswa;
    String kelasMahasiswa;

    public mahasiswa(String nama_mahasiswa, int nim, String kelas) {
        this.namaMahasiswa = nama_mahasiswa;
        this.nimMahasiswa = nim;
        this.kelasMahasiswa = kelas;
    }

    public String getNama() {
        return this.namaMahasiswa;
    }

    public int getNIM() {
        return this.nimMahasiswa;
    }

    public String getKelas() {
        return this.kelasMahasiswa;
    }
}
