public class event {
  private ticket[][] seats;

  public event(int numRows, int numColumns) {
    seats = new ticket[numRows][numColumns];
  }

  public String bookSeats(int numSeats) {
    int seatsBooked = 0;
    for(int r=0;r<seats.length;r++) {
      for(int c=0;c<seats[r].length;c++) {
        if(seatsBooked==numSeats) {
          return "booking successful";
        }
        if(!seats[r][c].getStatus()) {
          seats[r][c].bookTicket();
          seatsBooked++;
        }
      }
    }
    return "booking unsuccessful, only booked "+seatsBooked+" seats";
  }

  public int numSeatsBooked() {
    int booked = 0;
    for(ticket[] row: seats) {
      for(ticket t: row) {
        if(t.getStatus()) {
          booked++;
        }
      }
    }
    return total;
  }

  public double percentageBooked() {
    int total = seats.length*seats[r].length;
    return ((double)numSeatsBooked*100/total);
  }

  public double getCurrentSales() {
    double sales = 0;
    for(ticket[] row: seat) {
      for(int i=0;i<row.length;i++) {
        if(row[i].getStatus()) {
          sales+=rows[i].getPrice();
        }
      }
    }
    return sales;
  }
}
