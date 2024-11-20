import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Appointment {
    private String patientName;
    private String patientMobile;
    private LocalTime preferredTimeSlot;
    private HealthProfessional selectedDoctor;

    // Default constructor
    public Appointment() {
        this.patientName = "Not specified";
        this.patientMobile = "Not specified";
        this.preferredTimeSlot = LocalTime.of(9, 0); // Default to 09:00
        this.selectedDoctor = null;
    }

    // Constructor that initializes all instance variables
    public Appointment(String patientName, String patientMobile, LocalTime preferredTimeSlot, HealthProfessional selectedDoctor) {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.preferredTimeSlot = preferredTimeSlot;
        this.selectedDoctor = selectedDoctor;
    }

    // Method to print all instance variables
    public void printAppointmentDetails() {
        System.out.println("Appointment Details:");
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Mobile: " + patientMobile);
        System.out.println("Preferred Time Slot: " + preferredTimeSlot.format(DateTimeFormatter.ofPattern("HH:mm")));
        if (selectedDoctor != null) {
            System.out.println("Selected Doctor: " + selectedDoctor.getName());
            System.out.println("Doctor Type: " + (selectedDoctor instanceof GeneralPractitioner ? "General Practitioner" : "Specialist"));
        } else {
            System.out.println("Selected Doctor: Not assigned");
        }
    }

    // Getters and setters
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientMobile() {
        return patientMobile;
    }

    public void setPatientMobile(String patientMobile) {
        this.patientMobile = patientMobile;
    }

    public LocalTime getPreferredTimeSlot() {
        return preferredTimeSlot;
    }

    public void setPreferredTimeSlot(LocalTime preferredTimeSlot) {
        this.preferredTimeSlot = preferredTimeSlot;
    }

    public HealthProfessional getSelectedDoctor() {
        return selectedDoctor;
    }

    public void setSelectedDoctor(HealthProfessional selectedDoctor) {
        this.selectedDoctor = selectedDoctor;
    }

    // Additional method to check if the appointment is valid
    public boolean isValid() {
        return patientName != null && !patientName.isEmpty() &&
                patientMobile != null && !patientMobile.isEmpty() &&
                preferredTimeSlot != null &&
                selectedDoctor != null;
    }

    // Additional method to format the appointment as a string
    @Override
    public String toString() {
        return String.format("Appointment for %s at %s with Dr. %s",
                patientName,
                preferredTimeSlot.format(DateTimeFormatter.ofPattern("HH:mm")),
                selectedDoctor != null ? selectedDoctor.getName() : "Not assigned");
    }
}
//A