package pekan1_2511533009;

public class MobilDriver_2511533009 {
	
    private static int length = 0;
    private static Mobil_2511533009[] garasi = new Mobil_2511533009[0];
    public static void tambahMobil(Mobil_2511533009 mobil){
        length++;
        Mobil_2511533009[] tempGarasi = new Mobil_2511533009[length];
        tempGarasi[length-1] = mobil;
        for (int i = 0;i<length - 1;i++){
            tempGarasi[i] = garasi[i];
        }
        garasi = tempGarasi;
    }

    public static void hapusMobil(int index){
        Mobil_2511533009[] temp = new Mobil_2511533009[length-1];
        for (int i = index;i<length - 1;i++){
            garasi[index] = garasi[index+1];
        }
        length--;
        for (int i = 0;i<length;i++){
            temp[i]=garasi[i];
        }
        garasi=temp;
    }

	public static void main(String[] args) {
		Mobil_2511533009 mobil1 = new Mobil_2511533009("TDR 3000",1999,1500,10000000,"Yamaha");
        Mobil_2511533009 mobil2 = new Mobil_2511533009("GTR 67",1998,1200,2000000,"Roll Royce");

        mobil2.setCc(2000);
        mobil2.setNama("GTR 69");
        
        tambahMobil(mobil1);
        tambahMobil(mobil2);
        hapusMobil(1);
        
        System.out.println(mobil2.getNama());
	}

}
