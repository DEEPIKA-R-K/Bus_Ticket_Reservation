package BusRes;
import java.util.*;
public class Bus_demo {
 public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     ArrayList<Bus> buses = new ArrayList<>();
     ArrayList<Booking> bookings = new ArrayList<>();
     buses.add(new Bus(1, true, 1));
     home:
     while (true) {
         System.out.println("                           DPB-BOOKING");
         System.out.println("_________________________________________________________________");
         System.out.println();
         System.out.println("                 WELCOME TO DP BUS BOOKING SITE!");
         System.out.println("For Administrator -Enter 1| For BOOKING -Enter 2");
         int entry = sc.nextInt();
         sc.nextLine();
         //Administration side coding
         if (entry == 1) {
             System.out.println("Enter Password: ");
             String entered_pass=sc.nextLine();
             PassCheck pc=new PassCheck();
             boolean pass_check=pc.check_pass(entered_pass);
             if(pass_check)
             psList:
             while(true) {
                 System.out.println("To Get Passenger List-Enter 1| To exit-Enter 2");
                 int Ad_op = sc.nextInt();
                 if (Ad_op == 1) {
                     if(bookings.isEmpty())
                         System.out.println("Not even a booking is done..!!!");
                     else {
                         Booking b=new Booking(bookings);
                     }
                 }
                 else if (Ad_op == 2) {
                     continue home;
                 }
                 else {
                     System.out.println("Enter valid option!!!");
                     continue psList;
                 }
             }
         }
         //User side coding
         else if (entry == 2) {
             for (Bus bus : buses) {
                 bus.displayBusInfo();
             }
             int user_opt = 1;
             while (user_opt == 1) {
                 System.out.println("Enter 1 to booking and 2 to Exit...");
                 user_opt = sc.nextInt();
                 if (user_opt == 1) {
                     Booking booking = new Booking();
                     if (booking.isAvailable(bookings, buses)) {
                         bookings.add(booking);
                         System.out.println("Your booking is confirmed...");
                     } else {
                         System.out.println("Sorry!!!");
                         System.out.println("Bus is full! Try another bus or date!..");
                     }
                 }
                 else if(user_opt==2){
                     continue home;
                 }
             }
         }
     }
 }
}
