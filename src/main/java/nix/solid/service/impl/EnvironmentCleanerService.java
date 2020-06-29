package nix.solid.service.impl;

import nix.solid.exception.DeviceCleanerException;
import nix.solid.service.CleanerService;

public class EnvironmentCleanerService implements CleanerService {
    private boolean sterile = true;

    @Override
    public void isSterile() {
        if (sterile)
        {
            System.out.println("Помещение стерильно");
        } else
            throw new DeviceCleanerException("Помещение стерилено");
    }
}
