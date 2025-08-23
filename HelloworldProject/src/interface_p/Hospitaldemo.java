package interface_p;

interface Doctor {
    void operation();
    void ODP();
}

interface Nurse {
    void dailyCheck();
    void documentation();
}

interface Accountant {
    void payment();
    void query();
}

class Patient implements Doctor, Nurse, Accountant {

    public void operation() {
        System.out.println("Doctor is performing operation.");
    }

    public void ODP() {
        System.out.println("Doctor is doing OPD duty.");
    }

    public void dailyCheck() {
        System.out.println("Nurse is doing daily check-up.");
    }

    public void documentation() {
        System.out.println("Nurse is updating documents.");
    }

    public void payment() {
        System.out.println("Accountant is processing payment.");
    }

    public void query() {
        System.out.println("Accountant is handling billing queries.");
    }
}

public class Hospitaldemo {

    public static void main(String[] args) {
        Patient p = new Patient();

        p.operation();
        p.ODP();
        p.dailyCheck();
        p.documentation();
        p.payment();
        p.query();
    }
}
