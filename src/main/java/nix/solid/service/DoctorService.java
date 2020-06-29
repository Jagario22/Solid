package nix.solid.service;


import nix.solid.data.absrt.DoctorOfTreatment;
import nix.solid.data.Patient;

public interface DoctorService<L extends DoctorOfTreatment> {
    void startTreatment(Patient patient);

}
