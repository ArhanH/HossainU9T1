public class VehicleRunner
{
    public static void main(String[] args)
    {

        System.out.println("----------Test Object--------------");
        Airplane myPlane = new Airplane("Omori", 8,1300, 8700);
        System.out.println(myPlane.getName());
        System.out.println(myPlane.getWheels());
        System.out.println(myPlane.getSpeed());
        System.out.println(myPlane.heightInAir());


    }
}
