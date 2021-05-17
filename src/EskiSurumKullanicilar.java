public class EskiSurumKullanicilar implements IObserver{
    @Override
    public void notify(String message) {
        System.out.println("Yazılım Guncellemesi gelmiştir.Cihazinizi yeniden baslatın.");
    }
}
