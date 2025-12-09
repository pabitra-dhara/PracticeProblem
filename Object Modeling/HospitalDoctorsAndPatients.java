/*Problem 3: Hospital, Doctors, and Patients (Association and Communication)
Description: Model a Hospital where Doctor and Patient objects interact through consultations. A doctor can see multiple patients, and each patient can consult multiple doctors.
Tasks:
Define a Hospital class containing Doctor and Patient classes.
Create a method consult() in the Doctor class to show communication, which would display the consultation between a doctor and a patient.
Model an association between doctors and patients to show that doctors and patients can have multiple relationships.
Goal: Practice creating an association with communication between objects by modeling doctor-patient consultations. */

import java.util.*;

class Patient {
    String name;
    Patient(String name) {
        this.name = name;
    }
    void showInfo() {
        System.out.println("Patient: " + name);
    }
}

class Doctor {
    String name;
    ArrayList<Patient> patients = new ArrayList<>();

    Doctor(String name) {
        this.name = name;
    }
    void consult(Patient p) {
        System.out.println("Doctor " + name + " is consulting patient " + p.name);
        patients.add(p);
    }

    void showPatients() {
        System.out.println("\nDoctor " + name + " consulted:");
        for (Patient p : patients) {
            System.out.println("- " + p.name);
        }
    }
}

class Hospital {
    String name;
    Hospital(String name) {
        this.name = name;
    }
    void show() {
        System.out.println("Hospital: " + name);
    }
}

public class HospitalDoctorsAndPatients {
    public static void main(String[] args) {

        Hospital h = new Hospital("Neelam Hospital");
        Doctor d1 = new Doctor("Dr. Pabitra");
        Doctor d2 = new Doctor("Dr. Rohit");
        Patient p1 = new Patient("Arjun");
        Patient p2 = new Patient("Sita");
        h.show();
        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);
        d1.showPatients();
        d2.showPatients();
    }
}

