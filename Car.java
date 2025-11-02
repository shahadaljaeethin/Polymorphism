public class Car implements Vehicel {
Car(String model, int days){
this.days=days;
this.model=model;
}
Car(){model="no model"; days=0;}
private String model;
private int days;

    public double calculateRentCost(){
    return 50*days;}
    public void displayDetails(){
    System.out.println("#Car model: "+model+".\n#Daily rental rate 50SR.\n#Rental cost "+calculateRentCost()+"SR.");
    }

}
