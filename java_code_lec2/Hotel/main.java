package Hotel;

import java.util.ArrayList;

public class main {
    public static void main(String[] args){

        Room[] rooms = new Room[100];

        for (int i = 0 ; i < 100 ; i++){
            Room r = new Room(i+1, "Available");
            rooms[i] = r;
            // System.out.println("Room " + r.getNum() + " is " + r.getStatus());

        }
        
        ArrayList<Booking> books1 = new ArrayList<>();
        ArrayList<Booking> books2 = new ArrayList<>();
        

        Hotel hotelA = new Hotel(rooms,books1 , books2);


        for (int i = 0 ; i< 100 ; i++){
            Room[] rooms2 = hotelA.getRoom() ;
            System.out.println("Room" + rooms2[i].getNum() + " is " + rooms2[i].getStatus());
        }
        System.out.println("getRoom() work complete!"+"\n");
        
        int roomNum = 6 ;
        if (!hotelA.isAvailable(roomNum)){
            System.out.printf("room %d is Available \n",roomNum);
        }
        else{
            System.out.printf("room %d is Unavailable \n",roomNum);
        }
        System.out.println("isAvailable() work complete!"+"\n");
        
        
        System.out.println("Active bookings: " + hotelA.getActiveBookings().size());
        
        System.out.println(hotelA.CreateBooking(1, "1", "31"));
        System.out.println(hotelA.getRoom()[0].getStatus());
        System.out.println("Active bookings: " + hotelA.getActiveBookings().size());

        
    }
}
