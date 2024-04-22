import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        int nilai = 0;
        double rata = 0;
        String nama = "rifqi";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nama :" + nama);
        System.out.println("Input Nama Baru: ");
        nama = scanner.nextLine();
        System.out.println("Nama Baru : " + nama);
    }
}