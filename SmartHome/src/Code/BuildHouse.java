package Code;

import Rooms.*;

class BuildHouse {

    private CheckHouse checkHouse = new CheckHouse();
    private Bathroom bathroom = new Bathroom();
    private Hall hall = new Hall();
    private Bedroom bedroom = new Bedroom();
    private Livingroom livingroom = new Livingroom();
    private Kitchen kitchen = new Kitchen();

    BuildHouse(){
        System.out.println("Building house...");
        setRoomValues();
        checkHouse.menu();
    }
    private void setRoomValues(){
        setBathroom();
        setBedroom();
        setLivingroom();
        setKitchen();
        setHall();
    }
    private void setBathroom(){
        bathroom.setDoors(0);
        bathroom.setWindows(0);
        bathroom.setCelsius(23);
        bathroom.setFloor("Tile floor");
        bathroom.setLights(false);
    }
    private void setBedroom(){
        bedroom.setDoors(0);
        bedroom.setWindows(0);
        bedroom.setCelsius(23);
        bedroom.setFloor("Parquet Floor");
        bedroom.setLights(false);
    }
    private void setHall(){
        hall.setCode(1234);
        hall.setDoors(1);
        hall.setWindows(1);
        hall.setCelsius(23);
        hall.setFloor("Parquet Floor");
        hall.setLights(false);
    }
    private void setLivingroom(){
        livingroom.setDoors(0);
        livingroom.setWindows(2);
        livingroom.setCelsius(23);
        livingroom.setFloor("Parquet Floor");
        livingroom.setLights(false);
    }
    private void setKitchen(){
        kitchen.setDoors(0);
        kitchen.setWindows(0);
        kitchen.setCelsius(23);
        kitchen.setFloor("Tile floor");
        kitchen.setLights(false);
    }
}