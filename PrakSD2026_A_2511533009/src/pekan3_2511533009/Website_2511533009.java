package pekan3_2511533009;

public class Website_2511533009 {
    String judulWebsite_3009, urlWebsite_3009;
    public Website_2511533009(String judulWebsite_3009,String urlWebsite_3009){
        this.judulWebsite_3009=judulWebsite_3009;
        this.urlWebsite_3009=urlWebsite_3009;
    }

    //Getter
    public String getJudulWebsite_3009() {
        return judulWebsite_3009;
    }
    public String getUrlWebsite_3009() {
        return urlWebsite_3009;
    }

    //Setter
    public void setJudulWebsite_3009(String judulWebsite_3009) {
        this.judulWebsite_3009 = judulWebsite_3009;
    }
    public void setUrlWebsite_3009(String urlWebsite_3009) {
        this.urlWebsite_3009 = urlWebsite_3009;
    }

    @Override
    public String toString(){
        return "Mengunjungi Website: " + judulWebsite_3009 + "\n Url: " + urlWebsite_3009;
    }
}
