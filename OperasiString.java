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
    }
}
