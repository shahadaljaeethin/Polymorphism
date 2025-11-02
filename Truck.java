public class Truck implements Vehicel{
private String type;
private int week;

    public Truck(int week, String type) {
        this.week = week;
        this.type = type;
    }

    public double calculateRentCost(){return 500*week;}
public void displayDetails(){
        System.out.println("#Truck type: "+type+".\n#Weekly rental rate 500SR.\n#Rental cost "+calculateRentCost()+"SR.");
    }
}
