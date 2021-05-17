import java.sql.Connection;

public interface IVeriTabani {
    public Connection Baglan();
    public boolean KullaniciDogrula(Kullanici kullanici);
  //  public boolean KullaniciDogrula(Kullanici kullanici);
    public int SurumKontrol(Kullanici kullanici);
}
