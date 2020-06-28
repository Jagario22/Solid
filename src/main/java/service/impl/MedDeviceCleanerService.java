package service.impl;

import exception.DeviceCleanerException;
import service.CleanerService;

public class MedDeviceCleanerService implements CleanerService {
    private boolean sterile = true;

    @Override
    public void isSterile() {
        if (sterile)
        {
            System.out.println("Прибор для осмотра стерилен");
        } else
            throw new DeviceCleanerException("Прибор для осмотра не стерилен");
    }
}
