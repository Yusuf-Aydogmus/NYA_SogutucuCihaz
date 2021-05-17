public class AgArayuzu implements  IAgArayuzu{

    Cihaz cihaz;
    Eyleyici eyleyici;
    IMerkeziIslemBirimi merkeziIslemBirimi;
    void AgArayuzu(){
         eyleyici=new Eyleyici();
         cihaz=new Cihaz();
    }

    @Override
    public void kullaniciDogrula() {
         merkeziIslemBirimi=new MerkeziIslemBirimi();
        merkeziIslemBirimi.kullaniciDogrula();
    }

    @Override
    public void SicaklikGoruntule( ) {

        System.out.print("Sicaklik: ");
        cihaz.sicaklikGoruntule();
        System.out.println(" derece ");
    }

    @Override
    public void SogutucuAc( ) throws InterruptedException {
      //  Cihaz cihaz=new Cihaz();
        eyleyici.SogutucuAc();
    }

    @Override
    public void SogutucuKapat( ) throws InterruptedException {
      //  Cihaz cihaz=new Cihaz();
    eyleyici.SogutucuKapat();
    }
}
