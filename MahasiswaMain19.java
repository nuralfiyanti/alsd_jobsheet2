public class MahasiswaMain19 {
    public static void main(String[] args) {
        // Instansiasi object dari kelas Mahasiswa19
        Mahasiswa19 mhs1 = new Mahasiswa19();

        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "22417020171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa19 mhsNuralfiyanti = new Mahasiswa19("Nur Alfiyanti", "244107020055", 3.80, "TI 1F");
        mhsNuralfiyanti.tampilkanInformasi();
        mhsNuralfiyanti.updateIpk(3.30);
        mhsNuralfiyanti.tampilkanInformasi();
    }
}
