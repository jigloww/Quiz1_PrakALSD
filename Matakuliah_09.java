class MataKuliah_09 {
    String kodeMK;
    String namaMK;
    int sks;
    Dosen_09[] dosenPengampu;
    int jumlahDosen;

    
    MataKuliah_09(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
        this.dosenPengampu = new Dosen_09[3]; 
        this.jumlahDosen = 0;
    }

    void tampilkanInfo() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama MK: " + namaMK);
        System.out.println("SKS: " + sks);
        System.out.println("Dosen Pengampu:");
        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("- " + dosenPengampu[i].nama);
        }
    }

    void ubahNamaMK(String namaMKBaru) {
        namaMK = namaMKBaru;
    }

    void ubahSKS(int sksBaru) {
        if (sksBaru >= 2) {
            sks = sksBaru;
        } else {
            System.out.println("Jumlah SKS tidak boleh kurang dari 2.");
        }
    }

    void tambahDosen(Dosen_09 dosen) {
        if (jumlahDosen < dosenPengampu.length) {
            dosenPengampu[jumlahDosen] = dosen;
            jumlahDosen++;
        } else {
            System.out.println("Tidak bisa menambahkan lebih banyak dosen.");
        }
    }
}
