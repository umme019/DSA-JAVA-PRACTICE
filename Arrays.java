import java.util.*;

public class Arrays{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] matrix= new int[n][m];

        //input
        //rows
        for (int i =0;i<n;i++){
        //columns
        for (int j = 0;j<m;j++){
            matrix[i][j] = sc.nextInt();
        }
   }

        //output
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = m - 1;

        while (rowStart <= rowEnd && colStart <= colEnd){

            //1.First Row (left to right)
            for (int col=colStart;col<=colEnd;col++){
                System.out.print(matrix[rowStart][col] + " ");
                
            }
            rowStart++;

            //2.Last column (top to bottom)
            for(int row=rowStart; row<=rowEnd;row++){
                System.out.print(matrix[row][colEnd] + " ");
               
            }
             colEnd--;

            //3.Last row (right to left)
            if (rowStart <=rowEnd){
            for (int col=colEnd; col>=colStart;col--){
            System.out.print(matrix[rowEnd][col] + " ");
            }
              rowEnd--;
            }

            //4.First column (bottom to top)
            if (colStart<= colEnd){
            for(int row = rowEnd;row>=rowStart;row--){
                  System.out.print(matrix[row][colStart] + " ");
            }
                    colStart++;
            }
           
        }
         System.out.println();

     
    }
}

        

    
