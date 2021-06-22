public class nilaistudi {
    matakuliah mk1;
    char NilaiHuruf;

    public matakuliah getMatakuliah() {
        return mk1;
    }

    public nilaistudi(matakuliah mk, char nilai) {
        this.mk1 = mk;
        this.NilaiHuruf = nilai;
    }

    public double getNilaiAngka() {
        if (NilaiHuruf == 'A') {
            return 4.0;
        } else if (NilaiHuruf == 'B') {
            return 3.0;
        } else if (NilaiHuruf == 'C') {
            return 2.0;
        } else if (NilaiHuruf == 'D') {
            return 1.0;
        } else {
            return 0.0;
        }

    }
}
