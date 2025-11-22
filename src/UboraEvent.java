import javax.security.sasl.SaslClient;
import java.util.ArrayList;

public class UboraEvent implements Schedule {
    private String eventName;
    private String eventLocation;
    private String eventDate;
    private String eventTime;
    private int eventDuration;
    private String eventAbstract;
    private ArrayList<Awardees> awardees;
    private MasterOfEvent mc;
    private ArrayList<AwardCategories> awardCategories;

    public UboraEvent(String eventName, String eventLocation, String eventDate, String  eventTime, int eventDuration, String eventAbstract) {
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.eventDuration = eventDuration;
        this.eventAbstract = eventAbstract;
        this.awardees = new ArrayList<>();
        this.mc = null;
        this.awardCategories = new ArrayList<>();
    }

    //GETTERS.
    public String getEventName() {
        return eventName;
    }

    public String  getEventLocation() {
        return eventLocation;
    }

    public String getEventDate() {
        return eventDate;
    }

    public String getEventTime() {
        return eventTime;
    }

    public int getEventDuration() {
        return eventDuration;
    }

    public String getEventAbstract() {
        return eventAbstract;
    }

    public ArrayList<Awardees> getAwardees() {
        return awardees;
    }

    public MasterOfEvent getMasterOfEvent() {
        return mc;
    }

    public ArrayList<AwardCategories> getAwardCategories() {
        return awardCategories;
    }



    //SETTERS.
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public void setEventDuration(int eventDuration) {
        this.eventDuration = eventDuration;
    }

    public void setEventAbstract(String eventAbstract) {
        this.eventAbstract = eventAbstract;
    }

    public void setAwardees(ArrayList<Awardees> awardees) {
        this.awardees = awardees;
    }

    public void setMasterOfEvent(MasterOfEvent masterOfEvent) {
        this.mc = masterOfEvent;
    }

    public void setAwardCategories(ArrayList<AwardCategories> AwardCategory) {
        this.awardCategories = AwardCategory;
    }




    public void displayAwardEventInformation()
    {
        System.out.println("Event Name: " + eventName);
        System.out.println("Event Location: " + eventLocation);
        System.out.println("Event Date: " + eventDate);
        System.out.println("Event Time: " + eventTime);
        System.out.println("Event Duration: " + eventDuration);
        System.out.println("Event Abstract: " + eventAbstract);

        System.out.println("Master of events: ");
        if (mc != null) {
            System.out.println(mc.toString());
        }

        System.out.println("Award Categories: ");
        if (awardCategories != null) {
            for (AwardCategories aw : awardCategories) {
                System.out.println(aw.toString());
            }
        }
        System.out.println("Award Event: ");
        if (awardees != null) {
            for (Awardees aw : awardees) {
                System.out.println(aw.toString());
            }
        }



    }
}
