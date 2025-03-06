class MataKuliahMain_09 {
    public static void main(String[] args) {
        MataKuliah_09 mk = new MataKuliah_09("T0I2", "Algoritma dan Struktur Data", 2);
        Dosen_09 dosen1 = new Dosen_09("2011057060", "Dr. Mochammad Tanggaq, S.T., M.Kom.", 2005, "S3", "Teknologi Informasi");
        Dosen_09 dosen2 = new Dosen_09("1501067060", "Dr. Faisal Wibianto, S.A.B., M.Kom.", 2006, "S3", "Manajemen Informatika");
        Dosen_09 dosen3 = new Dosen_09("1612057060", "Prof. Dr. Ryan Iqbal, S.Kom., M.A.B.", 2005, "S3", "Manajemen Elektronika");
        
        mk.tambahDosen(dosen1);
        mk.tambahDosen(dosen2);
        mk.tambahDosen(dosen3);
        
        mk.tampilkanInfo();
        
        mk.ubahNamaMK("Algoritma dan Struktur Data Lanjutan");
        mk.ubahSKS(3);
        
        System.out.println("\nSetelah perubahan:");
        mk.tampilkanInfo();

        System.out.println();
        System.out.println("====================================");
        System.out.println();

        MataKuliah_09 mk2 = new MataKuliah_09("CT20", "Critical Thinking Problem Solving", 3);
        mk2.tambahDosen(dosen1);
        mk2.tambahDosen(dosen3);
        mk2.tampilkanInfo();

        mk2.ubahNamaMK("Konsep Teknologi Informasi");
        mk2.ubahSKS(4);
        System.out.println("\nSetelah perubahan:");
        mk2.tampilkanInfo();

        
    }
}
