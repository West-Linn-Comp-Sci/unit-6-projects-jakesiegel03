
public class SpeedBoat extends Boat
{
    private int amountOfPassengers;
    public SpeedBoat()
    {
        super("red","small");
    }
    public String activity(){
        return "wakeboarding";
    }

    public void setPassengers(int num){
        amountOfPassengers = num;
    }
    public int getPassengers(){
        return amountOfPassengers;
    }
    public String toString(){
        return "This speed boat fits " +getPassengers() 
        +" passengers, and the color is " + super.getColor();
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
