package nix.solid.service.impl;

import nix.solid.config.ObjectFactory;
import nix.solid.data.Patient;
import nix.solid.data.Therapist;
import nix.solid.service.CleanerService;
import nix.solid.service.DoctorResponsibilityService;
import nix.solid.service.DoctorService;

public class DoctorServiceImpl implements DoctorService<Therapist> {

    private CleanerService medDeviceCleanerService = ObjectFactory.getInstance().createObject(CleanerService.class);
    private DoctorResponsibilityService doctorResponsibilityService = ObjectFactory.getInstance().createObject(DoctorResponsibilityService.class);

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
