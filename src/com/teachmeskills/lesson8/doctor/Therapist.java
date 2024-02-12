package com.teachmeskills.lesson8.doctor;

import com.teachmeskills.lesson8.patient.Patient;

public class Therapist implements ITreatment {
    @Override
    public void heal() {
        System.out.println("The therapist treats");
    }
    public void appointDoctor(Patient patient) {
        //не знаю, как докрутить так, чтобы при выполнении условия вызывался метод
        if (patient.getTreatmentPlanCode() == Surgeon.code) {
           ;
        }
        if (patient.getTreatmentPlanCode() == Dentist.code) {
            ;
        }
        else {
            ;
        }
    }
}
