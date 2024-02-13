package com.teachmeskills.lesson8.doctor;

/**
 * This class defines the method "treat" from the abstract class "ITreatment"
 */
public class Dentist implements ITreatment {
    public static int code = 2;
    @Override
    public void treat() {
        System.out.println("The dentist treats");
    }
}
