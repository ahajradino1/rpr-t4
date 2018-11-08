package ba.unsa.etf.rpr.tutorijal04;

import java.util.Set;

public class Student {
    private String ime, prezime;
    private int brojIndeksa, ukupnoEcts;
    private Set<Predmet> predmeti;
    Student(String ime, String prezime, int brojIndeksa) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
    }
    public int getBrojIndeksa() {
        return brojIndeksa;
    }
    public String getIme() {
        return ime;
    }
    public String getPrezime() {
        return prezime;
    }
    public Set<Predmet> getPredmeti() {
        return predmeti;
    }
    public void upisiStudentaNaPredmet(Predmet p) throws IllegalArgumentException {
        if(ukupnoEcts + p.getEctsBodovi() > 30) throw new IllegalArgumentException("Prekoracen maksimum od 30 ECTS bodova!");
        predmeti.add(p);
    }
    public void ispisiStudentaSaPredmeta(Predmet p) {
        predmeti.remove(p);
        p.ispisiStudenta(this);
    }
}
