package com.teachmeskills.lesson8.doctor;

public class Surgeon implements ITreatment {
    public static int code = 1;
    @Override
    public void heal() {
        System.out.println("The surgeon treats");
    }
}
