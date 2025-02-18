public class mataKuliahMain19 {
    public static void main(String[] args) {
        mataKuliah19 matkul1 = new mataKuliah19();
        matkul1.kodeMK = "ALSD";
        matkul1.nama = "Algoritma dan Struktur Data";
        matkul1.sks = 3;
        matkul1.jumlahJam = 10;

        matkul1.tampilInformasi();
        matkul1.ubahSKS(4);
        matkul1.tambahJam(5);
        matkul1.kurangiJam(3);
        matkul1.tampilInformasi();

        mataKuliah19 matkul2 = new mataKuliah19("ALSD", "Algoritma dan Struktur Data", 2, 4);
        matkul2.tambahJam(3);
        matkul2.tampilInformasi();

        mataKuliah19 matkul3 = new mataKuliah19("ALIN", "Aljabar Linear", 2, 4);
        matkul3.kurangiJam(2);
        matkul3.tampilInformasi();
    }
}