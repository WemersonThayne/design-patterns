package com.estudos.patterns.creation.singleton;

public class Main {

    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        DBConnection dbConnection = DBConnection.getInstance("FOO");
        DBConnection anotherDBConnection = DBConnection.getInstance("BAR");
        System.out.println(dbConnection.value);
        System.out.println(anotherDBConnection.value);
    }
}
