package com.teachmeskills.lesson8.doctor;

import com.teachmeskills.lesson8.patient.Patient;
/**
 * This class defines the method "treat" from the abstract class "ITreatment" and
 * appoints a doctor according to the treatment plan code
 */
public class Therapist implements ITreatment {
    @Override
    public void treat() {
        System.out.println("The therapist treats");
    }
    ITreatment doctor;
    public void appointDoctor(Patient patient) {
        if (patient.getTreatmentPlanCode() == Surgeon.code) {
           doctor = new Surgeon();
        } else if(patient.getTreatmentPlanCode() == Dentist.code) {
            doctor = new Dentist();
        } else {
            doctor = new Therapist();
        }
        doctor.treat();
    }
}
