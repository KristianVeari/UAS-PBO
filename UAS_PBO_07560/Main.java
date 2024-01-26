package UAS_PBO_07560;

public class Main {
    public static void main(String[] args) {
        PedagangKambing pedagangKambing = new PedagangKambing();
        pedagangKambing.beliKambing("Kambing Gibas", 45, 85, 100);
        pedagangKambing.beliKambing("Kambing Etawa", 20, 60, 90);

        // Tampilkan informasi awal
        System.out.println("Informasi Awal:");
        pedagangKambing.tampilkanInformasiKambing();
        System.out.println("-----------------------------------------------");

        // Perkembangan bulanan
        for (int i = 1; i <= 12; i++) {
            System.out.println("\nPerkembangan Bulan ke-" + i + ":");
            pedagangKambing.perkembanganBulanan();
            pedagangKambing.tampilkanInformasiKambing();
            System.out.println("-----------------------------------------------");
        }
    }
}
