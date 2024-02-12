package com.teachmeskills.lesson8.doctor;

public class Dentist implements ITreatment {
    public static int code = 2;
    @Override
    public void heal() {
        System.out.println("The dentist treats");
    }
}
