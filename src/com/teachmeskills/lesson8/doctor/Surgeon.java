package com.teachmeskills.lesson8.doctor;
/**
 * This class defines the method "treat" from the abstract class "ITreatment"
 */
public class Surgeon implements ITreatment {
    public static int code = 1;
    @Override
    public void treat() {
        System.out.println("The surgeon treats");
    }
}
