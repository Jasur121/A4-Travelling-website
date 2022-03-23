
import java.util.ArrayList;

public class Main {
    public static void main (String[]args) {
        Tour tour;
        TourSpec spec = new TourSpec(true, TypeOfTour.COMBINING);

        ListOfTours chosenTour = new ListOfTours();
        tour = new Tour("Riga Old Town walking tour",6.16, 1.30f,377,"English",spec);
        chosenTour.addTour(tour);

        tour = new Tour("Ultimate Husky dog sled ride experience in Latvia", 78.84,3.00f, 445,"German",spec);
        chosenTour.addTour(tour);

        tour = new Tour("Delicious Food Tasting Adventure in Riga Central Market",32.35,2.30f,625,"Italian, English", new TourSpec());
        chosenTour.addTour(tour);

        chosenTour.printListOfChosenTours();

        ArrayList<Tour> list = chosenTour.findTour(spec);
        for(Tour t:list) {
            System.out.println(t.getName());
        }
        list = chosenTour.findTour("delicious");
        for(Tour t:list) {
            System.out.println(t.getName());
        }

    }


}
