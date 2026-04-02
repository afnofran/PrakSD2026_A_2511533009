package pekan1_2511533009;

public class Mobil_2511533009 {
    String nama,merk;
    int tahun,cc,harga;
    public Mobil_2511533009(String nama, int tahun, int cc, int harga, String merk){
        this.nama=nama;
        this.tahun=tahun;
        this.cc=cc;
        this.harga=harga;
        this.merk=merk;
    }

    //Getter
    public String getNama() {
        return nama;
    }

    public int getCc() {
        return cc;
    }

    public int getHarga() {
        return harga;
    }

    public int getTahun() {
        return tahun;
    }

    public String getMerk() {
        return merk;
    }

    //Setter
    public void setCc(int cc) {
        this.cc = cc;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
}