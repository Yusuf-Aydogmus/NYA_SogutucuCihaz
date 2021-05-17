public interface IAgArayuzu {
    //sıcaklık Görüntüle-->Sıcaklık Algılayıcı aktif
    //Sıcaklık görüntüle için sıcaklık algıyayıcıyı aç
    //Sıcaklık Oku-Sıcaklık Gönder
    //Sogutucuyu Calıştır-->Eyleyici Aktif
    //Sogutucuyu kapat-->Eyleyici deaktif

    public void kullaniciDogrula();
    public void SicaklikGoruntule( );
    public void SogutucuAc( ) throws InterruptedException;
    public void SogutucuKapat( ) throws InterruptedException;



}