package Task3;

import java.time.LocalDateTime;

public class Appointment {
    private int appointmentId;
    private int patientId;
    private int doctorId;
    private LocalDateTime dateTime;
    private String reason;
    private boolean status;

    // Constructor
    public Appointment(int appointmentId, int patientId, int doctorId, LocalDateTime dateTime, String reason) {
        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.dateTime = dateTime;
        this.reason = reason;
        this.status = false;
    }


    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
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

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public boolean isConfirmed() {
        return status;
    }

    public void confirmAppointment() {
        this.status = true;
    }

    public void cancelAppointment() {
        this.status = false;
    }
}

