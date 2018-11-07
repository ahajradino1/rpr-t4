package ba.unsa.etf.rpr.tutorijal04;

import java.util.ArrayList;

public class Semestar {
    private ArrayList<Predmet> predmeti;
    private int redniBrojSemestra, ectsBodovi;
    private PlanStudija planStudija;
    Semestar(int redniBrojSemestra, int ectsBodovi, PlanStudija planStudija) {
        this.redniBrojSemestra = redniBrojSemestra;
        this.planStudija = planStudija;
        this.ectsBodovi = ectsBodovi;
    }
    public PlanStudija getPlanStudija() {
        return planStudija;
    }
    public int getRedniBrojSemestra() {
        return redniBrojSemestra;
    }
    public int getEctsBodovi() {
        return ectsBodovi;
    }
    public void dodajPredmet(Predmet p) throws IllegalArgumentException {
        if(ectsBodovi + p.getEctsBodovi() > 30) throw new IllegalArgumentException("Prekoracen je maksimum od 30 ECTS bodova!");
        predmeti.add(p);
        ectsBodovi += p.getEctsBodovi();
    }
    public void izbrisiPredmet(Predmet p) throws IllegalArgumentException {
        if(predmeti.isEmpty()) throw new IllegalArgumentException("Nema predmeta za brisanje!");
        predmeti.remove(p);
    }
}
