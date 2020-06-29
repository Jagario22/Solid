package nix.solid.service.impl;

import nix.solid.annotation.Value;
import nix.solid.exception.DeviceCleanerException;
import nix.solid.service.CleanerService;

public class MedDeviceCleanerService implements CleanerService {
    @Value("Thermometer")
    private String deviceName;

    private boolean sterile = true;


    @Override
    public void isSterile() {
        if (sterile)
        {
            System.out.println("Прибор " + deviceName + " для осмотра стерилен");
        } else
            throw new DeviceCleanerException("Прибор для осмотра не стерилен");
    }
}
