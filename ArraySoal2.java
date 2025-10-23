public class ArraySoal2 {
    public static void main(String[] args) {
        // Menyimpan 6 nama mata pelajaran
        String[] mapel = {"Matematika","Bahasa Indonesia", "IPA", "Bahasa Inggris","IPS", "Senbud"};

        // Menampilkan setiap nama mata pelajaran
        System.out.println("Daftar Mata Pelajaran");
        for (int i = 0; i < mapel.length; i++) {
            System.out.println((i + 1) + "." + mapel[i]);
    }
}
}