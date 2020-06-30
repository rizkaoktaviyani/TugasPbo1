public class Guru {

    //atribut
    int id;
    String nik;
    String nama;
    double nilai;
    String alamat;

    //method
    //tidak memiliki nilai baik
    //tidak memiliki void
    //namanya sama dengan nama classnya
    //jalan ketika object di instance
    //constructore


    public Guru() {
    }

    public Guru(int id, String nik, String nama, double nilai, String alamat) {
        this.id = id;
        this.nik = nik;
        this.nama = nama;
        this.nilai = nilai;
        this.alamat = alamat;
    }

    //behavior/method
    //method tanpa nilai balik / procedure
    void tampilData(){
        System.out.println("ID dari Guru :" + id);
        System.out.println(nik);
        System.out.println(nama);
        System.out.println(nilai);
        System.out.println(alamat);
    }

    void tampilDataDenganGaris(String karakter){
        System.out.println(karakter);
        System.out.println("ID \t:" + id);
        System.out.println("Nik \t:" + nik);
        System.out.println("Nama \t:" + nama);
        System.out.println("Nilai \t:" + nilai);
        System.out.println("Alamat \t:" + alamat);
        System.out.println(karakter);
    }

    //method tanpa nilai balik dengan argument/parameter
    void hitungLuasPersegiPanjang(double panjang, double lebar){
        System.out.println("Panjang \t:" + panjang);
        System.out.println("Lebar \t:" + lebar);
        System.out.println("Luas \t:" + panjang*lebar);
    }

    //method dengan nilai balik dengan argument/parameter
    double hitungLuasPersegiPanjangReturn(double panjang, double lebar) { return panjang*lebar; }

    //method dengan nilai balik / function
    double getNilai() { return nilai; }
    }