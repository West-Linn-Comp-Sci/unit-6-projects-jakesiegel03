
/**
 * Creates a boat and the basic properties of a boat. 
 *
 * @author Jake Siegel
 * @version 5/17/21
 */
public class Boat 
{
   public String color;
   private String size;
   public Boat(String color, String size){
       this.color = color;
       this.size = size;
    }
   public String getColor(){
       return color;
    }
   public void setColor(String col){
        color = col;
    }
   public String getSize(){
       return size;
    }
   public String activity(){
       return "transportation";
    }
   public String toString(){
       return "This boat is " + size +", and the color is " + color;
    }
   public boolean equals(Boat boat1){
       return boat1 !=null && this.color.compareTo(boat1.color) ==0;
    }
   public int compareTo(Boat boat1){
        if(boat1!=null && this.color.compareTo(boat1.color)>0)
        return 1;
        else if( boat1!=null && this.color.compareTo(boat1.color)<0)
        return -1;
        else if(boat1!=null && this.color.compareTo(boat1.color)==0)
        return 0;
        else 
        return -1;
    }
}
