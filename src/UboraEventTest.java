import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.util.ArrayList;

public class UboraEventTest {

    @Test
    public void testUboraEventSetup() {

        // --------- Create 2 Ubora Events ---------
        UboraEvent event1 = new UboraEvent(
                "Ubora Awards 2025",
                "Kigali Convention Center",
                "21/12/2025",
                "6:00 PM",
                4,
                "Celebrating African Excellence"
        );

        UboraEvent event2 = new UboraEvent(
                "Ubora Leadership Gala",
                "Serena Hotel Nairobi",
                "14/02/2026",
                "7:30 PM",
                3,
                "Honoring impactful African leaders"
        );

        // --------- Create 2 MC Objects ---------
        MasterOfEvent mc1 = new MasterOfEvent("Anita Beryl", "Fashion Designer");
        MasterOfEvent mc2 = new MasterOfEvent("Trevor Noah", "Comedian");

        event1.setMasterOfEvent(mc1);
        event2.setMasterOfEvent(mc2);

        assertEquals("Anita Beryl", event1.getMasterOfEvent().getNameOfMasterOfEvent());
        assertEquals("Trevor Noah", event2.getMasterOfEvent().getNameOfMasterOfEvent());

        // --------- Create 2 Award Categories ---------
        AwardCategories cat1 = new AwardCategories("Best Designer");
        AwardCategories cat2 = new AwardCategories("Best Entrepreneur");

        ArrayList<AwardCategories> categories = new ArrayList<>();
        categories.add(cat1);
        categories.add(cat2);

        event1.setAwardCategories(categories);
        event2.setAwardCategories(categories);

        assertEquals(2, event1.getAwardCategories().size());
        assertEquals(2, event2.getAwardCategories().size());

        // --------- Create 2 Awardees ---------
        Awardees aw1 = new Awardees("Mona Muganzi", "Female", "Tech Innovator");
        Awardees aw2 = new Awardees("John Doe", "Male", "Entrepreneur");

        ArrayList<Awardees> awardeesList = new ArrayList<>();
        awardeesList.add(aw1);
        awardeesList.add(aw2);

        event1.setAwardees(awardeesList);
        event2.setAwardees(awardeesList);
    }
}
