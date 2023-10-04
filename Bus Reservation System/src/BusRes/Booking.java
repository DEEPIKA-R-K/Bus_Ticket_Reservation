package BusRes;

import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;
public class Booking {
    String passenger_name;
    int bus_no;
    Date date;
    Scanner sc=new Scanner(System.in);
    Booking(){
        System.out.println("Enter the passenger name: ");
        passenger_name=sc.nextLine();
        System.out.println("Enter the bus number: ");
        bus_no=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter date in the format(dd-mm-yyyy): ");
        String str=sc.nextLine();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
        try {
            date=dateFormat.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus> buses){
        int capacity=0;
        for(Bus bus:buses){
            if(bus.getBusno()==bus_no){
                capacity= bus.getCapacity();
            }
        }
        int booked=0;
        for(Booking b:bookings){
            if(b.bus_no ==bus_no && b.date.equals(date)){
                booked++;
            }
        }
        return booked<capacity?true:false;
    }
    Booking(ArrayList<Booking> bookings){
        Date date1=null;
        boolean present=false;
        System.out.println("Enter the bus number: ");
        int Bus_num=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter date in the format(dd-mm-yyyy): ");
        String str=sc.nextLine();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
        try {
            date1=dateFormat.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("                  Passenger List:");
        System.out.println("_____________________________________________________");
        System.out.println("Bus number: "+Bus_num+" Date: "+date1);
        for(Booking b:bookings){
            if(b.bus_no==Bus_num&&b.date.equals(date1)) {
                System.out.println("Name: " + b.passenger_name);
                present=true;
            }
        }
        if(present){
            System.out.println("----------------List Completed--------------");
            System.out.println();
        }
        else{
            System.out.println("Not even single booking is done in this date and bus number!");
        }
    }
}
