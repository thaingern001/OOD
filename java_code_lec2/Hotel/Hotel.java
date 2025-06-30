package Hotel;
import java.util.ArrayList;

public class Hotel {
    private Room[] rooms;
    
    private ArrayList<Booking> active_booking;

    private ArrayList<Booking> previous_booking;
    
    public Hotel(Room[] rooms , ArrayList<Booking> active_bookings , ArrayList<Booking> previous_bookings){
        this.rooms = rooms;
        this.active_booking = active_bookings;
        this.previous_booking = previous_bookings;
    }

    public Hotel(){
        rooms = new Room[100];

        active_booking = new ArrayList<>();
        previous_booking = new ArrayList<>();

    }

    public Room[] getRoom(){
        return rooms;
    }

    public boolean isAvailable(int roomNum){
        if (rooms[roomNum-1].getStatus() == "Available"){
            return true;
        }
        return false;
    }

    public ArrayList<Booking> getActiveBookings(){
        return active_booking;
    }

    public ArrayList<Booking> getPreviouBookings(){
        return previous_booking;
    }

    public boolean CreateBooking(int roomNum,String start,String end){
        if (rooms[roomNum-1].getStatus() == "Available"){
            Booking newBooking = new Booking(rooms[roomNum-1],start,end);

            active_booking.add(newBooking);
            rooms[roomNum-1].setStatus("UnAvailable");
            return true;
        }
        return false;
    }

    

    
}