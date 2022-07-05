// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter row number-");
        int row = sc.nextInt();
        System.out.println("Please enter column number-");
        int col = sc.nextInt();
        
        System.out.println("row >> "+ row); 
        System.out.println("col >> "+ col); 
        int[][] numbers = new int[row][col];
        
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                numbers[i][j] = j;
            }
        }
        
         
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}

--------------------------------------------------------------------------------------------------------------------------------------------
..................................................................   Another Example .......................................................
--------------------------------------------------------------------------------------------------------------------------------------------
    
  // Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
     
        // Scanner class
        System.out.println("Please enter the row number -");
        int row = scannerMethod();
        System.out.println("Row number - "+ row);
        
        System.out.println("Please enter the column number -");
        int col = scannerMethod();
        System.out.println("Col number - "+ col);
        
        create2DArray(row, col);
    }
    
    
    private static int scannerMethod() {
        
        Scanner sc = new Scanner(System.in);
        int inputInteger = sc.nextInt();
        return inputInteger;
        
    }
    
    private static void create2DArray(int row, int col) {
        int[][] nuumber = new int[row][col];
    }
}
