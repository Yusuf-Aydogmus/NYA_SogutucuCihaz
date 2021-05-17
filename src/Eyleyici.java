public class Eyleyici implements IEyleyici {
    static boolean SogutucuDurumu=false;
   // @Override
    public static void SogutucuAc() {
        if(SogutucuDurumu==false){
            if(Algilayici.Sicaklik>15){
                for(int i=0;i<5;i++){
                  Araclar.bekle();
                    Algilayici.Sicaklik--;
                    System.out.println("Sıcaklık Degeri : "+Algilayici.Sicaklik);
                }
            }
            else{
                System.out.println("Hava yeterince Soguk...");
            }
        }
        else{
            System.out.println(ConsoleColors.RED_BOLD+" Soğutucu ZATEN Açık "+ConsoleColors.RESET);
        }
        SogutucuDurumu=true;
    }

    //@Override


    public static void SogutucuKapat() throws InterruptedException {
        if(SogutucuDurumu==true){

            for(int i=0;i<5;i++){
                Thread.sleep(1000);
                Algilayici.Sicaklik++;
                System.out.println("Sıcaklık Degeri : "+Algilayici.Sicaklik);
            }
        }
        else{
            System.out.println(ConsoleColors.RED_BOLD+" Soğutucu ZATEN Kapalı "+ConsoleColors.RESET);
        }
        SogutucuDurumu=false;
    }

}
