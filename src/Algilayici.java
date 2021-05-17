import java.util.Random;

public class Algilayici implements  IAlgilayici{
    static int Sicaklik;
    public Algilayici(){
        Random rastgele=new Random();
        this.Sicaklik=rastgele.nextInt(30)+10;
    }

    public int SicaklikGoruntule() {

        return Algilayici.Sicaklik;

    }


}
