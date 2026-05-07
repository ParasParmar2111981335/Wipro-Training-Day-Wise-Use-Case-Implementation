package April_BatchDay04;

class Patient {
    private int id, age;
    private String name, illness;

    Patient(int id, String name, int age, String illness) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.illness = illness;
    }

    String getName() { return name; }
    int getAge() { return age; }
    String getIllness() { return illness; }
}

interface PatientService {
    void add(Patient p);
    void show();
}

class PatientServiceImpl implements PatientService {
    Patient[] arr = new Patient[5]; // array
    int index = 0;

    public void add(Patient p) {
        arr[index] = p;   // store in array
        index++;
    }

    public void show() {
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i].getName() + " " + arr[i].getIllness());
        }
    }
}

abstract class Doctor {
    abstract void diagnose(Patient p);
}

class GeneralPhysician extends Doctor {
    void diagnose(Patient p) {
        System.out.println("General treats " + p.getName());
    }
}

class Cardiologist extends Doctor {
    void diagnose(Patient p) {
        if (p.getIllness().contains("Heart"))
            System.out.println("Cardiologist treats " + p.getName());
        else
            System.out.println("Cardiologist cannot treat " + p.getName());
    }
}

public class HealthCare_Usecase {

	public static void main(String[] args) {
		Patient p1 = new Patient(1, "Paras", 21, "Fever");
        Patient p2 = new Patient(2, "Hardeep Singh ", 45, "Heart");

        PatientService s = new PatientServiceImpl();
        s.add(p1);
        s.add(p2);

        s.show();

        Doctor d = new Cardiologist();
        d.diagnose(p1);
        d.diagnose(p2);

	}

}
