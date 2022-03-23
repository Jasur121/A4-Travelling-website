
enum TypeOfTour {SIGHTSEEING, SHOREEXCURSION, ADVENTURE, SPORTING, COMBINING, SOME}

    public class TourSpec {
        private  boolean isMostPopular;
        private TypeOfTour typeOfTour;

        public TourSpec (boolean isMostPopular, TypeOfTour typeOfTour) {
            this.isMostPopular = isMostPopular;
            this.typeOfTour = typeOfTour;
        }
        public TourSpec() {
            this.isMostPopular = false;
            this.typeOfTour = TypeOfTour.SOME;
        }
        public boolean isMostPopular() {
            return  isMostPopular;
    }
      public TypeOfTour getTypeOfTour() {
            return typeOfTour;
      }


}
