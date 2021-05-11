
/**
 * Write a description of class frequencyChart here.
 *
 * @author Jake Siegel
 * @version 4/29/21
 */
import java.util.Scanner;
public class frequencyChart
{
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       int x;
       int countA=0;
       //1-10
       int countB=0;
       //10-20
       int countC=0;
       //20-30
       int countD=0;
       //30-40
       int countE=0;
       //40-50
       int countF=0;
       //50-60
       int countG=0;
       //60-70
       int countH=0;
       //70-80
       int countI=0;
       //80-90
       int countJ=0;
       //90-100
       
       System.out.println("Enter the number of numbers you want in the chart: ");
       x = input.nextInt();
       int[] userArray = new int[x];
       System.out.println("Insert numbers from 1-100 \nE.X. \n3\n34\n54");
       for(int i = 0;i<x;i++){
           userArray[i] = input.nextInt();
        }
          for(int i = 0;i<x;i++){
          if(userArray[i]>=1 && userArray[i]<=10)
          countA++;
         else if(userArray[i]>=11 && userArray[i]<=20)
         countB++;
         else if(userArray[i]>=21 && userArray[i]<=30)
         countC++;
         else if(userArray[i]>=31 && userArray[i]<=40)
         countD++;
         else if(userArray[i]>=41 && userArray[i]<=50)
         countE++;
         else if(userArray[i]>=51 && userArray[i]<=60)
         countF++;
         else if(userArray[i]>=61 && userArray[i]<=70)
         countG++;
         else if(userArray[i]>=71 && userArray[i]<=80)
         countH++;
         else if(userArray[i]>=81 && userArray[i]<=90)
         countI++;
         else if(userArray[i]>=91 && userArray[i]<=100)
         countJ++;
       }
       System.out.print("\n1 - 10  | " );
       for(int i = 0;i<countA;i++){
           System.out.print("*");
        }
       System.out.print("\n11 - 20 | ");
       for(int i = 0;i<countB;i++){
           System.out.print("*");
        }
       System.out.print("\n21 - 30 | ");
       for(int i = 0;i<countC;i++){
           System.out.print("*");
        }
       System.out.print("\n31 - 40 | ");
       for(int i = 0;i<countD;i++){
           System.out.print("*");
        }
       System.out.print("\n41 - 50 | ");
       for(int i = 0;i<countE;i++){
           System.out.print("*");
        }
       System.out.print("\n51 - 60 | ");
       for(int i = 0;i<countF;i++){
           System.out.print("*");
        }
       System.out.print("\n61 - 70 | ");
       for(int i = 0;i<countG;i++){
           System.out.print("*");
        }
       System.out.print("\n71 - 80 | ");
       for(int i = 0;i<countH;i++){
           System.out.print("*");
        }
       System.out.print("\n81 - 90 | ");
       for(int i = 0;i<countI;i++){
           System.out.print("*");
        }
         System.out.print("\n91 - 100| ");
       for(int i = 0;i<countJ;i++){
           System.out.print("*");
        }
    }
}
