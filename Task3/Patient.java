package Task3;

import java.util.Date;

public class Patient {
    private int patientId;
    private String name;
    private String gender;
    private Date dateOfBirth;
    private String contactInformation;
    private String medicalHistory;
    private String insuranceDetails;


    public Patient(int patientId, String name, String gender, Date dateOfBirth, String contactInformation, String medicalHistory, String insuranceDetails) {
        this.patientId = patientId;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.contactInformation = contactInformation;
        this.medicalHistory = medicalHistory;
        this.insuranceDetails = insuranceDetails;
    }


    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getInsuranceDetails() {
        return insuranceDetails;
    }

    public void setInsuranceDetails(String insuranceDetails) {
        this.insuranceDetails = insuranceDetails;
    }
}

