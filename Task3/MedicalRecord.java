package Task3;

import java.util.List;

public class MedicalRecord {
    private int patientId;
    private int doctorId;
    private String diagnosis;
    private List<String> medications;
    private List<String> testResults;


    public MedicalRecord(int patientId, int doctorId, String diagnosis, List<String> medications, List<String> testResults) {
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.diagnosis = diagnosis;
        this.medications = medications;
        this.testResults = testResults;
    }


    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public List<String> getMedications() {
        return medications;
    }

    public void setMedications(List<String> medications) {
        this.medications = medications;
    }

    public List<String> getTestResults() {
        return testResults;
    }

    public void setTestResults(List<String> testResults) {
        this.testResults = testResults;
    }
}

