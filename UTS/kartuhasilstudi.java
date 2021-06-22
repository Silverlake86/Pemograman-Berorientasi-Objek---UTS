import java.util.ArrayList;

public class kartuhasilstudi {
    int semester;
    mahasiswa mhs;

    ArrayList<nilaistudi> khs = new ArrayList<nilaistudi>();

    public kartuhasilstudi(mahasiswa mhs, int sem) {
        this.semester = sem;
        this.mhs = mhs;
    }

    public kartuhasilstudi(ArrayList<nilaistudi> khs, mahasiswa mhs, int semester) {
        this.khs = khs;
        this.mhs = mhs;
        this.semester = semester;
    }

    public int getSemester() {
        return this.semester;
    }

    public mahasiswa getMahasiswa() {
        return mhs;
    }

    public int totSks() {
        int s = 0;
        for (nilaistudi ns : khs) {
            s += ns.getMatakuliah().getSKS();
        }
        return s;
    }

    public double getIPK() {
        int totSKS = 0;
        double totNilai = 0.0;

        for (nilaistudi ns : khs) {
            totSKS += ns.getMatakuliah().getSKS();
            totNilai += (ns.getNilaiAngka() * ns.getMatakuliah().getSKS());
        }
        return totNilai / totSKS;
    }

    public void tambahkanNilai(nilaistudi ns) {
        khs.add(ns);
    }

    public void tampilKhs() {
        System.out.println("Nama Mahasiswa: \t" + getMahasiswa().getNama());
        System.out.println("Semester: \t\t " + getSemester());
        System.out.println("IPK: \t\t\t " + getIPK());
        System.out.println("Total SKS: \t\t " + totSks());
        System.out.println("Nilai");
        System.out.println("No.\tKode Matakuliah\t\tNama MataKuliah\t\tSks\tNilai\t");
        int t = 1;
        for (nilaistudi ns : khs) {
            System.out.print(t + "\t" + ns.getMatakuliah().getKode() + "\t\t\t" + ns.getMatakuliah().getNama() + "\t\t"
                    + ns.getMatakuliah().getSKS() + "\t" + ns.getNilaiAngka());
            System.out.println();
            t++;
        }
    }
}
