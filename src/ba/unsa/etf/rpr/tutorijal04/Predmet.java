package ba.unsa.etf.rpr.tutorijal04;

public class Predmet {
    private int ectsBodovi, sifra_predmeta;
    private final int maxBrojStudenata;
    private Student[] spisakUpisanih;
    private boolean obavezni; //predmet je izborni ako je obavezni = false
    Predmet(int ectsBodovi, int maxBrojStudenata, int sifra_predmeta, boolean obavezni) {
        this.ectsBodovi = ectsBodovi;
        this.maxBrojStudenata = maxBrojStudenata;
        this.sifra_predmeta = sifra_predmeta;
        this.obavezni = obavezni;
        spisakUpisanih = new Student[maxBrojStudenata];
    }
    public int getEctsBodovi() {
        return ectsBodovi;
    }
    public int getSifra_predmeta() {
        return sifra_predmeta;
    }
    public int getMaxBrojStudenata() {
        return maxBrojStudenata;
    }
    public boolean isObavezni() {
        return obavezni;
    }
    public void setEctsBodovi(int ectsBodovi) {
        this.ectsBodovi = ectsBodovi;
    }
    public void setSifra_predmeta(int sifra_predmeta) {
        this.sifra_predmeta = sifra_predmeta;
    }
    public void setObavezni(boolean obavezni) {
        this.obavezni = obavezni;
    }
    void upisiStudenta(Student s) throws IllegalArgumentException {
        boolean dostignutMax = false;
        for(int i = 0; i < getMaxBrojStudenata(); i++) {
            if(dostignutMax) throw new IllegalArgumentException ("Upisan je maksimalan broj studenata!");
            if(spisakUpisanih[i] == s) throw new IllegalArgumentException("Student je vec upisan!");
            if (spisakUpisanih[i] == null) {
                spisakUpisanih[i] = s;
                break;
            }
            if(i == maxBrojStudenata - 1)  dostignutMax = true;
        }
    }
    void ispisiStudenta(Student s) throws IllegalArgumentException {
        boolean ispisan = false;
        for(int i = 0; i < getMaxBrojStudenata(); i++)
            if(spisakUpisanih[i] != null && s.equals(spisakUpisanih[i]))  {
                for(int j = i; j < getMaxBrojStudenata() - 1; j++) {
                    ispisan = true;
                    if (spisakUpisanih[j] != null)
                        spisakUpisanih[j] = spisakUpisanih[j + 1];
                }
            }
        if(!ispisan) throw new IllegalArgumentException("Student ne postoji!");
    }
    public Student dajStudent(int i) throws IllegalArgumentException {
        if(i < 0 || i >= maxBrojStudenata) throw new IllegalArgumentException("Indeks van opsega!");
        return spisakUpisanih[i];
    }
    public void ispisi() {
        for(int i = 0; i < getMaxBrojStudenata(); i++) if(spisakUpisanih[i] != null)  System.out.println(spisakUpisanih[i]);
    }

}
