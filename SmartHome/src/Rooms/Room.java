package Rooms;

public class Room {

    int doors;
    int windows;
    int celsius;
    int doorCode;
    String floor;
    boolean lightsOn = false;

    public void printOutInfo(){
        System.out.println("Info about room");
    }

    public void setCode(int code){
        this.doorCode = code;
    }

    public String getFloor(){
        return floor;
    }

    public void setFloor(String floor){
        this.floor = floor;
    }

    public int getDoors(){
        return doors;
    }

    public void setDoors(int doors){
        this.doors = doors;
    }

    public int getWindows(){
        return windows;
    }

    public void setWindows(int windows){
        this.windows = windows;
    }

    public int getCelsius(){
        return celsius;
    }

    public void setCelsius(int celsius){
        this.celsius = celsius;
    }

    public boolean getLights(){
        return lightsOn;
    }

    public void setLights(boolean lights){
        this.lightsOn = lights;
    }
}