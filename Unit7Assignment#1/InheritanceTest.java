
public class InheritanceTest
{
    public static void main(String args[]){
        //objects
        Boat classic = new Boat("Brown", "small");
        SpeedBoat mockFive = new SpeedBoat();
        Yatch openWater = new Yatch();
        Boat a5 = new Yatch();
        
        //polymorphism
        System.out.println(a5.activity());
        //method 1
        System.out.println(openWater.getColor());
        openWater.setColor("purple");
        System.out.println(openWater.getColor());
        //method 2
        mockFive.setPassengers(3);
        System.out.println(mockFive.getPassengers());
        //method 3
        System.out.println(mockFive.activity());
        //method 4 
        System.out.println(classic.equals(mockFive));
        
        //method 4+
        System.out.println(classic);
        System.out.println(mockFive);
        System.out.println(openWater);
        
    }
}
