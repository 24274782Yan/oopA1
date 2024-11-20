import java.util.ArrayList;
import java.util.List;
import java.time.LocalTime;

public class AssignmentOne {
    // Initialize a static ArrayList to store Appointment objects
    private static ArrayList<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        // Print a header to indicate the start of Part 3
        System.out.println("// Part 3 – Using classes and objects");

        // Create a list to store health professionals
        List<HealthProfessional> healthProfessionals = new ArrayList<>();

        // Add three General Practitioners to the list
        // Each practitioner has a unique ID, name, experience, workplace, availability, consultation time, language skills, and patient limit
        healthProfessionals.add(new GeneralPractitioner(1001, "张医生", 15, "中心医院", true, 30, true, List.of("中文", "英语"), 8));
        healthProfessionals.add(new GeneralPractitioner(1002, "王医生", 10, "市立医院", false, 25, true, List.of("中文", "广东话"), 5));
        healthProfessionals.add(new GeneralPractitioner(1003, "李医生", 20, "社区卫生中心", true, 35, false, List.of("中文", "英语", "日语"), 12));

        // Add two Specialists to the list
        // Each specialist has specific expertise, a unique ID, specialty, experience, workplace, availability, specializations, consultation fee, and patient limit
        healthProfessionals.add(new Specialist(2001, "刘专家", "心脏科", 18, "心脏研究所", true, List.of("介入心脏病学", "心电生理学"), 45, 300.0, 25));
        healthProfessionals.add(new Specialist(2002, "陈专家", "神经科", 15, "脑科中心", false, List.of("脑卒中", "癫痫"), 60, 350.0, 15));

        // Print the details of each health professional
        for (HealthProfessional professional : healthProfessionals) {
            professional.printDetails();
            System.out.println("------------------------------");
        }

        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        // Print a header to indicate the start of Part 5
        System.out.println("// Part 5 – Collection of appointments");

        // Create appointments using Chinese names and phone numbers
        // Each appointment is associated with a specific health professional
        createAppointment("张伟", "13812345678", LocalTime.of(9, 0), healthProfessionals.get(0));
        createAppointment("王伟", "13987654321", LocalTime.of(10, 30), healthProfessionals.get(1));
        createAppointment("王芳", "13700001111", LocalTime.of(14, 0), healthProfessionals.get(2));
        createAppointment("李伟", "13622223333", LocalTime.of(15, 30), healthProfessionals.get(3));
        createAppointment("王秀英", "13944445555", LocalTime.of(11, 0), healthProfessionals.get(4));

        // Print all existing appointments
        System.out.println("\nExisting appointments:");
        printExistingAppointments();

        // Cancel an appointment using the patient's mobile phone number
        System.out.println("\nCancel Wang Wei's appointment (13987654321)");
        cancelBooking("13987654321");

        // Print the updated list of appointments to confirm the cancellation
        System.out.println("\nUpdated appointment list:");
        printExistingAppointments();

        System.out.println("------------------------------");
    }

    // Method to create a new appointment and add it to the list
    private static void createAppointment(String patientName, String patientMobile, LocalTime preferredTimeSlot, HealthProfessional selectedDoctor) {
        // Check that all necessary information is provided before creating an appointment
        if (patientName != null && !patientName.isEmpty() &&
                patientMobile != null && !patientMobile.isEmpty() &&
                preferredTimeSlot != null &&
                selectedDoctor != null) {
            // Create a new Appointment object and add it to the appointments list
            Appointment appointment = new Appointment(patientName, patientMobile, preferredTimeSlot, selectedDoctor);
            appointments.add(appointment);
            System.out.println("Success for " + patientName + " Create Appointment");
        } else {
            // Inform the user if any required information is missing
            System.out.println("Unable to create appointment. Please provide all necessary information.");
        }
    }

    // Method to display all existing appointments
    private static void printExistingAppointments() {
        // Check if there are any appointments to display
        if (appointments.isEmpty()) {
            System.out.println("There are no existing appointments");
        } else {
            // Print the details of each appointment
            for (Appointment appointment : appointments) {
                appointment.printAppointmentDetails();
                System.out.println("------------------------------");
            }
        }
    }

    // Method to cancel an appointment using the patient's mobile phone number
    private static void cancelBooking(String mobilePhone) {
        boolean found = false;
        // Iterate through the list of appointments to find the one to cancel
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getPatientMobile().equals(mobilePhone)) {
                appointments.remove(i);
                System.out.println("The appointment has been successfully cancelled.");
                found = true;
                break;
            }
        }
        // Inform the user if no appointment is found with the given mobile phone number
        if (!found) {
            System.out.println("No appointments related to this phone number were found: " + mobilePhone);
        }
    }
}
//A
