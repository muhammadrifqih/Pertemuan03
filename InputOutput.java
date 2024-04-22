import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nama;
        int jumlahSks;
        double IPK;

        System.out.println("Masukkan Nama Anda : ");
        nama = scanner.nextLine();
        System.out.println("Hai, " + nama);

        System.out.println("Masukan Jumlah SKS yang sudah di tempuh :");
        jumlahSks = scanner.nextInt();

        System.out.println("Masukan IPK Semester");
        IPK = scanner.nextDouble();

        double Jumlah = IPK * jumlahSks;
        System.out.println("Total Nilai = " + Jumlah);

    }
}