package ba.unsa.etf.rpr.tutorijal04;

public class Upis {
        private Predmet predmet;
        private Student student;
        private PlanStudija planStudija;
        Upis(Predmet predmet, Student student, PlanStudija planStudija) {
                this.predmet = predmet;
                this.student = student;
                this.planStudija = planStudija;
        }
        public Student getStudent() {
                return student;
        }
        public Predmet getPredmet() {
                return predmet;
        }
        public PlanStudija getPlanStudija() {
                return planStudija;
        }
}
