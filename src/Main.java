public class Main {
    public static void main(String [] args) {
        //instance / pembuatan objek dari class
        //namaClass namaObjek = new construktor()
        Guru guru = new Guru();

        guru.id = 1;
        guru.nik = "18630958";
        guru.nama = "Rizka Oktaviyani";
        guru.nilai = 3.6;
        guru.alamat = "Banjarbaru";
        guru.tampilData();

        Guru guru1 = new Guru(2,"18630011", "Ananda", 3.1, "Banjarbaru");
        guru1.tampilDataDenganGaris( "---------------------------");


        double hasilReturnValue = guru.getNilai();
        System.out.println("Hasil return value : " + hasilReturnValue);

//        guru.tampilDataDenganGaris("===========================");
//        guru.tampilDataDenganGaris("***************************");
//        guru.hitungLuasPersegiPanjang(5,3);
//        guru.hitungLuasPersegiPanjang(7,3);
//        guru.hitungLuasPersegiPanjang(8,4);
//        guru.hitungLuasPersegiPanjang(9,2);
    }
}
