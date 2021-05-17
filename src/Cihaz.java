import java.sql.SQLException;

public class Cihaz implements ICihaz {
    private String Model;
    private IMenu menu;
    private Eyleyici eyleyici;
    private IAlgilayici algilayici;
    private IAgArayuzu agArayuzu;
    private IMerkeziIslemBirimi merkeziIslemBirimi;
    public boolean SogutucuDurumu=false;

    public Cihaz(){
        eyleyici=new Eyleyici();
        algilayici=new Algilayici();
        agArayuzu=new AgArayuzu();
        merkeziIslemBirimi=new MerkeziIslemBirimi();
    }

    public void arayuzeAktar() throws SQLException {
   // agArayuzu.kullaniciDogrula();
    }
    @Override
    public void sicaklikGoruntule(){
       System.out.println(algilayici.SicaklikGoruntule());
       //System.out.println(Algilayici.Sicaklik);
    }
    @Override
    public void sogutucuAc() throws InterruptedException {
    Eyleyici.SogutucuAc();

    }
    @Override
    public void sogutucuKapat() throws InterruptedException {
    Eyleyici.SogutucuKapat();
    }
}
