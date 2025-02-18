public class dosenMain19{
    public static void main(String[] args) {
        dosen19 dosen1 = new dosen19();

        dosen1.idDosen="JJ019";
        dosen1.nama="Nur Alfiyanti";
        dosen1.statusAktif=true;
        dosen1.tahunBergabung=2010;
        dosen1.bidangKeahlian="Desain Grafis";

        dosen1.tampilInformasi();
        dosen1.setStatusAktif(false);
        dosen1.hitungMasaKerja(2024);
        dosen1.ubahKeahlian("Jaringan Dasar");
        dosen1.tampilInformasi();

        dosen19 dosen2 = new dosen19("RDJ09", "vina", true, 2011, "Algoritma Struktur Data");
        dosen2.hitungMasaKerja(2018);
        dosen2.tampilInformasi();

        dosen19 dosen3 = new dosen19("RDJ09", "iman", false, 2017, "Dasar Pemograman");
        dosen3.hitungMasaKerja(2023);
        dosen3.tampilInformasi();
    }
}