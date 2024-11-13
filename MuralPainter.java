import org.code.neighborhood.*;

public class MuralPainter extends PainterPlus {
// Turns around
  public void turnAround() {
    turnLeft();
    turnLeft();
  }
// Paints part of a line
  public void paintLineSegment(String color){
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
  }
// Paints a full line
  public void paintFullLine(String color){
    while(canMove()){
      paint(color);
      move();
    }
    paint(color);
  }
// Paints a part of a diagonal segment
  public void paintDiagonalSegment(String color){
    paint(color);
    if(canMove()){
      move();
      turnLeft();
   
      if(canMove()){
      move();
        paint(color);
    turnRight();
    }
   
    }
   
  }
// Paints complete diagonal line
  public void paintFullDiagonal(String color){
    while(canMove()){
        paintDiagonalSegment(color);
    }
  }
// Paints border 32 by 32
  public void paintBorder(String color){
    if(facingSouth()){
      turnLeft();
    } else if (facingWest()){
      turnAround();
    } else if (facingNorth()){
      turnRight();
    }

    paintFullLine(color);
    turnRight();
    move();
    turnRight();
    paintFullLine(color);
    turnLeft();
    paintFullLine(color);
  turnLeft();
    move();
    turnLeft();
    paintFullLine(color);
    turnRight();
    while(canMove()){
      move();
    }
    turnRight();
    while(canMove()){
      move();
    }
    turnRight();
    paintFullLine(color);
    turnRight();
    move();
    turnRight();
    paintFullLine(color);
    turnLeft();
    paintFullLine(color);
    turnLeft();
    move();
    turnLeft();
    paintFullLine(color);
  }
  
// Paints every square
  public void paintBackground(String color, int size) {
    while (canMove()) {
      paintLine(color);
      nextRow();
      }
  }

  public void nextRow() {
    if(canMove("South")) {
      if(isFacingEast()) {
        turnRight();
        move();
        turnRight();
      }
      else {
        turnLeft();
        move();
        turnLeft();
      }
    }
  }
/*
Paint color
If on paint move
Paint color again
*/
  public void paintLine(String color) {
    while(canMove()) {
      if(!isOnPaint()) {
        paint(color);
      }
      move();
    }
    if(!isOnPaint()) {
      paint(color);
    }
  }
// Turns to the west
  public void turnToWest() {
    if (isFacingEast()) {
      turnRight();
      move();
      turnRight();
    }
  }
// Turns to the east.
  public void turnToEast() {
    if (isFacingWest()) {
      turnLeft();
      move();
      turnLeft();
    }
  }
// Goes back to the original position
  public void resetPosition() {
    if (isFacingEast()) {
      turnLeft();

      while (canMove()) {
        move();
      }

      turnLeft();

      while (canMove()) {
        move();
      }

      turnAround();
    }
  }
// moves to corner
  public void moveToCorner() {
    while (canMove()) {
      move();
    }
   
    turnRight();

    while (canMove()) {
      move();
    }
  }
/*it Turns right
then Moves
then Turns right
*/
  public void turnRightMove() {
    turnRight();
    move();
    turnRight();
  }
/* it Turns left
 then moves
 then Turns left
*/
  public void turnLeftMove() {
    turnLeft();
    move();
    turnLeft();
  }
}
