/*4.Hotel Booking System: Create a HotelBooking class with attributes guestName, roomType, and nights. Use default, parameterized, and copy constructors to initialize bookings. */
class HotelBooking {
    String guestName;
    String roomType;
    int nights;
    HotelBooking(){
        
    }

    HotelBooking(String guestName, String roomType, int nights){
        this.guestName=guestName;
        this.roomType=roomType;
        this.nights=nights;
    }

    HotelBooking(HotelBooking hb){
        guestName=hb.guestName;
        roomType=hb.roomType;
        nights=hb.nights;
    }

    public static void main(String[] args) {
        HotelBooking b1 = new HotelBooking("Pabitra Dhara","AC",2);
        System.out.println(b1.guestName + " " + b1.roomType + " " + b1.nights);
    }
}
