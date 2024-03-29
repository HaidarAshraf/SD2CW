import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;


public class Theatre{
    static int[] rowone = new int[12];
    static int[] rowtwo = new int[16];
    static int[] rowthree = new int[20];
    static String[] seatingarearowone = new String[12];
    static String[] seatingarearowtwo = new String[16];
    static String[] seatingarearowthree = new String[20];
    static ArrayList <Ticket> tickets = new ArrayList<>();

    

    public static void main(String[] args) {
        System.out.println("Welcome to the New Theatre");
        //calling menu which asks for users choice
        boolean Quit = false;
        while(!Quit){
            Scanner input = new Scanner(System.in);
        String divider = "\n------------------------------------------------------------------------";
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
            switch(choice){
                case 0:
                    Quit = true;
                    System.out.println("Exiting program");
                    break;
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
                    showavailable(rowone,1);
                    showavailable(rowtwo,2);
                    showavailable(rowthree,3);
                    break;
                case 5:
                    System.out.println("You chose to Save to file");
                    saveF();
                    break;
                case 6:
                    System.out.println("You chose to Load from file");
                    loadF();
                    break;
                case 7:
                    System.out.println("You chose to Print Ticket information and total price");
                    showticketinfo();
                    break;
                case 8:
                    System.out.println("You chose to Sort tickets by price");
                    
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
        }
        

        int[] selectedrow=rowchoice==1?rowone : rowchoice==2?rowtwo : rowthree;

        if (selectedrow[seatchoice-1]==1) {
            System.out.println("Seat is already sold");
        }

        selectedrow[seatchoice-1]=1;
            System.out.println("Seat " + seatchoice + " in Row " + rowchoice + " Purchased Successfully");

        System.out.println("Enter your Name: ");
        String name = input.nextLine();
        System.out.println("\n");

        System.out.println("Enter your Surname: ");
        String surname = input.nextLine();
        System.out.println("\n");

        System.out.println("Enter your Email: ");
        String email = input.nextLine();
        System.out.println("\n");

        System.out.println("Enter the Price: ");
        double price = input.nextDouble();
        System.out.println("\n");

        Person person = new Person(name, surname, email);
        Ticket ticket = new Ticket(person, rowchoice, seatchoice, price);
        Ticket.settick(ticket);
        tickets.add(ticket);
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

        for(int i = 0; i < tickets.size(); i++){

        }
    }
    private static void showavailable(int[] arr , int rownum) {
        int count = 0;
        for (int i = 0; i<3; i++) {
            System.out.print("Seats Available in Row " + (rownum) + ": ");
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
    private static void saveF(){
        try {
            File file = new File("RowInfo.txt");
            file.createNewFile();
            FileWriter saveFILE = new FileWriter("RowInfo.txt");
            saveFILE.write("This is the information that is saved from the rows \n The 0 Represent the Seats that are Sold \n The 1 represents the Seats that are Available \n");
            for (int i = 0; i < rowone.length; i++){
                saveFILE.write(rowone[i] + " ");
            }
            saveFILE.write("\n");
            for (int i = 0; i < rowtwo.length; i++){
                saveFILE.write(rowtwo[i] + " ");
            }
            saveFILE.write("\n");
            for (int i = 0; i < rowthree.length; i++){
                saveFILE.write(rowthree[i] + " ");
            }
            saveFILE.close();
        }
        catch (IOException e) {
            System.out.println("Error while writing to a file.");
            e.printStackTrace();
        }
    }
    private static void loadF(){
        File file = new File("RowInfo.txt");
        try {
            Scanner readFile = new Scanner(file);
            int index = 0;
            while (readFile.hasNextInt()) {
                int number = readFile.nextInt();
                rowone[index] = number;
                index++;
            }
            readFile.close();
            System.out.print(" \n ");
            for (int i = 0; i < rowone.length; i++){
                System.out.print(rowone[i] + "  ");
            }
            System.out.print(" \n ");
            for (int i = 0; i < rowtwo.length; i++){
                System.out.print(rowtwo[i] + "  ");
            }
            System.out.print(" \n ");
            for (int i = 0; i < rowthree.length; i++){
                System.out.print(rowthree[i] + "  ");
            }
        } catch (IOException e) {
            System.out.println("Error while reading from a file.");
            e.printStackTrace();
        }
    }
    private static void showticketinfo(){
        System.out.println(tickets.get(1));

    }

}




    
