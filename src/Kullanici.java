public class Kullanici {

    private String kullaniciAdi;
    private String sifre;
    private int surum;

        public Kullanici(Builder kullaniciBuilder){
        this.kullaniciAdi=kullaniciBuilder.kullaniciAdi;
        this.sifre=kullaniciBuilder.sifre;
        this.surum=kullaniciBuilder.surum;

        }
    public String getSifre() {
        return sifre;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public static class Builder{
            private String kullaniciAdi,sifre;
            int surum;

            public Builder(){}
        public Builder kullaniciAdi(String kullaniciAdi){
                this.kullaniciAdi=kullaniciAdi;
                return this;
        }
        public Builder sifre(String sifre){
                this.sifre=sifre;
                return this;
        }
        public Builder surum(int surum){
          this.surum=surum;
            return this;
        }
        public Kullanici build(){
                Kullanici kullanici=new Kullanici(this);
                return kullanici;
        }

    }
}

