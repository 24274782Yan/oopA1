import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a Specialist, extending the HealthProfessional class.
 * It includes additional attributes and methods specific to medical specialists.
 */
public class Specialist extends HealthProfessional {
    private List<String> subspecialties;  // List of subspecialties the specialist practices
    private int minConsultationTime;      // Minimum consultation time in minutes
    private double consultationFee;       // Fee charged per consultation
    private int researchPapers;           // Number of research papers published

    /**
     * Default constructor for Specialist.
     */
    public Specialist() {
        super();
        this.subspecialties = new ArrayList<>();
    }

    /**
     * Parameterized constructor for Specialist.
     *
     * @param id The unique identifier for the specialist
     * @param name The full name of the specialist
     * @param specialization The main area of specialization
     * @param yearsOfExperience The number of years of professional experience
     * @param hospitalAffiliation The name of the affiliated hospital
     * @param isAvailableForEmergency Whether the specialist is available for emergency calls
     * @param subspecialties List of subspecialties
     * @param minConsultationTime Minimum consultation time in minutes
     * @param consultationFee Fee charged per consultation
     * @param researchPapers Number of research papers published
     */
    public Specialist(int id, String name, String specialization, int yearsOfExperience,
                      String hospitalAffiliation, boolean isAvailableForEmergency,
                      List<String> subspecialties, int minConsultationTime,
                      double consultationFee, int researchPapers) {
        super(id, name, specialization, yearsOfExperience, hospitalAffiliation, isAvailableForEmergency);
        this.subspecialties = new ArrayList<>(subspecialties);
        this.minConsultationTime = minConsultationTime;
        this.consultationFee = consultationFee;
        this.researchPapers = researchPapers;
    }

    /**
     * Prints all the details of the Specialist.
     * This method overrides the printDetails method in the parent class.
     */
    @Override
    public void printDetails() {
        System.out.println("Specialist Details:");
        super.printDetails();
        System.out.println("Subspecialties: " + String.join(", ", subspecialties));
        System.out.println("Minimum Consultation Time: " + minConsultationTime + " minutes");
        System.out.println("Consultation Fee: $" + consultationFee);
        System.out.println("Research Papers Published: " + researchPapers);
    }

    /**
     * Adds a new subspecialty to the specialist's list of subspecialties.
     *
     * @param subspecialty The subspecialty to be added
     */
    public void addSubspecialty(String subspecialty) {
        this.subspecialties.add(subspecialty);
    }

    /**
     * Calculates the maximum number of consultations the specialist can have in a day.
     *
     * @param workingHours The number of working hours in a day
     * @return The maximum number of consultations possible
     */
    public int calculateMaxConsultationsPerDay(int workingHours) {
        return (workingHours * 60) / minConsultationTime;
    }

    /**
     * Calculates the specialist's reputation score based on experience and research.
     *
     * @return A reputation score from 1 to 10, where 10 is the highest
     */
    public int calculateReputationScore() {
        int score = getYearsOfExperience() / 2 + researchPapers / 5;
        return Math.min(score, 10);  // Cap the score at 10
    }

    /**
     * Estimates the daily earning potential of the specialist.
     *
     * @param workingHours The number of working hours in a day
     * @return The estimated daily earning
     */
    public double estimateDailyEarning(int workingHours) {
        int maxConsultations = calculateMaxConsultationsPerDay(workingHours);
        return maxConsultations * consultationFee;
    }

    // Getters and setters for the new attributes

    public List<String> getSubspecialties() {
        return new ArrayList<>(subspecialties);
    }

    public void setSubspecialties(List<String> subspecialties) {
        this.subspecialties = new ArrayList<>(subspecialties);
    }

    public int getMinConsultationTime() {
        return minConsultationTime;
    }

    public void setMinConsultationTime(int minConsultationTime) {
        this.minConsultationTime = minConsultationTime;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }

    public int getResearchPapers() {
        return researchPapers;
    }

    public void setResearchPapers(int researchPapers) {
        this.researchPapers = researchPapers;
    }
}
//A