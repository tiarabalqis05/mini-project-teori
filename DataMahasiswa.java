import java.util.Scanner;

public class DataMahasiswa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        input.nextLine();

        Mahasiswa[] daftar = new Mahasiswa[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data mahasiswa ke-" + (i + 1));

            System.out.print("Nama  : ");
            String nama = input.nextLine();

            System.out.print("NIM   : ");
            String nim = input.nextLine();

            System.out.print("Nilai : ");
            double nilai = input.nextDouble();
            input.nextLine();

            daftar[i] = new Mahasiswa(nama, nim, nilai);
        }

        System.out.println("\n--- Data Mahasiswa ---");

        for (int i = 0; i < jumlah; i++) {
            daftar[i].tampilkanData();

            if (daftar[i].cekKelulusan()) {
                System.out.println("Status : LULUS");
            } else {
                System.out.println("Status : TIDAK LULUS");
            }

            System.out.println();
        }

        input.close();
    }
}