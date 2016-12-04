package HackerRank;

import java.util.*; 

public class matrixMultiplication {
    
    public static void main(String[] args) {
        
            //  Get 4 inputs from user
                Scanner input = new Scanner (System.in);
                
                System.out.println("Row of First Matrix ");
                int a = input.nextInt();
                System.out.println("Column of First Matrix ");
                int b = input.nextInt();
                System.out.println("Row of Second Matrix ");
                int c = input.nextInt();
                System.out.println("Column of Second Matrix ");
                int d = input.nextInt();
                
                int[][] fM = new int[a][b];
                int[][] sM = new int[c][d];
                int[][] rM = new int[a][d]; // can save space here
            //  Check condition , row of first matrix = row of second matix
            //  Get inputs for i * j number of times for first matrix and i * j times for second matrix
                if (b == c) {

                    for (int i = 0 ; i < a; i++) {
                        for (int j = 0 ; j < b; j++) {
                                fM [i][j] = input.nextInt(); 
                            }
                        }
                        
                        for (int i = 0 ; i < c; i++) {
                            for (int j = 0 ; j < d; j++) {
                                sM [i][j] = input.nextInt();
                            }
                        }    
            
                    }   
            
                else {
                    System.out.println("Invalid Matrix");
                }
                
            //  Use loop to navigate first row * first column and store it in an array
                 for(int i = 0 ; i < a ; i++) {
                     for(int j = 0 ; j < d ; j++) {
                         rM[i][j] = 0;
                         for(int k = 0 ; k < c ; k++) {
                             rM[i][j] += ( fM[i][j] * sM[i][j] ); // whats the logic behind this ?
                         }
                     }
                 }   
                
            //  Print Results
            for(int i = 0 ; i < a; i++) {
                for(int j = 0; j < d; j++) {
                    System.out.print(" "+rM[i][j]);
                }
                System.out.println("");
            }
                
    
    }
    
}