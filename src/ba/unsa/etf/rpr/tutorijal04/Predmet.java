package ba.unsa.etf.rpr.tutorijal04;

import java.util.Set;

public class Predmet {
    private int ectsBodovi, sifraPredmeta;
    private boolean obavezni;
    private Set<Student> spisakUpisanih;
    Predmet(int ectsBodovi, int sifraPredmeta, boolean obavezni) {
        this.ectsBodovi = ectsBodovi;
        this.sifraPredmeta = sifraPredmeta;
        this.obavezni = obavezni;
    }
    public int getEctsBodovi() {
        return ectsBodovi;
    }
    public int getSifraPredmeta() {
        return sifraPredmeta;
    }
    public boolean isObavezni() {
        return obavezni;
    }
    public Set<Student> getSpisakUpisanih() {
        return spisakUpisanih;
    }
    public void dodajStudenta(Student s) {
        s.upisiStudentaNaPredmet(this);
        spisakUpisanih.add(s);
    }
    public void ispisiStudenta(Student s) {
        spisakUpisanih.remove(s);
        s.ispisiStudentaSaPredmeta(this);
    }
}
