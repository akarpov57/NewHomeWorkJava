package homeWork_6;

public class CarTwo extends Cars {
          public CarTwo (String model, String color){
            this.model = model;
            this.color = color;
        }
        @Override
        public void refueling() {
            super.refueling();
            System.out.println(" dizel");
        }
    }

