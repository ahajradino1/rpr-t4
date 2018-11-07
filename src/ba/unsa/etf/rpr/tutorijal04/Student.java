package ba.unsa.etf.rpr.tutorijal04;

import static java.lang.String.format;

public class Student {
    private String ime, prezime;
    private int brojIndeksa;
    private PlanStudija planStudija;
    private Semestar semestar;
    Student(String ime, String prezime, int brojIndeksa, PlanStudija planStudija, Semestar semestar) {
        setIme(ime);
        setPrezime(prezime);
        setBrojIndeksa(brojIndeksa);
        setPlanStudija(planStudija);
        setSemestar(semestar);
    }
    public void setIme(String ime) {
        this.ime = ime;
    }
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }
    public void setPlanStudija(PlanStudija planStudija) {
        this.planStudija = planStudija;
    }
    public void setSemestar(Semestar semestar) {
        this.semestar = semestar;
    }
    public String getIme() {
        return ime;
    }
    public String getPrezime() {
        return prezime;
    }
    public int getbrojIndeksa() {
        return brojIndeksa;
    }
    public PlanStudija getPlanStudija() {
        return planStudija;
    }
    public Semestar getSemestar() {
        return semestar;
    }
    public void noviPlanStudija(PlanStudija p) {
        planStudija = p;
    }
    public void noviSemestar(Semestar s) {
        semestar = s;
    }
    @Override
    public String toString() {
        String s = "";
        return format(s + ime + prezime + brojIndeksa);
    }
}
