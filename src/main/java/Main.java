import data.Patient;
import service.DoctorService;
import service.impl.DoctorServiceImpl;

public class Main {
    public static void main(String[] args) {
        DoctorService doctorService = new DoctorServiceImpl();
        Patient patient = new Patient();
        doctorService.startTreatment(patient);
    }
}
