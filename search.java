
public class search
{
  public static void main(String[] args){
      //boolean cheese = false;
      int search = 0;
      int[] array1 = {1,4,23,54,3,6,0};
      
      for(int i = 0;i<array1.length;i++){
          if(array1[i]==search)
            System.out.println( search + "was found in array at slot: " +i); 
        }
    }
}
