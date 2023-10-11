package Tugas1Praktikum;

public class DemoNilai {
    public static void main(String[] args) {
        Nilai num = new Nilai();

        num.nama = "Muhammad Rifky Akbar";
        num.absen = 80;
        num.tugas = 90;
        num.uts = 90;
        num.nim = 2210631170088l;
        num.uas = 75;

        num.Nilai();

        num.CetakNilai();

    }
}
