public class Ticket {

  private double cost;
  private boolean isBooked = false;

  public ticket() {
    cost = 1000;
  }
  public ticket(double c) {
    cost = c;
  }

  public double getPrice() {
    return cost;
  }
  public boolean getStatus() {
    return isBooked;
  }
  public void bookTicket() {
    isBooked = true;
  }
  public void cancelBooking() {
    isBooked = false;
  }
}
