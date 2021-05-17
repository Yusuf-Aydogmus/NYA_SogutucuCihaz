public interface IObservable {

    void gozlemciEkle(IObserver observer);
    void gozlemciSil(IObserver observer);
    void gozlemcilereHaberVer();

}
