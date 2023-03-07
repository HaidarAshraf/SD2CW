import java.util.Arrays;
import java.util.Scanner;

public class test{
    static int[] rowone = new int[12];
    static int[] rowtwo = new int[16];
    static int[] rowthree = new int[20];
    static String[] seatingarearowone = new String[12];
    static String[] seatingarearowtwo = new String[16];
    static String[] seatingarearowthree = new String[20];

    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the New Theatre");

        // setting all seats to 0/free
        for (int i = 0; i < rowone.length; i++) {
            rowone[i] = 0;
        }
        for (int i = 0; i < rowtwo.length; i++) {
            rowtwo[i] = 0;
        }
        for (int i = 0; i < rowthree.length; i++) {
            rowthree[i] = 0;
        }
        //calling menu which asks for users choice
        menu();

    }
    private static void menu(){
        Scanner input = new Scanner(System.in);
        String divider = "------------------------------------------------------------------------";
        System.out.println(divider);
        System.out.println("Please select an option:");
        System.out.println("1) Buy a ticket");
        System.out.println("2) Print seating area");
        System.out.println("3) Cancel ticket");
        System.out.println("4) List available seats");
        System.out.println("5) Save to file");
        System.out.println("6) Load from file");
        System.out.println("7) Print ticket information and total price");
        System.out.println("8) Sort tickets by price");
        System.out.println("0) Quit");
        System.out.println(divider);
        System.out.println("Enter Option:");
        int choice = input.nextInt();

        while(choice != 0){
            switch(choice){
                case 0:
                    System.out.println("Exiting program");
                    return;
                case 1:
                    System.out.println("You chose to buy a ticket");
                    buyticket();
                    break;
                case 2:
                    System.out.println("You chose to Print the Seating Area");
                    printseatingarea();
                    break;
                case 3:
                    System.out.println("You chose to Cancel your ticket ");
                    cancelticket();
                    break;
                case 4:
                    System.out.println("You chose to List available seats");
                    showavailable(rowone);
                    showavailable(rowtwo);
                    showavailable(rowthree);
                    menu();
                    break;
                case 5:
                    System.out.println("You chose to Save to file");
                    //self def for case
                    break;
                case 6:
                    System.out.println("You chose to Load from file");
                    //self def for case
                    break;
                case 7:
                    System.out.println("You chose to Print Ticket information and total price");
                    //self def for case
                    break;
                case 8:
                    System.out.println("You chose to Sort tickets by price");
                    //self def for case
                    break;
            default:
                System.out.println("Invalid Choice");
                break;
            }
        }
    }

    private static void buyticket(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the buy station");
        System.out.println("Enter the row you would like to buy a seat in (1-3)");
        int rowchoice = input.nextInt();

        System.out.println("Enter a Seat number (1-" + (rowchoice == 1? 12 : rowchoice == 2? 16 : 20) + "):");
        int seatchoice = input.nextInt();

        if (rowchoice < 1 || rowchoice > 3 || seatchoice < 1 || seatchoice > (rowchoice == 1? 12 : rowchoice == 2? 16 : 20) ){
            System.out.println("Invalid Row or Seat Number");
            return;
        }
        

        int[] selectedrow=rowchoice==1?rowone : rowchoice==2?rowtwo : rowthree;

        if (selectedrow[seatchoice-1]==1) {
            System.out.println("Seat is already sold");
            return;
        }

        selectedrow[seatchoice-1]=1;
            System.out.println("Seat " + seatchoice + " in Row " + rowchoice + " Purchased Successfully");
        menu();
    }

    private static void printseatingarea(){
        System.out.println("     ***********     ");
        System.out.println("     *  STAGE  *     ");
        System.out.println("     ***********     ");

        for (int i = 0; i < rowone.length; i++) {
            if (rowone[i] == 1) {
                seatingarearowone[i] = "X";
            } 
            else {
                seatingarearowone[i] = "O";
            }
            System.out.print(seatingarearowone[i] + " ");
        }
        System.out.print("\n");

        for (int i = 0; i < rowtwo.length; i++) {
            if (rowtwo[i] == 1) {
                seatingarearowtwo[i] = "X";
            } 
            else {
                seatingarearowtwo[i] = "O";
            }
            System.out.print(seatingarearowtwo[i] + " ");
            
        }
        System.out.print("\n");

        for (int i = 0; i < rowthree.length; i++) {
            if (rowthree[i] == 1) {
                seatingarearowthree[i] = "X";
            } 
            else {
                seatingarearowthree[i] = "O";
            }
            System.out.print(seatingarearowthree[i] + " ");
            
        }
        System.out.print("\n");
        menu();
        }
    private static void cancelticket(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Cancel station");
        System.out.println("Enter the row you would like to cancel a seat in (1-3)");
        int rowcancelchoice = input.nextInt();

        System.out.println("Enter a Seat number (1-" + (rowcancelchoice == 1? 12 : rowcancelchoice == 2? 16 : 20) + "):");
        int seatcancelchoice = input.nextInt();

        if (rowcancelchoice < 1 || rowcancelchoice > 3 || seatcancelchoice < 1 || seatcancelchoice > (rowcancelchoice == 1? 12 : rowcancelchoice == 2? 16 : 20) ){
            System.out.println("Invalid Row or Seat Number");
            return;
        }
        

        int[] selectedcancelrow=rowcancelchoice==1?rowone : rowcancelchoice==2?rowtwo : rowthree;

        if (selectedcancelrow[seatcancelchoice-1]==1){
            selectedcancelrow[seatcancelchoice-1]=0;
        }

        else{
            System.out.println("Seat is NOT sold");
            System.out.println("Try Again");
            return;
        }
        System.out.print("\n");
        menu();
    }
    private static void showavailable(int[] arr) {
        int count = 0;
        for (int i = 0; i<3; i++) {
            System.out.print("Seats Available in Row " + (i+1) + ": ");
            break;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
                System.out.print((i + 1) + ", ");
            }
        }
        if (count == 0) {
            System.out.print("No seats available");
        }
        System.out.println();
    
    }
}

    