public class matakuliah {
    String KodeMataKuliah;
    String NamaMataKuliah;
    int SKS;

    public matakuliah(String nama_kuliah, String kode, int sks) {
        this.NamaMataKuliah = nama_kuliah;
        this.KodeMataKuliah = kode;
        this.SKS = sks;
    }

    public String getNama() {
        return this.NamaMataKuliah;
    }

    public String getKode() {
        return this.KodeMataKuliah;
    }

    public int getSKS() {
        return this.SKS;
    }

}