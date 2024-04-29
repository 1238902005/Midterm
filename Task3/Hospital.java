package Task3;

import java.util.ArrayList;
import java.util.List;


public class Hospital {
    private String name;
    private List<String> patients;
    private List<String> doctors; // Represented as strings
    private List<String> appointments; // Represented as strings
    private List<String> departments;

    // Constructor
    public Hospital(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
        this.doctors = new ArrayList<>();
        this.appointments = new ArrayList<>();
        this.departments = new ArrayList<>();
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Add patient
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Remove patient
    public void removePatient(Patient patient) {
        patients.remove(patient);
    }

    // Add doctor
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Remove doctor
    public void removeDoctor(Doctor doctor) {
        doctors.remove(doctor);
    }


    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }


    public void removeAppointment(Appointment appointment) {
        appointments.remove(appointment);
    }


    public void addDepartment(Department department) {
        departments.add(department);
    }


    public void removeDepartment(Department department) {
        departments.remove(department);
    }


}

