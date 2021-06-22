import java.util.*;

public class App {
    public static void main(String[] args) {
        mahasiswa mhs = new mahasiswa("Setiawan", 101, "18TI3");
        matakuliah mk1 = new matakuliah("Akuntansi", "101", 4);
        matakuliah mk2 = new matakuliah("Struktur Data", "102", 4);
        matakuliah mk3 = new matakuliah("Astronomi", "103", 4);
        nilaistudi ns1 = new nilaistudi(mk1, 'A');
        nilaistudi ns2 = new nilaistudi(mk2, 'B');
        nilaistudi ns3 = new nilaistudi(mk3, 'A');

        kartuhasilstudi khs = new kartuhasilstudi(mhs, 5);
        khs.tambahkanNilai(ns1);
        khs.tambahkanNilai(ns2);
        khs.tambahkanNilai(ns3);

        Scanner s1 = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Tampilkan KHS");
        System.out.println("2. Keluar");
        int i = s1.nextInt();
        if (i == 1) {
            khs.tampilKhs();
        } else if (i == 2) {
        }

    }
}
