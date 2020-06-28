package service.impl;

import data.Patient;
import data.Therapist;
import service.CleanerService;
import service.DoctorResponsibilityService;
import service.DoctorService;

public class DoctorServiceImpl implements DoctorService<Therapist> {

    private CleanerService medDeviceCleanerService = new MedDeviceCleanerService();
    private DoctorResponsibilityService doctorResponsibilityService = new DoctorResponsibilityServiceImpl();

    @Override
    public void startTreatment(Patient patient) {
        doctorResponsibilityService.startResponsibility(patient);
        medDeviceCleanerService.isSterile();
        treat(patient);
        doctorResponsibilityService.finishResponsibility(patient);
    }

    public void treat(Patient patient) {
        System.out.println("Провести осмотр");
        System.out.println("Назначить лечение");
    }
}
