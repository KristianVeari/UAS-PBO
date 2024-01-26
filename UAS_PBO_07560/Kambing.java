package UAS_PBO_07560;

import java.util.ArrayList;

class Kambing extends Hewan {
    private int usia;
    private String nama; // nama/jenis

    public Kambing(String nama, int berat, int tinggi, int panjang, int usia) {
        super(berat, tinggi, panjang);
        this.usia = usia;
        this.nama = nama;
    }

    @Override
    public String getSuara() {
        return "Mbek Mbek!";
    }

    public int getUsia() {
        return usia;
    }

    public String getNama() {
        return nama;
    }

    public void perkembanganBulanan() {
        usia++;
        setBerat(getBerat() + 1);  //tambahan 1 kg setiap bulan
        setTinggi(getTinggi() + 1);  // tambahan 1 cm setiap bulan
        setPanjang(getPanjang() + 2);  // tambahan 2 cm setiap bulan
    }
}

class PedagangKambing {
    private ArrayList<Kambing> daftarKambing;

    public PedagangKambing() {
        daftarKambing = new ArrayList<>();
    }

    public void beliKambing(String nama, int berat, int tinggi, int panjang) {
        Kambing kambingBaru = new Kambing(nama, berat, tinggi, panjang, 0);
        daftarKambing.add(kambingBaru);
    }

    public void tampilkanInformasiKambing() {
        System.out.println("Informasi Kambing:");
        for (Kambing kambing : daftarKambing) {
            System.out.println("Nama: " + kambing.getNama());
            System.out.println("Usia: " + kambing.getUsia() + " bulan");
            System.out.println(kambing.getInfo());
            System.out.println();
        }
    }

    public void perkembanganBulanan() {
        for (Kambing kambing : daftarKambing) {
            kambing.perkembanganBulanan();
        }
    }
}
