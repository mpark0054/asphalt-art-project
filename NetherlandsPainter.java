import org.code.neighborhood.*;
public class NetherlandsPainter extends MuralPainter {
// goes to the position where the pole starts
  public void getToPole() {
    turnAround();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    turnLeft();
    move();
    move();

  }
// Starts painting the flagpole
  public void makePoleStick(String color) {
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
  }
  
// Starts painting the flag
  public void startFlagPaint(String color) {
    paintLineSegment(color);

  }

   
  }

