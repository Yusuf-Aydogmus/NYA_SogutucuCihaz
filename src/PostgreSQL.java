import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PostgreSQL implements IVeriTabani {
    static boolean erisim;

    private String PD_url = "jdbc:postgresql://localhost:5432/Kullanici";
    private String PD_Password = "yusuf4415367";
    private String PD_username = "postgres";


    @Override
    public Connection Baglan() {
        Connection baglanti=null;
        try {
            baglanti=DriverManager.getConnection(PD_url,PD_username,PD_Password);

            if(baglanti!=null){

             //   System.out.println("VeriTabanina Baglanildi");
            }
            else{

               // System.out.println("Veritabanina Baglanılamadi");
            }

        }
        catch (Exception e){

            e.printStackTrace();
        }
        return baglanti;
    }

    @Override
    public boolean KullaniciDogrula(Kullanici kullanici) {

        boolean sonuc = false;
      String tabloAdi=" \"KullaniciGiris\" ";
      String username=" \"kullaniciAdi\" ";
      String password=" \"sifre\" ";
        try {
            Connection baglanti= this.Baglan();
            String sql="SELECT * FROM"+tabloAdi+"WHERE"+username+"="+"'"+kullanici.getKullaniciAdi()+"'"+"AND"+password+"="+"'"+kullanici.getSifre()+"'";

            Statement stmt=baglanti.createStatement();
            ResultSet rs=stmt.executeQuery(sql);

            baglanti.close();
            if(!rs.next()){
                System.out.println("");
                System.out.println("**************************************************************");
                System.out.println( ConsoleColors.RED_BACKGROUND+" Kullanici Bilgileri Dogrulanamadı.Lutfen Tekrar Deneyiniz"+ConsoleColors.RESET);
                System.out.println("**************************************************************");
                System.out.println("");
                sonuc=false;

            }
            else{
                sonuc=true;
                System.out.println("");
                System.out.println("***********************************");
                System.out.println("      "+ConsoleColors.YELLOW_BACKGROUND+"Hosgeldiniz,Sayın: "+kullanici.getKullaniciAdi()+ConsoleColors.RESET);
                System.out.println("***********************************");
                System.out.println("");

            }

             rs.close();;
             stmt.close();
             return sonuc;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public int SurumKontrol(Kullanici kullanici) {
        int Vsurum = -1;
        String tabloAdi=" \"KullaniciGiris\" ";
        String username=" \"kullaniciAdi\" ";
        String surum=" \"surum\" ";



        try {
            Connection baglanti = this.Baglan();
            String sql = "SELECT" + surum + "From" + tabloAdi + "Where" + username + "=" + "'" + kullanici.getKullaniciAdi() + "'";

            Statement stmt = baglanti.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            baglanti.close();

            while (rs.next()) {
                Vsurum = rs.getInt("surum");
            }
            rs.close();
            stmt.close();
            return Vsurum;
        }catch (Exception e){
            e.printStackTrace();

        }


        return Vsurum;
    }


}









