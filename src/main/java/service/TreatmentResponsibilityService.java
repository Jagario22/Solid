package service;

import absrt.DoctorOfTreatment;
import data.Patient;

public interface TreatmentResponsibilityService<L extends DoctorOfTreatment> {
    void startResponsibility(Patient patient);
    void finishResponsibility(Patient patient);

}
