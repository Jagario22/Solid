import data.Patient;
import service.DoctorService;

public class Main {
    public static void main(String[] args) {
        DoctorService doctorService = new DoctorService();
        Patient patient = new Patient();
        doctorService.startTreatment(patient);
    }
}
