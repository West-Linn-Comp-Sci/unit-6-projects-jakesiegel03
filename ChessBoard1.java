public class ChessBoard1
 
{
    public static void main(String[] args)
    {
        //Create an 8x8 2D String array called chess.
        String empty[] = {"-","-","-","-","-","-","-","-"};
        String row1[] = {"Rook","Knight","Bishop","Queen","King","Bishop","Knight","Rook"};
        String row2[] = {"Pawn","Pawn","Pawn","Pawn","Pawn","Pawn","Pawn","Pawn",};
        String chess[][]= {row1,row2,empty,empty,empty,empty,row2,row1};
        
        //Use this method to print the chess board onto the console
        print(chess);
        
 
    }
    
    //Do not make alterations to this method!
    public static void print(String[][] array)
    {
        for(String[] row: array)
        {
            for(String thing: row)
            {
                System.out.print(thing + "\t");
            }
            System.out.println();
        }
    }
}
