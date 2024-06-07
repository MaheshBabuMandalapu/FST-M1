public class Car {

    String color;
    String transmission;
    int make;
    int tryes;
    int doors;
    
    Car ()
    {
     tryes=4;
     doors=4;
    }
    public void displayCharacteristics()
    {
        System.out.println("Car transmission :"+ transmission);
        System.out.println("Car color :"+ color);
        System.out.println("car make :"+make);
        System.out.println("No of tyres :"+ tryes);
        System.out.println("no of doors : "+doors);
    }
    public void accelarate()
    {
System.out.println("Car is moving forward.");
    }
    public void brake()
    {
        System.out.println("Car has stopped.");

    }

}
