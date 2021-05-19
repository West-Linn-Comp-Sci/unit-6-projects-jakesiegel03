
public class Yatch extends Boat
{
    public Yatch(){
        super("black", "large");
    }
    public String activity(){
        return "relaxation";
    }
    public String toString(){
        return "This luxurious yatch is " + super.getColor() +",and is ment for " 
        + activity();
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
    public boolean equals(Boat boat1){
       return boat1 !=null && this.color.compareTo(boat1.color) ==0;
    }
}
