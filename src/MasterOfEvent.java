public class MasterOfEvent implements Introduction {
    private String nameOfMasterOfEvent;
    private String occupationOfMasterOfEvent;

    public MasterOfEvent() {
        this.nameOfMasterOfEvent = "";
        this.occupationOfMasterOfEvent = "";
    }
    public MasterOfEvent(String  nameOfMasterOfEvent, String occupationOfMasterOfEvent) {
        this.nameOfMasterOfEvent = nameOfMasterOfEvent;
        this.occupationOfMasterOfEvent = occupationOfMasterOfEvent;
    }
    public String getNameOfMasterOfEvent() {
        return nameOfMasterOfEvent;
    }

    public void setNameOfMasterOfEvent(String nameOfMasterOfEvent) {
        this.nameOfMasterOfEvent = nameOfMasterOfEvent;
    }

    public String getOccupationOfMasterOfEvent() {
        return occupationOfMasterOfEvent;
    }

    public void setOccupationOfMasterOfEvent(String occupationOfMasterOfEvent) {
        this.occupationOfMasterOfEvent = occupationOfMasterOfEvent;
    }

    @Override
    public void introduce() {
        System.out.println("MasterOfEvent is..." + this.nameOfMasterOfEvent);
    }

    public String toString() {
        return "MC Name: " + nameOfMasterOfEvent +
                "\nOccupation: " + occupationOfMasterOfEvent;
    }
}
