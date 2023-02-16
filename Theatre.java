import java.util.Scanner;

public class Theatre{
    public static void main(String[] args){
        System.out.println("Welcome to the New Theatre");
        int[] row1 = new int[12];
        int[] row2 = new int[16];
        int[] row3 = new int[20];
        menu();

    }
    private static void menu(){
        Scanner input = new Scanner(System.in);
        String divider = "-------------------------------------------------------------------------------------";
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
                case 1:
                    System.out.println("You chose to buy a ticket");
                    buyticket();
                    break;
                case 2:
                    System.out.println("You chose to Print the Seating Area");
                    // self def print the seating area 
                    break;
                case 3:
                    System.out.println("You chose to Cancel your ticket ");
                    //self def for case
                    break;
                case 4:
                    System.out.println("You chose to List available seats");
                    //self def for case
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

            }

        }

        if (choice == 0){
            System.out.println("You chose to Exit the Program");
            
        }


    }

    private static void buyticket(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the but station");
        System.out.println("Enter the row you would like to buy a seat in (1-3)");
        int rowchoice = input.nextInt();
        if (rowchoice == 1){
            System.out.println("");
        }

    }
}
