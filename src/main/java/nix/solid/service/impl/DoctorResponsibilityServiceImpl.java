package nix.solid.service.impl;

import nix.solid.config.ObjectFactory;
import nix.solid.data.Patient;
import nix.solid.service.DoctorResponsibilityService;

public class DoctorResponsibilityServiceImpl implements DoctorResponsibilityService {



    @Override
    public void startResponsibility(Patient patient) {
        System.out.println("Получить историю болезней пациента");
        System.out.println("Сделать записи по приему пациента");
        System.out.println("Получить результаты анализов");
    }

    @Override
    public void finishResponsibility(Patient patient) {
        System.out.println("Отвечать на вопросы");
        System.out.println("Назначить новую встречу");
    }
}
