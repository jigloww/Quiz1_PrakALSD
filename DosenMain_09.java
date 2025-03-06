public class DosenMain_09 {
    public static void main(String[] args) {
        Dosen_09 dosen1 = new Dosen_09("2011057060", "Mochammad Tanggaq, S.T., M.Kom.", 2005, "S2", "Teknik Elektro");
        dosen1.tampilkanInfo();
        dosen1.ubahProdi("Teknologi Informasi");
        dosen1.ubahPendidikan("S3");
        dosen1.ubahGelar("Dr. Mochammad Tanggaq, S.T., M.Kom.");
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("\nSetelah perubahan:");
        dosen1.tampilkanInfo();

        System.out.println();
        System.out.println("======================================");
        System.out.println();
        Dosen_09 dosen2 = new Dosen_09("1501067060", "Faisal Wibianto, S.A.B., M.Kom.", 2006, "S2", "Manajemen Pemasaran");
        dosen2.tampilkanInfo();
        dosen2.ubahProdi("Manajemen Informatika");
        dosen2.ubahPendidikan("S3");
        dosen2.ubahGelar("Dr. Faisal Wibianto, S.A.B., M.Kom.");
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("\nSetelah perubahan:");
        dosen2.tampilkanInfo();
    }
}
