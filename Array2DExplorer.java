
/**
 * Write a description of class practice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Array2DExplorer
{
    public boolean evenRow(int[][] mat, int row){
        for(int i = 0;i<mat[row].length;i++){
            if(i%2 !=0){
                return false;
            } 

        }
        return true;
    }
    public boolean oddColSum(int[] []nums, int col){
        int sum = 0;
      for(int index = 0; index < nums.length; index++)
      {
	sum += nums[index][col];
    }
    if(sum % 1 ==0 ){
        return true;
    }
    else
    return false;
   }
    
    
    
   public int minRow(int[] []nums,int row){
        int min = 5;
        for(int index = 0; index < nums.length; index++)
        {
             if(nums[row][index]<min) 
            min = nums[row][index];
        }
        return min;
    }
    
   public int[] colMaxs(int[][] matrix){
    int[] max = matrix[0];
       for(int rowIndex = 0;rowIndex<matrix.length;rowIndex++){
            for(int colIndex = 0;colIndex<matrix[rowIndex].length;rowIndex++){
                if(matrix[rowIndex][colIndex]>max[colIndex])
                max[colIndex] = matrix[rowIndex][colIndex]; 
            }
    }
    return max;
   }
   
   public int[] allRowSums(int[][] data){
       int[] row =new int[data.length];
       int sum = 0;
       for(int index = 0;index<data.length;index++){
           for(int a =0;a<data[index].length;a ++){
               sum = data[index][a];
               row[index] =row[index] + sum;
            }
        }
       return row;
    }
    
   public double[] averageCol(int[][] nums){
       double[] array = new double[nums.length];
       double sum = 0.0;
       double average = 0.0;
              for(int index = 0;index<nums.length;index++){
           for(int a =0;a<nums[index].length;a ++){
               sum += nums[index][a];
               
            }
            average = sum/nums[index].length;
            array[index] = average;
            average = 0.0;
            sum = 0.0;
       }
       return array;
    }
   
   public int smallEven(int[][] matrix){
       int min = matrix[0][0];
         for(int index = 0;index<matrix.length;index++){
           for(int a =0;a<matrix[index].length;a ++){
               if(matrix[index][a]%2==0){
                   if(matrix[index][a]<min){
                    min = matrix[index][a];
                    }
                }
            }
    }
    return min;
}
public static int biggestRow(int[][] nums){
 int numRows = nums.length;
 int numCols = nums[0].length; 
 int[] rowSum = new int[numRows]; 
 int sum =0;
 for(int i = 0; i < numRows; i++) {
     for(int j =0; j < numCols; j++) {
          sum += nums[i][j]; 
        }
        rowSum[i] = sum; 
    }
int rowMax = rowSum[0];
int maxIndex = 0;
for(int i = 0; i < rowSum.length; i++) {
    if (rowSum[i]> rowMax) {
        rowMax = rowSum[i];
        maxIndex = i; }
}
return maxIndex;
}

}


