import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Activity6 {
    public static void main(String[] args) throws InterruptedException {
        Plane plane = new Plane(10);

        plane.onboard("Mahesh");
        plane.onboard("Vinod");
        plane.onboard("Ram");
        plane.onboard("Spy");
        plane.onboard("Sai");

        System.out.println("Take-off time: " + plane.takeoff());
        System.out.println("Passengers: " + plane.getPassengers());

        Thread.sleep(5000); 

        plane.land();
        System.out.println("Landing time : "+plane.getlastTimeLanded());
        
    }

}
class Plane{
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;

    public Plane(int passengers) {
        this.passengers = new ArrayList<>();
    }
    public void onboard(String passengers){
        this.passengers.add(passengers);
    }
    public Date takeoff(){
        return new Date();
    }
    public void land(){
        lastTimeLanded= new Date();
        passengers.clear();
    
    }
    public Date getlastTimeLanded()
    {
        return lastTimeLanded;
    }
    public List<String> getPassengers()
    {
        return passengers;
    }
}
