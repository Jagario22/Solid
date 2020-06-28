package service;

import data.Patient;

public class DoctorService {

    private MedDeviceCleanerService medDeviceCleanerService = new MedDeviceCleanerService();
    private DoctorResponsibilityService doctorResponsibilityService = new DoctorResponsibilityService();

    public void startTreatment(Patient patient) {
        doctorResponsibilityService.startResponsibility();
        medDeviceCleanerService.isSterile();
        treat(patient);
        doctorResponsibilityService.finishResponsibility();
    }

    public void treat(Patient patient) {
        System.out.println("Провести осмотр");
        System.out.println("Назначить лечение");
    }
}
