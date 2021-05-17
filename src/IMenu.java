import java.sql.SQLException;

public interface IMenu {
  //  void dogrulaMenu() throws SQLException;
    void girisMenu();
    void anaMenu() throws InterruptedException;
    void menuTemizle();
    int secimYap();
   void DevingenAnaMenu() throws InterruptedException;

}
