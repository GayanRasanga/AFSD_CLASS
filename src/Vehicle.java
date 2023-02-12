public class Vehicle {
    String color;
    int wheels;
    int sheat;


    public Vehicle(String color,int wheels,int sheat) {
       this.color = color;
       this.wheels = wheels;
       this.sheat = sheat;
    }
    public void vehicledrive() {
        System.out.println("Vehicle Drives....");
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Red",4,52);
        System.out.println(vehicle.color+" "+vehicle.sheat+" "+vehicle.wheels);
    }
}