public class test {

    static int[] rowone = new int[12];
    static int[] rowtwo = new int[16];
    static int[] rowthree = new int[20];

    public static void main(String[] args) {
        int[] dice = {1, 2, 3, 4, 5, 0};
        String string = "";
    
        for (int i = 0; i < dice.length; i++) {
            string = string + dice[i];
        }
       
    
    }

    private static void printseatingarea(){
        String[] seatingarearowone = new String[12];
        System.out.println("***********");
        System.out.println("** STAGE **");
        System.out.println("***********");
        
        
        for (int i = 0; i< rowone.length ; i++) {
            if (rowone[i]== 1){
                seatingarearowone[0] = "X";
            }
            else{
                seatingarearowone[0] = "O";
            }

        }



    }

}
