import java.util.ArrayList;
import java.util.List;

public class NoticeObservable implements  IObservable {
   private List<IObserver> observerList=new ArrayList<>();
   private String message="Yazılım Guncellemesi gelmiştir.Cihazinizi yeniden baslatın.";


    @Override
    public void gozlemciEkle(IObserver observer) {

        observerList.add(observer);
    }

    @Override
    public void gozlemciSil(IObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void gozlemcilereHaberVer() {
        for(IObserver observer:observerList){
            observer.notify(message);
        }
    }
}
