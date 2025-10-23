public class ArraySoal3 {
    public static void main(String[] args) {
        // Menyimpan 5 nama hewan peliharaan
        String[] hewan = {"Kucing", "Anjing", "Ikan", "Kelinci", "Babi"};
        System.out.println("Hewan peliharaan yang memiliki nama lebih dari 4 karakter");

        // Menampilkan semua nama hewan yang memiliki nama kebih dari 4 karakter
        for (int i = 0; i < hewan.length; i++) {
            if (hewan[i].length() > 4) {
                System.out.println(hewan[i]);
    }
}
    }
}