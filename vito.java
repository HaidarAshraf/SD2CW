import java.util.Scanner;
public class vito {
    int[] row1 = {0,0,0,0,0,0,0,0,0,0,0,0};    
    int[] row2 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,};
    int[] row3 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    public static void main(String[] args) {
        System.out.println("Welcome to the New Theatre");
        Scanner input = new Scanner(System.in);
        System.out.println("----------------------------------------");
        System.out.println("Please select an option: ");
        System.out.println("1) Buy a ticket");  
        System.out.println("2) Print seating area");
        System.out.println("3) Cancel ticket");
        System.out.println("4) List available seats");
        System.out.println("5) Save to file");
        System.out.println("6) Load from file");
        System.out.println("7) Print ticket information and total price");
        System.out.println("8) Sort tickets by price");
        System.out.println("0) Quit");
        System.out.println("----------------------------------------");
        System.out.println("Enter option: ");
        int choice = input.nextInt();  
   
        switch(choice) {
           
            case 0:
                //System.exit(0);
                System.out.println("Invalid choice");
                break;
           
            case 1:
                System.out.println("You chose option buy tickets");
               
                break;
               
            case 2:
                System.out.println("You chose to print the seating area");
               
                break;
               
            case 3:
                System.out.println("You chose to cancel tickets");
               
                break;
               
            case 4:
                System.out.println("You chose to list available seats");
               
                break;
               
            case 5:
                System.out.println("You chose to save to file");
               
                break;
               
            case 6:
                System.out.println("You chose to load from file");
               
                break;
               
            case 7:
                System.out.println("You chose to print tiket information and total price");
               
                break;
               
               
            case 8:
                System.out.println("You chose to sort tickets by price");
               
                break;
           
        default:        
            System.out.println("Invalid choice");
            break;
               
        }
    }
    
}
