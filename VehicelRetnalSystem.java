import java.util.ArrayList;
import java.util.Scanner;

public class VehicelRetnalSystem {
public static final String result = "\u001B[33m";   
public static final String defultColor = "\u001B[0m";
public int non_static_int = 1;

public static void main(String[] args){
showMenu();
}
public static void showMenu(){
Scanner user = new Scanner(System.in);
ArrayList<Vehicel> rented = new ArrayList<>();

int choice=0;
while(choice!=5) {
    try {
        System.out.println(defultColor + "# Vehicle Rental System #\n1] Rend a car.\n2] Rend a bike.\n3] Rend a truck.\n4] Veiw rented vehicels.\n5] Exit.");
        choice = user.nextInt();
        switch (choice){
            case 1: rented.add(createCar()); break;
            case 2: rented.add(createBike()); break;
            case 3: rented.add(createTruck()); break;
            case 4:
            if(rented.isEmpty()){System.out.println(defultColor+"-->No rented vehicle yet.");}
            else {
            System.out.print(result); //color
            for(Vehicel v: rented){
            v.displayDetails();
            System.out.println("____________________________");
            }
                 }
            break;
            case 5: break;
            default: System.out.println(defultColor+"Re-choose again");
        }
}catch(Exception e){System.out.println(e.getMessage());}
}
System.out.println("Thank you for using the Vehicles Rental System!");

}

public static Vehicel createCar()throws Exception{
    Scanner r = new Scanner(System.in);

    System.out.println("Enter car model:");
    String model = r.nextLine();
    System.out.println("Enter number of days you want to rent");
    int days = r.nextInt();
    if(days<=0) throw new Exception("ERROR: rent period must be over 0");
    return new Car(model,days);

}
    public static Vehicel createBike()throws Exception{
        Scanner r = new Scanner(System.in);

        System.out.println("Enter bike brand:");
        String brand = r.nextLine();
        System.out.println("Enter number of hours you want to rent");
        int hourse = r.nextInt();
        if(hourse<=0||hourse>24) throw new Exception("ERROR: rent period must be over 0H and less than 24H");
        return new Bike(hourse,brand);

    }
    public static Vehicel createTruck()throws Exception{
        Scanner r = new Scanner(System.in);

        System.out.println("Enter car type:");
        String type = r.nextLine();
        System.out.println("Enter number of weeks you want to rent");
        int week = r.nextInt();
        if(week<=0) throw new Exception("ERROR: rent period must be over 0");
        return new Truck(week,type);

    }
}

