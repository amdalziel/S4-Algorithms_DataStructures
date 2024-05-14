package Arrays;

import java.util.Arrays;

public class MovieTheatre {

    private String theatre[][] = null;
    static final private String letters[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    public MovieTheatre (int numRows, int numCols) {
        this.theatre = new String[numRows][numCols];
        for (int row = 0; row < theatre.length; row++) {
            for(int col = 0; col < theatre[0].length; col++){
                theatre[row][col] = (row + 1) + letters[col];
            }
        }
    }


    public void displaySeats() {
        try {
            for (int row = 0; row < theatre.length; row++) {
                for (int col = 0; col < theatre[0].length; col++) {
                    System.out.print(theatre[row][col] + " ");
                }
                System.out.println();
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }


    public void reserveSeat(String seatId) {
        boolean seatFound = false;
        boolean seatAlreadyReserved = false;
        try {
            for (int row = 0; row < theatre.length; row++) {
                for (int col = 0; col < theatre[0].length; col++) {
                    if (theatre[row][col].equals(seatId)) {
                        seatFound = true;
                        if (theatre[row][col].equals("R")) {
                            seatAlreadyReserved = true;
                        } else {
                            theatre[row][col] = "R";
                            System.out.println("Successful - you have reserved seat " + seatId);
                            return;
                        }
                    }
                }
            }
            if (seatFound && seatAlreadyReserved) {
                System.out.println("Seat already reserved. Please make another selection.");
            } else if (!seatFound) {
                System.out.println("Error - seat selection invalid.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void cancelSeatReservation(String seatId) {
        boolean cancelSuccessful = false;
        try {
            for (int row = 0; row < theatre.length; row++) {
                for (int col = 0; col < theatre[0].length; col++) {
                    String requestedSeatId = (row + 1) + letters[col];
                    if (theatre[row][col].equals("R") && requestedSeatId.equals(seatId)) {
                        theatre[row][col] = requestedSeatId;
                        cancelSuccessful = true;
                        System.out.println("Success - reservation for seat " + seatId + " cancelled.");
                        return;
                    }
                }
            }
            if (!cancelSuccessful) {
                System.out.println("Error - No reservation found for seat " + seatId );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        MovieTheatre movieTheatre = new MovieTheatre(4, 3);
        movieTheatre.displaySeats();

        movieTheatre.reserveSeat("2C");
        movieTheatre.reserveSeat("3C");
        movieTheatre.reserveSeat("3D");
        movieTheatre.displaySeats();

        movieTheatre.cancelSeatReservation("2C");
        movieTheatre.cancelSeatReservation("1C");
        movieTheatre.displaySeats();
    }
}
