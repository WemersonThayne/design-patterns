package com.estudos.patterns.creation.singleton;

public class DBConnection {

    private static DBConnection instance;
    public String value;

    private DBConnection(String value) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static DBConnection getInstance(String value) {
        if (instance == null) {
            instance = new DBConnection(value);
        }
        return instance;
    }

}
