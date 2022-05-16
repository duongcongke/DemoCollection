import jdk.internal.icu.text.UnicodeSet;

import java.util.ArrayList;
import java.util.List;

public class DemoCollection {
    class hotel {
        private String hotel;
        private int booking;
        private int phone

        public hotel(String hotel, int booking, int phone) {
            this.hotel = hotel;
            this.booking = booking;
            this.phone = phone;
        }
        public String getHotel() {
            return hotel;
        }
        public void setHotel(String hotel) {
            this.hotel = hotel;
        }
        public int getBooking() {
            return booking;
        }
        public void setBooking(int booking) {
            this.booking = booking;
        }
        public int getPhone() {
            return phone;
        }
        public void setPhone(int phone) {
            this.phone = phone;
        }
    }
    public class ArrayListDemo {
        public void main(String[] args) {
            List<hotel> hotels = new ArrayList<>();
            UnicodeSet user = null;
            user.add(new hotel("Grenn Star", 25 ,0963435230));
            
            user.forEach(hotel -> {
                System.out.println("Hotel : " + user.getRangeCount() + ", Booking : " + user.getRangeCount());

            });

        }
    }
}
