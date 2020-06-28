package service;

import exception.DeviceCleanerException;

public class EnvironmentCleanerService {
    private boolean sterile = true;

    public void isSterile() {
        if (sterile)
        {
            System.out.println("Помещение стерильно");
        } else
            throw new DeviceCleanerException("Помещение стерилено");
    }
}
