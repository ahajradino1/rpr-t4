package ba.unsa.etf.rpr.tutorijal04;

import java.util.*;

public class Fakultet {
    private Set<Predmet> spisakPredmeta;
    private Set<Student> spisakStudenata;
    private Set<Upis> upisi;

    Fakultet(Set<Predmet> predmeti, Set<Student> studenti, Set<Upis> upisi) {
        spisakPredmeta = predmeti;
        spisakStudenata = studenti;
        this.upisi = upisi;
    }
    public Set<Predmet> getSpisakPredmeta() {
        return spisakPredmeta;
    }
    public Set<Student> getSpisakStudenata() {
        return spisakStudenata;
    }
    public Set<Upis> getUpisi() {
        return upisi;
    }
    public void upisiStudenta(Student s, Predmet predmet, PlanStudija plan) {
        upisi.add(new Upis(predmet, s, plan));
    }
    public void ispisiStudenta(Student s, Predmet predmet, PlanStudija plan) {
        upisi.removeIf(upis -> upis.getStudent().equals(s) && upis.getPredmet().equals(predmet) && upis.getPlanStudija().equals(plan));
    }
    public Set<Student> dajStudentaNaPredmetuIPlanu(Predmet predmet, PlanStudija plan) {
        Set<Student> s = new HashSet<>();
        for(Upis u: upisi) {
            if(u.getPredmet().equals(predmet) && u.getPlanStudija().equals(plan))
                s.add(u.getStudent());
        }
        return s;
    }
    public Set<Predmet> dajPredmeteNaKojimaJeStudent(Student student, PlanStudija plan) {
        Set<Predmet> s = new HashSet<>();
        for (Upis u : upisi) {
            if (u.getStudent().equals(student) && u.getPlanStudija().equals(plan))
                s.add(u.getPredmet());
        }
        return s;
    }
}
