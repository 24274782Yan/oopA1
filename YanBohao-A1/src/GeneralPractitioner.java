import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a General Practitioner, extending the HealthProfessional class.
 * It includes additional attributes and methods specific to general practitioners.
 */
public class GeneralPractitioner extends HealthProfessional {
    private int maxPatientsPerDay;     // Maximum number of patients the GP can see in a day
    private boolean offersTelehealth;  // Whether the GP offers telehealth services
    private List<String> languages;    // Languages spoken by the GP
    private int yearsInCurrentClinic;  // Number of years working in the current clinic

    /**
     * Default constructor for GeneralPractitioner.
     */
    public GeneralPractitioner() {
        super();
        this.languages = new ArrayList<>();
    }

    /**
     * Parameterized constructor for GeneralPractitioner.
     *
     * @param id The unique identifier for the GP
     * @param name The full name of the GP
     * @param yearsOfExperience The number of years of professional experience
     * @param hospitalAffiliation The name of the affiliated hospital
     * @param isAvailableForEmergency Whether the GP is available for emergency calls
     * @param maxPatientsPerDay Maximum number of patients the GP can see in a day
     * @param offersTelehealth Whether the GP offers telehealth services
     * @param languages List of languages spoken by the GP
     * @param yearsInCurrentClinic Number of years working in the current clinic
     */
    public GeneralPractitioner(int id, String name, int yearsOfExperience,
                               String hospitalAffiliation, boolean isAvailableForEmergency,
                               int maxPatientsPerDay, boolean offersTelehealth,
                               List<String> languages, int yearsInCurrentClinic) {
        super(id, name, "General Practice", yearsOfExperience, hospitalAffiliation, isAvailableForEmergency);
        this.maxPatientsPerDay = maxPatientsPerDay;
        this.offersTelehealth = offersTelehealth;
        this.languages = new ArrayList<>(languages);
        this.yearsInCurrentClinic = yearsInCurrentClinic;
    }

    /**
     * Prints all the details of the General Practitioner.
     * This method overrides the printDetails method in the parent class.
     */
    @Override
    public void printDetails() {
        System.out.println("General Practitioner Details:");
        super.printDetails();
        System.out.println("Max Patients Per Day: " + maxPatientsPerDay);
        System.out.println("Offers Telehealth: " + (offersTelehealth ? "Yes" : "No"));
        System.out.println("Languages Spoken: " + String.join(", ", languages));
        System.out.println("Years in Current Clinic: " + yearsInCurrentClinic);
    }

    /**
     * Checks if the GP can accept more patients for the day.
     *
     * @param currentPatients The number of patients already scheduled for the day
     * @return true if the GP can accept more patients, false otherwise
     */
    public boolean canAcceptMorePatients(int currentPatients) {
        return currentPatients < maxPatientsPerDay;
    }

    /**
     * Calculates the experience rating of the GP based on total experience and time in current clinic.
     *
     * @return A rating from 1 to 5, where 5 is the highest
     */
    public int calculateExperienceRating() {
        int totalExperience = getYearsOfExperience() + yearsInCurrentClinic;
        if (totalExperience > 20) return 5;
        if (totalExperience > 15) return 4;
        if (totalExperience > 10) return 3;
        if (totalExperience > 5) return 2;
        return 1;
    }

    /**
     * Adds a new language to the GP's list of spoken languages.
     *
     * @param language The language to be added
     */
    public void addLanguage(String language) {
        this.languages.add(language);
    }

    // Getters and setters for the new attributes

    public int getMaxPatientsPerDay() {
        return maxPatientsPerDay;
    }

    public void setMaxPatientsPerDay(int maxPatientsPerDay) {
        this.maxPatientsPerDay = maxPatientsPerDay;
    }

    public boolean isOffersTelehealth() {
        return offersTelehealth;
    }

    public void setOffersTelehealth(boolean offersTelehealth) {
        this.offersTelehealth = offersTelehealth;
    }

    public List<String> getLanguages() {
        return new ArrayList<>(languages);
    }

    public void setLanguages(List<String> languages) {
        this.languages = new ArrayList<>(languages);
    }

    public int getYearsInCurrentClinic() {
        return yearsInCurrentClinic;
    }

    public void setYearsInCurrentClinic(int yearsInCurrentClinic) {
        this.yearsInCurrentClinic = yearsInCurrentClinic;
    }
}
//A