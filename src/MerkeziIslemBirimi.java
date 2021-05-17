import java.util.Scanner;

public class MerkeziIslemBirimi implements IMerkeziIslemBirimi{
    public static int surum;
    public String kullaniciAdi;
    public String sifre;
    @Override
    public void kullaniciDogrula() {
        IVeriTabani veriTabani=new PostgreSQL();
        Kullanici kullanici;
        Scanner oku=new Scanner(System.in);
        do{
            System.out.print("Kullanici Adi : ");
            kullaniciAdi=oku.next();
            System.out.print("Sifre : ");
            sifre=oku.next();
            kullanici=new Kullanici.Builder().kullaniciAdi(kullaniciAdi).sifre(sifre).build();
            surum=veriTabani.SurumKontrol(kullanici);

        }while( !veriTabani.KullaniciDogrula(kullanici));
    }

    @Override
    public void SicaklikIsle() {

    }
    public void surumKontrol(Kullanici kullanici){

    }


}
