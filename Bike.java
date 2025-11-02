public class Bike implements Vehicel{
private int hours;
private String brand;

    public Bike(int hours, String brand) {
        this.hours = hours;
        this.brand = brand;
    }

    public void displayDetails(){
        System.out.println("#Bike brand: "+brand+".\n#Hourly rental rate 10SR.\n#Rental cost "+calculateRentCost()+"SR.");
    }
    public double calculateRentCost(){return hours*10;}

}
