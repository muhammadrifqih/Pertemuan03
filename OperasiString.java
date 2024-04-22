public class OperasiString {
    public static void main(String[] args) {
        String kota = "Banjarbaru";
        System.out.println(kota);

        char[] uniskaChar = { 'U', 'N', 'I', 'S', 'K', 'A' };
        String uniskacString = new String(uniskaChar);
        System.out.println(uniskacString);

        System.out.println(uniskacString.toUpperCase());
        System.out.println(kota.toUpperCase());

        System.out.println(uniskacString.toLowerCase());
        System.out.println(kota.toLowerCase());

        System.out.println(uniskacString.substring(5));
        System.out.println(kota.substring(5));

        System.out.println(uniskacString.substring(0, 4));
        System.out.println(kota.substring(0, 4));

        String hariIni = "2024-04-22";
        String tahun = hariIni.substring(0, 4);
        String bulan = hariIni.substring(5, 7);
        String tanggal = hariIni.substring(8, 10);
        System.out.println(tanggal + "-" + bulan + "-" + tahun);

    }
}
