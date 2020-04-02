package Code;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DoorLock {

    Scanner sc = new Scanner(System.in);
    int codeInput;
    int timesGettingDoorCodeWrong = 0;
    boolean doorLocked = true;

    private boolean enterHouse(){

        while (!doorLocked) {
            if (timesGettingDoorCodeWrong > 1) {
                System.out.println("Sending message to owner... Someone is trying to get inside.");
            }
            enterDoorCode();
            if (codeInput == 1234) {
                System.out.println("Sending message to owner... Someone unlocked the door.");
                return true;
            }
        }
        return false;
    }

    private void enterDoorCode(){
        System.out.println("Please enter the code to unlock the door. (4 digits)");
        try {
            codeInput = sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Try again with digits.");
        }
    }
}
