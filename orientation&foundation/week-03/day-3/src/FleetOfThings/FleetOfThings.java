package FleetOfThings;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();

        Thing milk = new Thing("Get milk");
        Thing obstacles = new Thing("Remove the obstacles");
        Thing standup = new Thing("Stand up");
        Thing eat = new Thing("Eat lunch");

        fleet.add(milk);
        fleet.add(obstacles);
        fleet.add(standup);
        fleet.add(eat);

        standup.complete();
        eat.complete();


        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        System.out.println(fleet);
    }
}