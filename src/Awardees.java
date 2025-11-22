public class Awardees {
    private String nameOfAwardee;
    private String Gender;
    private String occupation;

    public Awardees(String nameOfAwardee, String gender, String occupation) {
        this.nameOfAwardee = nameOfAwardee;
        this.Gender = gender;
        this.occupation = occupation;
    }

    public String getNameOfAwardee() {
        return nameOfAwardee;
    }

    public void setNameOfAwardee(String nameOfAwardee) {
        this.nameOfAwardee = nameOfAwardee;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String toString() {
        return "Awardee Name: " + nameOfAwardee +
                ", Gender: " + Gender +
                ", Occupation: " + occupation;


    }
}
