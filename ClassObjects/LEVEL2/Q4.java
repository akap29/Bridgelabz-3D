package ClassObjects.LEVEL2;

public class Q4 {
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked;

    // Constructor
    Q4(String movieName) {
        this.movieName = movieName;
        this.seatNumber = "Null";
        this.price = 0.0;
        this.isBooked = false;
    }

    // Book ticket
    public void bookTicket(String seatNumber, double price) {
        if (isBooked) {
            System.err.println("House full!!! Sorry..... Ticket already booked");
        } else {
            this.seatNumber = seatNumber;
            this.price = price;
            this.isBooked = true;
            System.out.println("Ticket booked for movie: " + this.movieName);
            System.out.println("Seat Number: " + this.seatNumber);
            System.out.println("Price: $" + this.price);
        }
    }

    // Display ticket details
    public void displayTicket() {
        if (this.isBooked) {
            System.out.println("Ticket booked for movie: " + this.movieName);
            System.out.println("Seat Number: " + this.seatNumber);
            System.out.println("Price: $" + this.price);
        } else {
            System.out.println("Ticket has not been booked yet....");
        }
    }

    public static void main(String[] args) {
        Q4 ticket1 = new Q4("Dragon");

        ticket1.displayTicket();
        ticket1.bookTicket("A10", 120.0);
        ticket1.bookTicket("B10", 120.0);
        ticket1.bookTicket("A11", 120.0); // booking again
        ticket1.displayTicket();
    }
}
