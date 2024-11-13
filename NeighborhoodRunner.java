import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

   NetherlandsPainter bob = new NetherlandsPainter();
   NetherlandsPainter tim = new NetherlandsPainter();
    
    bob.paintBackground("LightBlue", 16);
    
    tim.paintBorder("White");
    
    bob.resetPosition();
    tim.moveToCorner();
    tim.getToPole();  
    
    tim.makePoleStick("Black");
    
    tim.turnAround();
    tim.move();
    tim.move();
    tim.turnLeft();
    
    tim.startFlagPaint("Red");
    tim.turnRightMove();
    tim.startFlagPaint("Red");
    tim.turnLeftMove();
    tim.startFlagPaint("Red");
    tim.turnRightMove();
    tim.startFlagPaint("Red");
    tim.turnLeftMove();
    tim.startFlagPaint("Red");
    
    tim.turnRightMove();
    tim.startFlagPaint("White");
    tim.turnLeftMove();
    tim.startFlagPaint("White");
    tim.turnRightMove();
    tim.startFlagPaint("White");
    tim.turnLeftMove();
    tim.startFlagPaint("White");
    tim.turnRightMove();
    tim.startFlagPaint("White");
    
    tim.turnLeftMove();
    tim.startFlagPaint("Blue");
    tim.turnRightMove();
    tim.startFlagPaint("Blue");
    tim.turnLeftMove();
    tim.startFlagPaint("Blue");
    tim.turnRightMove();
    tim.startFlagPaint("Blue");
    tim.turnRightMove();
    tim.startFlagPaint("Blue");
    tim.turnRightMove();
 
  }
}
