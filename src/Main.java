import java.util.*;
public class Main {


    public static void main(String[] args) {


                // Create MCs
                MasterOfEvent mc1 = new MasterOfEvent("Anita Beryl", "Fashion Designer");
                MasterOfEvent mc2 = new MasterOfEvent("Trevor Noah", "Comedian");

                //Create Award Categories
                AwardCategories cat1 = new AwardCategories("Best Designer");
                AwardCategories cat2 = new AwardCategories("Best Entrepreneur");
                ArrayList<AwardCategories> categories = new ArrayList<>();
                categories.add(cat1);
                categories.add(cat2);

                //Create Awardees
                Awardees aw1 = new Awardees("Mona Muganzi", "Female", "Tech Innovator");
                Awardees aw2 = new Awardees("John Doe", "Male", "Entrepreneur");
                ArrayList<Awardees> awardeesList = new ArrayList<>();
                awardeesList.add(aw1);
                awardeesList.add(aw2);

                //Create Ubora Events
                UboraEvent event1 = new UboraEvent(
                        "Ubora Awards 2025",
                        "Accra",
                        "21/12/2025",
                        "6:00 PM",
                        4,
                        "Celebrating excellence"
                );
                event1.setMasterOfEvent(mc1);
                event1.setAwardCategories(categories);
                event1.setAwardees(awardeesList);

                UboraEvent event2 = new UboraEvent(
                        "Ubora Awards 2026",
                        "Accra",
                        "14/02/2026",
                        "7:30 PM",
                        3,
                        "Recognizing Hard Work and discipline"
                );
                event2.setMasterOfEvent(mc2);
                event2.setAwardCategories(categories);
                event2.setAwardees(awardeesList);

                // Put events in an array
                UboraEvent[] events = { event1, event2 };

                // Display all events using a loop
                for (UboraEvent ev : events) {
                    ev.displayAwardEventInformation();
                    System.out.println("\n");
                }
            }
        }



