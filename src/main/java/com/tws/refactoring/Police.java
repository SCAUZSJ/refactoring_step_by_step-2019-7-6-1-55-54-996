package com.tws.refactoring;

public class Police {
    public boolean checkDriverAdult(Driver driver) {
        return driver.getAge() >= 18;
    }
}
