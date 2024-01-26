package UAS_PBO_07560;

abstract class Hewan {
    private int berat;
    private int tinggi;
    private int panjang;

    public Hewan(int berat, int tinggi, int panjang) {
        this.berat = berat;
        this.tinggi = tinggi;
        this.panjang = panjang;
    }

    public abstract String getSuara();

    public String getInfo() {
        return "Berat: " + berat + " kg, Tinggi: " + tinggi + " cm, Panjang: " + panjang + " cm";
    }

    // Getter dan setter untuk berat, tinggi, dan panjang
    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }
}

