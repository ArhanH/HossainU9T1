public class Airplane extends Vehicle{
    private int speed;
    private int heightInAir;
    public Airplane (String name, int wheels, int speed, int heightInAir) {
        super(name, wheels);
        this.speed = speed;
        this.heightInAir = heightInAir;
    }
    public int getSpeed() {
        return speed;
    }
    public int heightInAir(){
        return heightInAir;
    }
}
