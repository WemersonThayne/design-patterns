package com.estudos.patterns.structures.bridge;

import com.estudos.patterns.structures.bridge.devices.Device;
import com.estudos.patterns.structures.bridge.devices.Radio;
import com.estudos.patterns.structures.bridge.devices.Tv;
import com.estudos.patterns.structures.bridge.remotes.AdvancedRemote;
import com.estudos.patterns.structures.bridge.remotes.BasicRemote;

public class Main {

    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
        
    }

}
