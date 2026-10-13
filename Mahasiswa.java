public class Mahasiswa {
    String nama;
    String nim;
    double nilai;

    public Mahasiswa(String nama, String nim, double nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    void tampilkanData() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Nilai : " + nilai);
    }

    boolean cekKelulusan() {
        if (nilai >= 70) {
            return true;
        } else {
            return false;
        }
    }
}