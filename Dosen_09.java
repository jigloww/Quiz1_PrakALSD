class Dosen_09 {
    String nidn;
    String nama;
    int tahunMasuk;
    String jenjangPendidikan;
    String prodi;

    Dosen_09(String nidn, String nama, int tahunMasuk, String jenjangPendidikan, String prodi) {
        this.nidn = nidn;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.jenjangPendidikan = jenjangPendidikan;
        this.prodi = prodi;
    }

    void tampilkanInfo() {
        System.out.println("NIDN: " + nidn);
        System.out.println("Nama: " + nama);
        System.out.println("Tahun Masuk: " + tahunMasuk);
        System.out.println("Jenjang Pendidikan: " + jenjangPendidikan);
        System.out.println("Program Studi: " + prodi);
    }

    void ubahProdi(String prodiBaru) {
        prodi = prodiBaru;
    }

    void ubahPendidikan(String jenjangBaru) {
        jenjangPendidikan = jenjangBaru;
    }
    
    void ubahGelar(String tambahGelar) {
        nama = tambahGelar;
    }
}