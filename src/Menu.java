import javax.swing.*;
import java.sql.SQLException;
import java.util.Scanner;

public class Menu implements IMenu{
    public String kullaniciAdi;
    public String sifre;
    public int secim;
    IAlgilayici algilayici1;
    IAgArayuzu agArayuzu;

   public Menu(){
       algilayici1=new Algilayici();
       agArayuzu=new AgArayuzu();

   }

    @Override
    public void girisMenu() {

        agArayuzu.kullaniciDogrula();
    }

    @Override
    public void anaMenu() throws InterruptedException {
        menuTemizle();
        System.out.println("***********************************");
        System.out.println("***"+ConsoleColors.BLUE_BOLD +"         ANA MENU  "+ConsoleColors.RESET+"          ***");
        System.out.println("***"+"      1-)Sicaklik Goruntule  "+"***");
        System.out.println("***"+"      2-)Sogutucu Calistir   "+"***");
        System.out.println("***"+"      3-)Sogutucu Kapat      "+"***");
        System.out.println("***"+"      4-)Surum Kontrol      "+"***");
        System.out.println("***"+"      5-)Cikis               "+"***");
        System.out.println("***********************************");
        secim=secimYap();

        if(secim==1){
            SicakliGoruntule();
        }
        else if(secim==2){
            SogutucuCalistir();
        }
        else if(secim==3){
            SogutucuKapat();
        }
        else if(secim==4){
            SurumKontrol();
        }
        else{
           Cikis();
        }


    }

    @Override
    public void menuTemizle() {

        System.out.print("\u000C");
    }
    @Override
    public int secimYap(){
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.print("SECİM: ");
            secim=scanner.nextInt();
            if(secim<1||secim>5){
                System.out.println("Yanlış Seçim!!' Lütfen Tekrar Deneyiniz");
            }
            else{
                Araclar.bekle(60);
                System.out.println("~ İşlem Gerçekleştiriliyor ~");
            }
        }while(secim<1||secim>5);
        return secim;
    }
    public void SicakliGoruntule(){
        System.out.print("Sicaklik: ");
        System.out.print(algilayici1.SicaklikGoruntule());
        System.out.println(" derece ");
    }
    public void SogutucuCalistir() throws InterruptedException {

        agArayuzu.SogutucuAc();
    }
    public void SogutucuKapat() throws InterruptedException {

        agArayuzu.SogutucuKapat();
    }
    public void SurumKontrol(){
        System.out.println();
        System.out.println("Surumunuz:"+MerkeziIslemBirimi.surum);
        if(MerkeziIslemBirimi.surum==1){
            NoticeObservable n1=new NoticeObservable();
            EskiSurumKullanicilar surum1=new EskiSurumKullanicilar();
            n1.gozlemciEkle(surum1);
            n1.gozlemcilereHaberVer();
        }
        else{
            NoticeObservable n2=new NoticeObservable();
            YeniSurumKullanicilar surum2=new YeniSurumKullanicilar();
            n2.gozlemciEkle(surum2);
            n2.gozlemcilereHaberVer();

        }
       /* NoticeObservable n1=new NoticeObservable();
        NoticeObservable n2=new NoticeObservable();
        EskiSurumKullanicilar surum1=new EskiSurumKullanicilar();
        YeniSurumKullanicilar surum2=new YeniSurumKullanicilar();

      n1.gozlemciEkle(surum1);
      n2.gozlemciEkle(surum2);
      n1.gozlemcilereHaberVer();
      n2.gozlemcilereHaberVer();*/


    }
    public void DevingenAnaMenu() throws InterruptedException {
        girisMenu();

        char userChoice;
        do{
            Araclar.bekle(1000);
        anaMenu();
        Scanner girdi = new Scanner(System.in);
        System.out.println("\nDevam Etmek İstiyormusunuz? e(E)/h(H)");
         userChoice = girdi.next().charAt(0);
        if (userChoice == 'e' || userChoice == 'E') {
            Araclar.bekle(1000);

        } else
        if (userChoice == 'h' || userChoice == 'H') {
           Cikis();
        }
        else {
            System.out.println("Yanlıs deger girdiniz tekrar deneyin!");
        }
        }while(userChoice=='E'||userChoice=='e');
    }
    public void Cikis(){
        Araclar.bekle(1000);
        System.out.println("Çıkış yapılıyor!");
        Araclar.bekle(1000);
        Runtime.getRuntime().exit(0);
    }




    }




