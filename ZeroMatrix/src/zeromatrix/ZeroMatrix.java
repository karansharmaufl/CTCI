
package zeromatrix;

public class ZeroMatrix {

    public static void main(String[] args) {
       int[][] matrix = new int[][]{
       {1,0,3},
       {4,5,6},
       {7,8,0},
       };
       ZeroMatrix z=new ZeroMatrix();
       
       boolean[] row=new boolean[matrix.length];
       boolean[] col=new boolean[matrix[0].length];
       
       for(int i=0;i<matrix.length;i++)
       {
           for(int j=0;j<matrix[0].length;j++)
           {
               if(matrix[i][j]==0)
               {
                   row[i]=true;
                   col[j]=true;
               }
           }
       }
       
       for(int i=0;i<row.length;i++)
       {
           if(row[i])
               z.nullifyRow(matrix,i);
               
       }
       
        for(int i=0;i<col.length;i++)
       {
           if(col[i])
               z.nullifyCol(matrix,i);
               
       }
        
       for(int i=0;i<matrix.length;i++)
       {
           for(int j=0;j<matrix[0].length;j++)
           {
               System.out.print(matrix[i][j]);
           }
           System.out.println();
       }
       
       
       
    }
    
    public void nullifyRow(int[][] matrix , int row)
    {
        for(int i=0;i<matrix[0].length;i++)
            matrix[row][i]=0;
    }
    
    public void nullifyCol(int[][] matrix , int col)
    {
        for(int i=0;i<matrix.length;i++)
            matrix[i][col]=0;
    }
    
}
