/**
 * This class represents a Health Professional in a medical system.
 * It contains basic information about the professional, such as their ID, name, and specialization.
 * Additional fields include years of experience, hospital affiliation, and emergency availability.
 */
public class HealthProfessional {
    // Basic information
    private int id;                  // Unique identifier for the health professional
    private String name;             // Full name of the health professional
    private String specialization;   // Area of medical expertise (e.g., "Cardiology", "Pediatrics")

    // Additional information
    private int yearsOfExperience;           // Number of years working in the medical field
    private String hospitalAffiliation;      // Name of the hospital where the professional works
    private boolean isAvailableForEmergency; // Indicates if the professional can respond to emergencies

    /**
     * Default constructor.
     * Initializes a HealthProfessional object with no data.
     */
    public HealthProfessional() {
        // The body is empty as we're not setting any default values
    }

    /**
     * Parameterized constructor.
     * Initializes a HealthProfessional object with all the provided information.
     *
     * @param id The unique identifier for the health professional
     * @param name The full name of the health professional
     * @param specialization The area of medical expertise
     * @param yearsOfExperience The number of years of professional experience
     * @param hospitalAffiliation The name of the affiliated hospital
     * @param isAvailableForEmergency Whether the professional is available for emergency calls
     */
    public HealthProfessional(int id, String name, String specialization, int yearsOfExperience,
                              String hospitalAffiliation, boolean isAvailableForEmergency) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.yearsOfExperience = yearsOfExperience;
        this.hospitalAffiliation = hospitalAffiliation;
        this.isAvailableForEmergency = isAvailableForEmergency;
    }

    /**
     * Prints all the details of the health professional.
     * This method displays all the instance variables in a formatted manner.
     */
    public void printDetails() {
        System.out.println("Health Professional Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("Years of Experience: " + yearsOfExperience);
        System.out.println("Hospital Affiliation: " + hospitalAffiliation);
        System.out.println("Available for Emergency: " + (isAvailableForEmergency ? "Yes" : "No"));
    }

    // Getter and Setter methods for each instance variable
    // These methods allow controlled access to the private variables

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getHospitalAffiliation() {
        return hospitalAffiliation;
    }

    public void setHospitalAffiliation(String hospitalAffiliation) {
        this.hospitalAffiliation = hospitalAffiliation;
    }

    public boolean isAvailableForEmergency() {
        return isAvailableForEmergency;
    }

    public void setAvailableForEmergency(boolean availableForEmergency) {
        isAvailableForEmergency = availableForEmergency;
    }
}
//A