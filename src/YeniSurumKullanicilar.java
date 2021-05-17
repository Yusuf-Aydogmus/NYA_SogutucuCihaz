public class YeniSurumKullanicilar implements IObserver{
    @Override
    public void notify(String message) {
        System.out.println("Bir sonraki surume kadar en iyisi...");
    }
}
