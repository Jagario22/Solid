package nix.solid;

import nix.solid.data.Patient;
import nix.solid.service.DoctorService;
import nix.solid.service.impl.DoctorServiceImpl;

public class Main {
    public static void main(String[] args) {
        DoctorService doctorService = new DoctorServiceImpl();
        Patient patient = new Patient();
        doctorService.startTreatment(patient);
    }
}
