package Rooms;

public class Bedroom extends Room {

    int doors;
    int windows;
    int celsius;
    String floor;
    boolean lightsOn = false;

    @Override
    public void printOutInfo(){
        System.out.println("Doors: "+doors+" Windows: "+windows+" Celsius: "+celsius+" Floor type: "+floor+" Light on? "+lightsOn);
    }
}
