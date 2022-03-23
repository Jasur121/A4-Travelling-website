import java.util.ArrayList;


public class  ListOfTours {
    private ArrayList<Tour> tourList = new ArrayList<>();


    public Tour maxQuantityOfBookings() {
        if (!tourList.isEmpty()) {
            double maxBooking = tourList.get(0).getQuantityOfBookings();
            Tour maxBookingTour = tourList.get(0);

            for (Tour tour : tourList) {
                if (maxBooking < tour.getQuantityOfBookings()) {
                    maxBookingTour = tour;
                }
            }
            return maxBookingTour;
        }
        return null;
    }

    public float avgQuantityOfBookings() {
        if (!tourList.isEmpty()) {
            double bookings = 0;
            for (Tour tour : tourList) {
                bookings += tour.getQuantityOfBookings();
            }
            return (float) bookings / tourList.size();
        }
        return 0;
    }


    public void addTour(Tour tour) {
        if (!findTour(tour)) {
            tourList.add(tour);
        } else {
            System.out.println("The tour is already in the bag");
        }
    }

    public boolean findTour(Tour tour) {
        for (Tour t : tourList) {
            if (tour.getName().equalsIgnoreCase(t.getName())) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Tour> findTour(TourSpec tourSpec) {
        ArrayList<Tour> list = new ArrayList<>();
        for (Tour t : tourList) {
            if (tourSpec.getTypeOfTour().equals(t.getTourSpec().getTypeOfTour())) {
                list.add(t);
            }
        }
        return list;
    }

    public ArrayList findTour(String tour) {
        ArrayList<Tour> tours = new ArrayList<>();
        for (Tour t : tourList) {
            if (t.getName().toLowerCase().contains(tour.toLowerCase())) {
                tours.add(t);
            } else if (t.getLanguageOfTour().toLowerCase().contains(tour.toLowerCase())) {
                tours.add(t);
            }
        }
        return tours;
    }




    public void printListOfChosenTours() {
        System.out.println("I have " + tourList.size() + " tours in bag");
        for (int i = 0; i < tourList.size(); i++) {
            System.out.println((i + 1) + ". " + tourList.get(i));
        }
    }
}



