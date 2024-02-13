package com.teachmeskills.lesson8.run;

import com.teachmeskills.lesson8.patient.Patient;
import com.teachmeskills.lesson8.doctor.Therapist;

/**
 * This class is used to check the written code
 */
public class Runner {
    public static void main(String[] args) {
        Patient patient = new Patient();
        patient.setTreatmentPlanCode(3);
        Therapist therapist = new Therapist();
        therapist.appointDoctor(patient);
    }
}
