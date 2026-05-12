package pekan6_2511533009;

public class Lagu_2511533009 {
    String judul_3009, penyanyi_3009;
    Lagu_2511533009 next_3009,prev_3009;
    public Lagu_2511533009(String judul_3009,String penyanyi_3009){
        this.judul_3009=judul_3009;
        this.penyanyi_3009=penyanyi_3009;
        this.next_3009 = null;
        this.prev_3009 = null;
    }

    public Lagu_2511533009 getNext_3009(){
        return next_3009;
    }
    public Lagu_2511533009 getPrev_3009(){
        return prev_3009;
    }
    public String getJudul_3009(){
        return judul_3009;
    }
    public String getPenyanyi_3009() {
        return penyanyi_3009;
    }

    public void setPenyanyi_3009(String penyanyi_3009) {
        this.penyanyi_3009 = penyanyi_3009;
    }
    public void setJudul_3009(String judul_3009) {
        this.judul_3009 = judul_3009;
    }
    public void setNext_3009(Lagu_2511533009 next_3009) {
        this.next_3009 = next_3009;
    }
    public void setPrev_3009(Lagu_2511533009 prev_3009) {
        this.prev_3009 = prev_3009;
    }
}
