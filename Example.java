import java.util.Arrays;

public class Example {
    
    public static void main(String[] args) {
        int[][] seats = {
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        
        showAvailable(seats);
    }
    
    private static void showAvailable(int[][] seats) {
        for (int i = 0; i < seats.length; i++) {
            System.out.print("Seats Available in Row " + (i+1) + ": ");
            int[] rowSeats = seats[i];
            boolean available = false;
            for (int j = 0; j < rowSeats.length; j++) {
                if (rowSeats[j] == 0) {
                    available = true;
                    System.out.print((j+1) + ", ");
                }
            }
            if (!available) {
                System.out.print("No seats available");
            }
            System.out.println();
            System.out.println("Seats Available: " + Arrays.toString(rowSeats));
        }
    }
}