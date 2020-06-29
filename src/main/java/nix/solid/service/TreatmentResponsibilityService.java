package nix.solid.service;

import nix.solid.data.absrt.DoctorOfTreatment;
import nix.solid.data.Patient;

public interface TreatmentResponsibilityService<L extends DoctorOfTreatment> {
    void startResponsibility(Patient patient);
    void finishResponsibility(Patient patient);

}
