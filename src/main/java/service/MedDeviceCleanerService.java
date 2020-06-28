package service;

import exception.DeviceCleanerException;

public class MedDeviceCleanerService {
    private boolean sterile = true;

    public void isSterile() {
        if (sterile)
        {
            System.out.println("Прибор для осмотра стерилен");
        } else
            throw new DeviceCleanerException("Прибор для осмотра не стерилен");
    }
}
