package pekan2_2511533009;


public class Musik_2511533009 {
    String judulLagu_3009,penyanyi_3009;
    int durasi_3009;
    //Konstruktor
    public Musik_2511533009(String judulLagu_3009,String penyanyi_3009,int durasi_3009) {
        this.judulLagu_3009 = judulLagu_3009;
        this.penyanyi_3009 = penyanyi_3009;
        this.durasi_3009 = durasi_3009;
    }

    //Getter
    public String getJudulLagu_3009(){
        return this.judulLagu_3009;
    }
    public String getPenyanyi_3009(){
        return this.penyanyi_3009;
    }
    public int getDurasi_3009() {
        return durasi_3009;
    }

    //Setter
    public void setDurasi_3009(int durasi_3009) {
        this.durasi_3009 = durasi_3009;
    }
    public void setJudulLagu_3009(String judulLagu_3009) {
        this.judulLagu_3009 = judulLagu_3009;
    }
    public void setPenyanyi_3009(String penyanyi_3009) {
        this.penyanyi_3009 = penyanyi_3009;
    }

    @Override
    public String  toString(){
        return "Judul Musik: " + judulLagu_3009 +
                "\nPenyanyi: " + penyanyi_3009 +
                "\nDurasi: " + durasi_3009 + " detik";
    }
}
