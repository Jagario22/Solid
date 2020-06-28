package service;

import absrt.DoctorOfTreatment;
import data.Patient;

public interface DoctorService<L extends DoctorOfTreatment> {
    void startTreatment(Patient patient);

}
