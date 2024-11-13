import org.code.neighborhood.Painter;

public class PainterPlus extends Painter {
// Makes the Painter get the ability to turn right
  public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();

  }
// Takes all paint at once
  public void takeAllPaint() {
    while (isOnBucket()) {
    takePaint();
    }
  }
// Moves if it can
  public void moveFast() {
    while (canMove()) {
    move();

      }
    }
// Paints in a line until no more paint is remaining
  public void paintToEmpty(String color) {
    while (hasPaint()) {
    paint(color);
    move();
    }
  }
// Paints a square
  public void paintDonut(String color) {
    while (hasPaint()) {
    move();
    paint(color);
    turnRight();
    move();
    paint(color);
    move();
    paint(color);
    turnRight();
    move();
    paint(color);
    move();
    paint(color);
    turnRight();
    move();
    paint(color);
    move();
    paint(color);
    turnRight();
    move();
    paint(color);
   
   }
  }
}

