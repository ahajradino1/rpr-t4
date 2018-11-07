package ba.unsa.etf.rpr.tutorijal04;

import java.util.ArrayList;

public class PlanStudija {
    private ArrayList<Predmet> izborniPredmeti;
    private ArrayList<Predmet> obavezniPredmeti;
    private String nazivStudija;
    PlanStudija(ArrayList<Predmet> izborniPredmeti, ArrayList<Predmet> obavezniPredmeti, String nazivStudija) {
        this.izborniPredmeti = izborniPredmeti;
        this.obavezniPredmeti = obavezniPredmeti;
        this.nazivStudija = nazivStudija;
    }
    public ArrayList<Predmet> getIzborniPredmeti() {
        return izborniPredmeti;
    }
    public ArrayList<Predmet> getObavezniPredmeti() {
        return obavezniPredmeti;
    }
    public String getNazivStudija() {
        return nazivStudija;
    }
    public void dodajObavezniPredmet(Predmet p) throws IllegalArgumentException {
        if(!p.isObavezni()) throw new IllegalArgumentException("Predmet nije obavezni!");
        obavezniPredmeti.add(p);
    }
    public void dodajIzborniPredmet(Predmet p) throws IllegalArgumentException {
        if(p.isObavezni()) throw new IllegalArgumentException("Predmet nije izborni!");
        izborniPredmeti.add(p);
    }
    public void izbrisiObavezniPredmet(Predmet p) throws IllegalArgumentException {
        if(!p.isObavezni()) throw new IllegalArgumentException("Predmet nije obavezan!");
        if(obavezniPredmeti.isEmpty()) {
            System.out.println("Nema predmeta za brisanje!");
            return;
        }
        obavezniPredmeti.remove(p);
    }
    public void izbrisiIzborniPredmet(Predmet p) throws IllegalArgumentException {
        if(p.isObavezni()) throw new IllegalArgumentException("Predmet nije izborni!");
        if(izborniPredmeti.isEmpty()) {
            System.out.println("Nema predmeta za brisanje!");
            return;
        }
        izborniPredmeti.remove(p);
    }
}
